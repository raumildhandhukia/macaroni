import antlr.macaroniParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MacaroniVisitor extends antlr.macaroniBaseVisitor<Object> {

    private final Map<String, Variable> variables;

    private final List<String> errorList;
    private final List<Object> consoleOutList;


    public MacaroniVisitor() {
        this.errorList = new ArrayList<>();
        this.consoleOutList = new ArrayList<>();
        this.variables = new HashMap<>();
    }

    public void compilerOutcome() {
        if (errorList.size() == 0) {
            System.out.println("Program Compiled Successfully.");
            for (Object outCome : this.consoleOutList) {
                System.out.println(outCome);
            }
        } else {
            System.out.println("Program Could Not Compile. Errors:");
            for (String err : errorList)
                System.out.println(err);
        }
    }

    public String errorDecorator(Token symbol, String err) {
        int lineNum = symbol.getLine();
        int charPosition = symbol.getCharPositionInLine();
        String position = "\t[" + lineNum + ":" + charPosition + "] ";
        return "\033[31m" + position + err + "\033[0m";
    }

    @Override
    public Object visitProgram(macaroniParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(macaroniParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(macaroniParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declaration(macaroniParser.Variable_declarationContext ctx) {
        try {
            Object res = visitChildren(ctx);
            if (ctx.expression() != null) {
                if (ctx.ID() != null) {
                    String varName = ctx.ID().getText();
                    if (!variables.containsKey(varName)) {
                        try {
                            String type = ctx.data_type().getText();
                            Variable ID = new Variable(type);
                            variables.put(varName, ID);
                            ID.variableValue = visitChildren(ctx.expression());
                        } catch (Exception ex) {
                            Token t = ctx.getStart();
                            String Err = errorDecorator(t, "Declaration failed: " + ctx.ID().toString());
                            errorList.add(Err);
                        }
                    } else {
                        Token t = ctx.getStart();
                        String Err = errorDecorator(t, "Variable already declared: " + ctx.ID().toString());
                        errorList.add(Err);
                    }
                }
            }
            return res;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }

    }

    public String getDataType(macaroniParser.IdsContext ctx) {
        try {
            if (ctx.parent.getRuleIndex() == 3) {
                return ((macaroniParser.Variable_declarationContext) ctx.parent).data_type().getText();
            } else {
                return getDataType((macaroniParser.IdsContext) ctx.parent);
            }
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitIds(macaroniParser.IdsContext ctx) {
        try {
            if (ctx.ID() != null) {
                String varName = ctx.ID().getText();
                if (!variables.containsKey(varName)) {
                    try {
                        String type = getDataType(ctx);
                        Variable ID = new Variable(type);
                        variables.put(varName, ID);
                    } catch (Exception ex) {
                        Token t = ctx.getStart();
                        String Err = errorDecorator(t, "Declaration failed: " + ctx.ID().toString());
                        errorList.add(Err);
                    }
                } else {
                    Token t = ctx.getStart();
                    String Err = errorDecorator(t, "Variable already declared: " + ctx.ID().toString());
                    errorList.add(Err);
                }
            }
            return visitChildren(ctx);
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    public Object getResult(macaroniParser.ExpressionContext ex){
        Object res = visit(ex);
        if (res == null){
            return visit(ex.expression());
        } else{
            return res;
        }
    }
    @Override
    public Object visitAssignment(macaroniParser.AssignmentContext ctx) {
        try {
            if (ctx.expression() != null) {
                Object res = getResult(ctx.expression());
//                if (ctx.expression().ternary_expression() != null){
//                    res = visit(ctx.expression().ternary_expression());
//                }
                String varName = ctx.ID().getText();
                if (variables.containsKey(varName)) {
                    try {
                        Variable var = variables.get(varName);
                        var.setVariableValue(res);
                    } catch (Exception e) {
                        Token start = ctx.expression().getStart();
                        String Err = errorDecorator(start, e.toString());
                        errorList.add(Err);
                    }
                }
            }

            return visitChildren(ctx);
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitIf_statement(macaroniParser.If_statementContext ctx) {
        try {
            Object res = getResult(ctx.expression());
            if (res instanceof Boolean) {
                if ((Boolean) res) {
                    for(int i=0;i<ctx.if_statements().statement().size();i++){
                        visit(ctx.if_statements().statement(i));
                    }
                } else {
                    if (ctx.else_statements() != null) {
                        for(int i=0;i<ctx.else_statements().statement().size();i++){
                            visit(ctx.else_statements().statement(i));
                        }
                    }
                }
            } else {
                Token start = ctx.expression().getStart();
                String Err = errorDecorator(start, "Only relational expressions and logical expressions are valid in if condition.");
                errorList.add(Err);
            }
            return null;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }

    }

    @Override public Object visitFor_statement(macaroniParser.For_statementContext ctx) {
        try {
            macaroniParser.Relational_expressionContext rel = ctx.expression().relational_expression();
            if (rel == null) {
                String err = errorDecorator(ctx.getStart(), "Relational Expression not in for loop.");
                errorList.add(err);
                return null;
            }
            String var = ctx.variable_declaration().ID().getText();
            boolean firstSame = rel.arithmetic_expression(0).primary().ID() != null && Objects.equals(rel.arithmetic_expression(0).primary().ID().getText(), var);

            if (!firstSame){
                String err = errorDecorator(ctx.getStart(), "Declared variable must come first in relational expression. HINT: Reverse your relational expression");
                errorList.add(err);
                return null;
            }

            Set<String> keySetBefore = new HashSet<>(variables.keySet());
            if (variables.containsKey(var)) {
                Token start = ctx.getStart();
                String Err = errorDecorator(start, "Variable already declared: " + var);
                errorList.add(Err);
                return null;
            }

            Variable ID = new Variable("int");
            variables.put(var, ID);
            ID.variableValue = visit(ctx.variable_declaration().expression().arithmetic_expression().primary());
            String op = ctx.expression().relational_expression().relational_op().IS_EQUAL() != null ? ctx.expression().relational_expression().relational_op().getText()
                    : ctx.expression().relational_expression().relational_op().IS_GREATER() != null ? ctx.expression().relational_expression().relational_op().IS_GREATER().getText()
                    : ctx.expression().relational_expression().relational_op().IS_LESS() != null ? ctx.expression().relational_expression().relational_op().IS_LESS().getText()
                    : ctx.expression().relational_expression().relational_op().IS_NOT_EQUAL() != null ? ctx.expression().relational_expression().relational_op().IS_NOT_EQUAL().getText()
                    : ctx.expression().relational_expression().relational_op().IS_GREATER_EQUAL() != null ? ctx.expression().relational_expression().relational_op().IS_GREATER_EQUAL().getText()
                    : ctx.expression().relational_expression().relational_op().IS_LESSER_EQUAL().getText();

            String unary_var = ctx.operation().ID().getText();

            if (var.equals(unary_var)) {
                if (variables.get(var).variableValue != null) {
                    int start = rel.arithmetic_expression(0).primary().ID() != null ? Integer.parseInt(variables.get(rel.arithmetic_expression(0).primary().ID().getText()).variableValue.toString()) : Integer.parseInt(rel.arithmetic_expression(0).primary().INT().getText());
                    int end = rel.arithmetic_expression(1).primary().ID() != null ? Integer.parseInt(variables.get(rel.arithmetic_expression(1).primary().ID().getText()).variableValue.toString()) : Integer.parseInt(rel.arithmetic_expression(1).primary().INT().getText());
                    String assign = ctx.operation().UNARY_OP().getText();
                    if (assign.equals("++")) {
                        switch (op) {
                            case "<" -> {
                                for (int i = start; i < end; i++) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case "<=" -> {
                                for (int i = start; i <= end; i++) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case ">" -> {
                                for (int i = start; i > end; i++) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case ">=" -> {
                                for (int i = start; i >= end; i++) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case "==", "!=" -> {
                                Token st = ctx.getStart();
                                String Err = errorDecorator(st, "Operation not allowed - Operator is not comparable: " + var);
                                errorList.add(Err);
                                return null;
                            }
                        }
                    } else if (assign.equals("--")) {
                        switch (op) {
                            case "<" -> {
                                for (int i = start; i < end; i--) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case "<=" -> {
                                for (int i = start; i <= end; i--) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case ">" -> {
                                for (int i = start; i > end; i--) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case ">=" -> {
                                for (int i = start; i >= end; i--) {
                                    ID.variableValue = i;
                                    for (int y = 0; y < ctx.statement().size(); y++) {
                                        visit(ctx.statement().get(y));
                                    }
                                }
                            }
                            case "==" -> {
                                Token st = ctx.getStart();
                                String Err = errorDecorator(st, "Operation not allowed - Operator is not comparable: " + var);
                                errorList.add(Err);
                                return null;
                            }
                        }
                    } else if (op.equals("!=")) {
                        Token st = ctx.getStart();
                        String Err = errorDecorator(st, "Operation not allowed - Operator is not comparable: " + var);
                        errorList.add(Err);
                        return null;
                    }
                }
                Set<String> keySetAfter = new HashSet<>(variables.keySet());
                for (String key : keySetAfter) {
                    if (!keySetBefore.contains(key)) {
                        variables.remove(key);
                    }
                }
            } else {
                Token start = ctx.getStart();
                String Err = errorDecorator(start, "Variable already declared: " + var);
                errorList.add(Err);
                return null;
            }
            return null;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }

    }
    @Override
    public Object visitFor_in_range_statement(macaroniParser.For_in_range_statementContext ctx) {
        try {
            String var = ctx.ID().getText();
            Set<String> keySetBefore = new HashSet<>(variables.keySet());
            if (variables.containsKey(var)) {
                Token start = ctx.getStart();
                String Err = errorDecorator(start, "Variable already declared: " + var);
                errorList.add(Err);
                return null;
            }
            Variable ID = new Variable("int");
            variables.put(var, ID);
            int start = ctx.expression(0).arithmetic_expression().primary().ID() != null ? Integer.parseInt(variables.get(ctx.expression(0).arithmetic_expression().primary().ID().getText()).variableValue.toString()) : Integer.parseInt(ctx.expression(0).arithmetic_expression().primary().INT().getText());
            int end = ctx.expression(1).arithmetic_expression().primary().ID() != null ? Integer.parseInt(variables.get(ctx.expression(1).arithmetic_expression().primary().ID().getText()).variableValue.toString()) : Integer.parseInt(ctx.expression(1).arithmetic_expression().primary().INT().getText());

            ID.variableValue = start;
            for (int i = start; i <= end; i++) {
                ID.variableValue = i;
                visitChildren(ctx);
            }
            Set<String> keySetAfter = new HashSet<>(variables.keySet());
            for (String key : keySetAfter) {
                if (!keySetBefore.contains(key)) {
                    variables.remove(key);
                }
            }
            return null;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitWhile_statement(macaroniParser.While_statementContext ctx) {
        try {
            Object res = visit(ctx.expression());
            if (res instanceof Boolean) {
                while ((Boolean) res) {
                    for (int i = 0; i < ctx.statement().size(); i++) {
                        visit(ctx.statement().get(i));
                    }
                    res = visit(ctx.expression());
                }
            } else {
                Token start = ctx.expression().getStart();
                String Err = errorDecorator(start, "Needs Boolean Value");
                errorList.add(Err);
            }
            return null;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitPrint_statement(macaroniParser.Print_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressions(macaroniParser.ExpressionsContext ctx) {
        return visitChildren(ctx);
    }

    public static int calculate(int leftOperand, String operator, int rightOperand) {
        switch (operator) {
            case "+" -> {
                return leftOperand + rightOperand;
            }
            case "-" -> {
                return leftOperand - rightOperand;
            }
            case "*" -> {
                return leftOperand * rightOperand;
            }
            case "/" -> {
                if (rightOperand == 0) {
                    throw new IllegalArgumentException("Division by zero.");
                }
                return leftOperand / rightOperand;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    @Override
    public Object visitArithmetic_expression(macaroniParser.Arithmetic_expressionContext ctx) {
        try {
            if (ctx.children.size() < 2) return visitChildren(ctx);
            if (ctx.add_minus() != null) {
                Object leftOperand = visit(ctx.children.get(0));
                Object rightOperand = visit(ctx.children.get(2));
                TerminalNode OP = ctx.add_minus().ADD() != null ? ctx.add_minus().ADD() : ctx.add_minus().MINUS();
                String op = OP.getText();
                return calculate(Integer.parseInt(leftOperand.toString()), op, Integer.parseInt(rightOperand.toString()));
            } else if (ctx.mul_div() != null) {
                Object leftOperand = visit(ctx.children.get(0));
                Object rightOperand = visit(ctx.children.get(2));
                TerminalNode OP = ctx.mul_div().MUL() != null ? ctx.mul_div().MUL() : ctx.mul_div().DIV();
                String op = OP.getText();
                return calculate(Integer.parseInt(leftOperand.toString()), op, Integer.parseInt(rightOperand.toString()));
            }
            return visitChildren(ctx);
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    public static boolean compare(Object leftOperand, String cmp, Object rightOperand) {
        return switch (cmp) {
            case "==" -> leftOperand.toString().equals(rightOperand.toString());
            case "!=" -> !leftOperand.equals(rightOperand);
            case ">" -> (Integer.parseInt(leftOperand.toString()) > Integer.parseInt(rightOperand.toString()));
            case "<" -> (Integer.parseInt(leftOperand.toString()) < Integer.parseInt(rightOperand.toString()));
            case ">=" -> (Integer.parseInt(leftOperand.toString()) >= Integer.parseInt(rightOperand.toString()));
            case "<=" -> (Integer.parseInt(leftOperand.toString()) <= Integer.parseInt(rightOperand.toString()));
            default -> throw new IllegalArgumentException("Invalid Comparison Operator: " + cmp);
        };
    }

    @Override
    public Object visitRelational_expression(macaroniParser.Relational_expressionContext ctx) {
        try {
            Object leftOperand = visit(ctx.arithmetic_expression(0));
            Object rightOperand = visit(ctx.arithmetic_expression(1));

            if (!((leftOperand instanceof Integer && rightOperand instanceof Integer) || (leftOperand instanceof String && rightOperand instanceof String) || (leftOperand instanceof Boolean && rightOperand instanceof Boolean))) {

                String err = errorDecorator(ctx.getStart(), "Cannot compare variables with different data types.");
                errorList.add(err);
                return visitChildren(ctx);
            }
            String op = ctx.relational_op().IS_EQUAL() != null ? ctx.relational_op().getText() : ctx.relational_op().IS_GREATER() != null ? ctx.relational_op().IS_GREATER().getText() : ctx.relational_op().IS_LESS() != null ? ctx.relational_op().IS_LESS().getText() : ctx.relational_op().IS_NOT_EQUAL() != null ? ctx.relational_op().IS_NOT_EQUAL().getText() : ctx.relational_op().IS_GREATER_EQUAL() != null ? ctx.relational_op().IS_GREATER_EQUAL().getText() : ctx.relational_op().IS_LESSER_EQUAL().getText();

            if ((op.equals(">") || op.equals("<") || op.equals(">=") || op.equals("<=")) && (leftOperand instanceof String || leftOperand instanceof Boolean)) {
                String err = errorDecorator(ctx.getStart(), "Comparison Expressions are only compatible with Integers.");
                errorList.add(err);
                return visitChildren(ctx);
            }
            return compare(leftOperand, op, rightOperand);
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    public static boolean logicalExpr(Object leftOperand, String op, Object rightOperand) {
        return switch (op) {
            case "&&" ->
                    Boolean.parseBoolean(leftOperand.toString()) && Boolean.parseBoolean((rightOperand.toString()));
            case "||" ->
                    Boolean.parseBoolean(leftOperand.toString()) || Boolean.parseBoolean((rightOperand.toString()));
            default -> throw new IllegalArgumentException("Invalid Comparison Operator: " + op);
        };
    }

    @Override
    public Object visitLogical_expression(macaroniParser.Logical_expressionContext ctx) {
        try {
            if (ctx.children.size() == 1) {
                return visitChildren(ctx);
            } else {
                if(ctx.logical_op()!=null){
                    String op = ctx.logical_op().getText();
                    Object leftOperand = visit(ctx.logical_expression(0));
                    Object rightOperand = visit(ctx.logical_expression(1));
                    return logicalExpr(leftOperand, op, rightOperand);
                } else if (Objects.equals(ctx.children.get(1).getText(), "not")) {
                    return ! (Boolean) visit(ctx.logical_expression(0));
                }
            }
            return null;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitTernary_expression(macaroniParser.Ternary_expressionContext ctx) {
        try {
            boolean res = (boolean) (ctx.relational_expression() != null ? visit(ctx.relational_expression()) : visit(ctx.logical_expression()));
            if (res) {
                return visit(ctx.children.get(2));
            }
            return visit(ctx.children.get(4));
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

//    public Boolean getParentPrint(macaroniParser.ExpressionContext ctx){
//        if (ctx.parent.getRuleIndex() == 13){
//            return true;
//        } else {
//            if (ctx.parent.getClass().toString().equals("class antlr.macaroniParser$ExpressionsContext")){
//                return getParentPrint((macaroniParser.ExpressionContext) ctx.parent);
//            } else {
//                return false;
//            }
//        }
//    }
    @Override
    public Object visitExpression(macaroniParser.ExpressionContext ctx) {
        try {
            Object res = visitChildren(ctx);
//            Boolean isPrint = getParentPrint(ctx);
            if (res != null && (ctx.parent.getRuleIndex() == 13 || (ctx.parent.parent != null & ctx.parent.parent.getRuleIndex() == 13))) {
                consoleOutList.add(res);
            }
            return res;
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitPrimary(macaroniParser.PrimaryContext ctx) {
        try {
            if (ctx.INT() != null) {
                return Integer.parseInt(ctx.INT().getText());
            } else if (ctx.STR() != null) {
                return ctx.STR().getText();
            } else if (ctx.ID() != null) {
                String res = ctx.ID().getText();
                if (variables.containsKey(res)) {
                    return variables.get(res).variableValue;
                } else {
                    Token symbol = ctx.ID().getSymbol();
                    String Err = errorDecorator(symbol, "Variable " + res + " not declared.");
                    errorList.add(Err);
                }

            } else if (ctx.BOOL() != null) {
                return Boolean.parseBoolean(ctx.BOOL().getText());
            }
            return visitChildren(ctx);
        } catch (Exception e) {
            String err = errorDecorator(ctx.getStart(), String.valueOf(e));
            errorList.add(err);
            return null;
        }
    }

    @Override
    public Object visitLogical_op(macaroniParser.Logical_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdd_minus(macaroniParser.Add_minusContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMul_div(macaroniParser.Mul_divContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelational_op(macaroniParser.Relational_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitData_type(macaroniParser.Data_typeContext ctx) {
        return visitChildren(ctx);
    }


}

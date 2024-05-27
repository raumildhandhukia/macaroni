// Generated from macaroni.g4 by ANTLR 4.12.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link macaroniParser}.
 */
public interface macaroniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link macaroniParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(macaroniParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(macaroniParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(macaroniParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(macaroniParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(macaroniParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(macaroniParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(macaroniParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(macaroniParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(macaroniParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(macaroniParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(macaroniParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(macaroniParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(macaroniParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(macaroniParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#if_statements}.
	 * @param ctx the parse tree
	 */
	void enterIf_statements(macaroniParser.If_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#if_statements}.
	 * @param ctx the parse tree
	 */
	void exitIf_statements(macaroniParser.If_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#else_statements}.
	 * @param ctx the parse tree
	 */
	void enterElse_statements(macaroniParser.Else_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#else_statements}.
	 * @param ctx the parse tree
	 */
	void exitElse_statements(macaroniParser.Else_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(macaroniParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(macaroniParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(macaroniParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(macaroniParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#for_in_range_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_range_statement(macaroniParser.For_in_range_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#for_in_range_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_range_statement(macaroniParser.For_in_range_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(macaroniParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(macaroniParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(macaroniParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(macaroniParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(macaroniParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(macaroniParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(macaroniParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(macaroniParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(macaroniParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(macaroniParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(macaroniParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(macaroniParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(macaroniParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(macaroniParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expression(macaroniParser.Ternary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expression(macaroniParser.Ternary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(macaroniParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(macaroniParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(macaroniParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(macaroniParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#add_minus}.
	 * @param ctx the parse tree
	 */
	void enterAdd_minus(macaroniParser.Add_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#add_minus}.
	 * @param ctx the parse tree
	 */
	void exitAdd_minus(macaroniParser.Add_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(macaroniParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(macaroniParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(macaroniParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(macaroniParser.Relational_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link macaroniParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(macaroniParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link macaroniParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(macaroniParser.Data_typeContext ctx);
}
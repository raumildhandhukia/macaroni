// Generated from macaroni.g4 by ANTLR 4.12.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link macaroniParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface macaroniVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link macaroniParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(macaroniParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(macaroniParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(macaroniParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(macaroniParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(macaroniParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(macaroniParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(macaroniParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#if_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statements(macaroniParser.If_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#else_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statements(macaroniParser.Else_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(macaroniParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(macaroniParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#for_in_range_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_range_statement(macaroniParser.For_in_range_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(macaroniParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(macaroniParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(macaroniParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(macaroniParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(macaroniParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(macaroniParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(macaroniParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#ternary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expression(macaroniParser.Ternary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(macaroniParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(macaroniParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#add_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_minus(macaroniParser.Add_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#mul_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div(macaroniParser.Mul_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(macaroniParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link macaroniParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(macaroniParser.Data_typeContext ctx);
}
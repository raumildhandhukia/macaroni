// Generated from macaroni.g4 by ANTLR 4.12.0

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class macaroniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, INT=22, STR=23, BOOL=24, UNARY_OP=25, 
		ID=26, AND=27, OR=28, IS_EQUAL=29, IS_NOT_EQUAL=30, IS_GREATER=31, IS_LESS=32, 
		IS_GREATER_EQUAL=33, IS_LESSER_EQUAL=34, ADD=35, MINUS=36, MUL=37, DIV=38, 
		TERNARY_TRUE=39, TERNARY_FALSE=40, WS=41, COMMENT=42;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_variable_declaration = 3, 
		RULE_ids = 4, RULE_assignment = 5, RULE_if_statement = 6, RULE_if_statements = 7, 
		RULE_else_statements = 8, RULE_operation = 9, RULE_for_statement = 10, 
		RULE_for_in_range_statement = 11, RULE_while_statement = 12, RULE_print_statement = 13, 
		RULE_expressions = 14, RULE_expression = 15, RULE_arithmetic_expression = 16, 
		RULE_relational_expression = 17, RULE_logical_expression = 18, RULE_ternary_expression = 19, 
		RULE_primary = 20, RULE_logical_op = 21, RULE_add_minus = 22, RULE_mul_div = 23, 
		RULE_relational_op = 24, RULE_data_type = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "variable_declaration", "ids", "assignment", 
			"if_statement", "if_statements", "else_statements", "operation", "for_statement", 
			"for_in_range_statement", "while_statement", "print_statement", "expressions", 
			"expression", "arithmetic_expression", "relational_expression", "logical_expression", 
			"ternary_expression", "primary", "logical_op", "add_minus", "mul_div", 
			"relational_op", "data_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'end'", "';'", "'='", "','", "'if'", "'('", "')'", 
			"'{'", "'}'", "'else'", "'for-loop'", "'for'", "'in'", "'range'", "'while'", 
			"'print'", "'not'", "'int'", "'str'", "'bool'", null, null, null, null, 
			null, "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INT", "STR", 
			"BOOL", "UNARY_OP", "ID", "AND", "OR", "IS_EQUAL", "IS_NOT_EQUAL", "IS_GREATER", 
			"IS_LESS", "IS_GREATER_EQUAL", "IS_LESSER_EQUAL", "ADD", "MINUS", "MUL", 
			"DIV", "TERNARY_TRUE", "TERNARY_FALSE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "macaroni.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public macaroniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(macaroniParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			block();
			setState(54);
			match(T__1);
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856161992L) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_range_statementContext for_in_range_statement() {
			return getRuleContext(For_in_range_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				for_in_range_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				print_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				expression();
				setState(71);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode ID() { return getToken(macaroniParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				data_type();
				setState(76);
				ids();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				data_type();
				setState(79);
				match(ID);
				setState(80);
				match(T__3);
				setState(81);
				expression();
				setState(82);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(macaroniParser.ID, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ids);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				setState(87);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				setState(89);
				match(T__4);
				setState(90);
				ids();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(macaroniParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(T__3);
			setState(95);
			expression();
			setState(96);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public If_statementsContext if_statements() {
			return getRuleContext(If_statementsContext.class,0);
		}
		public Else_statementsContext else_statements() {
			return getRuleContext(Else_statementsContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__5);
			setState(99);
			match(T__6);
			setState(100);
			expression();
			setState(101);
			match(T__7);
			setState(102);
			match(T__8);
			setState(103);
			if_statements();
			setState(104);
			match(T__9);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(105);
				match(T__10);
				setState(106);
				match(T__8);
				setState(107);
				else_statements();
				setState(108);
				match(T__9);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterIf_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitIf_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitIf_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementsContext if_statements() throws RecognitionException {
		If_statementsContext _localctx = new If_statementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856161992L) != 0)) {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterElse_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitElse_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitElse_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementsContext else_statements() throws RecognitionException {
		Else_statementsContext _localctx = new Else_statementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856161992L) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(macaroniParser.ID, 0); }
		public TerminalNode UNARY_OP() { return getToken(macaroniParser.UNARY_OP, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(UNARY_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__11);
			setState(128);
			match(T__6);
			setState(129);
			variable_declaration();
			setState(130);
			expression();
			setState(131);
			match(T__2);
			setState(132);
			operation();
			setState(133);
			match(T__7);
			setState(134);
			match(T__8);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856161992L) != 0)) {
				{
				{
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_in_range_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(macaroniParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_in_range_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_range_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterFor_in_range_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitFor_in_range_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitFor_in_range_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_range_statementContext for_in_range_statement() throws RecognitionException {
		For_in_range_statementContext _localctx = new For_in_range_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_in_range_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__12);
			setState(144);
			match(T__6);
			setState(145);
			match(ID);
			setState(146);
			match(T__13);
			setState(147);
			match(T__14);
			setState(148);
			match(T__6);
			setState(149);
			expression();
			setState(150);
			match(T__4);
			setState(151);
			expression();
			setState(152);
			match(T__7);
			setState(153);
			match(T__7);
			setState(154);
			match(T__8);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856161992L) != 0)) {
				{
				{
				setState(155);
				statement();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__15);
			setState(164);
			match(T__6);
			setState(165);
			expression();
			setState(166);
			match(T__7);
			setState(167);
			match(T__8);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856161992L) != 0)) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__16);
			setState(177);
			match(T__6);
			setState(178);
			expressions();
			setState(179);
			match(T__7);
			setState(180);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressions);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				expression();
				setState(184);
				match(T__4);
				setState(185);
				expressions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				arithmetic_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				logical_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				relational_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				ternary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(T__6);
				setState(194);
				expression();
				setState(195);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public Add_minusContext add_minus() {
			return getRuleContext(Add_minusContext.class,0);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						mul_div();
						setState(204);
						arithmetic_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						add_minus();
						setState(208);
						primary();
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relational_expression);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__7:
			case TERNARY_TRUE:
			case TERNARY_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__6);
				setState(217);
				arithmetic_expression(0);
				setState(218);
				relational_op();
				setState(219);
				arithmetic_expression(0);
				setState(220);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expressionContext extends ParserRuleContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public Logical_opContext logical_op() {
			return getRuleContext(Logical_opContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logical_expression);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__6);
				setState(225);
				logical_expression();
				{
				setState(226);
				logical_op();
				}
				setState(227);
				logical_expression();
				setState(228);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__6);
				setState(231);
				match(T__17);
				setState(232);
				logical_expression();
				setState(233);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ternary_expressionContext extends ParserRuleContext {
		public TerminalNode TERNARY_TRUE() { return getToken(macaroniParser.TERNARY_TRUE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TERNARY_FALSE() { return getToken(macaroniParser.TERNARY_FALSE, 0); }
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Ternary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterTernary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitTernary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitTernary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_expressionContext ternary_expression() throws RecognitionException {
		Ternary_expressionContext _localctx = new Ternary_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ternary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(238);
				relational_expression();
				}
				break;
			case 2:
				{
				setState(239);
				logical_expression();
				}
				break;
			}
			setState(242);
			match(TERNARY_TRUE);
			setState(243);
			expression();
			setState(244);
			match(TERNARY_FALSE);
			setState(245);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(macaroniParser.INT, 0); }
		public TerminalNode STR() { return getToken(macaroniParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(macaroniParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(macaroniParser.ID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 96468992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(macaroniParser.AND, 0); }
		public TerminalNode OR() { return getToken(macaroniParser.OR, 0); }
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitLogical_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitLogical_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_minusContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(macaroniParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(macaroniParser.MINUS, 0); }
		public Add_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterAdd_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitAdd_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitAdd_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_minusContext add_minus() throws RecognitionException {
		Add_minusContext _localctx = new Add_minusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_add_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_divContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(macaroniParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(macaroniParser.DIV, 0); }
		public Mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitMul_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitMul_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		Mul_divContext _localctx = new Mul_divContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode IS_EQUAL() { return getToken(macaroniParser.IS_EQUAL, 0); }
		public TerminalNode IS_NOT_EQUAL() { return getToken(macaroniParser.IS_NOT_EQUAL, 0); }
		public TerminalNode IS_GREATER() { return getToken(macaroniParser.IS_GREATER, 0); }
		public TerminalNode IS_LESS() { return getToken(macaroniParser.IS_LESS, 0); }
		public TerminalNode IS_GREATER_EQUAL() { return getToken(macaroniParser.IS_GREATER_EQUAL, 0); }
		public TerminalNode IS_LESSER_EQUAL() { return getToken(macaroniParser.IS_LESSER_EQUAL, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitRelational_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof macaroniListener ) ((macaroniListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof macaroniVisitor ) return ((macaroniVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"o\b\u0006\u0001\u0007\u0005\u0007r\b\u0007\n\u0007\f\u0007u\t\u0007\u0001"+
		"\b\u0005\bx\b\b\n\b\f\b{\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0089\b\n\n"+
		"\n\f\n\u008c\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009d\b\u000b\n"+
		"\u000b\f\u000b\u00a0\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00aa\b\f\n\f\f\f\u00ad\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bc\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c6\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d3\b\u0010\n\u0010\f\u0010"+
		"\u00d6\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00df\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ed\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00f1\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0001 \u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0006\u0002\u0000\u0016\u0018\u001a\u001a\u0001"+
		"\u0000\u001b\u001c\u0001\u0000#$\u0001\u0000%&\u0001\u0000\u001d\"\u0001"+
		"\u0000\u0013\u0015\u0104\u00004\u0001\u0000\u0000\u0000\u0002<\u0001\u0000"+
		"\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000"+
		"\b[\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fb\u0001\u0000"+
		"\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000"+
		"\u0012|\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016"+
		"\u008f\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a"+
		"\u00b0\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000\u0000\u001e"+
		"\u00c5\u0001\u0000\u0000\u0000 \u00c7\u0001\u0000\u0000\u0000\"\u00de"+
		"\u0001\u0000\u0000\u0000$\u00ec\u0001\u0000\u0000\u0000&\u00f0\u0001\u0000"+
		"\u0000\u0000(\u00f7\u0001\u0000\u0000\u0000*\u00f9\u0001\u0000\u0000\u0000"+
		",\u00fb\u0001\u0000\u0000\u0000.\u00fd\u0001\u0000\u0000\u00000\u00ff"+
		"\u0001\u0000\u0000\u00002\u0101\u0001\u0000\u0000\u000045\u0005\u0001"+
		"\u0000\u000056\u0003\u0002\u0001\u000067\u0005\u0002\u0000\u000078\u0005"+
		"\u0000\u0000\u00018\u0001\u0001\u0000\u0000\u00009;\u0003\u0004\u0002"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?J\u0003\u0006\u0003\u0000@J\u0003\n\u0005\u0000"+
		"AJ\u0003\f\u0006\u0000BJ\u0003\u0014\n\u0000CJ\u0003\u0016\u000b\u0000"+
		"DJ\u0003\u0018\f\u0000EJ\u0003\u001a\r\u0000FG\u0003\u001e\u000f\u0000"+
		"GH\u0005\u0003\u0000\u0000HJ\u0001\u0000\u0000\u0000I?\u0001\u0000\u0000"+
		"\u0000I@\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000\u0000IB\u0001\u0000"+
		"\u0000\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001"+
		"\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000"+
		"\u0000KL\u00032\u0019\u0000LM\u0003\b\u0004\u0000MU\u0001\u0000\u0000"+
		"\u0000NO\u00032\u0019\u0000OP\u0005\u001a\u0000\u0000PQ\u0005\u0004\u0000"+
		"\u0000QR\u0003\u001e\u000f\u0000RS\u0005\u0003\u0000\u0000SU\u0001\u0000"+
		"\u0000\u0000TK\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000U\u0007"+
		"\u0001\u0000\u0000\u0000VW\u0005\u001a\u0000\u0000W\\\u0005\u0003\u0000"+
		"\u0000XY\u0005\u001a\u0000\u0000YZ\u0005\u0005\u0000\u0000Z\\\u0003\b"+
		"\u0004\u0000[V\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000\\\t\u0001"+
		"\u0000\u0000\u0000]^\u0005\u001a\u0000\u0000^_\u0005\u0004\u0000\u0000"+
		"_`\u0003\u001e\u000f\u0000`a\u0005\u0003\u0000\u0000a\u000b\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0006\u0000\u0000cd\u0005\u0007\u0000\u0000de\u0003"+
		"\u001e\u000f\u0000ef\u0005\b\u0000\u0000fg\u0005\t\u0000\u0000gh\u0003"+
		"\u000e\u0007\u0000hn\u0005\n\u0000\u0000ij\u0005\u000b\u0000\u0000jk\u0005"+
		"\t\u0000\u0000kl\u0003\u0010\b\u0000lm\u0005\n\u0000\u0000mo\u0001\u0000"+
		"\u0000\u0000ni\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\r\u0001"+
		"\u0000\u0000\u0000pr\u0003\u0004\u0002\u0000qp\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000t\u000f\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0003"+
		"\u0004\u0002\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0011\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u001a\u0000\u0000}~\u0005"+
		"\u0019\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0080\u0005\f"+
		"\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0082\u0003\u0006"+
		"\u0003\u0000\u0082\u0083\u0003\u001e\u000f\u0000\u0083\u0084\u0005\u0003"+
		"\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u0086\u0005\b\u0000"+
		"\u0000\u0086\u008a\u0005\t\u0000\u0000\u0087\u0089\u0003\u0004\u0002\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\n\u0000\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\r\u0000\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091\u0092"+
		"\u0005\u001a\u0000\u0000\u0092\u0093\u0005\u000e\u0000\u0000\u0093\u0094"+
		"\u0005\u000f\u0000\u0000\u0094\u0095\u0005\u0007\u0000\u0000\u0095\u0096"+
		"\u0003\u001e\u000f\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098"+
		"\u0003\u001e\u000f\u0000\u0098\u0099\u0005\b\u0000\u0000\u0099\u009a\u0005"+
		"\b\u0000\u0000\u009a\u009e\u0005\t\u0000\u0000\u009b\u009d\u0003\u0004"+
		"\u0002\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2\u0017\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0010\u0000\u0000\u00a4\u00a5\u0005\u0007\u0000"+
		"\u0000\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u00a7\u0005\b\u0000\u0000"+
		"\u00a7\u00ab\u0005\t\u0000\u0000\u00a8\u00aa\u0003\u0004\u0002\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\n\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0011\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00b3"+
		"\u0003\u001c\u000e\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0003\u0000\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00bc\u0003"+
		"\u001e\u000f\u0000\u00b7\u00b8\u0003\u001e\u000f\u0000\u00b8\u00b9\u0005"+
		"\u0005\u0000\u0000\u00b9\u00ba\u0003\u001c\u000e\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd\u00c6\u0003"+
		" \u0010\u0000\u00be\u00c6\u0003$\u0012\u0000\u00bf\u00c6\u0003\"\u0011"+
		"\u0000\u00c0\u00c6\u0003&\u0013\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000"+
		"\u00c2\u00c3\u0003\u001e\u000f\u0000\u00c3\u00c4\u0005\b\u0000\u0000\u00c4"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c5"+
		"\u00be\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6"+
		"\u001f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006\u0010\uffff\uffff\u0000"+
		"\u00c8\u00c9\u0003(\u0014\u0000\u00c9\u00d4\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\n\u0003\u0000\u0000\u00cb\u00cc\u0003.\u0017\u0000\u00cc\u00cd"+
		"\u0003 \u0010\u0004\u00cd\u00d3\u0001\u0000\u0000\u0000\u00ce\u00cf\n"+
		"\u0002\u0000\u0000\u00cf\u00d0\u0003,\u0016\u0000\u00d0\u00d1\u0003(\u0014"+
		"\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5!\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00df\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000"+
		"\u00d9\u00da\u0003 \u0010\u0000\u00da\u00db\u00030\u0018\u0000\u00db\u00dc"+
		"\u0003 \u0010\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00d7\u0001\u0000\u0000\u0000\u00de\u00d8\u0001"+
		"\u0000\u0000\u0000\u00df#\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0007"+
		"\u0000\u0000\u00e1\u00e2\u0003$\u0012\u0000\u00e2\u00e3\u0003*\u0015\u0000"+
		"\u00e3\u00e4\u0003$\u0012\u0000\u00e4\u00e5\u0005\b\u0000\u0000\u00e5"+
		"\u00ed\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0007\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0012\u0000\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9\u00ea"+
		"\u0005\b\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003"+
		"(\u0014\u0000\u00ec\u00e0\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed%\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0003\"\u0011\u0000\u00ef\u00f1\u0003$\u0012\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\'\u0000\u0000\u00f3"+
		"\u00f4\u0003\u001e\u000f\u0000\u00f4\u00f5\u0005(\u0000\u0000\u00f5\u00f6"+
		"\u0003\u001e\u000f\u0000\u00f6\'\u0001\u0000\u0000\u0000\u00f7\u00f8\u0007"+
		"\u0000\u0000\u0000\u00f8)\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0001"+
		"\u0000\u0000\u00fa+\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0002\u0000"+
		"\u0000\u00fc-\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007\u0003\u0000\u0000"+
		"\u00fe/\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0004\u0000\u0000\u0100"+
		"1\u0001\u0000\u0000\u0000\u0101\u0102\u0007\u0005\u0000\u0000\u01023\u0001"+
		"\u0000\u0000\u0000\u0011<IT[nsy\u008a\u009e\u00ab\u00bb\u00c5\u00d2\u00d4"+
		"\u00de\u00ec\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
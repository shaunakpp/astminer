// Generated from Corundum.g4 by ANTLR 4.7.1
package me.vovak.antlr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CorundumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		PIR=9, IF=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, 
		EXP=25, EQUAL=26, NOT_EQUAL=27, GREATER=28, LESS=29, LESS_EQUAL=30, GREATER_EQUAL=31, 
		ASSIGN=32, PLUS_ASSIGN=33, MINUS_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, 
		MOD_ASSIGN=37, EXP_ASSIGN=38, BIT_AND=39, BIT_OR=40, BIT_XOR=41, BIT_NOT=42, 
		BIT_SHL=43, BIT_SHR=44, AND=45, OR=46, NOT=47, LEFT_RBRACKET=48, RIGHT_RBRACKET=49, 
		LEFT_SBRACKET=50, RIGHT_SBRACKET=51, NIL=52, SL_COMMENT=53, ML_COMMENT=54, 
		WS=55, INT=56, FLOAT=57, ID=58, ID_GLOBAL=59, ID_FUNCTION=60;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_global_get = 3, 
		RULE_global_set = 4, RULE_global_result = 5, RULE_function_inline_call = 6, 
		RULE_require_block = 7, RULE_pir_inline = 8, RULE_pir_expression_list = 9, 
		RULE_function_definition = 10, RULE_function_definition_body = 11, RULE_function_definition_header = 12, 
		RULE_function_name = 13, RULE_function_definition_params = 14, RULE_function_definition_params_list = 15, 
		RULE_function_definition_param_id = 16, RULE_return_statement = 17, RULE_function_call = 18, 
		RULE_function_call_param_list = 19, RULE_function_call_params = 20, RULE_function_param = 21, 
		RULE_function_unnamed_param = 22, RULE_function_named_param = 23, RULE_function_call_assignment = 24, 
		RULE_all_result = 25, RULE_elsif_statement = 26, RULE_if_elsif_statement = 27, 
		RULE_if_statement = 28, RULE_unless_statement = 29, RULE_while_statement = 30, 
		RULE_for_statement = 31, RULE_init_expression = 32, RULE_all_assignment = 33, 
		RULE_for_init_list = 34, RULE_cond_expression = 35, RULE_loop_expression = 36, 
		RULE_for_loop_list = 37, RULE_statement_body = 38, RULE_statement_expression_list = 39, 
		RULE_assignment = 40, RULE_dynamic_assignment = 41, RULE_int_assignment = 42, 
		RULE_float_assignment = 43, RULE_string_assignment = 44, RULE_initial_array_assignment = 45, 
		RULE_array_assignment = 46, RULE_array_definition = 47, RULE_array_definition_elements = 48, 
		RULE_array_selector = 49, RULE_dynamic_result = 50, RULE_dynamic = 51, 
		RULE_int_result = 52, RULE_float_result = 53, RULE_string_result = 54, 
		RULE_comparison_list = 55, RULE_comparison = 56, RULE_comp_var = 57, RULE_lvalue = 58, 
		RULE_rvalue = 59, RULE_break_expression = 60, RULE_literal_t = 61, RULE_float_t = 62, 
		RULE_int_t = 63, RULE_bool_t = 64, RULE_nil_t = 65, RULE_id = 66, RULE_id_global = 67, 
		RULE_id_function = 68, RULE_terminator = 69, RULE_else_token = 70, RULE_crlf = 71;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "global_get", "global_set", "global_result", 
		"function_inline_call", "require_block", "pir_inline", "pir_expression_list", 
		"function_definition", "function_definition_body", "function_definition_header", 
		"function_name", "function_definition_params", "function_definition_params_list", 
		"function_definition_param_id", "return_statement", "function_call", "function_call_param_list", 
		"function_call_params", "function_param", "function_unnamed_param", "function_named_param", 
		"function_call_assignment", "all_result", "elsif_statement", "if_elsif_statement", 
		"if_statement", "unless_statement", "while_statement", "for_statement", 
		"init_expression", "all_assignment", "for_init_list", "cond_expression", 
		"loop_expression", "for_loop_list", "statement_body", "statement_expression_list", 
		"assignment", "dynamic_assignment", "int_assignment", "float_assignment", 
		"string_assignment", "initial_array_assignment", "array_assignment", "array_definition", 
		"array_definition_elements", "array_selector", "dynamic_result", "dynamic", 
		"int_result", "float_result", "string_result", "comparison_list", "comparison", 
		"comp_var", "lvalue", "rvalue", "break_expression", "literal_t", "float_t", 
		"int_t", "bool_t", "nil_t", "id", "id_global", "id_function", "terminator", 
		"else_token", "crlf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "';'", null, "'require'", "'end'", "'def'", "'return'", 
		"'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
		"'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", 
		null, null, null, "'('", "')'", "'['", "']'", "'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
		"RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", 
		"FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", 
		"NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
		"AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
		"ID", "ID_GLOBAL", "ID_FUNCTION"
	};
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
	public String getGrammarFileName() { return "Corundum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CorundumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expression_list(0);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(147);
				expression();
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(148);
					terminator(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(151);
					terminator(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(156);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(157);
					terminator(0);
					setState(158);
					expression();
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(159);
						terminator(0);
						}
						break;
					}
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(176);
				pir_inline();
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

	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public Id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterGlobal_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitGlobal_get(this);
		}
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(180);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(181);
			((Global_getContext)_localctx).global_name = id_global();
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

	public static class Global_setContext extends ParserRuleContext {
		public Id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterGlobal_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitGlobal_set(this);
		}
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((Global_setContext)_localctx).global_name = id_global();
			setState(184);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(185);
			((Global_setContext)_localctx).result = all_result();
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

	public static class Global_resultContext extends ParserRuleContext {
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterGlobal_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitGlobal_result(this);
		}
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			id_global();
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

	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_inline_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_inline_call(this);
		}
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			function_call();
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

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(CorundumParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterRequire_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitRequire_block(this);
		}
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(REQUIRE);
			setState(192);
			literal_t();
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

	public static class Pir_inlineContext extends ParserRuleContext {
		public TerminalNode PIR() { return getToken(CorundumParser.PIR, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Pir_expression_listContext pir_expression_list() {
			return getRuleContext(Pir_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterPir_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitPir_inline(this);
		}
	}

	public final Pir_inlineContext pir_inline() throws RecognitionException {
		Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PIR);
			setState(195);
			crlf();
			setState(196);
			pir_expression_list();
			setState(197);
			match(END);
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

	public static class Pir_expression_listContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterPir_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitPir_expression_list(this);
		}
	}

	public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
		Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expression_list(0);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			function_definition_header();
			setState(202);
			function_definition_body();
			setState(203);
			match(END);
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

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_body(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expression_list(0);
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(CorundumParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_header(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_definition_header);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(DEF);
				setState(208);
				function_name();
				setState(209);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(DEF);
				setState(212);
				function_name();
				setState(213);
				function_definition_params();
				setState(214);
				crlf();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_name);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				id();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_params(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition_params);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(LEFT_RBRACKET);
				setState(223);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(LEFT_RBRACKET);
				setState(225);
				function_definition_params_list(0);
				setState(226);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				function_definition_params_list(0);
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

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public Function_definition_param_idContext function_definition_param_id() {
			return getRuleContext(Function_definition_param_idContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_params_list(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			function_definition_param_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(234);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(235);
					match(COMMA);
					setState(236);
					function_definition_param_id();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Function_definition_param_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_param_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_param_id(this);
		}
	}

	public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
		Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			id();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CorundumParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(RETURN);
			setState(245);
			all_result();
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((Function_callContext)_localctx).name = function_name();
				setState(248);
				match(LEFT_RBRACKET);
				setState(249);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(250);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				((Function_callContext)_localctx).name = function_name();
				setState(253);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				((Function_callContext)_localctx).name = function_name();
				setState(256);
				match(LEFT_RBRACKET);
				setState(257);
				match(RIGHT_RBRACKET);
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

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call_param_list(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			function_call_params(0);
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public Function_paramContext function_param() {
			return getRuleContext(Function_paramContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call_params(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			function_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(266);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(267);
					match(COMMA);
					setState(268);
					function_param();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_param(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(274);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(275);
				function_named_param();
				}
				break;
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

	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_unnamed_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_unnamed_param(this);
		}
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(278);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(279);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(280);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(281);
				dynamic_result(0);
				}
				break;
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

	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_named_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_named_param(this);
		}
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			id();
			setState(285);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(286);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(287);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(288);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(289);
				dynamic_result(0);
				}
				break;
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

	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call_assignment(this);
		}
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			function_call();
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

	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Global_resultContext global_result() {
			return getRuleContext(Global_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterAll_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitAll_result(this);
		}
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(294);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(295);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(296);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(297);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(298);
				global_result();
				}
				break;
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

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitElsif_statement(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			if_elsif_statement();
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

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(CorundumParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitIf_elsif_statement(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_elsif_statement);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(ELSIF);
				setState(304);
				cond_expression();
				setState(305);
				crlf();
				setState(306);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(ELSIF);
				setState(309);
				cond_expression();
				setState(310);
				crlf();
				setState(311);
				statement_body();
				setState(312);
				else_token();
				setState(313);
				crlf();
				setState(314);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(ELSIF);
				setState(317);
				cond_expression();
				setState(318);
				crlf();
				setState(319);
				statement_body();
				setState(320);
				if_elsif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CorundumParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(IF);
				setState(325);
				cond_expression();
				setState(326);
				crlf();
				setState(327);
				statement_body();
				setState(328);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(IF);
				setState(331);
				cond_expression();
				setState(332);
				crlf();
				setState(333);
				statement_body();
				setState(334);
				else_token();
				setState(335);
				crlf();
				setState(336);
				statement_body();
				setState(337);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(IF);
				setState(340);
				cond_expression();
				setState(341);
				crlf();
				setState(342);
				statement_body();
				setState(343);
				elsif_statement();
				setState(344);
				match(END);
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

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(CorundumParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitUnless_statement(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unless_statement);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(UNLESS);
				setState(349);
				cond_expression();
				setState(350);
				crlf();
				setState(351);
				statement_body();
				setState(352);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(UNLESS);
				setState(355);
				cond_expression();
				setState(356);
				crlf();
				setState(357);
				statement_body();
				setState(358);
				else_token();
				setState(359);
				crlf();
				setState(360);
				statement_body();
				setState(361);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(UNLESS);
				setState(364);
				cond_expression();
				setState(365);
				crlf();
				setState(366);
				statement_body();
				setState(367);
				elsif_statement();
				setState(368);
				match(END);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CorundumParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(WHILE);
			setState(373);
			cond_expression();
			setState(374);
			crlf();
			setState(375);
			statement_body();
			setState(376);
			match(END);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CorundumParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CorundumParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CorundumParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_statement);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(FOR);
				setState(379);
				match(LEFT_RBRACKET);
				setState(380);
				init_expression();
				setState(381);
				match(SEMICOLON);
				setState(382);
				cond_expression();
				setState(383);
				match(SEMICOLON);
				setState(384);
				loop_expression();
				setState(385);
				match(RIGHT_RBRACKET);
				setState(386);
				crlf();
				setState(387);
				statement_body();
				setState(388);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(FOR);
				setState(391);
				init_expression();
				setState(392);
				match(SEMICOLON);
				setState(393);
				cond_expression();
				setState(394);
				match(SEMICOLON);
				setState(395);
				loop_expression();
				setState(396);
				crlf();
				setState(397);
				statement_body();
				setState(398);
				match(END);
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

	public static class Init_expressionContext extends ParserRuleContext {
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public Init_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInit_expression(this);
		}
	}

	public final Init_expressionContext init_expression() throws RecognitionException {
		Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_init_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			for_init_list(0);
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

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterAll_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitAll_assignment(this);
		}
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(404);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(405);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(406);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(407);
				dynamic_assignment();
				}
				break;
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

	public static class For_init_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public For_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFor_init_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFor_init_list(this);
		}
	}

	public final For_init_listContext for_init_list() throws RecognitionException {
		return for_init_list(0);
	}

	private For_init_listContext for_init_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_init_listContext _localctx = new For_init_listContext(_ctx, _parentState);
		For_init_listContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_for_init_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_init_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
					setState(413);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(414);
					match(COMMA);
					setState(415);
					all_assignment();
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitCond_expression(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			comparison_list();
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitLoop_expression(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			for_loop_list(0);
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

	public static class For_loop_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public For_loop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFor_loop_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFor_loop_list(this);
		}
	}

	public final For_loop_listContext for_loop_list() throws RecognitionException {
		return for_loop_list(0);
	}

	private For_loop_listContext for_loop_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_loop_listContext _localctx = new For_loop_listContext(_ctx, _parentState);
		For_loop_listContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_for_loop_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(426);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_loop_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
					setState(428);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(429);
					match(COMMA);
					setState(430);
					all_assignment();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitStatement_body(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			statement_expression_list(0);
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

	public static class Statement_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(CorundumParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitStatement_expression_list(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(439);
				expression();
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(440);
					terminator(0);
					}
					break;
				}
				}
				break;
			case RETRY:
				{
				setState(443);
				match(RETRY);
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(444);
					terminator(0);
					}
					break;
				}
				}
				break;
			case BREAK:
				{
				setState(447);
				break_expression();
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(448);
					terminator(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(453);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(454);
						expression();
						setState(456);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(455);
							terminator(0);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(458);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(459);
						match(RETRY);
						setState(461);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(460);
							terminator(0);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(463);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(464);
						break_expression();
						setState(466);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(465);
							terminator(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(474);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(475);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(478);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				rvalue(0);
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

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterDynamic_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitDynamic_assignment(this);
		}
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dynamic_assignment);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(484);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(485);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(488);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				dynamic_result(0);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInt_assignment(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_int_assignment);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(494);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(495);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(498);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(499);
				int_result(0);
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

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFloat_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFloat_assignment(this);
		}
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_float_assignment);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(504);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(505);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(508);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(509);
				float_result(0);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitString_assignment(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_string_assignment);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(514);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(515);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(518);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(519);
				string_result(0);
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

	public static class Initial_array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public TerminalNode LEFT_SBRACKET() { return getToken(CorundumParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(CorundumParser.RIGHT_SBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInitial_array_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInitial_array_assignment(this);
		}
	}

	public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
		Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(524);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(525);
			match(LEFT_SBRACKET);
			setState(526);
			match(RIGHT_SBRACKET);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_selectorContext arr_def;
		public Token op;
		public All_resultContext arr_val;
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_assignment(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(529);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(530);
			((Array_assignmentContext)_localctx).arr_val = all_result();
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(CorundumParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(CorundumParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_definition(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(LEFT_SBRACKET);
			setState(533);
			array_definition_elements(0);
			setState(534);
			match(RIGHT_SBRACKET);
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

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_definition_elements(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(537);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(538);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(541);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(542);
					match(COMMA);
					setState(545);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(543);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(544);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Array_selectorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(CorundumParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(CorundumParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_selector(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_array_selector);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				id();
				setState(553);
				match(LEFT_SBRACKET);
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(554);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(555);
					dynamic_result(0);
					}
					break;
				}
				setState(558);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				id_global();
				setState(561);
				match(LEFT_SBRACKET);
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(562);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(563);
					dynamic_result(0);
					}
					break;
				}
				setState(566);
				match(RIGHT_SBRACKET);
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

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public DynamicContext dynamic() {
			return getRuleContext(DynamicContext.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterDynamic_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitDynamic_result(this);
		}
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(571);
				int_result(0);
				setState(572);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(575);
				float_result(0);
				setState(576);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(577);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(579);
				string_result(0);
				setState(580);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(581);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(583);
				int_result(0);
				setState(584);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(585);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(587);
				float_result(0);
				setState(588);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(591);
				match(LEFT_RBRACKET);
				setState(592);
				dynamic_result(0);
				setState(593);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(595);
				dynamic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(619);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(598);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(599);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(600);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(601);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(602);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(603);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(604);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(605);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(606);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(607);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(608);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(609);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(610);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(611);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(612);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(613);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(614);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(615);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(616);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(617);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(618);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class DynamicContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public DynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitDynamic(this);
		}
	}

	public final DynamicContext dynamic() throws RecognitionException {
		DynamicContext _localctx = new DynamicContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dynamic);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				array_selector();
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

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInt_result(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(630);
				match(LEFT_RBRACKET);
				setState(631);
				int_result(0);
				setState(632);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(634);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(643);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(637);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(638);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(639);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(640);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(641);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(642);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFloat_result(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(649);
				int_result(0);
				setState(650);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(651);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(653);
				int_result(0);
				setState(654);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(655);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(657);
				match(LEFT_RBRACKET);
				setState(658);
				float_result(0);
				setState(659);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(661);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(676);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(664);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(665);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(666);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(667);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(668);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(669);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(670);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(671);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(672);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(673);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(674);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(675);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitString_result(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(682);
				int_result(0);
				setState(683);
				((String_resultContext)_localctx).op = match(MUL);
				setState(684);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(686);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(689);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(690);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(691);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(692);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(693);
						((String_resultContext)_localctx).op = match(MUL);
						setState(694);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(CorundumParser.BIT_AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(CorundumParser.AND, 0); }
		public TerminalNode BIT_OR() { return getToken(CorundumParser.BIT_OR, 0); }
		public TerminalNode OR() { return getToken(CorundumParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitComparison_list(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparison_list);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				((Comparison_listContext)_localctx).left = comparison();
				setState(701);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(702);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				((Comparison_listContext)_localctx).left = comparison();
				setState(705);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(706);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				((Comparison_listContext)_localctx).left = comparison();
				setState(709);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(710);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				((Comparison_listContext)_localctx).left = comparison();
				setState(713);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(714);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				match(LEFT_RBRACKET);
				setState(717);
				comparison_list();
				setState(718);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(720);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(CorundumParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CorundumParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(CorundumParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(CorundumParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CorundumParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CorundumParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparison);
		int _la;
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				((ComparisonContext)_localctx).left = comp_var();
				setState(724);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(725);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				((ComparisonContext)_localctx).left = comp_var();
				setState(728);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(729);
				((ComparisonContext)_localctx).right = comp_var();
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

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterComp_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitComp_var(this);
		}
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_comp_var);
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				id();
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

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			id();
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

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Initial_array_assignmentContext initial_array_assignment() {
			return getRuleContext(Initial_array_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CorundumParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(CorundumParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(CorundumParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(CorundumParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(CorundumParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(CorundumParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(CorundumParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(CorundumParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(CorundumParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CorundumParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(CorundumParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(CorundumParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CorundumParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CorundumParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(CorundumParser.OR, 0); }
		public TerminalNode AND() { return getToken(CorundumParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(741);
				lvalue();
				}
				break;
			case 2:
				{
				setState(742);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(743);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(744);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(745);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(746);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(747);
				global_set();
				}
				break;
			case 8:
				{
				setState(748);
				global_get();
				}
				break;
			case 9:
				{
				setState(749);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(750);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(751);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(752);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(753);
				assignment();
				}
				break;
			case 14:
				{
				setState(754);
				function_call();
				}
				break;
			case 15:
				{
				setState(755);
				literal_t();
				}
				break;
			case 16:
				{
				setState(756);
				bool_t();
				}
				break;
			case 17:
				{
				setState(757);
				float_t();
				}
				break;
			case 18:
				{
				setState(758);
				int_t();
				}
				break;
			case 19:
				{
				setState(759);
				nil_t();
				}
				break;
			case 20:
				{
				setState(760);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(761);
				rvalue(10);
				}
				break;
			case 21:
				{
				setState(762);
				match(LEFT_RBRACKET);
				setState(763);
				rvalue(0);
				setState(764);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(795);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(768);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(769);
						match(EXP);
						setState(770);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(771);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(772);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(773);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(774);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(775);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(776);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(777);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(778);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(779);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(780);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(781);
						match(BIT_AND);
						setState(782);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(783);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(784);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(785);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(786);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(787);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(788);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(789);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(790);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(791);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(792);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(793);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(794);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CorundumParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterBreak_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitBreak_expression(this);
		}
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(BREAK);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(CorundumParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitLiteral_t(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(LITERAL);
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

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CorundumParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFloat_t(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(FLOAT);
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

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CorundumParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInt_t(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(INT);
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

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CorundumParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CorundumParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitBool_t(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(CorundumParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitNil_t(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(NIL);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CorundumParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(ID);
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

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(CorundumParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterId_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitId_global(this);
		}
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(ID_GLOBAL);
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

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID_FUNCTION() { return getToken(CorundumParser.ID_FUNCTION, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterId_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitId_function(this);
		}
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(ID_FUNCTION);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CorundumParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(819);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(820);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(823);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(824);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(825);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(826);
						crlf();
						}
						break;
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CorundumParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterElse_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitElse_token(this);
		}
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(ELSE);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(CorundumParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitCrlf(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(CRLF);
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 15:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 20:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 34:
			return for_init_list_sempred((For_init_listContext)_localctx, predIndex);
		case 37:
			return for_loop_list_sempred((For_loop_listContext)_localctx, predIndex);
		case 39:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 48:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 50:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 52:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 53:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 54:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 59:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 69:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_init_list_sempred(For_init_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_loop_list_sempred(For_loop_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 11);
		case 25:
			return precpred(_ctx, 9);
		case 26:
			return precpred(_ctx, 8);
		case 27:
			return precpred(_ctx, 7);
		case 28:
			return precpred(_ctx, 6);
		case 29:
			return precpred(_ctx, 5);
		case 30:
			return precpred(_ctx, 4);
		case 31:
			return precpred(_ctx, 3);
		case 32:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 4);
		case 34:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0347\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\3\5\3\u0098\n\3\3\3\5\3\u009b\n\3\5\3\u009d\n\3"+
		"\3\3\3\3\3\3\3\3\5\3\u00a3\n\3\7\3\u00a5\n\3\f\3\16\3\u00a8\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b4\n\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00db\n\16\3\17\3\17\5\17\u00df\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f0\n\21\f"+
		"\21\16\21\u00f3\13\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u0110\n\26\f\26\16\26\u0113\13\26\3\27\3\27"+
		"\5\27\u0117\n\27\3\30\3\30\3\30\3\30\5\30\u011d\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u0125\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u012e\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0145\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015d\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0175\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0193\n!\3\"\3\"\3#"+
		"\3#\3#\3#\5#\u019b\n#\3$\3$\3$\3$\3$\3$\7$\u01a3\n$\f$\16$\u01a6\13$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01b2\n\'\f\'\16\'\u01b5\13\'\3"+
		"(\3(\3)\3)\3)\5)\u01bc\n)\3)\3)\5)\u01c0\n)\3)\3)\5)\u01c4\n)\5)\u01c6"+
		"\n)\3)\3)\3)\5)\u01cb\n)\3)\3)\3)\5)\u01d0\n)\3)\3)\3)\5)\u01d5\n)\7)"+
		"\u01d7\n)\f)\16)\u01da\13)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01e4\n*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u01ee\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01f8\n,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u0202\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u020c\n.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\5"+
		"\62\u021e\n\62\3\62\3\62\3\62\3\62\5\62\u0224\n\62\7\62\u0226\n\62\f\62"+
		"\16\62\u0229\13\62\3\63\3\63\3\63\3\63\5\63\u022f\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0237\n\63\3\63\3\63\5\63\u023b\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0257\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u026e\n\64\f\64\16\64\u0271\13\64"+
		"\3\65\3\65\3\65\5\65\u0276\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u027e"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0286\n\66\f\66\16\66\u0289\13"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\5\67\u0299\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u02a7\n\67\f\67\16\67\u02aa\13\67\38\38\38\38\38\38\5"+
		"8\u02b2\n8\38\38\38\38\38\38\78\u02ba\n8\f8\168\u02bd\138\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u02d4\n9\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u02de\n:\3;\3;\3;\5;\u02e3\n;\3<\3<\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5="+
		"\u0301\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\7=\u031e\n=\f=\16=\u0321\13=\3>\3>\3?\3?\3@\3@\3"+
		"A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\5G\u0338\nG\3G\3G\3G\3G\7"+
		"G\u033e\nG\fG\16G\u0341\13G\3H\3H\3I\3I\3I\2\17\4 *FLPbfjlnx\u008cJ\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\2\f\3\2#(\3\2\30\32\3\2\26\27\3\2\36!\3\2\34\35\4\2,,\61\61\3\2"+
		"-.\3\2*+\3\2/\60\3\2\24\25\2\u0385\2\u0092\3\2\2\2\4\u009c\3\2\2\2\6\u00b3"+
		"\3\2\2\2\b\u00b5\3\2\2\2\n\u00b9\3\2\2\2\f\u00bd\3\2\2\2\16\u00bf\3\2"+
		"\2\2\20\u00c1\3\2\2\2\22\u00c4\3\2\2\2\24\u00c9\3\2\2\2\26\u00cb\3\2\2"+
		"\2\30\u00cf\3\2\2\2\32\u00da\3\2\2\2\34\u00de\3\2\2\2\36\u00e7\3\2\2\2"+
		" \u00e9\3\2\2\2\"\u00f4\3\2\2\2$\u00f6\3\2\2\2&\u0105\3\2\2\2(\u0107\3"+
		"\2\2\2*\u0109\3\2\2\2,\u0116\3\2\2\2.\u011c\3\2\2\2\60\u011e\3\2\2\2\62"+
		"\u0126\3\2\2\2\64\u012d\3\2\2\2\66\u012f\3\2\2\28\u0144\3\2\2\2:\u015c"+
		"\3\2\2\2<\u0174\3\2\2\2>\u0176\3\2\2\2@\u0192\3\2\2\2B\u0194\3\2\2\2D"+
		"\u019a\3\2\2\2F\u019c\3\2\2\2H\u01a7\3\2\2\2J\u01a9\3\2\2\2L\u01ab\3\2"+
		"\2\2N\u01b6\3\2\2\2P\u01c5\3\2\2\2R\u01e3\3\2\2\2T\u01ed\3\2\2\2V\u01f7"+
		"\3\2\2\2X\u0201\3\2\2\2Z\u020b\3\2\2\2\\\u020d\3\2\2\2^\u0212\3\2\2\2"+
		"`\u0216\3\2\2\2b\u021a\3\2\2\2d\u023a\3\2\2\2f\u0256\3\2\2\2h\u0275\3"+
		"\2\2\2j\u027d\3\2\2\2l\u0298\3\2\2\2n\u02b1\3\2\2\2p\u02d3\3\2\2\2r\u02dd"+
		"\3\2\2\2t\u02e2\3\2\2\2v\u02e4\3\2\2\2x\u0300\3\2\2\2z\u0322\3\2\2\2|"+
		"\u0324\3\2\2\2~\u0326\3\2\2\2\u0080\u0328\3\2\2\2\u0082\u032a\3\2\2\2"+
		"\u0084\u032c\3\2\2\2\u0086\u032e\3\2\2\2\u0088\u0330\3\2\2\2\u008a\u0332"+
		"\3\2\2\2\u008c\u0337\3\2\2\2\u008e\u0342\3\2\2\2\u0090\u0344\3\2\2\2\u0092"+
		"\u0093\5\4\3\2\u0093\3\3\2\2\2\u0094\u0095\b\3\1\2\u0095\u0097\5\6\4\2"+
		"\u0096\u0098\5\u008cG\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009d\3\2\2\2\u0099\u009b\5\u008cG\2\u009a\u0099\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u00a6\3\2\2\2\u009e\u009f\f\4\2\2\u009f\u00a0\5\u008cG\2\u00a0\u00a2"+
		"\5\6\4\2\u00a1\u00a3\5\u008cG\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2"+
		"\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00b4\5\26\f\2\u00aa\u00b4\5\16\b\2\u00ab\u00b4\5\20\t\2\u00ac\u00b4"+
		"\5:\36\2\u00ad\u00b4\5<\37\2\u00ae\u00b4\5x=\2\u00af\u00b4\5$\23\2\u00b0"+
		"\u00b4\5> \2\u00b1\u00b4\5@!\2\u00b2\u00b4\5\22\n\2\u00b3\u00a9\3\2\2"+
		"\2\u00b3\u00aa\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad"+
		"\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\7\3\2\2\2\u00b5\u00b6\5v<\2\u00b6"+
		"\u00b7\7\"\2\2\u00b7\u00b8\5\u0088E\2\u00b8\t\3\2\2\2\u00b9\u00ba\5\u0088"+
		"E\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\5\64\33\2\u00bc\13\3\2\2\2\u00bd\u00be"+
		"\5\u0088E\2\u00be\r\3\2\2\2\u00bf\u00c0\5&\24\2\u00c0\17\3\2\2\2\u00c1"+
		"\u00c2\7\7\2\2\u00c2\u00c3\5|?\2\u00c3\21\3\2\2\2\u00c4\u00c5\7\13\2\2"+
		"\u00c5\u00c6\5\u0090I\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\b\2\2\u00c8"+
		"\23\3\2\2\2\u00c9\u00ca\5\4\3\2\u00ca\25\3\2\2\2\u00cb\u00cc\5\32\16\2"+
		"\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7\b\2\2\u00ce\27\3\2\2\2\u00cf\u00d0"+
		"\5\4\3\2\u00d0\31\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\5\34\17\2\u00d3"+
		"\u00d4\5\u0090I\2\u00d4\u00db\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7"+
		"\5\34\17\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\5\u0090I\2\u00d9\u00db\3"+
		"\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d5\3\2\2\2\u00db\33\3\2\2\2\u00dc"+
		"\u00df\5\u008aF\2\u00dd\u00df\5\u0086D\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e1\7\62\2\2\u00e1\u00e8\7\63\2\2\u00e2"+
		"\u00e3\7\62\2\2\u00e3\u00e4\5 \21\2\u00e4\u00e5\7\63\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e8\5 \21\2\u00e7\u00e0\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\b\21\1\2\u00ea\u00eb\5\"\22"+
		"\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\f\3\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00f0"+
		"\5\"\22\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2!\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5"+
		"\u0086D\2\u00f5#\3\2\2\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\5\64\33\2\u00f8"+
		"%\3\2\2\2\u00f9\u00fa\5\34\17\2\u00fa\u00fb\7\62\2\2\u00fb\u00fc\5(\25"+
		"\2\u00fc\u00fd\7\63\2\2\u00fd\u0106\3\2\2\2\u00fe\u00ff\5\34\17\2\u00ff"+
		"\u0100\5(\25\2\u0100\u0106\3\2\2\2\u0101\u0102\5\34\17\2\u0102\u0103\7"+
		"\62\2\2\u0103\u0104\7\63\2\2\u0104\u0106\3\2\2\2\u0105\u00f9\3\2\2\2\u0105"+
		"\u00fe\3\2\2\2\u0105\u0101\3\2\2\2\u0106\'\3\2\2\2\u0107\u0108\5*\26\2"+
		"\u0108)\3\2\2\2\u0109\u010a\b\26\1\2\u010a\u010b\5,\27\2\u010b\u0111\3"+
		"\2\2\2\u010c\u010d\f\3\2\2\u010d\u010e\7\4\2\2\u010e\u0110\5,\27\2\u010f"+
		"\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112+\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0117\5.\30\2\u0115\u0117"+
		"\5\60\31\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117-\3\2\2\2\u0118"+
		"\u011d\5j\66\2\u0119\u011d\5l\67\2\u011a\u011d\5n8\2\u011b\u011d\5f\64"+
		"\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d/\3\2\2\2\u011e\u011f\5\u0086D\2\u011f\u0124\7\"\2\2\u0120"+
		"\u0125\5j\66\2\u0121\u0125\5l\67\2\u0122\u0125\5n8\2\u0123\u0125\5f\64"+
		"\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123"+
		"\3\2\2\2\u0125\61\3\2\2\2\u0126\u0127\5&\24\2\u0127\63\3\2\2\2\u0128\u012e"+
		"\5j\66\2\u0129\u012e\5l\67\2\u012a\u012e\5n8\2\u012b\u012e\5f\64\2\u012c"+
		"\u012e\5\f\7\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\65\3\2\2\2\u012f\u0130"+
		"\58\35\2\u0130\67\3\2\2\2\u0131\u0132\7\16\2\2\u0132\u0133\5H%\2\u0133"+
		"\u0134\5\u0090I\2\u0134\u0135\5N(\2\u0135\u0145\3\2\2\2\u0136\u0137\7"+
		"\16\2\2\u0137\u0138\5H%\2\u0138\u0139\5\u0090I\2\u0139\u013a\5N(\2\u013a"+
		"\u013b\5\u008eH\2\u013b\u013c\5\u0090I\2\u013c\u013d\5N(\2\u013d\u0145"+
		"\3\2\2\2\u013e\u013f\7\16\2\2\u013f\u0140\5H%\2\u0140\u0141\5\u0090I\2"+
		"\u0141\u0142\5N(\2\u0142\u0143\58\35\2\u0143\u0145\3\2\2\2\u0144\u0131"+
		"\3\2\2\2\u0144\u0136\3\2\2\2\u0144\u013e\3\2\2\2\u01459\3\2\2\2\u0146"+
		"\u0147\7\f\2\2\u0147\u0148\5H%\2\u0148\u0149\5\u0090I\2\u0149\u014a\5"+
		"N(\2\u014a\u014b\7\b\2\2\u014b\u015d\3\2\2\2\u014c\u014d\7\f\2\2\u014d"+
		"\u014e\5H%\2\u014e\u014f\5\u0090I\2\u014f\u0150\5N(\2\u0150\u0151\5\u008e"+
		"H\2\u0151\u0152\5\u0090I\2\u0152\u0153\5N(\2\u0153\u0154\7\b\2\2\u0154"+
		"\u015d\3\2\2\2\u0155\u0156\7\f\2\2\u0156\u0157\5H%\2\u0157\u0158\5\u0090"+
		"I\2\u0158\u0159\5N(\2\u0159\u015a\5\66\34\2\u015a\u015b\7\b\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0146\3\2\2\2\u015c\u014c\3\2\2\2\u015c\u0155\3\2"+
		"\2\2\u015d;\3\2\2\2\u015e\u015f\7\17\2\2\u015f\u0160\5H%\2\u0160\u0161"+
		"\5\u0090I\2\u0161\u0162\5N(\2\u0162\u0163\7\b\2\2\u0163\u0175\3\2\2\2"+
		"\u0164\u0165\7\17\2\2\u0165\u0166\5H%\2\u0166\u0167\5\u0090I\2\u0167\u0168"+
		"\5N(\2\u0168\u0169\5\u008eH\2\u0169\u016a\5\u0090I\2\u016a\u016b\5N(\2"+
		"\u016b\u016c\7\b\2\2\u016c\u0175\3\2\2\2\u016d\u016e\7\17\2\2\u016e\u016f"+
		"\5H%\2\u016f\u0170\5\u0090I\2\u0170\u0171\5N(\2\u0171\u0172\5\66\34\2"+
		"\u0172\u0173\7\b\2\2\u0173\u0175\3\2\2\2\u0174\u015e\3\2\2\2\u0174\u0164"+
		"\3\2\2\2\u0174\u016d\3\2\2\2\u0175=\3\2\2\2\u0176\u0177\7\20\2\2\u0177"+
		"\u0178\5H%\2\u0178\u0179\5\u0090I\2\u0179\u017a\5N(\2\u017a\u017b\7\b"+
		"\2\2\u017b?\3\2\2\2\u017c\u017d\7\23\2\2\u017d\u017e\7\62\2\2\u017e\u017f"+
		"\5B\"\2\u017f\u0180\7\5\2\2\u0180\u0181\5H%\2\u0181\u0182\7\5\2\2\u0182"+
		"\u0183\5J&\2\u0183\u0184\7\63\2\2\u0184\u0185\5\u0090I\2\u0185\u0186\5"+
		"N(\2\u0186\u0187\7\b\2\2\u0187\u0193\3\2\2\2\u0188\u0189\7\23\2\2\u0189"+
		"\u018a\5B\"\2\u018a\u018b\7\5\2\2\u018b\u018c\5H%\2\u018c\u018d\7\5\2"+
		"\2\u018d\u018e\5J&\2\u018e\u018f\5\u0090I\2\u018f\u0190\5N(\2\u0190\u0191"+
		"\7\b\2\2\u0191\u0193\3\2\2\2\u0192\u017c\3\2\2\2\u0192\u0188\3\2\2\2\u0193"+
		"A\3\2\2\2\u0194\u0195\5F$\2\u0195C\3\2\2\2\u0196\u019b\5V,\2\u0197\u019b"+
		"\5X-\2\u0198\u019b\5Z.\2\u0199\u019b\5T+\2\u019a\u0196\3\2\2\2\u019a\u0197"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019bE\3\2\2\2\u019c"+
		"\u019d\b$\1\2\u019d\u019e\5D#\2\u019e\u01a4\3\2\2\2\u019f\u01a0\f\4\2"+
		"\2\u01a0\u01a1\7\4\2\2\u01a1\u01a3\5D#\2\u01a2\u019f\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5G\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\5p9\2\u01a8I\3\2\2\2\u01a9\u01aa\5L\'\2\u01aa"+
		"K\3\2\2\2\u01ab\u01ac\b\'\1\2\u01ac\u01ad\5D#\2\u01ad\u01b3\3\2\2\2\u01ae"+
		"\u01af\f\4\2\2\u01af\u01b0\7\4\2\2\u01b0\u01b2\5D#\2\u01b1\u01ae\3\2\2"+
		"\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4M"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\5P)\2\u01b7O\3\2\2\2\u01b8\u01b9"+
		"\b)\1\2\u01b9\u01bb\5\6\4\2\u01ba\u01bc\5\u008cG\2\u01bb\u01ba\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01c6\3\2\2\2\u01bd\u01bf\7\21\2\2\u01be\u01c0"+
		"\5\u008cG\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c6\3\2\2"+
		"\2\u01c1\u01c3\5z>\2\u01c2\u01c4\5\u008cG\2\u01c3\u01c2\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01b8\3\2\2\2\u01c5\u01bd\3\2"+
		"\2\2\u01c5\u01c1\3\2\2\2\u01c6\u01d8\3\2\2\2\u01c7\u01c8\f\5\2\2\u01c8"+
		"\u01ca\5\6\4\2\u01c9\u01cb\5\u008cG\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01d7\3\2\2\2\u01cc\u01cd\f\4\2\2\u01cd\u01cf\7\21\2\2"+
		"\u01ce\u01d0\5\u008cG\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d7\3\2\2\2\u01d1\u01d2\f\3\2\2\u01d2\u01d4\5z>\2\u01d3\u01d5\5\u008c"+
		"G\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01c7\3\2\2\2\u01d6\u01cc\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d7\u01da\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9Q\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01db\u01dc\5v<\2\u01dc\u01dd\7\"\2\2\u01dd\u01de\5x=\2\u01de"+
		"\u01e4\3\2\2\2\u01df\u01e0\5v<\2\u01e0\u01e1\t\2\2\2\u01e1\u01e2\5x=\2"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4S\3"+
		"\2\2\2\u01e5\u01e6\5v<\2\u01e6\u01e7\7\"\2\2\u01e7\u01e8\5f\64\2\u01e8"+
		"\u01ee\3\2\2\2\u01e9\u01ea\5v<\2\u01ea\u01eb\t\2\2\2\u01eb\u01ec\5f\64"+
		"\2\u01ec\u01ee\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ed\u01e9\3\2\2\2\u01eeU"+
		"\3\2\2\2\u01ef\u01f0\5v<\2\u01f0\u01f1\7\"\2\2\u01f1\u01f2\5j\66\2\u01f2"+
		"\u01f8\3\2\2\2\u01f3\u01f4\5v<\2\u01f4\u01f5\t\2\2\2\u01f5\u01f6\5j\66"+
		"\2\u01f6\u01f8\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8W"+
		"\3\2\2\2\u01f9\u01fa\5v<\2\u01fa\u01fb\7\"\2\2\u01fb\u01fc\5l\67\2\u01fc"+
		"\u0202\3\2\2\2\u01fd\u01fe\5v<\2\u01fe\u01ff\t\2\2\2\u01ff\u0200\5l\67"+
		"\2\u0200\u0202\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u01fd\3\2\2\2\u0202Y"+
		"\3\2\2\2\u0203\u0204\5v<\2\u0204\u0205\7\"\2\2\u0205\u0206\5n8\2\u0206"+
		"\u020c\3\2\2\2\u0207\u0208\5v<\2\u0208\u0209\7#\2\2\u0209\u020a\5n8\2"+
		"\u020a\u020c\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0207\3\2\2\2\u020c[\3"+
		"\2\2\2\u020d\u020e\5v<\2\u020e\u020f\7\"\2\2\u020f\u0210\7\64\2\2\u0210"+
		"\u0211\7\65\2\2\u0211]\3\2\2\2\u0212\u0213\5d\63\2\u0213\u0214\7\"\2\2"+
		"\u0214\u0215\5\64\33\2\u0215_\3\2\2\2\u0216\u0217\7\64\2\2\u0217\u0218"+
		"\5b\62\2\u0218\u0219\7\65\2\2\u0219a\3\2\2\2\u021a\u021d\b\62\1\2\u021b"+
		"\u021e\5j\66\2\u021c\u021e\5f\64\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2"+
		"\2\2\u021e\u0227\3\2\2\2\u021f\u0220\f\3\2\2\u0220\u0223\7\4\2\2\u0221"+
		"\u0224\5j\66\2\u0222\u0224\5f\64\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2"+
		"\2\2\u0224\u0226\3\2\2\2\u0225\u021f\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228c\3\2\2\2\u0229\u0227\3\2\2\2"+
		"\u022a\u022b\5\u0086D\2\u022b\u022e\7\64\2\2\u022c\u022f\5j\66\2\u022d"+
		"\u022f\5f\64\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0231\7\65\2\2\u0231\u023b\3\2\2\2\u0232\u0233\5\u0088E\2\u0233"+
		"\u0236\7\64\2\2\u0234\u0237\5j\66\2\u0235\u0237\5f\64\2\u0236\u0234\3"+
		"\2\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7\65\2\2\u0239"+
		"\u023b\3\2\2\2\u023a\u022a\3\2\2\2\u023a\u0232\3\2\2\2\u023be\3\2\2\2"+
		"\u023c\u023d\b\64\1\2\u023d\u023e\5j\66\2\u023e\u023f\t\3\2\2\u023f\u0240"+
		"\5f\64\17\u0240\u0257\3\2\2\2\u0241\u0242\5l\67\2\u0242\u0243\t\3\2\2"+
		"\u0243\u0244\5f\64\r\u0244\u0257\3\2\2\2\u0245\u0246\5n8\2\u0246\u0247"+
		"\7\30\2\2\u0247\u0248\5f\64\n\u0248\u0257\3\2\2\2\u0249\u024a\5j\66\2"+
		"\u024a\u024b\t\4\2\2\u024b\u024c\5f\64\b\u024c\u0257\3\2\2\2\u024d\u024e"+
		"\5l\67\2\u024e\u024f\t\4\2\2\u024f\u0250\5f\64\6\u0250\u0257\3\2\2\2\u0251"+
		"\u0252\7\62\2\2\u0252\u0253\5f\64\2\u0253\u0254\7\63\2\2\u0254\u0257\3"+
		"\2\2\2\u0255\u0257\5h\65\2\u0256\u023c\3\2\2\2\u0256\u0241\3\2\2\2\u0256"+
		"\u0245\3\2\2\2\u0256\u0249\3\2\2\2\u0256\u024d\3\2\2\2\u0256\u0251\3\2"+
		"\2\2\u0256\u0255\3\2\2\2\u0257\u026f\3\2\2\2\u0258\u0259\f\f\2\2\u0259"+
		"\u025a\t\3\2\2\u025a\u026e\5f\64\r\u025b\u025c\f\5\2\2\u025c\u025d\t\4"+
		"\2\2\u025d\u026e\5f\64\6\u025e\u025f\f\20\2\2\u025f\u0260\t\3\2\2\u0260"+
		"\u026e\5j\66\2\u0261\u0262\f\16\2\2\u0262\u0263\t\3\2\2\u0263\u026e\5"+
		"l\67\2\u0264\u0265\f\13\2\2\u0265\u0266\7\30\2\2\u0266\u026e\5n8\2\u0267"+
		"\u0268\f\t\2\2\u0268\u0269\t\4\2\2\u0269\u026e\5j\66\2\u026a\u026b\f\7"+
		"\2\2\u026b\u026c\t\4\2\2\u026c\u026e\5l\67\2\u026d\u0258\3\2\2\2\u026d"+
		"\u025b\3\2\2\2\u026d\u025e\3\2\2\2\u026d\u0261\3\2\2\2\u026d\u0264\3\2"+
		"\2\2\u026d\u0267\3\2\2\2\u026d\u026a\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270g\3\2\2\2\u0271\u026f\3\2\2\2"+
		"\u0272\u0276\5\u0086D\2\u0273\u0276\5\62\32\2\u0274\u0276\5d\63\2\u0275"+
		"\u0272\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276i\3\2\2\2"+
		"\u0277\u0278\b\66\1\2\u0278\u0279\7\62\2\2\u0279\u027a\5j\66\2\u027a\u027b"+
		"\7\63\2\2\u027b\u027e\3\2\2\2\u027c\u027e\5\u0080A\2\u027d\u0277\3\2\2"+
		"\2\u027d\u027c\3\2\2\2\u027e\u0287\3\2\2\2\u027f\u0280\f\6\2\2\u0280\u0281"+
		"\t\3\2\2\u0281\u0286\5j\66\7\u0282\u0283\f\5\2\2\u0283\u0284\t\4\2\2\u0284"+
		"\u0286\5j\66\6\u0285\u027f\3\2\2\2\u0285\u0282\3\2\2\2\u0286\u0289\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288k\3\2\2\2\u0289\u0287"+
		"\3\2\2\2\u028a\u028b\b\67\1\2\u028b\u028c\5j\66\2\u028c\u028d\t\3\2\2"+
		"\u028d\u028e\5l\67\t\u028e\u0299\3\2\2\2\u028f\u0290\5j\66\2\u0290\u0291"+
		"\t\4\2\2\u0291\u0292\5l\67\6\u0292\u0299\3\2\2\2\u0293\u0294\7\62\2\2"+
		"\u0294\u0295\5l\67\2\u0295\u0296\7\63\2\2\u0296\u0299\3\2\2\2\u0297\u0299"+
		"\5~@\2\u0298\u028a\3\2\2\2\u0298\u028f\3\2\2\2\u0298\u0293\3\2\2\2\u0298"+
		"\u0297\3\2\2\2\u0299\u02a8\3\2\2\2\u029a\u029b\f\n\2\2\u029b\u029c\t\3"+
		"\2\2\u029c\u02a7\5l\67\13\u029d\u029e\f\7\2\2\u029e\u029f\t\4\2\2\u029f"+
		"\u02a7\5l\67\b\u02a0\u02a1\f\b\2\2\u02a1\u02a2\t\3\2\2\u02a2\u02a7\5j"+
		"\66\2\u02a3\u02a4\f\5\2\2\u02a4\u02a5\t\4\2\2\u02a5\u02a7\5j\66\2\u02a6"+
		"\u029a\3\2\2\2\u02a6\u029d\3\2\2\2\u02a6\u02a0\3\2\2\2\u02a6\u02a3\3\2"+
		"\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"m\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\b8\1\2\u02ac\u02ad\5j\66\2\u02ad"+
		"\u02ae\7\30\2\2\u02ae\u02af\5n8\5\u02af\u02b2\3\2\2\2\u02b0\u02b2\5|?"+
		"\2\u02b1\u02ab\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02bb\3\2\2\2\u02b3\u02b4"+
		"\f\4\2\2\u02b4\u02b5\7\26\2\2\u02b5\u02ba\5n8\5\u02b6\u02b7\f\6\2\2\u02b7"+
		"\u02b8\7\30\2\2\u02b8\u02ba\5j\66\2\u02b9\u02b3\3\2\2\2\u02b9\u02b6\3"+
		"\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"o\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\5r:\2\u02bf\u02c0\7)\2\2\u02c0"+
		"\u02c1\5p9\2\u02c1\u02d4\3\2\2\2\u02c2\u02c3\5r:\2\u02c3\u02c4\7/\2\2"+
		"\u02c4\u02c5\5p9\2\u02c5\u02d4\3\2\2\2\u02c6\u02c7\5r:\2\u02c7\u02c8\7"+
		"*\2\2\u02c8\u02c9\5p9\2\u02c9\u02d4\3\2\2\2\u02ca\u02cb\5r:\2\u02cb\u02cc"+
		"\7\60\2\2\u02cc\u02cd\5p9\2\u02cd\u02d4\3\2\2\2\u02ce\u02cf\7\62\2\2\u02cf"+
		"\u02d0\5p9\2\u02d0\u02d1\7\63\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d4\5r:"+
		"\2\u02d3\u02be\3\2\2\2\u02d3\u02c2\3\2\2\2\u02d3\u02c6\3\2\2\2\u02d3\u02ca"+
		"\3\2\2\2\u02d3\u02ce\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4q\3\2\2\2\u02d5"+
		"\u02d6\5t;\2\u02d6\u02d7\t\5\2\2\u02d7\u02d8\5t;\2\u02d8\u02de\3\2\2\2"+
		"\u02d9\u02da\5t;\2\u02da\u02db\t\6\2\2\u02db\u02dc\5t;\2\u02dc\u02de\3"+
		"\2\2\2\u02dd\u02d5\3\2\2\2\u02dd\u02d9\3\2\2\2\u02des\3\2\2\2\u02df\u02e3"+
		"\5\64\33\2\u02e0\u02e3\5d\63\2\u02e1\u02e3\5\u0086D\2\u02e2\u02df\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3u\3\2\2\2\u02e4\u02e5"+
		"\5\u0086D\2\u02e5w\3\2\2\2\u02e6\u02e7\b=\1\2\u02e7\u0301\5v<\2\u02e8"+
		"\u0301\5\\/\2\u02e9\u0301\5^\60\2\u02ea\u0301\5j\66\2\u02eb\u0301\5l\67"+
		"\2\u02ec\u0301\5n8\2\u02ed\u0301\5\n\6\2\u02ee\u0301\5\b\5\2\u02ef\u0301"+
		"\5T+\2\u02f0\u0301\5Z.\2\u02f1\u0301\5X-\2\u02f2\u0301\5V,\2\u02f3\u0301"+
		"\5R*\2\u02f4\u0301\5&\24\2\u02f5\u0301\5|?\2\u02f6\u0301\5\u0082B\2\u02f7"+
		"\u0301\5~@\2\u02f8\u0301\5\u0080A\2\u02f9\u0301\5\u0084C\2\u02fa\u02fb"+
		"\t\7\2\2\u02fb\u0301\5x=\f\u02fc\u02fd\7\62\2\2\u02fd\u02fe\5x=\2\u02fe"+
		"\u02ff\7\63\2\2\u02ff\u0301\3\2\2\2\u0300\u02e6\3\2\2\2\u0300\u02e8\3"+
		"\2\2\2\u0300\u02e9\3\2\2\2\u0300\u02ea\3\2\2\2\u0300\u02eb\3\2\2\2\u0300"+
		"\u02ec\3\2\2\2\u0300\u02ed\3\2\2\2\u0300\u02ee\3\2\2\2\u0300\u02ef\3\2"+
		"\2\2\u0300\u02f0\3\2\2\2\u0300\u02f1\3\2\2\2\u0300\u02f2\3\2\2\2\u0300"+
		"\u02f3\3\2\2\2\u0300\u02f4\3\2\2\2\u0300\u02f5\3\2\2\2\u0300\u02f6\3\2"+
		"\2\2\u0300\u02f7\3\2\2\2\u0300\u02f8\3\2\2\2\u0300\u02f9\3\2\2\2\u0300"+
		"\u02fa\3\2\2\2\u0300\u02fc\3\2\2\2\u0301\u031f\3\2\2\2\u0302\u0303\f\r"+
		"\2\2\u0303\u0304\7\33\2\2\u0304\u031e\5x=\16\u0305\u0306\f\13\2\2\u0306"+
		"\u0307\t\3\2\2\u0307\u031e\5x=\f\u0308\u0309\f\n\2\2\u0309\u030a\t\4\2"+
		"\2\u030a\u031e\5x=\13\u030b\u030c\f\t\2\2\u030c\u030d\t\b\2\2\u030d\u031e"+
		"\5x=\n\u030e\u030f\f\b\2\2\u030f\u0310\7)\2\2\u0310\u031e\5x=\t\u0311"+
		"\u0312\f\7\2\2\u0312\u0313\t\t\2\2\u0313\u031e\5x=\b\u0314\u0315\f\6\2"+
		"\2\u0315\u0316\t\5\2\2\u0316\u031e\5x=\7\u0317\u0318\f\5\2\2\u0318\u0319"+
		"\t\6\2\2\u0319\u031e\5x=\6\u031a\u031b\f\4\2\2\u031b\u031c\t\n\2\2\u031c"+
		"\u031e\5x=\5\u031d\u0302\3\2\2\2\u031d\u0305\3\2\2\2\u031d\u0308\3\2\2"+
		"\2\u031d\u030b\3\2\2\2\u031d\u030e\3\2\2\2\u031d\u0311\3\2\2\2\u031d\u0314"+
		"\3\2\2\2\u031d\u0317\3\2\2\2\u031d\u031a\3\2\2\2\u031e\u0321\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320y\3\2\2\2\u0321\u031f\3\2\2\2"+
		"\u0322\u0323\7\22\2\2\u0323{\3\2\2\2\u0324\u0325\7\3\2\2\u0325}\3\2\2"+
		"\2\u0326\u0327\7;\2\2\u0327\177\3\2\2\2\u0328\u0329\7:\2\2\u0329\u0081"+
		"\3\2\2\2\u032a\u032b\t\13\2\2\u032b\u0083\3\2\2\2\u032c\u032d\7\66\2\2"+
		"\u032d\u0085\3\2\2\2\u032e\u032f\7<\2\2\u032f\u0087\3\2\2\2\u0330\u0331"+
		"\7=\2\2\u0331\u0089\3\2\2\2\u0332\u0333\7>\2\2\u0333\u008b\3\2\2\2\u0334"+
		"\u0335\bG\1\2\u0335\u0338\7\5\2\2\u0336\u0338\5\u0090I\2\u0337\u0334\3"+
		"\2\2\2\u0337\u0336\3\2\2\2\u0338\u033f\3\2\2\2\u0339\u033a\f\6\2\2\u033a"+
		"\u033e\7\5\2\2\u033b\u033c\f\5\2\2\u033c\u033e\5\u0090I\2\u033d\u0339"+
		"\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u008d\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\7\r"+
		"\2\2\u0343\u008f\3\2\2\2\u0344\u0345\7\6\2\2\u0345\u0091\3\2\2\2C\u0097"+
		"\u009a\u009c\u00a2\u00a6\u00b3\u00da\u00de\u00e7\u00f1\u0105\u0111\u0116"+
		"\u011c\u0124\u012d\u0144\u015c\u0174\u0192\u019a\u01a4\u01b3\u01bb\u01bf"+
		"\u01c3\u01c5\u01ca\u01cf\u01d4\u01d6\u01d8\u01e3\u01ed\u01f7\u0201\u020b"+
		"\u021d\u0223\u0227\u022e\u0236\u023a\u0256\u026d\u026f\u0275\u027d\u0285"+
		"\u0287\u0298\u02a6\u02a8\u02b1\u02b9\u02bb\u02d3\u02dd\u02e2\u0300\u031d"+
		"\u031f\u0337\u033d\u033f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
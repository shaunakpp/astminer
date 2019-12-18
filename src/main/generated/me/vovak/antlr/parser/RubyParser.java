// Generated from RubyParser.g4 by ANTLR 4.7.1
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
public class RubyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HereDoc1=1, HereDoc2=2, HereDoc3=3, PercentString=4, ALIAS=5, BEGIN=6, 
		BEGIN_BLOCK=7, BREAK=8, CASE=9, CLASS=10, DEF=11, DEFINED=12, DO=13, ELSE=14, 
		ELSIF=15, END_BLOCK=16, END=17, ENSURE=18, FALSE=19, FOR=20, IF=21, IN=22, 
		MODULE=23, NEXT=24, NIL=25, NOT=26, RAISE=27, REDO=28, RESCUE=29, RETRY=30, 
		RETURN=31, SELF=32, SUPER=33, THEN=34, TRUE=35, UNDEF=36, UNLESS=37, UNTIL=38, 
		WHEN=39, WHILE=40, YIELD=41, Integer=42, Float=43, Regex=44, String=45, 
		DollarSpecial=46, CRLF=47, AND=48, OR=49, PLUS=50, MINUS=51, MOD=52, PLUS_ASSIGN=53, 
		MOD_ASSIGN=54, SHARP=55, AND_ASSIGN=56, BIT_AND_ASSIGN=57, ANDDOT=58, 
		BIT_AND=59, EXP_ASSIGN=60, EXP=61, MUL=62, MUL_ASSIGN=63, DOLLAR=64, AT=65, 
		RIGHT_PAREN=66, LEFT_PAREN=67, RIGHT_SBRACKET=68, LEFT_SBRACKET=69, RIGHT_RBRACKET=70, 
		LEFT_RBRACKET=71, DOT3=72, DOT2=73, DOT=74, DIV_ASSIGN=75, DIV=76, QUESTION=77, 
		NOT_EQUAL=78, SIGH=79, COLON=80, COLON2=81, SEMICOLON=82, COMMA=83, MINUS_ASSIGN=84, 
		OR_ASSIGN=85, BIT_OR_ASSIGN=86, BIT_OR=87, BIT_SHR_ASSIGN=88, GREATER_EQUAL=89, 
		BIT_SHR=90, GREATER=91, ASSIGN=92, ASSOC=93, EQUAL3=94, EQUAL=95, PATTERN_MATCH=96, 
		LESS_EQUAL=97, LESS=98, BIT_SHL_ASSIGN=99, BIT_SHL=100, BIT_NOT_ASSIGN=101, 
		BIT_NOT=102, BIT_XOR_ASSIGN=103, BIT_XOR=104, SL_COMMENT=105, ML_COMMENT=106, 
		WS=107, Identifier=108, ShellCommand=109, HereDocEnd1=110, HereDocEnd2=111, 
		AnyInHere=112, SL_COMMENT_IN_HEREDOC=113, ML_COMMENT_IN_HEREDOC=114, PercentStringLineEnd=115, 
		AnyInQuotedString1=116, AnyInQuotedString2=117;
	public static final int
		RULE_compilation_unit = 0, RULE_statement_list_terms = 1, RULE_statement_list_noterms = 2, 
		RULE_statement = 3, RULE_undef_statement = 4, RULE_alias_statement = 5, 
		RULE_function_name_or_symbol = 6, RULE_begin_block = 7, RULE_end_block = 8, 
		RULE_module_definition = 9, RULE_class_definition = 10, RULE_superclass = 11, 
		RULE_class_header = 12, RULE_function_definition = 13, RULE_function_definition_header = 14, 
		RULE_function_name = 15, RULE_function_definition_params = 16, RULE_function_definition_param = 17, 
		RULE_function_call_param = 18, RULE_expr = 19, RULE_expr_statement_suffix = 20, 
		RULE_primary = 21, RULE_func_call_parameters = 22, RULE_func_call_parameters_no_bracket = 23, 
		RULE_rescure_param = 24, RULE_case_body = 25, RULE_when_cond = 26, RULE_if_tail = 27, 
		RULE_else_tail = 28, RULE_dot_ref = 29, RULE_logicalOperator = 30, RULE_equalsOperator = 31, 
		RULE_compareOperator = 32, RULE_bitOperator = 33, RULE_mathOperator = 34, 
		RULE_assignOperator = 35, RULE_not = 36, RULE_block = 37, RULE_block_params = 38, 
		RULE_id_symbol = 39, RULE_symbol = 40, RULE_hash_asso = 41, RULE_variable_path = 42, 
		RULE_cpath = 43, RULE_literal = 44, RULE_identifier = 45, RULE_empty = 46, 
		RULE_globalVar = 47, RULE_classVar = 48, RULE_instanceVar = 49, RULE_idArg = 50, 
		RULE_do_keyword = 51, RULE_then_keyword = 52, RULE_string = 53, RULE_crlfs = 54, 
		RULE_terms = 55, RULE_term = 56;
	public static final String[] ruleNames = {
		"compilation_unit", "statement_list_terms", "statement_list_noterms", 
		"statement", "undef_statement", "alias_statement", "function_name_or_symbol", 
		"begin_block", "end_block", "module_definition", "class_definition", "superclass", 
		"class_header", "function_definition", "function_definition_header", "function_name", 
		"function_definition_params", "function_definition_param", "function_call_param", 
		"expr", "expr_statement_suffix", "primary", "func_call_parameters", "func_call_parameters_no_bracket", 
		"rescure_param", "case_body", "when_cond", "if_tail", "else_tail", "dot_ref", 
		"logicalOperator", "equalsOperator", "compareOperator", "bitOperator", 
		"mathOperator", "assignOperator", "not", "block", "block_params", "id_symbol", 
		"symbol", "hash_asso", "variable_path", "cpath", "literal", "identifier", 
		"empty", "globalVar", "classVar", "instanceVar", "idArg", "do_keyword", 
		"then_keyword", "string", "crlfs", "terms", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'alias'", "'begin'", "'BEGIN'", "'break'", 
		"'case'", "'class'", "'def'", "'defined?'", "'do'", "'else'", "'elsif'", 
		"'END'", "'end'", "'ensure'", "'false'", "'for'", "'if'", "'in'", "'module'", 
		"'next'", "'nil'", "'not'", "'raise'", "'redo'", "'rescue'", "'retry'", 
		"'return'", "'self'", "'super'", "'then'", "'true'", "'undef'", "'unless'", 
		"'until'", "'when'", "'while'", "'yield'", null, null, null, null, null, 
		null, null, null, "'+'", "'-'", "'%'", "'+='", "'%='", "'#'", "'&&='", 
		"'&='", "'&.'", "'&'", "'**='", "'**'", "'*'", "'*='", "'$'", "'@'", "'}'", 
		"'{'", "']'", "'['", "')'", "'('", "'...'", "'..'", "'.'", "'/='", "'/'", 
		"'?'", "'!='", "'!'", "':'", "'::'", "';'", "','", "'-='", "'||='", "'|='", 
		"'|'", "'>>='", "'>='", "'>>'", "'>'", "'='", "'=>'", "'==='", "'=='", 
		"'=~'", "'<='", "'<'", "'<<='", "'<<'", "'~='", "'~'", "'^='", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HereDoc1", "HereDoc2", "HereDoc3", "PercentString", "ALIAS", "BEGIN", 
		"BEGIN_BLOCK", "BREAK", "CASE", "CLASS", "DEF", "DEFINED", "DO", "ELSE", 
		"ELSIF", "END_BLOCK", "END", "ENSURE", "FALSE", "FOR", "IF", "IN", "MODULE", 
		"NEXT", "NIL", "NOT", "RAISE", "REDO", "RESCUE", "RETRY", "RETURN", "SELF", 
		"SUPER", "THEN", "TRUE", "UNDEF", "UNLESS", "UNTIL", "WHEN", "WHILE", 
		"YIELD", "Integer", "Float", "Regex", "String", "DollarSpecial", "CRLF", 
		"AND", "OR", "PLUS", "MINUS", "MOD", "PLUS_ASSIGN", "MOD_ASSIGN", "SHARP", 
		"AND_ASSIGN", "BIT_AND_ASSIGN", "ANDDOT", "BIT_AND", "EXP_ASSIGN", "EXP", 
		"MUL", "MUL_ASSIGN", "DOLLAR", "AT", "RIGHT_PAREN", "LEFT_PAREN", "RIGHT_SBRACKET", 
		"LEFT_SBRACKET", "RIGHT_RBRACKET", "LEFT_RBRACKET", "DOT3", "DOT2", "DOT", 
		"DIV_ASSIGN", "DIV", "QUESTION", "NOT_EQUAL", "SIGH", "COLON", "COLON2", 
		"SEMICOLON", "COMMA", "MINUS_ASSIGN", "OR_ASSIGN", "BIT_OR_ASSIGN", "BIT_OR", 
		"BIT_SHR_ASSIGN", "GREATER_EQUAL", "BIT_SHR", "GREATER", "ASSIGN", "ASSOC", 
		"EQUAL3", "EQUAL", "PATTERN_MATCH", "LESS_EQUAL", "LESS", "BIT_SHL_ASSIGN", 
		"BIT_SHL", "BIT_NOT_ASSIGN", "BIT_NOT", "BIT_XOR_ASSIGN", "BIT_XOR", "SL_COMMENT", 
		"ML_COMMENT", "WS", "Identifier", "ShellCommand", "HereDocEnd1", "HereDocEnd2", 
		"AnyInHere", "SL_COMMENT_IN_HEREDOC", "ML_COMMENT_IN_HEREDOC", "PercentStringLineEnd", 
		"AnyInQuotedString1", "AnyInQuotedString2"
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
	public String getGrammarFileName() { return "RubyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCompilation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			statement_list_terms(0);
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

	public static class Statement_list_termsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Statement_list_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterStatement_list_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitStatement_list_terms(this);
		}
	}

	public final Statement_list_termsContext statement_list_terms() throws RecognitionException {
		return statement_list_terms(0);
	}

	private Statement_list_termsContext statement_list_terms(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_list_termsContext _localctx = new Statement_list_termsContext(_ctx, _parentState);
		Statement_list_termsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statement_list_terms, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIAS:
			case BEGIN:
			case BEGIN_BLOCK:
			case BREAK:
			case CASE:
			case CLASS:
			case DEF:
			case DEFINED:
			case END_BLOCK:
			case ENSURE:
			case FALSE:
			case FOR:
			case IF:
			case MODULE:
			case NEXT:
			case NIL:
			case NOT:
			case RAISE:
			case REDO:
			case RESCUE:
			case RETRY:
			case RETURN:
			case SELF:
			case SUPER:
			case TRUE:
			case UNDEF:
			case UNLESS:
			case UNTIL:
			case WHEN:
			case WHILE:
			case YIELD:
			case Integer:
			case Float:
			case Regex:
			case String:
			case DollarSpecial:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case MOD:
			case PLUS_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case BIT_AND_ASSIGN:
			case BIT_AND:
			case EXP_ASSIGN:
			case EXP:
			case MUL:
			case MUL_ASSIGN:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case LEFT_RBRACKET:
			case DIV_ASSIGN:
			case DIV:
			case NOT_EQUAL:
			case SIGH:
			case COLON:
			case COLON2:
			case MINUS_ASSIGN:
			case OR_ASSIGN:
			case BIT_OR_ASSIGN:
			case BIT_OR:
			case BIT_SHR_ASSIGN:
			case GREATER_EQUAL:
			case BIT_SHR:
			case GREATER:
			case EQUAL3:
			case EQUAL:
			case LESS_EQUAL:
			case LESS:
			case BIT_SHL_ASSIGN:
			case BIT_SHL:
			case BIT_NOT_ASSIGN:
			case BIT_NOT:
			case BIT_XOR_ASSIGN:
			case BIT_XOR:
			case Identifier:
			case ShellCommand:
				{
				setState(117);
				statement();
				setState(118);
				terms();
				}
				break;
			case CRLF:
			case SEMICOLON:
			case SL_COMMENT:
				{
				setState(120);
				terms();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_list_termsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list_terms);
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					statement();
					setState(125);
					terms();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Statement_list_notermsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public Statement_list_notermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list_noterms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterStatement_list_noterms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitStatement_list_noterms(this);
		}
	}

	public final Statement_list_notermsContext statement_list_noterms() throws RecognitionException {
		Statement_list_notermsContext _localctx = new Statement_list_notermsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_list_noterms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					statement();
					setState(133);
					terms();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(140);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public Begin_blockContext begin_block() {
			return getRuleContext(Begin_blockContext.class,0);
		}
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public Alias_statementContext alias_statement() {
			return getRuleContext(Alias_statementContext.class,0);
		}
		public Undef_statementContext undef_statement() {
			return getRuleContext(Undef_statementContext.class,0);
		}
		public TerminalNode ENSURE() { return getToken(RubyParser.ENSURE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				begin_block();
				}
				break;
			case END_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				end_block();
				}
				break;
			case ALIAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				alias_statement();
				}
				break;
			case UNDEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				undef_statement();
				}
				break;
			case ENSURE:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(ENSURE);
				}
				break;
			case BEGIN:
			case BREAK:
			case CASE:
			case CLASS:
			case DEF:
			case DEFINED:
			case FALSE:
			case FOR:
			case IF:
			case MODULE:
			case NEXT:
			case NIL:
			case NOT:
			case RAISE:
			case REDO:
			case RESCUE:
			case RETRY:
			case RETURN:
			case SELF:
			case SUPER:
			case TRUE:
			case UNLESS:
			case UNTIL:
			case WHEN:
			case WHILE:
			case YIELD:
			case Integer:
			case Float:
			case Regex:
			case String:
			case DollarSpecial:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case MOD:
			case PLUS_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case BIT_AND_ASSIGN:
			case BIT_AND:
			case EXP_ASSIGN:
			case EXP:
			case MUL:
			case MUL_ASSIGN:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case LEFT_RBRACKET:
			case DIV_ASSIGN:
			case DIV:
			case NOT_EQUAL:
			case SIGH:
			case COLON:
			case COLON2:
			case MINUS_ASSIGN:
			case OR_ASSIGN:
			case BIT_OR_ASSIGN:
			case BIT_OR:
			case BIT_SHR_ASSIGN:
			case GREATER_EQUAL:
			case BIT_SHR:
			case GREATER:
			case EQUAL3:
			case EQUAL:
			case LESS_EQUAL:
			case LESS:
			case BIT_SHL_ASSIGN:
			case BIT_SHL:
			case BIT_NOT_ASSIGN:
			case BIT_NOT:
			case BIT_XOR_ASSIGN:
			case BIT_XOR:
			case Identifier:
			case ShellCommand:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				expr(0);
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

	public static class Undef_statementContext extends ParserRuleContext {
		public TerminalNode UNDEF() { return getToken(RubyParser.UNDEF, 0); }
		public List<Function_name_or_symbolContext> function_name_or_symbol() {
			return getRuleContexts(Function_name_or_symbolContext.class);
		}
		public Function_name_or_symbolContext function_name_or_symbol(int i) {
			return getRuleContext(Function_name_or_symbolContext.class,i);
		}
		public Undef_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterUndef_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitUndef_statement(this);
		}
	}

	public final Undef_statementContext undef_statement() throws RecognitionException {
		Undef_statementContext _localctx = new Undef_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_undef_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(UNDEF);
			setState(151);
			function_name_or_symbol();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					function_name_or_symbol();
					}
					} 
				}
				setState(158);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_statementContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(RubyParser.ALIAS, 0); }
		public List<Function_name_or_symbolContext> function_name_or_symbol() {
			return getRuleContexts(Function_name_or_symbolContext.class);
		}
		public Function_name_or_symbolContext function_name_or_symbol(int i) {
			return getRuleContext(Function_name_or_symbolContext.class,i);
		}
		public Alias_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterAlias_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitAlias_statement(this);
		}
	}

	public final Alias_statementContext alias_statement() throws RecognitionException {
		Alias_statementContext _localctx = new Alias_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ALIAS);
			setState(160);
			function_name_or_symbol();
			setState(161);
			function_name_or_symbol();
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

	public static class Function_name_or_symbolContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Function_name_or_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name_or_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_name_or_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_name_or_symbol(this);
		}
	}

	public final Function_name_or_symbolContext function_name_or_symbol() throws RecognitionException {
		Function_name_or_symbolContext _localctx = new Function_name_or_symbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_name_or_symbol);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case FALSE:
			case NEXT:
			case NIL:
			case REDO:
			case RETRY:
			case SELF:
			case SUPER:
			case TRUE:
			case Integer:
			case Float:
			case String:
			case DollarSpecial:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case MOD:
			case PLUS_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case BIT_AND_ASSIGN:
			case BIT_AND:
			case EXP_ASSIGN:
			case EXP:
			case MUL:
			case MUL_ASSIGN:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case DIV_ASSIGN:
			case DIV:
			case NOT_EQUAL:
			case MINUS_ASSIGN:
			case OR_ASSIGN:
			case BIT_OR_ASSIGN:
			case BIT_OR:
			case BIT_SHR_ASSIGN:
			case GREATER_EQUAL:
			case BIT_SHR:
			case GREATER:
			case EQUAL3:
			case EQUAL:
			case LESS_EQUAL:
			case LESS:
			case BIT_SHL_ASSIGN:
			case BIT_SHL:
			case BIT_NOT_ASSIGN:
			case BIT_XOR_ASSIGN:
			case BIT_XOR:
			case Identifier:
			case ShellCommand:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				function_name();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				symbol();
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

	public static class Begin_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN_BLOCK() { return getToken(RubyParser.BEGIN_BLOCK, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public Begin_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBegin_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBegin_block(this);
		}
	}

	public final Begin_blockContext begin_block() throws RecognitionException {
		Begin_blockContext _localctx = new Begin_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(BEGIN_BLOCK);
			setState(168);
			match(LEFT_PAREN);
			setState(169);
			statement_list_terms(0);
			setState(170);
			match(RIGHT_PAREN);
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

	public static class End_blockContext extends ParserRuleContext {
		public TerminalNode END_BLOCK() { return getToken(RubyParser.END_BLOCK, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public End_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterEnd_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitEnd_block(this);
		}
	}

	public final End_blockContext end_block() throws RecognitionException {
		End_blockContext _localctx = new End_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(END_BLOCK);
			setState(173);
			match(LEFT_PAREN);
			setState(174);
			statement_list_terms(0);
			setState(175);
			match(RIGHT_PAREN);
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

	public static class Module_definitionContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(RubyParser.MODULE, 0); }
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Module_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterModule_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitModule_definition(this);
		}
	}

	public final Module_definitionContext module_definition() throws RecognitionException {
		Module_definitionContext _localctx = new Module_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_module_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MODULE);
			setState(178);
			cpath();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
				{
				setState(179);
				statement_list_terms(0);
				}
			}

			setState(182);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public Class_headerContext class_header() {
			return getRuleContext(Class_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			class_header();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
				{
				setState(185);
				statement_list_terms(0);
				}
			}

			setState(188);
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

	public static class SuperclassContext extends ParserRuleContext {
		public Id_symbolContext id_symbol() {
			return getRuleContext(Id_symbolContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LESS);
			setState(191);
			id_symbol();
			setState(192);
			terms();
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

	public static class Class_headerContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(RubyParser.CLASS, 0); }
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public TerminalNode BIT_SHL() { return getToken(RubyParser.BIT_SHL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterClass_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitClass_header(this);
		}
	}

	public final Class_headerContext class_header() throws RecognitionException {
		Class_headerContext _localctx = new Class_headerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_header);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(CLASS);
				setState(195);
				cpath();
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(196);
					superclass();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(CLASS);
				setState(200);
				match(BIT_SHL);
				setState(201);
				identifier();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			function_definition_header();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
				{
				setState(205);
				statement_list_terms(0);
				}
			}

			setState(208);
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RubyParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition_header(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DEF);
			setState(211);
			function_name();
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(212);
				function_definition_params();
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
				{
				setState(215);
				expr(0);
				}
			}

			setState(218);
			terms();
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
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public TerminalNode AT() { return getToken(RubyParser.AT, 0); }
		public BitOperatorContext bitOperator() {
			return getRuleContext(BitOperatorContext.class,0);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public EqualsOperatorContext equalsOperator() {
			return getRuleContext(EqualsOperatorContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				cpath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				cpath();
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(222);
					match(QUESTION);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				cpath();
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(226);
					match(ASSIGN);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				cpath();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(230);
					match(SIGH);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				assignOperator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				mathOperator();
				setState(236);
				match(AT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				bitOperator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				compareOperator();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(240);
				equalsOperator();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(241);
				logicalOperator();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public List<Function_definition_paramContext> function_definition_param() {
			return getRuleContexts(Function_definition_paramContext.class);
		}
		public Function_definition_paramContext function_definition_param(int i) {
			return getRuleContext(Function_definition_paramContext.class,i);
		}
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition_params(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_definition_params);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(LEFT_RBRACKET);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(245);
					function_definition_param();
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(246);
						match(COMMA);
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(247);
							crlfs();
							}
						}

						setState(250);
						function_definition_param();
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(258);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				function_definition_param();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260);
					match(COMMA);
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CRLF || _la==SL_COMMENT) {
						{
						setState(261);
						crlfs();
						}
					}

					setState(264);
					function_definition_param();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Function_definition_paramContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode EXP() { return getToken(RubyParser.EXP, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public Hash_assoContext hash_asso() {
			return getRuleContext(Hash_assoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_definition_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_definition_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_definition_param(this);
		}
	}

	public final Function_definition_paramContext function_definition_param() throws RecognitionException {
		Function_definition_paramContext _localctx = new Function_definition_paramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_definition_param);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(MUL);
				setState(274);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(EXP);
				setState(276);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(BIT_AND);
				setState(278);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				hash_asso();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				identifier();
				setState(281);
				match(ASSIGN);
				setState(282);
				expr(0);
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

	public static class Function_call_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Hash_assoContext hash_asso() {
			return getRuleContext(Hash_assoContext.class,0);
		}
		public Function_call_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunction_call_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunction_call_param(this);
		}
	}

	public final Function_call_paramContext function_call_param() throws RecognitionException {
		Function_call_paramContext _localctx = new Function_call_paramContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call_param);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				hash_asso();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprLogicalNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public ExprLogicalNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprLogicalNot(this);
		}
	}
	public static class ExprDotClassContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dot_refContext dot_ref() {
			return getRuleContext(Dot_refContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(RubyParser.CLASS, 0); }
		public ExprDotClassContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprDotClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprDotClass(this);
		}
	}
	public static class ExprCalcuationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public BitOperatorContext bitOperator() {
			return getRuleContext(BitOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprCalcuationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprCalcuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprCalcuation(this);
		}
	}
	public static class ExprPrimaryContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExprPrimaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPrimary(this);
		}
	}
	public static class ExprCompareLogicalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprCompareLogicalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprCompareLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprCompareLogical(this);
		}
	}
	public static class ExprBatchAssignContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprBatchAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprBatchAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprBatchAssign(this);
		}
	}
	public static class ExprPatternMatch2Context extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public ExprPatternMatch2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPatternMatch2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPatternMatch2(this);
		}
	}
	public static class ExprPatternMatch3Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public ExprPatternMatch3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPatternMatch3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPatternMatch3(this);
		}
	}
	public static class ExprPrefixCalcContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public ExprPrefixCalcContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPrefixCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPrefixCalc(this);
		}
	}
	public static class ExprFunctionCall3Context extends ExprContext {
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public ExprFunctionCall3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprFunctionCall3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprFunctionCall3(this);
		}
	}
	public static class ExprQuestionContext extends ExprContext {
		public Token postfix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public ExprQuestionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprQuestion(this);
		}
	}
	public static class ExprFunctionCall2Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dot_refContext dot_ref() {
			return getRuleContext(Dot_refContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Func_call_parameters_no_bracketContext func_call_parameters_no_bracket() {
			return getRuleContext(Func_call_parameters_no_bracketContext.class,0);
		}
		public Expr_statement_suffixContext expr_statement_suffix() {
			return getRuleContext(Expr_statement_suffixContext.class,0);
		}
		public ExprFunctionCall2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprFunctionCall2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprFunctionCall2(this);
		}
	}
	public static class ExprFunctionCall1Context extends ExprContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Func_call_parameters_no_bracketContext func_call_parameters_no_bracket() {
			return getRuleContext(Func_call_parameters_no_bracketContext.class,0);
		}
		public Expr_statement_suffixContext expr_statement_suffix() {
			return getRuleContext(Expr_statement_suffixContext.class,0);
		}
		public ExprFunctionCall1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprFunctionCall1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprFunctionCall1(this);
		}
	}
	public static class ExprEqualTestContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsOperatorContext equalsOperator() {
			return getRuleContext(EqualsOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprEqualTestContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprEqualTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprEqualTest(this);
		}
	}
	public static class ExprRangeContext extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT2() { return getToken(RubyParser.DOT2, 0); }
		public TerminalNode DOT3() { return getToken(RubyParser.DOT3, 0); }
		public ExprRangeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprRange(this);
		}
	}
	public static class ExprPatternMatch1Context extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PATTERN_MATCH() { return getToken(RubyParser.PATTERN_MATCH, 0); }
		public ExprPatternMatch1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprPatternMatch1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprPatternMatch1(this);
		}
	}
	public static class ExprBlockContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprBlock(this);
		}
	}
	public static class ExprLogicalJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprLogicalJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprLogicalJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprLogicalJoin(this);
		}
	}
	public static class ExprArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public ExprArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprArrayAccess(this);
		}
	}
	public static class ExprConditionStatementContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(RubyParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public ExprConditionStatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprConditionStatement(this);
		}
	}
	public static class ExprWitStatementSuffixContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statement_suffixContext expr_statement_suffix() {
			return getRuleContext(Expr_statement_suffixContext.class,0);
		}
		public ExprWitStatementSuffixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprWitStatementSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprWitStatementSuffix(this);
		}
	}
	public static class ExprDefineTestContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFINED() { return getToken(RubyParser.DEFINED, 0); }
		public ExprDefineTestContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprDefineTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprDefineTest(this);
		}
	}
	public static class ExprListContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprList(this);
		}
	}
	public static class ExprDotRefContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Dot_refContext dot_ref() {
			return getRuleContext(Dot_refContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprDotRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprDotRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprDotRef(this);
		}
	}
	public static class ExprAssignContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public ExprAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExprAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExprAssign(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(291);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ExprPrefixCalcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				((ExprPrefixCalcContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << BIT_AND) | (1L << MUL))) != 0)) ) {
					((ExprPrefixCalcContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				expr(21);
				}
				break;
			case 3:
				{
				_localctx = new ExprDefineTestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				((ExprDefineTestContext)_localctx).prefix = match(DEFINED);
				setState(295);
				expr(19);
				}
				break;
			case 4:
				{
				_localctx = new ExprLogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case SIGH:
					{
					setState(296);
					not();
					}
					break;
				case BIT_NOT:
					{
					setState(297);
					match(BIT_NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300);
				expr(12);
				}
				break;
			case 5:
				{
				_localctx = new ExprFunctionCall1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				function_name();
				setState(302);
				func_call_parameters_no_bracket();
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(303);
					expr_statement_suffix();
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new ExprFunctionCall3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				cpath();
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==QUESTION || _la==SIGH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprListContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(312);
						match(COMMA);
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(313);
							crlfs();
							}
						}

						setState(316);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new ExprDotRefContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(318);
						dot_ref();
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(319);
							crlfs();
							}
						}

						setState(322);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new ExprBatchAssignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(325);
							match(COMMA);
							}
						}

						setState(329);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(328);
							match(MUL);
							}
						}

						setState(331);
						match(ASSIGN);
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(332);
							crlfs();
							}
						}

						setState(335);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprAssignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(337);
						assignOperator();
						setState(339);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(338);
							crlfs();
							}
						}

						setState(341);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprPatternMatch1Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(344);
						((ExprPatternMatch1Context)_localctx).bop = match(PATTERN_MATCH);
						setState(345);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprPatternMatch2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(347);
						((ExprPatternMatch2Context)_localctx).bop = match(BIT_NOT);
						setState(348);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprPatternMatch3Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(350);
						match(SIGH);
						setState(351);
						match(BIT_NOT);
						setState(352);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprCompareLogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						{
						setState(354);
						compareOperator();
						}
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(355);
							crlfs();
							}
						}

						setState(358);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new ExprLogicalJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(361);
						logicalOperator();
						}
						setState(363);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(362);
							crlfs();
							}
						}

						setState(365);
						expr(11);
						}
						break;
					case 10:
						{
						_localctx = new ExprEqualTestContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(367);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(368);
						equalsOperator();
						}
						setState(370);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(369);
							crlfs();
							}
						}

						setState(372);
						expr(10);
						}
						break;
					case 11:
						{
						_localctx = new ExprCalcuationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(374);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(377);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
						case MINUS:
						case MOD:
						case EXP:
						case MUL:
						case DIV:
							{
							setState(375);
							mathOperator();
							}
							break;
						case BIT_AND:
						case BIT_OR:
						case BIT_SHR:
						case BIT_SHL:
						case BIT_XOR:
							{
							setState(376);
							bitOperator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(379);
							crlfs();
							}
						}

						setState(382);
						expr(9);
						}
						break;
					case 12:
						{
						_localctx = new ExprConditionStatementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(384);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(385);
						match(QUESTION);
						setState(386);
						expr(0);
						setState(387);
						match(COLON);
						setState(388);
						expr(8);
						}
						break;
					case 13:
						{
						_localctx = new ExprQuestionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(390);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(391);
						((ExprQuestionContext)_localctx).postfix = match(QUESTION);
						}
						break;
					case 14:
						{
						_localctx = new ExprArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(392);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(393);
						match(LEFT_SBRACKET);
						setState(394);
						expr(0);
						setState(395);
						match(RIGHT_SBRACKET);
						}
						break;
					case 15:
						{
						_localctx = new ExprRangeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(397);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(398);
						((ExprRangeContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DOT3 || _la==DOT2) ) {
							((ExprRangeContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(400);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(399);
							expr(0);
							}
							break;
						}
						}
						break;
					case 16:
						{
						_localctx = new ExprBlockContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(402);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(403);
						block();
						}
						break;
					case 17:
						{
						_localctx = new ExprWitStatementSuffixContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(404);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(405);
						expr_statement_suffix();
						}
						break;
					case 18:
						{
						_localctx = new ExprDotClassContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(406);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(407);
						dot_ref();
						setState(408);
						match(CLASS);
						}
						break;
					case 19:
						{
						_localctx = new ExprFunctionCall2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						dot_ref();
						setState(412);
						function_name();
						setState(413);
						func_call_parameters_no_bracket();
						setState(415);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(414);
							expr_statement_suffix();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class Expr_statement_suffixContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(RubyParser.UNTIL, 0); }
		public TerminalNode RESCUE() { return getToken(RubyParser.RESCUE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(RubyParser.DO, 0); }
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Block_paramsContext block_params() {
			return getRuleContext(Block_paramsContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Expr_statement_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterExpr_statement_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitExpr_statement_suffix(this);
		}
	}

	public final Expr_statement_suffixContext expr_statement_suffix() throws RecognitionException {
		Expr_statement_suffixContext _localctx = new Expr_statement_suffixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_statement_suffix);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(IF);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(423);
					crlfs();
					}
				}

				setState(426);
				expr(0);
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(UNLESS);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(428);
					crlfs();
					}
				}

				setState(431);
				expr(0);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(WHILE);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(433);
					crlfs();
					}
				}

				setState(436);
				expr(0);
				}
				break;
			case UNTIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(UNTIL);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(438);
					crlfs();
					}
				}

				setState(441);
				expr(0);
				}
				break;
			case RESCUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(RESCUE);
				setState(443);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				match(DO);
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(445);
					block_params();
					}
					break;
				}
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(448);
					terms();
					}
					break;
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(451);
					statement_list_terms(0);
					}
				}

				setState(454);
				match(END);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryVarPathContext extends PrimaryContext {
		public Variable_pathContext variable_path() {
			return getRuleContext(Variable_pathContext.class,0);
		}
		public PrimaryVarPathContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryVarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryVarPath(this);
		}
	}
	public static class PrimaryStatementReturnContext extends PrimaryContext {
		public TerminalNode RETURN() { return getToken(RubyParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementReturnContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementReturn(this);
		}
	}
	public static class PrimaryBlockModelDefContext extends PrimaryContext {
		public Module_definitionContext module_definition() {
			return getRuleContext(Module_definitionContext.class,0);
		}
		public PrimaryBlockModelDefContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockModelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockModelDef(this);
		}
	}
	public static class PrimaryFunctionCall0Context extends PrimaryContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Func_call_parametersContext func_call_parameters() {
			return getRuleContext(Func_call_parametersContext.class,0);
		}
		public PrimaryFunctionCall0Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryFunctionCall0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryFunctionCall0(this);
		}
	}
	public static class PrimaryListExprContext extends PrimaryContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public PrimaryListExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryListExpr(this);
		}
	}
	public static class PrimaryBlockCase2Context extends PrimaryContext {
		public TerminalNode CASE() { return getToken(RubyParser.CASE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public List<Case_bodyContext> case_body() {
			return getRuleContexts(Case_bodyContext.class);
		}
		public Case_bodyContext case_body(int i) {
			return getRuleContext(Case_bodyContext.class,i);
		}
		public PrimaryBlockCase2Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockCase2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockCase2(this);
		}
	}
	public static class PrimaryBlockCase1Context extends PrimaryContext {
		public TerminalNode CASE() { return getToken(RubyParser.CASE, 0); }
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public List<Case_bodyContext> case_body() {
			return getRuleContexts(Case_bodyContext.class);
		}
		public Case_bodyContext case_body(int i) {
			return getRuleContext(Case_bodyContext.class,i);
		}
		public PrimaryBlockCase1Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockCase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockCase1(this);
		}
	}
	public static class PrimaryBlockIf2Context extends PrimaryContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Then_keywordContext> then_keyword() {
			return getRuleContexts(Then_keywordContext.class);
		}
		public Then_keywordContext then_keyword(int i) {
			return getRuleContext(Then_keywordContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public PrimaryBlockIf2Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockIf2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockIf2(this);
		}
	}
	public static class PrimaryBlockContext extends PrimaryContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrimaryBlockContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlock(this);
		}
	}
	public static class PrimaryBlockUntilContext extends PrimaryContext {
		public TerminalNode UNTIL() { return getToken(RubyParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_keywordContext do_keyword() {
			return getRuleContext(Do_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBlockUntilContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockUntil(this);
		}
	}
	public static class PrimaryBlockUnlessContext extends PrimaryContext {
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public PrimaryBlockUnlessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockUnless(this);
		}
	}
	public static class PrimaryStatementBreakContext extends PrimaryContext {
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementBreakContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementBreak(this);
		}
	}
	public static class PrimaryBlockIfContext extends PrimaryContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public List<If_tailContext> if_tail() {
			return getRuleContexts(If_tailContext.class);
		}
		public If_tailContext if_tail(int i) {
			return getRuleContext(If_tailContext.class,i);
		}
		public PrimaryBlockIfContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockIf(this);
		}
	}
	public static class PrimaryBlockForContext extends PrimaryContext {
		public TerminalNode FOR() { return getToken(RubyParser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(RubyParser.IN, 0); }
		public When_condContext when_cond() {
			return getRuleContext(When_condContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBlockForContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockFor(this);
		}
	}
	public static class PrimaryRangeContext extends PrimaryContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode DOT2() { return getToken(RubyParser.DOT2, 0); }
		public TerminalNode DOT3() { return getToken(RubyParser.DOT3, 0); }
		public PrimaryRangeContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryRange(this);
		}
	}
	public static class PrimaryStatementRaiseContext extends PrimaryContext {
		public TerminalNode RAISE() { return getToken(RubyParser.RAISE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementRaiseContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementRaise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementRaise(this);
		}
	}
	public static class PrimaryStatementRescueContext extends PrimaryContext {
		public TerminalNode RESCUE() { return getToken(RubyParser.RESCUE, 0); }
		public Rescure_paramContext rescure_param() {
			return getRuleContext(Rescure_paramContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public PrimaryStatementRescueContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementRescue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementRescue(this);
		}
	}
	public static class PrimaryRegexContext extends PrimaryContext {
		public TerminalNode Regex() { return getToken(RubyParser.Regex, 0); }
		public PrimaryRegexContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryRegex(this);
		}
	}
	public static class PrimaryStatementYieldContext extends PrimaryContext {
		public TerminalNode YIELD() { return getToken(RubyParser.YIELD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryStatementYieldContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryStatementYield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryStatementYield(this);
		}
	}
	public static class PrimaryBlockFunctionDefContext extends PrimaryContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public PrimaryBlockFunctionDefContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockFunctionDef(this);
		}
	}
	public static class PrimaryBracketContext extends PrimaryContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public PrimaryBracketContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBracket(this);
		}
	}
	public static class PrimaryBlockClassDefContext extends PrimaryContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public PrimaryBlockClassDefContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockClassDef(this);
		}
	}
	public static class PrimaryBeginBlockContext extends PrimaryContext {
		public TerminalNode BEGIN() { return getToken(RubyParser.BEGIN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBeginBlockContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBeginBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBeginBlock(this);
		}
	}
	public static class PrimaryBlockWhenContext extends PrimaryContext {
		public TerminalNode WHEN() { return getToken(RubyParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public Statement_list_notermsContext statement_list_noterms() {
			return getRuleContext(Statement_list_notermsContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public PrimaryBlockWhenContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockWhen(this);
		}
	}
	public static class PrimaryListHashContext extends PrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public List<Hash_assoContext> hash_asso() {
			return getRuleContexts(Hash_assoContext.class);
		}
		public Hash_assoContext hash_asso(int i) {
			return getRuleContext(Hash_assoContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public PrimaryListHashContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryListHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryListHash(this);
		}
	}
	public static class PrimaryBlockWhileContext extends PrimaryContext {
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_keywordContext do_keyword() {
			return getRuleContext(Do_keywordContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public PrimaryBlockWhileContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimaryBlockWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimaryBlockWhile(this);
		}
	}
	public static class PrimarySymbolContext extends PrimaryContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public PrimarySymbolContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterPrimarySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitPrimarySymbol(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new PrimaryVarPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				variable_path(0);
				}
				break;
			case 2:
				_localctx = new PrimaryRegexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(Regex);
				}
				break;
			case 3:
				_localctx = new PrimarySymbolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				symbol();
				}
				break;
			case 4:
				_localctx = new PrimaryBracketContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(LEFT_RBRACKET);
				setState(461);
				expr(0);
				setState(462);
				match(RIGHT_RBRACKET);
				}
				break;
			case 5:
				_localctx = new PrimaryBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				block();
				}
				break;
			case 6:
				_localctx = new PrimaryStatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(465);
				match(BREAK);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(466);
					expr(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new PrimaryStatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				match(RETURN);
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(470);
					expr(0);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new PrimaryStatementRaiseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(473);
				match(RAISE);
				setState(474);
				expr(0);
				}
				break;
			case 9:
				_localctx = new PrimaryStatementRescueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(475);
				match(RESCUE);
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(476);
					rescure_param();
					}
					break;
				}
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(479);
					else_tail();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new PrimaryStatementYieldContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(482);
				match(YIELD);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(483);
					expr(0);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new PrimaryBeginBlockContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(486);
				match(BEGIN);
				setState(487);
				terms();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(488);
					statement_list_terms(0);
					}
				}

				setState(491);
				match(END);
				}
				break;
			case 12:
				_localctx = new PrimaryBlockIf2Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(493);
				match(IF);
				setState(494);
				expr(0);
				setState(495);
				then_keyword();
				setState(496);
				statement();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSIF) {
					{
					setState(497);
					match(ELSIF);
					setState(498);
					expr(0);
					setState(499);
					then_keyword();
					setState(500);
					statement();
					}
				}

				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(504);
					match(ELSE);
					setState(505);
					expr(0);
					}
				}

				setState(508);
				match(END);
				}
				break;
			case 13:
				_localctx = new PrimaryBlockIfContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(510);
				match(IF);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(511);
					crlfs();
					}
				}

				setState(514);
				expr(0);
				setState(515);
				then_keyword();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(516);
					statement_list_terms(0);
					}
				}

				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE || _la==ELSIF) {
					{
					{
					setState(519);
					if_tail();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(END);
				}
				break;
			case 14:
				_localctx = new PrimaryBlockWhenContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(527);
				match(WHEN);
				setState(528);
				expr(0);
				setState(529);
				then_keyword();
				setState(530);
				statement_list_noterms();
				setState(531);
				match(END);
				}
				break;
			case 15:
				_localctx = new PrimaryBlockUnlessContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(533);
				match(UNLESS);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(534);
					crlfs();
					}
				}

				setState(537);
				expr(0);
				setState(538);
				then_keyword();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(539);
					statement_list_terms(0);
					}
				}

				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(542);
					else_tail();
					}
				}

				setState(545);
				match(END);
				}
				break;
			case 16:
				_localctx = new PrimaryBlockCase1Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(547);
				match(CASE);
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(548);
					statement_list_terms(0);
					}
					break;
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE || _la==WHEN) {
					{
					{
					setState(551);
					case_body();
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(557);
				match(END);
				}
				break;
			case 17:
				_localctx = new PrimaryBlockCase2Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(558);
				match(CASE);
				setState(559);
				terms();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE || _la==WHEN) {
					{
					{
					setState(560);
					case_body();
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				match(END);
				}
				break;
			case 18:
				_localctx = new PrimaryBlockWhileContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(568);
				match(WHILE);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(569);
					crlfs();
					}
				}

				setState(572);
				expr(0);
				setState(573);
				do_keyword();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(574);
					statement_list_terms(0);
					}
				}

				setState(577);
				match(END);
				}
				break;
			case 19:
				_localctx = new PrimaryBlockUntilContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(579);
				match(UNTIL);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(580);
					crlfs();
					}
				}

				setState(583);
				expr(0);
				setState(584);
				do_keyword();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(585);
					statement_list_terms(0);
					}
				}

				setState(588);
				match(END);
				}
				break;
			case 20:
				_localctx = new PrimaryBlockForContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(590);
				match(FOR);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(591);
					crlfs();
					}
				}

				setState(594);
				expr(0);
				setState(595);
				match(IN);
				setState(596);
				when_cond();
				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(597);
					terms();
					}
					break;
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << BEGIN) | (1L << BEGIN_BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << END_BLOCK) | (1L << ENSURE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNDEF) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << CRLF) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (SEMICOLON - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (SL_COMMENT - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(600);
					statement_list_terms(0);
					}
				}

				setState(603);
				match(END);
				}
				break;
			case 21:
				_localctx = new PrimaryBlockClassDefContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(605);
				class_definition();
				}
				break;
			case 22:
				_localctx = new PrimaryBlockFunctionDefContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(606);
				function_definition();
				}
				break;
			case 23:
				_localctx = new PrimaryBlockModelDefContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(607);
				module_definition();
				}
				break;
			case 24:
				_localctx = new PrimaryFunctionCall0Context(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(608);
				function_name();
				setState(609);
				func_call_parameters();
				}
				break;
			case 25:
				_localctx = new PrimaryListHashContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(611);
				match(LEFT_PAREN);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(612);
					crlfs();
					}
				}

				setState(615);
				hash_asso();
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(616);
					crlfs();
					}
					break;
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(619);
						match(COMMA);
						setState(621);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(620);
							crlfs();
							}
						}

						setState(623);
						hash_asso();
						}
						} 
					}
					setState(628);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(629);
					match(COMMA);
					}
				}

				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(632);
					crlfs();
					}
				}

				setState(635);
				match(RIGHT_PAREN);
				}
				break;
			case 26:
				_localctx = new PrimaryListExprContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(637);
				match(LEFT_SBRACKET);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(638);
					crlfs();
					}
				}

				setState(641);
				expr(0);
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(642);
					crlfs();
					}
					break;
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						match(COMMA);
						setState(647);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CRLF || _la==SL_COMMENT) {
							{
							setState(646);
							crlfs();
							}
						}

						setState(649);
						expr(0);
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(655);
					match(COMMA);
					}
				}

				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(658);
					crlfs();
					}
				}

				setState(661);
				match(RIGHT_SBRACKET);
				}
				break;
			case 27:
				_localctx = new PrimaryRangeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(663);
				match(LEFT_RBRACKET);
				setState(664);
				expr(0);
				setState(665);
				_la = _input.LA(1);
				if ( !(_la==DOT3 || _la==DOT2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << BREAK) | (1L << CASE) | (1L << CLASS) | (1L << DEF) | (1L << DEFINED) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << MODULE) | (1L << NEXT) | (1L << NIL) | (1L << NOT) | (1L << RAISE) | (1L << REDO) | (1L << RESCUE) | (1L << RETRY) | (1L << RETURN) | (1L << SELF) | (1L << SUPER) | (1L << TRUE) | (1L << UNLESS) | (1L << UNTIL) | (1L << WHEN) | (1L << WHILE) | (1L << YIELD) | (1L << Integer) | (1L << Float) | (1L << Regex) | (1L << String) | (1L << DollarSpecial) | (1L << AND) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << MOD) | (1L << PLUS_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << BIT_AND_ASSIGN) | (1L << BIT_AND) | (1L << EXP_ASSIGN) | (1L << EXP) | (1L << MUL) | (1L << MUL_ASSIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOLLAR - 64)) | (1L << (AT - 64)) | (1L << (LEFT_PAREN - 64)) | (1L << (LEFT_SBRACKET - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (DIV - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (SIGH - 64)) | (1L << (COLON - 64)) | (1L << (COLON2 - 64)) | (1L << (MINUS_ASSIGN - 64)) | (1L << (OR_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (BIT_OR - 64)) | (1L << (BIT_SHR_ASSIGN - 64)) | (1L << (GREATER_EQUAL - 64)) | (1L << (BIT_SHR - 64)) | (1L << (GREATER - 64)) | (1L << (EQUAL3 - 64)) | (1L << (EQUAL - 64)) | (1L << (LESS_EQUAL - 64)) | (1L << (LESS - 64)) | (1L << (BIT_SHL_ASSIGN - 64)) | (1L << (BIT_SHL - 64)) | (1L << (BIT_NOT_ASSIGN - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_XOR_ASSIGN - 64)) | (1L << (BIT_XOR - 64)) | (1L << (Identifier - 64)) | (1L << (ShellCommand - 64)))) != 0)) {
					{
					setState(666);
					expr(0);
					}
				}

				setState(669);
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

	public static class Func_call_parametersContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public List<Function_call_paramContext> function_call_param() {
			return getRuleContexts(Function_call_paramContext.class);
		}
		public Function_call_paramContext function_call_param(int i) {
			return getRuleContext(Function_call_paramContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Func_call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunc_call_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunc_call_parameters(this);
		}
	}

	public final Func_call_parametersContext func_call_parameters() throws RecognitionException {
		Func_call_parametersContext _localctx = new Func_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_call_parameters);
		int _la;
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(LEFT_RBRACKET);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(674);
					crlfs();
					}
				}

				setState(677);
				function_call_param();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(678);
					match(COMMA);
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CRLF || _la==SL_COMMENT) {
						{
						setState(679);
						crlfs();
						}
					}

					setState(682);
					function_call_param();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(688);
					crlfs();
					}
				}

				setState(691);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(LEFT_RBRACKET);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(694);
					crlfs();
					}
				}

				setState(697);
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

	public static class Func_call_parameters_no_bracketContext extends ParserRuleContext {
		public List<Function_call_paramContext> function_call_param() {
			return getRuleContexts(Function_call_paramContext.class);
		}
		public Function_call_paramContext function_call_param(int i) {
			return getRuleContext(Function_call_paramContext.class,i);
		}
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Func_call_parameters_no_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_parameters_no_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterFunc_call_parameters_no_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitFunc_call_parameters_no_bracket(this);
		}
	}

	public final Func_call_parameters_no_bracketContext func_call_parameters_no_bracket() throws RecognitionException {
		Func_call_parameters_no_bracketContext _localctx = new Func_call_parameters_no_bracketContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_func_call_parameters_no_bracket);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			function_call_param();
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(701);
					match(COMMA);
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CRLF || _la==SL_COMMENT) {
						{
						setState(702);
						crlfs();
						}
					}

					setState(705);
					function_call_param();
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class Rescure_paramContext extends ParserRuleContext {
		public Id_symbolContext id_symbol() {
			return getRuleContext(Id_symbolContext.class,0);
		}
		public Hash_assoContext hash_asso() {
			return getRuleContext(Hash_assoContext.class,0);
		}
		public TerminalNode ASSOC() { return getToken(RubyParser.ASSOC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Rescure_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rescure_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterRescure_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitRescure_param(this);
		}
	}

	public final Rescure_paramContext rescure_param() throws RecognitionException {
		Rescure_paramContext _localctx = new Rescure_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rescure_param);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				id_symbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				hash_asso();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				match(ASSOC);
				setState(714);
				identifier();
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

	public static class Case_bodyContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(RubyParser.WHEN, 0); }
		public List<When_condContext> when_cond() {
			return getRuleContexts(When_condContext.class);
		}
		public When_condContext when_cond(int i) {
			return getRuleContext(When_condContext.class,i);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public Case_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCase_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCase_body(this);
		}
	}

	public final Case_bodyContext case_body() throws RecognitionException {
		Case_bodyContext _localctx = new Case_bodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_body);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				match(WHEN);
				setState(718);
				when_cond();
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(719);
					match(COMMA);
					setState(720);
					when_cond();
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(726);
				then_keyword();
				setState(727);
				statement_list_terms(0);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				else_tail();
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

	public static class When_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public When_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterWhen_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitWhen_cond(this);
		}
	}

	public final When_condContext when_cond() throws RecognitionException {
		When_condContext _localctx = new When_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_when_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			expr(0);
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

	public static class If_tailContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Then_keywordContext then_keyword() {
			return getRuleContext(Then_keywordContext.class,0);
		}
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Else_tailContext else_tail() {
			return getRuleContext(Else_tailContext.class,0);
		}
		public If_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterIf_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitIf_tail(this);
		}
	}

	public final If_tailContext if_tail() throws RecognitionException {
		If_tailContext _localctx = new If_tailContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_tail);
		int _la;
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(ELSIF);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(735);
					crlfs();
					}
				}

				setState(738);
				expr(0);
				setState(739);
				then_keyword();
				setState(740);
				statement_list_terms(0);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				else_tail();
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

	public static class Else_tailContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public Statement_list_termsContext statement_list_terms() {
			return getRuleContext(Statement_list_termsContext.class,0);
		}
		public CrlfsContext crlfs() {
			return getRuleContext(CrlfsContext.class,0);
		}
		public Else_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterElse_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitElse_tail(this);
		}
	}

	public final Else_tailContext else_tail() throws RecognitionException {
		Else_tailContext _localctx = new Else_tailContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(ELSE);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(746);
				crlfs();
				}
				break;
			}
			setState(749);
			statement_list_terms(0);
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

	public static class Dot_refContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(RubyParser.DOT, 0); }
		public TerminalNode ANDDOT() { return getToken(RubyParser.ANDDOT, 0); }
		public Dot_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterDot_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitDot_ref(this);
		}
	}

	public final Dot_refContext dot_ref() throws RecognitionException {
		Dot_refContext _localctx = new Dot_refContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dot_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if ( !(_la==ANDDOT || _la==DOT) ) {
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(RubyParser.OR, 0); }
		public TerminalNode AND() { return getToken(RubyParser.AND, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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

	public static class EqualsOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL3() { return getToken(RubyParser.EQUAL3, 0); }
		public EqualsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterEqualsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitEqualsOperator(this);
		}
	}

	public final EqualsOperatorContext equalsOperator() throws RecognitionException {
		EqualsOperatorContext _localctx = new EqualsOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equalsOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (NOT_EQUAL - 78)) | (1L << (EQUAL3 - 78)) | (1L << (EQUAL - 78)))) != 0)) ) {
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

	public static class CompareOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(RubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyParser.GREATER_EQUAL, 0); }
		public CompareOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCompareOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCompareOperator(this);
		}
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (GREATER_EQUAL - 89)) | (1L << (GREATER - 89)) | (1L << (LESS_EQUAL - 89)) | (1L << (LESS - 89)))) != 0)) ) {
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

	public static class BitOperatorContext extends ParserRuleContext {
		public TerminalNode BIT_SHL() { return getToken(RubyParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(RubyParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(RubyParser.BIT_XOR, 0); }
		public BitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBitOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBitOperator(this);
		}
	}

	public final BitOperatorContext bitOperator() throws RecognitionException {
		BitOperatorContext _localctx = new BitOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bitOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BIT_AND - 59)) | (1L << (BIT_OR - 59)) | (1L << (BIT_SHR - 59)) | (1L << (BIT_SHL - 59)) | (1L << (BIT_XOR - 59)))) != 0)) ) {
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

	public static class MathOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode EXP() { return getToken(RubyParser.EXP, 0); }
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitMathOperator(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (PLUS - 50)) | (1L << (MINUS - 50)) | (1L << (MOD - 50)) | (1L << (EXP - 50)) | (1L << (MUL - 50)) | (1L << (DIV - 50)))) != 0)) ) {
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public TerminalNode BIT_OR_ASSIGN() { return getToken(RubyParser.BIT_OR_ASSIGN, 0); }
		public TerminalNode BIT_AND_ASSIGN() { return getToken(RubyParser.BIT_AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(RubyParser.OR_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(RubyParser.AND_ASSIGN, 0); }
		public TerminalNode BIT_XOR_ASSIGN() { return getToken(RubyParser.BIT_XOR_ASSIGN, 0); }
		public TerminalNode BIT_NOT_ASSIGN() { return getToken(RubyParser.BIT_NOT_ASSIGN, 0); }
		public TerminalNode BIT_SHL_ASSIGN() { return getToken(RubyParser.BIT_SHL_ASSIGN, 0); }
		public TerminalNode BIT_SHR_ASSIGN() { return getToken(RubyParser.BIT_SHR_ASSIGN, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitAssignOperator(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (PLUS_ASSIGN - 53)) | (1L << (MOD_ASSIGN - 53)) | (1L << (AND_ASSIGN - 53)) | (1L << (BIT_AND_ASSIGN - 53)) | (1L << (EXP_ASSIGN - 53)) | (1L << (MUL_ASSIGN - 53)) | (1L << (DIV_ASSIGN - 53)) | (1L << (MINUS_ASSIGN - 53)) | (1L << (OR_ASSIGN - 53)) | (1L << (BIT_OR_ASSIGN - 53)) | (1L << (BIT_SHR_ASSIGN - 53)) | (1L << (BIT_SHL_ASSIGN - 53)) | (1L << (BIT_NOT_ASSIGN - 53)) | (1L << (BIT_XOR_ASSIGN - 53)))) != 0)) ) {
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RubyParser.NOT, 0); }
		public TerminalNode SIGH() { return getToken(RubyParser.SIGH, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==SIGH) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public List<Statement_list_notermsContext> statement_list_noterms() {
			return getRuleContexts(Statement_list_notermsContext.class);
		}
		public Statement_list_notermsContext statement_list_noterms(int i) {
			return getRuleContext(Statement_list_notermsContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public List<CrlfsContext> crlfs() {
			return getRuleContexts(CrlfsContext.class);
		}
		public CrlfsContext crlfs(int i) {
			return getRuleContext(CrlfsContext.class,i);
		}
		public Block_paramsContext block_params() {
			return getRuleContext(Block_paramsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(LEFT_PAREN);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CRLF || _la==SL_COMMENT) {
				{
				setState(768);
				crlfs();
				}
			}

			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(771);
				block_params();
				}
				break;
			}
			setState(774);
			statement_list_noterms();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CRLF || _la==SL_COMMENT) {
				{
				setState(775);
				crlfs();
				}
			}

			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(778);
				match(COMMA);
				setState(779);
				statement_list_noterms();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF || _la==SL_COMMENT) {
					{
					setState(780);
					crlfs();
					}
				}

				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			match(RIGHT_PAREN);
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

	public static class Block_paramsContext extends ParserRuleContext {
		public List<TerminalNode> BIT_OR() { return getTokens(RubyParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(RubyParser.BIT_OR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Block_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterBlock_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitBlock_params(this);
		}
	}

	public final Block_paramsContext block_params() throws RecognitionException {
		Block_paramsContext _localctx = new Block_paramsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(BIT_OR);
			setState(791);
			expr(0);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(792);
				match(COMMA);
				setState(793);
				expr(0);
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			match(BIT_OR);
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

	public static class Id_symbolContext extends ParserRuleContext {
		public CpathContext cpath() {
			return getRuleContext(CpathContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public Id_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterId_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitId_symbol(this);
		}
	}

	public final Id_symbolContext id_symbol() throws RecognitionException {
		Id_symbolContext _localctx = new Id_symbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_id_symbol);
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case NEXT:
			case NIL:
			case REDO:
			case RETRY:
			case SELF:
			case SUPER:
			case DollarSpecial:
			case DOLLAR:
			case AT:
			case LEFT_PAREN:
			case LEFT_SBRACKET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				cpath();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(COLON);
				setState(803);
				cpath();
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

	public static class SymbolContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(RubyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RubyParser.COLON, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_symbol);
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				match(COLON);
				setState(807);
				identifier();
				setState(808);
				match(COLON);
				setState(809);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(COLON);
				setState(812);
				function_name();
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

	public static class Hash_assoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSOC() { return getToken(RubyParser.ASSOC, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public Hash_assoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_asso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterHash_asso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitHash_asso(this);
		}
	}

	public final Hash_assoContext hash_asso() throws RecognitionException {
		Hash_assoContext _localctx = new Hash_assoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hash_asso);
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				expr(0);
				setState(816);
				match(ASSOC);
				setState(817);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				expr(0);
				setState(820);
				match(COLON);
				setState(821);
				expr(0);
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

	public static class Variable_pathContext extends ParserRuleContext {
		public Variable_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_path; }
	 
		public Variable_pathContext() { }
		public void copyFrom(Variable_pathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarPathLiteralContext extends Variable_pathContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarPathLiteralContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathLiteral(this);
		}
	}
	public static class VarPathIdContext extends Variable_pathContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarPathIdContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathId(this);
		}
	}
	public static class VarPathGlobalPrefixContext extends Variable_pathContext {
		public TerminalNode COLON2() { return getToken(RubyParser.COLON2, 0); }
		public Variable_pathContext variable_path() {
			return getRuleContext(Variable_pathContext.class,0);
		}
		public VarPathGlobalPrefixContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathGlobalPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathGlobalPrefix(this);
		}
	}
	public static class VarPathJoinContext extends Variable_pathContext {
		public Variable_pathContext variable_path() {
			return getRuleContext(Variable_pathContext.class,0);
		}
		public TerminalNode COLON2() { return getToken(RubyParser.COLON2, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarPathJoinContext(Variable_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterVarPathJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitVarPathJoin(this);
		}
	}

	public final Variable_pathContext variable_path() throws RecognitionException {
		return variable_path(0);
	}

	private Variable_pathContext variable_path(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_pathContext _localctx = new Variable_pathContext(_ctx, _parentState);
		Variable_pathContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_variable_path, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				_localctx = new VarPathIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(826);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new VarPathLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(827);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new VarPathGlobalPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(828);
				match(COLON2);
				setState(829);
				variable_path(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarPathJoinContext(new Variable_pathContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_variable_path);
					setState(832);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(833);
					match(COLON2);
					setState(836);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(834);
						identifier();
						}
						break;
					case 2:
						{
						setState(835);
						literal();
						}
						break;
					}
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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

	public static class CpathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COLON2() { return getTokens(RubyParser.COLON2); }
		public TerminalNode COLON2(int i) {
			return getToken(RubyParser.COLON2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(RubyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RubyParser.DOT, i);
		}
		public CpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCpath(this);
		}
	}

	public final CpathContext cpath() throws RecognitionException {
		CpathContext _localctx = new CpathContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cpath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			identifier();
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(844);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==COLON2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(845);
					identifier();
					}
					} 
				}
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(RubyParser.Float, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Integer() { return getToken(RubyParser.Integer, 0); }
		public TerminalNode TRUE() { return getToken(RubyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RubyParser.FALSE, 0); }
		public TerminalNode NIL() { return getToken(RubyParser.NIL, 0); }
		public TerminalNode DOT() { return getToken(RubyParser.DOT, 0); }
		public TerminalNode ShellCommand() { return getToken(RubyParser.ShellCommand, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		int _la;
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(Float);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(Integer);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				match(NIL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(856);
				match(Float);
				setState(857);
				match(DOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
				match(ShellCommand);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public GlobalVarContext globalVar() {
			return getRuleContext(GlobalVarContext.class,0);
		}
		public ClassVarContext classVar() {
			return getRuleContext(ClassVarContext.class,0);
		}
		public InstanceVarContext instanceVar() {
			return getRuleContext(InstanceVarContext.class,0);
		}
		public IdArgContext idArg() {
			return getRuleContext(IdArgContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(RubyParser.NEXT, 0); }
		public TerminalNode REDO() { return getToken(RubyParser.REDO, 0); }
		public TerminalNode RETRY() { return getToken(RubyParser.RETRY, 0); }
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public TerminalNode SELF() { return getToken(RubyParser.SELF, 0); }
		public TerminalNode SUPER() { return getToken(RubyParser.SUPER, 0); }
		public TerminalNode NIL() { return getToken(RubyParser.NIL, 0); }
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				globalVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				classVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				instanceVar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(865);
				idArg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(866);
				match(NEXT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(867);
				match(REDO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(868);
				match(RETRY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(869);
				match(BREAK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(870);
				match(SELF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(871);
				match(SUPER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(872);
				match(NIL);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(873);
				empty();
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

	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(RubyParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(RubyParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_empty);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(LEFT_PAREN);
				setState(877);
				match(RIGHT_PAREN);
				}
				break;
			case LEFT_SBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(LEFT_SBRACKET);
				setState(879);
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

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(RubyParser.DOLLAR, 0); }
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitGlobalVar(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_globalVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(DOLLAR);
			setState(883);
			match(Identifier);
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

	public static class ClassVarContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(RubyParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(RubyParser.AT, i);
		}
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public ClassVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterClassVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitClassVar(this);
		}
	}

	public final ClassVarContext classVar() throws RecognitionException {
		ClassVarContext _localctx = new ClassVarContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(AT);
			setState(886);
			match(AT);
			setState(887);
			match(Identifier);
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

	public static class InstanceVarContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(RubyParser.AT, 0); }
		public TerminalNode Identifier() { return getToken(RubyParser.Identifier, 0); }
		public InstanceVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterInstanceVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitInstanceVar(this);
		}
	}

	public final InstanceVarContext instanceVar() throws RecognitionException {
		InstanceVarContext _localctx = new InstanceVarContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_instanceVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(AT);
			setState(890);
			match(Identifier);
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

	public static class IdArgContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(RubyParser.DOLLAR, 0); }
		public TerminalNode Integer() { return getToken(RubyParser.Integer, 0); }
		public TerminalNode DollarSpecial() { return getToken(RubyParser.DollarSpecial, 0); }
		public IdArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterIdArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitIdArg(this);
		}
	}

	public final IdArgContext idArg() throws RecognitionException {
		IdArgContext _localctx = new IdArgContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_idArg);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(DOLLAR);
				setState(893);
				match(Integer);
				}
				break;
			case DollarSpecial:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(DollarSpecial);
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

	public static class Do_keywordContext extends ParserRuleContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode DO() { return getToken(RubyParser.DO, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public Do_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterDo_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitDo_keyword(this);
		}
	}

	public final Do_keywordContext do_keyword() throws RecognitionException {
		Do_keywordContext _localctx = new Do_keywordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_do_keyword);
		int _la;
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				_la = _input.LA(1);
				if ( !(_la==DO || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(898);
				terms();
				}
				break;
			case CRLF:
			case SEMICOLON:
			case SL_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				terms();
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

	public static class Then_keywordContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(RubyParser.THEN, 0); }
		public TerminalNode COLON() { return getToken(RubyParser.COLON, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Then_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterThen_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitThen_keyword(this);
		}
	}

	public final Then_keywordContext then_keyword() throws RecognitionException {
		Then_keywordContext _localctx = new Then_keywordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_then_keyword);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				_la = _input.LA(1);
				if ( !(_la==THEN || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(903);
					terms();
					}
					break;
				}
				}
				break;
			case CRLF:
			case SEMICOLON:
			case SL_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				terms();
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(RubyParser.String); }
		public TerminalNode String(int i) {
			return getToken(RubyParser.String, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(909);
					match(String);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(912); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CrlfsContext extends ParserRuleContext {
		public List<TerminalNode> SL_COMMENT() { return getTokens(RubyParser.SL_COMMENT); }
		public TerminalNode SL_COMMENT(int i) {
			return getToken(RubyParser.SL_COMMENT, i);
		}
		public List<TerminalNode> CRLF() { return getTokens(RubyParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(RubyParser.CRLF, i);
		}
		public CrlfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterCrlfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitCrlfs(this);
		}
	}

	public final CrlfsContext crlfs() throws RecognitionException {
		CrlfsContext _localctx = new CrlfsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_crlfs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(914);
					_la = _input.LA(1);
					if ( !(_la==CRLF || _la==SL_COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(917); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_terms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(920); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(919);
					term();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(922); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RubyParser.SEMICOLON, 0); }
		public TerminalNode CRLF() { return getToken(RubyParser.CRLF, 0); }
		public TerminalNode SL_COMMENT() { return getToken(RubyParser.SL_COMMENT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyParserListener ) ((RubyParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (CRLF - 47)) | (1L << (SEMICOLON - 47)) | (1L << (SL_COMMENT - 47)))) != 0)) ) {
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
		case 1:
			return statement_list_terms_sempred((Statement_list_termsContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 42:
			return variable_path_sempred((Variable_pathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_list_terms_sempred(Statement_list_termsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 18);
		case 16:
			return precpred(_ctx, 6);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean variable_path_sempred(Variable_pathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3w\u03a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3|\n\3\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3"+
		"\3\4\3\4\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0097\n\5\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00a8\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\5\13\u00b7\n\13\3\13\3\13\3\f\3\f\5\f\u00bd"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16"+
		"\3\16\5\16\u00cd\n\16\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\3\20\3\20\3"+
		"\20\5\20\u00d8\n\20\3\20\5\20\u00db\n\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00e2\n\21\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\5\21\u00ea\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f5\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00fb\n\22\3\22\7\22\u00fe\n\22\f\22\16\22\u0101\13\22\5\22"+
		"\u0103\n\22\3\22\3\22\3\22\3\22\5\22\u0109\n\22\3\22\7\22\u010c\n\22\f"+
		"\22\16\22\u010f\13\22\5\22\u0111\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24\5\24\u0123\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012d\n\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0133\n\25\3\25\3\25\3\25\5\25\u0138\n\25\3\25\3\25\3\25\5"+
		"\25\u013d\n\25\3\25\3\25\3\25\3\25\5\25\u0143\n\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0149\n\25\3\25\5\25\u014c\n\25\3\25\3\25\5\25\u0150\n\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0156\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0167\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u016e\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0175\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u017c\n\25\3\25\5\25\u017f\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0193\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u01a2\n\25\7\25\u01a4\n\25\f\25\16\25\u01a7\13\25"+
		"\3\26\3\26\5\26\u01ab\n\26\3\26\3\26\3\26\5\26\u01b0\n\26\3\26\3\26\3"+
		"\26\5\26\u01b5\n\26\3\26\3\26\3\26\5\26\u01ba\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u01c1\n\26\3\26\5\26\u01c4\n\26\3\26\5\26\u01c7\n\26\3\26\5"+
		"\26\u01ca\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u01d6\n\27\3\27\3\27\5\27\u01da\n\27\3\27\3\27\3\27\3\27\5\27\u01e0\n"+
		"\27\3\27\5\27\u01e3\n\27\3\27\3\27\5\27\u01e7\n\27\3\27\3\27\3\27\5\27"+
		"\u01ec\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u01f9\n\27\3\27\3\27\5\27\u01fd\n\27\3\27\3\27\3\27\3\27\5\27\u0203\n"+
		"\27\3\27\3\27\3\27\5\27\u0208\n\27\3\27\7\27\u020b\n\27\f\27\16\27\u020e"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021a\n"+
		"\27\3\27\3\27\3\27\5\27\u021f\n\27\3\27\5\27\u0222\n\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0228\n\27\3\27\7\27\u022b\n\27\f\27\16\27\u022e\13\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0234\n\27\f\27\16\27\u0237\13\27\3\27\3\27\3\27"+
		"\3\27\5\27\u023d\n\27\3\27\3\27\3\27\5\27\u0242\n\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0248\n\27\3\27\3\27\3\27\5\27\u024d\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0253\n\27\3\27\3\27\3\27\3\27\5\27\u0259\n\27\3\27\5\27\u025c\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0268\n\27"+
		"\3\27\3\27\5\27\u026c\n\27\3\27\3\27\5\27\u0270\n\27\3\27\7\27\u0273\n"+
		"\27\f\27\16\27\u0276\13\27\3\27\5\27\u0279\n\27\3\27\5\27\u027c\n\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0282\n\27\3\27\3\27\5\27\u0286\n\27\3\27\3\27"+
		"\5\27\u028a\n\27\3\27\7\27\u028d\n\27\f\27\16\27\u0290\13\27\3\27\5\27"+
		"\u0293\n\27\3\27\5\27\u0296\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u029e"+
		"\n\27\3\27\3\27\5\27\u02a2\n\27\3\30\3\30\5\30\u02a6\n\30\3\30\3\30\3"+
		"\30\5\30\u02ab\n\30\3\30\7\30\u02ae\n\30\f\30\16\30\u02b1\13\30\3\30\5"+
		"\30\u02b4\n\30\3\30\3\30\3\30\3\30\5\30\u02ba\n\30\3\30\5\30\u02bd\n\30"+
		"\3\31\3\31\3\31\5\31\u02c2\n\31\3\31\7\31\u02c5\n\31\f\31\16\31\u02c8"+
		"\13\31\3\32\3\32\3\32\3\32\5\32\u02ce\n\32\3\33\3\33\3\33\3\33\7\33\u02d4"+
		"\n\33\f\33\16\33\u02d7\13\33\3\33\3\33\3\33\3\33\5\33\u02dd\n\33\3\34"+
		"\3\34\3\35\3\35\5\35\u02e3\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u02ea\n"+
		"\35\3\36\3\36\5\36\u02ee\n\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u0304\n\'\3\'\5\'\u0307\n\'\3\'\3"+
		"\'\5\'\u030b\n\'\3\'\3\'\3\'\5\'\u0310\n\'\7\'\u0312\n\'\f\'\16\'\u0315"+
		"\13\'\3\'\3\'\3(\3(\3(\3(\7(\u031d\n(\f(\16(\u0320\13(\3(\3(\3)\3)\3)"+
		"\5)\u0327\n)\3*\3*\3*\3*\3*\3*\3*\5*\u0330\n*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\5+\u033a\n+\3,\3,\3,\3,\3,\5,\u0341\n,\3,\3,\3,\3,\5,\u0347\n,\7,\u0349"+
		"\n,\f,\16,\u034c\13,\3-\3-\3-\7-\u0351\n-\f-\16-\u0354\13-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\5.\u035e\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u036d"+
		"\n/\3\60\3\60\3\60\3\60\5\60\u0373\n\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u0382\n\64\3\65\3\65\3\65\5\65"+
		"\u0387\n\65\3\66\3\66\5\66\u038b\n\66\3\66\5\66\u038e\n\66\3\67\6\67\u0391"+
		"\n\67\r\67\16\67\u0392\38\68\u0396\n8\r8\168\u0397\39\69\u039b\n9\r9\16"+
		"9\u039c\3:\3:\3:\2\5\4(V;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\23\5\2\64\66==@@\4\2"+
		"OOQQ\3\2JK\4\2<<LL\3\2\62\63\4\2PP`a\5\2[[]]cd\7\2==YY\\\\ffjj\5\2\64"+
		"\66?@NN\f\2\678:;>>AAMMVXZZeeggii\4\2\34\34QQ\4\2LLSS\4\2\25\25%%\4\2"+
		"\17\17RR\4\2$$RR\4\2\61\61kk\5\2\61\61TTkk\2\u043a\2t\3\2\2\2\4{\3\2\2"+
		"\2\6\u008b\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2\2\f\u00a1\3\2\2\2\16"+
		"\u00a7\3\2\2\2\20\u00a9\3\2\2\2\22\u00ae\3\2\2\2\24\u00b3\3\2\2\2\26\u00ba"+
		"\3\2\2\2\30\u00c0\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00d4\3"+
		"\2\2\2 \u00f4\3\2\2\2\"\u0110\3\2\2\2$\u011e\3\2\2\2&\u0122\3\2\2\2(\u0137"+
		"\3\2\2\2*\u01c9\3\2\2\2,\u02a1\3\2\2\2.\u02bc\3\2\2\2\60\u02be\3\2\2\2"+
		"\62\u02cd\3\2\2\2\64\u02dc\3\2\2\2\66\u02de\3\2\2\28\u02e9\3\2\2\2:\u02eb"+
		"\3\2\2\2<\u02f1\3\2\2\2>\u02f3\3\2\2\2@\u02f5\3\2\2\2B\u02f7\3\2\2\2D"+
		"\u02f9\3\2\2\2F\u02fb\3\2\2\2H\u02fd\3\2\2\2J\u02ff\3\2\2\2L\u0301\3\2"+
		"\2\2N\u0318\3\2\2\2P\u0326\3\2\2\2R\u032f\3\2\2\2T\u0339\3\2\2\2V\u0340"+
		"\3\2\2\2X\u034d\3\2\2\2Z\u035d\3\2\2\2\\\u036c\3\2\2\2^\u0372\3\2\2\2"+
		"`\u0374\3\2\2\2b\u0377\3\2\2\2d\u037b\3\2\2\2f\u0381\3\2\2\2h\u0386\3"+
		"\2\2\2j\u038d\3\2\2\2l\u0390\3\2\2\2n\u0395\3\2\2\2p\u039a\3\2\2\2r\u039e"+
		"\3\2\2\2tu\5\4\3\2u\3\3\2\2\2vw\b\3\1\2wx\5\b\5\2xy\5p9\2y|\3\2\2\2z|"+
		"\5p9\2{v\3\2\2\2{z\3\2\2\2|\u0083\3\2\2\2}~\f\4\2\2~\177\5\b\5\2\177\u0080"+
		"\5p9\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\5\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\5\b\5\2\u0087\u0088\5p9\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2"+
		"\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\b\5\2\u008f\7\3\2\2\2\u0090"+
		"\u0097\5\20\t\2\u0091\u0097\5\22\n\2\u0092\u0097\5\f\7\2\u0093\u0097\5"+
		"\n\6\2\u0094\u0097\7\24\2\2\u0095\u0097\5(\25\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\t\3\2\2\2\u0098\u0099\7&\2\2\u0099\u009e"+
		"\5\16\b\2\u009a\u009b\7U\2\2\u009b\u009d\5\16\b\2\u009c\u009a\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\5\16\b\2"+
		"\u00a3\u00a4\5\16\b\2\u00a4\r\3\2\2\2\u00a5\u00a8\5 \21\2\u00a6\u00a8"+
		"\5R*\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\17\3\2\2\2\u00a9"+
		"\u00aa\7\t\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\5\4\3\2\u00ac\u00ad\7D\2"+
		"\2\u00ad\21\3\2\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1"+
		"\5\4\3\2\u00b1\u00b2\7D\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4"+
		"\u00b6\5X-\2\u00b5\u00b7\5\4\3\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\25\3\2\2\2\u00ba\u00bc"+
		"\5\32\16\2\u00bb\u00bd\5\4\3\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\7\23\2\2\u00bf\27\3\2\2\2\u00c0\u00c1"+
		"\7d\2\2\u00c1\u00c2\5P)\2\u00c2\u00c3\5p9\2\u00c3\31\3\2\2\2\u00c4\u00c5"+
		"\7\f\2\2\u00c5\u00c7\5X-\2\u00c6\u00c8\5\30\r\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7f"+
		"\2\2\u00cb\u00cd\5\\/\2\u00cc\u00c4\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"\33\3\2\2\2\u00ce\u00d0\5\36\20\2\u00cf\u00d1\5\4\3\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\23\2\2\u00d3"+
		"\35\3\2\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d8\5\"\22"+
		"\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db"+
		"\5(\25\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\5p9\2\u00dd\37\3\2\2\2\u00de\u00f5\5X-\2\u00df\u00e1\5X-\2\u00e0"+
		"\u00e2\7O\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00f5\3\2"+
		"\2\2\u00e3\u00e5\5X-\2\u00e4\u00e6\7^\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00f5\3\2\2\2\u00e7\u00e9\5X-\2\u00e8\u00ea\7Q\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f5\3\2\2\2\u00eb\u00f5\5Z"+
		".\2\u00ec\u00f5\5H%\2\u00ed\u00ee\5F$\2\u00ee\u00ef\7C\2\2\u00ef\u00f5"+
		"\3\2\2\2\u00f0\u00f5\5D#\2\u00f1\u00f5\5B\"\2\u00f2\u00f5\5@!\2\u00f3"+
		"\u00f5\5> \2\u00f4\u00de\3\2\2\2\u00f4\u00df\3\2\2\2\u00f4\u00e3\3\2\2"+
		"\2\u00f4\u00e7\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ed"+
		"\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5!\3\2\2\2\u00f6\u0102\7I\2\2\u00f7\u00ff\5$\23\2\u00f8"+
		"\u00fa\7U\2\2\u00f9\u00fb\5n8\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2"+
		"\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5$\23\2\u00fd\u00f8\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u00f7\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0111\7H\2\2\u0105\u010d\5$\23\2\u0106\u0108\7U\2\2\u0107\u0109"+
		"\5n8\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\5$\23\2\u010b\u0106\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u00f6\3\2\2\2\u0110\u0105\3\2\2\2\u0111#\3\2\2\2\u0112\u011f\5\\/\2\u0113"+
		"\u0114\7@\2\2\u0114\u011f\5\\/\2\u0115\u0116\7?\2\2\u0116\u011f\5\\/\2"+
		"\u0117\u0118\7=\2\2\u0118\u011f\5\\/\2\u0119\u011f\5T+\2\u011a\u011b\5"+
		"\\/\2\u011b\u011c\7^\2\2\u011c\u011d\5(\25\2\u011d\u011f\3\2\2\2\u011e"+
		"\u0112\3\2\2\2\u011e\u0113\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0117\3\2"+
		"\2\2\u011e\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011f%\3\2\2\2\u0120\u0123"+
		"\5(\25\2\u0121\u0123\5T+\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\'\3\2\2\2\u0124\u0125\b\25\1\2\u0125\u0138\5,\27\2\u0126\u0127\t\2\2"+
		"\2\u0127\u0138\5(\25\27\u0128\u0129\7\16\2\2\u0129\u0138\5(\25\25\u012a"+
		"\u012d\5J&\2\u012b\u012d\7h\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u0138\5(\25\16\u012f\u0130\5 \21\2\u0130"+
		"\u0132\5\60\31\2\u0131\u0133\5*\26\2\u0132\u0131\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0138\3\2\2\2\u0134\u0135\5X-\2\u0135\u0136\t\3\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0124\3\2\2\2\u0137\u0126\3\2\2\2\u0137\u0128\3\2"+
		"\2\2\u0137\u012c\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"\u01a5\3\2\2\2\u0139\u013a\f\32\2\2\u013a\u013c\7U\2\2\u013b\u013d\5n"+
		"8\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u01a4\5(\25\33\u013f\u0140\f\31\2\2\u0140\u0142\5<\37\2\u0141\u0143\5"+
		"n8\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\5(\25\32\u0145\u01a4\3\2\2\2\u0146\u0148\f\23\2\2\u0147\u0149\7"+
		"U\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u014c\7@\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014f\7^\2\2\u014e\u0150\5n8\2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u01a4\5(\25\24\u0152\u0153\f\22\2\2"+
		"\u0153\u0155\5H%\2\u0154\u0156\5n8\2\u0155\u0154\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\5(\25\23\u0158\u01a4\3\2\2\2\u0159"+
		"\u015a\f\21\2\2\u015a\u015b\7b\2\2\u015b\u01a4\5(\25\22\u015c\u015d\f"+
		"\20\2\2\u015d\u015e\7h\2\2\u015e\u01a4\5(\25\21\u015f\u0160\f\17\2\2\u0160"+
		"\u0161\7Q\2\2\u0161\u0162\7h\2\2\u0162\u01a4\5(\25\20\u0163\u0164\f\r"+
		"\2\2\u0164\u0166\5B\"\2\u0165\u0167\5n8\2\u0166\u0165\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5(\25\16\u0169\u01a4\3\2\2\2"+
		"\u016a\u016b\f\f\2\2\u016b\u016d\5> \2\u016c\u016e\5n8\2\u016d\u016c\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\5(\25\r\u0170"+
		"\u01a4\3\2\2\2\u0171\u0172\f\13\2\2\u0172\u0174\5@!\2\u0173\u0175\5n8"+
		"\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\5(\25\f\u0177\u01a4\3\2\2\2\u0178\u017b\f\n\2\2\u0179\u017c\5F$\2\u017a"+
		"\u017c\5D#\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u017e\3\2\2"+
		"\2\u017d\u017f\5n8\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\5(\25\13\u0181\u01a4\3\2\2\2\u0182\u0183\f\t\2\2"+
		"\u0183\u0184\7O\2\2\u0184\u0185\5(\25\2\u0185\u0186\7R\2\2\u0186\u0187"+
		"\5(\25\n\u0187\u01a4\3\2\2\2\u0188\u0189\f\30\2\2\u0189\u01a4\7O\2\2\u018a"+
		"\u018b\f\26\2\2\u018b\u018c\7G\2\2\u018c\u018d\5(\25\2\u018d\u018e\7F"+
		"\2\2\u018e\u01a4\3\2\2\2\u018f\u0190\f\24\2\2\u0190\u0192\t\4\2\2\u0191"+
		"\u0193\5(\25\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01a4\3\2"+
		"\2\2\u0194\u0195\f\b\2\2\u0195\u01a4\5L\'\2\u0196\u0197\f\7\2\2\u0197"+
		"\u01a4\5*\26\2\u0198\u0199\f\6\2\2\u0199\u019a\5<\37\2\u019a\u019b\7\f"+
		"\2\2\u019b\u01a4\3\2\2\2\u019c\u019d\f\4\2\2\u019d\u019e\5<\37\2\u019e"+
		"\u019f\5 \21\2\u019f\u01a1\5\60\31\2\u01a0\u01a2\5*\26\2\u01a1\u01a0\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0139\3\2\2\2\u01a3"+
		"\u013f\3\2\2\2\u01a3\u0146\3\2\2\2\u01a3\u0152\3\2\2\2\u01a3\u0159\3\2"+
		"\2\2\u01a3\u015c\3\2\2\2\u01a3\u015f\3\2\2\2\u01a3\u0163\3\2\2\2\u01a3"+
		"\u016a\3\2\2\2\u01a3\u0171\3\2\2\2\u01a3\u0178\3\2\2\2\u01a3\u0182\3\2"+
		"\2\2\u01a3\u0188\3\2\2\2\u01a3\u018a\3\2\2\2\u01a3\u018f\3\2\2\2\u01a3"+
		"\u0194\3\2\2\2\u01a3\u0196\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u019c\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		")\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\7\27\2\2\u01a9\u01ab\5n8\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ca\5("+
		"\25\2\u01ad\u01af\7\'\2\2\u01ae\u01b0\5n8\2\u01af\u01ae\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01ca\5(\25\2\u01b2\u01b4\7*"+
		"\2\2\u01b3\u01b5\5n8\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01ca\5(\25\2\u01b7\u01b9\7(\2\2\u01b8\u01ba\5n8\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01ca\5("+
		"\25\2\u01bc\u01bd\7\37\2\2\u01bd\u01ca\5\b\5\2\u01be\u01c0\7\17\2\2\u01bf"+
		"\u01c1\5N(\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2"+
		"\2\u01c2\u01c4\5p9\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6"+
		"\3\2\2\2\u01c5\u01c7\5\4\3\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\7\23\2\2\u01c9\u01a8\3\2\2\2\u01c9\u01ad\3"+
		"\2\2\2\u01c9\u01b2\3\2\2\2\u01c9\u01b7\3\2\2\2\u01c9\u01bc\3\2\2\2\u01c9"+
		"\u01be\3\2\2\2\u01ca+\3\2\2\2\u01cb\u02a2\5V,\2\u01cc\u02a2\7.\2\2\u01cd"+
		"\u02a2\5R*\2\u01ce\u01cf\7I\2\2\u01cf\u01d0\5(\25\2\u01d0\u01d1\7H\2\2"+
		"\u01d1\u02a2\3\2\2\2\u01d2\u02a2\5L\'\2\u01d3\u01d5\7\n\2\2\u01d4\u01d6"+
		"\5(\25\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u02a2\3\2\2\2\u01d7"+
		"\u01d9\7!\2\2\u01d8\u01da\5(\25\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u02a2\3\2\2\2\u01db\u01dc\7\35\2\2\u01dc\u02a2\5(\25\2\u01dd"+
		"\u01df\7\37\2\2\u01de\u01e0\5\62\32\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5:\36\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u02a2\3\2\2\2\u01e4\u01e6\7+\2\2\u01e5\u01e7\5(\25"+
		"\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u02a2\3\2\2\2\u01e8\u01e9"+
		"\7\b\2\2\u01e9\u01eb\5p9\2\u01ea\u01ec\5\4\3\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\23\2\2\u01ee\u02a2\3"+
		"\2\2\2\u01ef\u01f0\7\27\2\2\u01f0\u01f1\5(\25\2\u01f1\u01f2\5j\66\2\u01f2"+
		"\u01f8\5\b\5\2\u01f3\u01f4\7\21\2\2\u01f4\u01f5\5(\25\2\u01f5\u01f6\5"+
		"j\66\2\u01f6\u01f7\5\b\5\2\u01f7\u01f9\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01fb\7\20\2\2\u01fb\u01fd\5"+
		"(\25\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\7\23\2\2\u01ff\u02a2\3\2\2\2\u0200\u0202\7\27\2\2\u0201\u0203\5"+
		"n8\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\5(\25\2\u0205\u0207\5j\66\2\u0206\u0208\5\4\3\2\u0207\u0206\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u020c\3\2\2\2\u0209\u020b\58\35\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\23\2\2\u0210"+
		"\u02a2\3\2\2\2\u0211\u0212\7)\2\2\u0212\u0213\5(\25\2\u0213\u0214\5j\66"+
		"\2\u0214\u0215\5\6\4\2\u0215\u0216\7\23\2\2\u0216\u02a2\3\2\2\2\u0217"+
		"\u0219\7\'\2\2\u0218\u021a\5n8\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u021c\5(\25\2\u021c\u021e\5j\66\2\u021d\u021f"+
		"\5\4\3\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u0222\5:\36\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0224\7\23\2\2\u0224\u02a2\3\2\2\2\u0225\u0227\7\13\2\2\u0226"+
		"\u0228\5\4\3\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022c\3\2"+
		"\2\2\u0229\u022b\5\64\33\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022f\u02a2\7\23\2\2\u0230\u0231\7\13\2\2\u0231\u0235\5p9\2\u0232"+
		"\u0234\5\64\33\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3"+
		"\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238"+
		"\u0239\7\23\2\2\u0239\u02a2\3\2\2\2\u023a\u023c\7*\2\2\u023b\u023d\5n"+
		"8\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\5(\25\2\u023f\u0241\5h\65\2\u0240\u0242\5\4\3\2\u0241\u0240\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7\23\2\2\u0244"+
		"\u02a2\3\2\2\2\u0245\u0247\7(\2\2\u0246\u0248\5n8\2\u0247\u0246\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5(\25\2\u024a\u024c"+
		"\5h\65\2\u024b\u024d\5\4\3\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\7\23\2\2\u024f\u02a2\3\2\2\2\u0250\u0252\7"+
		"\26\2\2\u0251\u0253\5n8\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0255\5(\25\2\u0255\u0256\7\30\2\2\u0256\u0258\5"+
		"\66\34\2\u0257\u0259\5p9\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025b\3\2\2\2\u025a\u025c\5\4\3\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7\23\2\2\u025e\u02a2\3\2\2\2\u025f"+
		"\u02a2\5\26\f\2\u0260\u02a2\5\34\17\2\u0261\u02a2\5\24\13\2\u0262\u0263"+
		"\5 \21\2\u0263\u0264\5.\30\2\u0264\u02a2\3\2\2\2\u0265\u0267\7E\2\2\u0266"+
		"\u0268\5n8\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2"+
		"\2\u0269\u026b\5T+\2\u026a\u026c\5n8\2\u026b\u026a\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u0274\3\2\2\2\u026d\u026f\7U\2\2\u026e\u0270\5n8\2\u026f"+
		"\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\5T"+
		"+\2\u0272\u026d\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\7U"+
		"\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a"+
		"\u027c\5n8\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027e\7D\2\2\u027e\u02a2\3\2\2\2\u027f\u0281\7G\2\2\u0280\u0282"+
		"\5n8\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0285\5(\25\2\u0284\u0286\5n8\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2"+
		"\2\u0286\u028e\3\2\2\2\u0287\u0289\7U\2\2\u0288\u028a\5n8\2\u0289\u0288"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\5(\25\2\u028c"+
		"\u0287\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0293\7U\2\2\u0292"+
		"\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0296\5n"+
		"8\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\7F\2\2\u0298\u02a2\3\2\2\2\u0299\u029a\7I\2\2\u029a\u029b\5(\25"+
		"\2\u029b\u029d\t\4\2\2\u029c\u029e\5(\25\2\u029d\u029c\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7H\2\2\u02a0\u02a2\3\2\2\2\u02a1"+
		"\u01cb\3\2\2\2\u02a1\u01cc\3\2\2\2\u02a1\u01cd\3\2\2\2\u02a1\u01ce\3\2"+
		"\2\2\u02a1\u01d2\3\2\2\2\u02a1\u01d3\3\2\2\2\u02a1\u01d7\3\2\2\2\u02a1"+
		"\u01db\3\2\2\2\u02a1\u01dd\3\2\2\2\u02a1\u01e4\3\2\2\2\u02a1\u01e8\3\2"+
		"\2\2\u02a1\u01ef\3\2\2\2\u02a1\u0200\3\2\2\2\u02a1\u0211\3\2\2\2\u02a1"+
		"\u0217\3\2\2\2\u02a1\u0225\3\2\2\2\u02a1\u0230\3\2\2\2\u02a1\u023a\3\2"+
		"\2\2\u02a1\u0245\3\2\2\2\u02a1\u0250\3\2\2\2\u02a1\u025f\3\2\2\2\u02a1"+
		"\u0260\3\2\2\2\u02a1\u0261\3\2\2\2\u02a1\u0262\3\2\2\2\u02a1\u0265\3\2"+
		"\2\2\u02a1\u027f\3\2\2\2\u02a1\u0299\3\2\2\2\u02a2-\3\2\2\2\u02a3\u02a5"+
		"\7I\2\2\u02a4\u02a6\5n8\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02af\5&\24\2\u02a8\u02aa\7U\2\2\u02a9\u02ab\5n8"+
		"\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae"+
		"\5&\24\2\u02ad\u02a8\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4\5n"+
		"8\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b6\7H\2\2\u02b6\u02bd\3\2\2\2\u02b7\u02b9\7I\2\2\u02b8\u02ba\5n8\2"+
		"\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd"+
		"\7H\2\2\u02bc\u02a3\3\2\2\2\u02bc\u02b7\3\2\2\2\u02bd/\3\2\2\2\u02be\u02c6"+
		"\5&\24\2\u02bf\u02c1\7U\2\2\u02c0\u02c2\5n8\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\5&\24\2\u02c4\u02bf\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\61\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ce\5P)\2\u02ca\u02ce\5T+\2\u02cb"+
		"\u02cc\7_\2\2\u02cc\u02ce\5\\/\2\u02cd\u02c9\3\2\2\2\u02cd\u02ca\3\2\2"+
		"\2\u02cd\u02cb\3\2\2\2\u02ce\63\3\2\2\2\u02cf\u02d0\7)\2\2\u02d0\u02d5"+
		"\5\66\34\2\u02d1\u02d2\7U\2\2\u02d2\u02d4\5\66\34\2\u02d3\u02d1\3\2\2"+
		"\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8"+
		"\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\5j\66\2\u02d9\u02da\5\4\3\2\u02da"+
		"\u02dd\3\2\2\2\u02db\u02dd\5:\36\2\u02dc\u02cf\3\2\2\2\u02dc\u02db\3\2"+
		"\2\2\u02dd\65\3\2\2\2\u02de\u02df\5(\25\2\u02df\67\3\2\2\2\u02e0\u02e2"+
		"\7\21\2\2\u02e1\u02e3\5n8\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\5(\25\2\u02e5\u02e6\5j\66\2\u02e6\u02e7\5\4"+
		"\3\2\u02e7\u02ea\3\2\2\2\u02e8\u02ea\5:\36\2\u02e9\u02e0\3\2\2\2\u02e9"+
		"\u02e8\3\2\2\2\u02ea9\3\2\2\2\u02eb\u02ed\7\20\2\2\u02ec\u02ee\5n8\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\5\4"+
		"\3\2\u02f0;\3\2\2\2\u02f1\u02f2\t\5\2\2\u02f2=\3\2\2\2\u02f3\u02f4\t\6"+
		"\2\2\u02f4?\3\2\2\2\u02f5\u02f6\t\7\2\2\u02f6A\3\2\2\2\u02f7\u02f8\t\b"+
		"\2\2\u02f8C\3\2\2\2\u02f9\u02fa\t\t\2\2\u02faE\3\2\2\2\u02fb\u02fc\t\n"+
		"\2\2\u02fcG\3\2\2\2\u02fd\u02fe\t\13\2\2\u02feI\3\2\2\2\u02ff\u0300\t"+
		"\f\2\2\u0300K\3\2\2\2\u0301\u0303\7E\2\2\u0302\u0304\5n8\2\u0303\u0302"+
		"\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0307\5N(\2\u0306"+
		"\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\5\6"+
		"\4\2\u0309\u030b\5n8\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0313"+
		"\3\2\2\2\u030c\u030d\7U\2\2\u030d\u030f\5\6\4\2\u030e\u0310\5n8\2\u030f"+
		"\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u030c\3\2"+
		"\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7D\2\2\u0317M\3\2\2\2\u0318"+
		"\u0319\7Y\2\2\u0319\u031e\5(\25\2\u031a\u031b\7U\2\2\u031b\u031d\5(\25"+
		"\2\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7Y\2\2\u0322"+
		"O\3\2\2\2\u0323\u0327\5X-\2\u0324\u0325\7R\2\2\u0325\u0327\5X-\2\u0326"+
		"\u0323\3\2\2\2\u0326\u0324\3\2\2\2\u0327Q\3\2\2\2\u0328\u0329\7R\2\2\u0329"+
		"\u032a\5\\/\2\u032a\u032b\7R\2\2\u032b\u032c\5l\67\2\u032c\u0330\3\2\2"+
		"\2\u032d\u032e\7R\2\2\u032e\u0330\5 \21\2\u032f\u0328\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u0330S\3\2\2\2\u0331\u0332\5(\25\2\u0332\u0333\7_\2\2\u0333\u0334"+
		"\5(\25\2\u0334\u033a\3\2\2\2\u0335\u0336\5(\25\2\u0336\u0337\7R\2\2\u0337"+
		"\u0338\5(\25\2\u0338\u033a\3\2\2\2\u0339\u0331\3\2\2\2\u0339\u0335\3\2"+
		"\2\2\u033aU\3\2\2\2\u033b\u033c\b,\1\2\u033c\u0341\5\\/\2\u033d\u0341"+
		"\5Z.\2\u033e\u033f\7S\2\2\u033f\u0341\5V,\3\u0340\u033b\3\2\2\2\u0340"+
		"\u033d\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u034a\3\2\2\2\u0342\u0343\f\4"+
		"\2\2\u0343\u0346\7S\2\2\u0344\u0347\5\\/\2\u0345\u0347\5Z.\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0345\3\2\2\2\u0347\u0349\3\2\2\2\u0348\u0342\3\2\2\2\u0349"+
		"\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034bW\3\2\2\2"+
		"\u034c\u034a\3\2\2\2\u034d\u0352\5\\/\2\u034e\u034f\t\r\2\2\u034f\u0351"+
		"\5\\/\2\u0350\u034e\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353Y\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u035e\7-\2\2\u0356"+
		"\u035e\5l\67\2\u0357\u035e\7,\2\2\u0358\u035e\t\16\2\2\u0359\u035e\7\33"+
		"\2\2\u035a\u035b\7-\2\2\u035b\u035e\7L\2\2\u035c\u035e\7o\2\2\u035d\u0355"+
		"\3\2\2\2\u035d\u0356\3\2\2\2\u035d\u0357\3\2\2\2\u035d\u0358\3\2\2\2\u035d"+
		"\u0359\3\2\2\2\u035d\u035a\3\2\2\2\u035d\u035c\3\2\2\2\u035e[\3\2\2\2"+
		"\u035f\u036d\7n\2\2\u0360\u036d\5`\61\2\u0361\u036d\5b\62\2\u0362\u036d"+
		"\5d\63\2\u0363\u036d\5f\64\2\u0364\u036d\7\32\2\2\u0365\u036d\7\36\2\2"+
		"\u0366\u036d\7 \2\2\u0367\u036d\7\n\2\2\u0368\u036d\7\"\2\2\u0369\u036d"+
		"\7#\2\2\u036a\u036d\7\33\2\2\u036b\u036d\5^\60\2\u036c\u035f\3\2\2\2\u036c"+
		"\u0360\3\2\2\2\u036c\u0361\3\2\2\2\u036c\u0362\3\2\2\2\u036c\u0363\3\2"+
		"\2\2\u036c\u0364\3\2\2\2\u036c\u0365\3\2\2\2\u036c\u0366\3\2\2\2\u036c"+
		"\u0367\3\2\2\2\u036c\u0368\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036a\3\2"+
		"\2\2\u036c\u036b\3\2\2\2\u036d]\3\2\2\2\u036e\u036f\7E\2\2\u036f\u0373"+
		"\7D\2\2\u0370\u0371\7G\2\2\u0371\u0373\7F\2\2\u0372\u036e\3\2\2\2\u0372"+
		"\u0370\3\2\2\2\u0373_\3\2\2\2\u0374\u0375\7B\2\2\u0375\u0376\7n\2\2\u0376"+
		"a\3\2\2\2\u0377\u0378\7C\2\2\u0378\u0379\7C\2\2\u0379\u037a\7n\2\2\u037a"+
		"c\3\2\2\2\u037b\u037c\7C\2\2\u037c\u037d\7n\2\2\u037de\3\2\2\2\u037e\u037f"+
		"\7B\2\2\u037f\u0382\7,\2\2\u0380\u0382\7\60\2\2\u0381\u037e\3\2\2\2\u0381"+
		"\u0380\3\2\2\2\u0382g\3\2\2\2\u0383\u0384\t\17\2\2\u0384\u0387\5p9\2\u0385"+
		"\u0387\5p9\2\u0386\u0383\3\2\2\2\u0386\u0385\3\2\2\2\u0387i\3\2\2\2\u0388"+
		"\u038a\t\20\2\2\u0389\u038b\5p9\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2"+
		"\2\2\u038b\u038e\3\2\2\2\u038c\u038e\5p9\2\u038d\u0388\3\2\2\2\u038d\u038c"+
		"\3\2\2\2\u038ek\3\2\2\2\u038f\u0391\7/\2\2\u0390\u038f\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393m\3\2\2\2\u0394"+
		"\u0396\t\21\2\2\u0395\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0395\3"+
		"\2\2\2\u0397\u0398\3\2\2\2\u0398o\3\2\2\2\u0399\u039b\5r:\2\u039a\u0399"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"q\3\2\2\2\u039e\u039f\t\22\2\2\u039fs\3\2\2\2\u0080{\u0083\u008b\u0096"+
		"\u009e\u00a7\u00b6\u00bc\u00c7\u00cc\u00d0\u00d7\u00da\u00e1\u00e5\u00e9"+
		"\u00f4\u00fa\u00ff\u0102\u0108\u010d\u0110\u011e\u0122\u012c\u0132\u0137"+
		"\u013c\u0142\u0148\u014b\u014f\u0155\u0166\u016d\u0174\u017b\u017e\u0192"+
		"\u01a1\u01a3\u01a5\u01aa\u01af\u01b4\u01b9\u01c0\u01c3\u01c6\u01c9\u01d5"+
		"\u01d9\u01df\u01e2\u01e6\u01eb\u01f8\u01fc\u0202\u0207\u020c\u0219\u021e"+
		"\u0221\u0227\u022c\u0235\u023c\u0241\u0247\u024c\u0252\u0258\u025b\u0267"+
		"\u026b\u026f\u0274\u0278\u027b\u0281\u0285\u0289\u028e\u0292\u0295\u029d"+
		"\u02a1\u02a5\u02aa\u02af\u02b3\u02b9\u02bc\u02c1\u02c6\u02cd\u02d5\u02dc"+
		"\u02e2\u02e9\u02ed\u0303\u0306\u030a\u030f\u0313\u031e\u0326\u032f\u0339"+
		"\u0340\u0346\u034a\u0352\u035d\u036c\u0372\u0381\u0386\u038a\u038d\u0392"+
		"\u0397\u039c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
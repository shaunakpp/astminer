// Generated from RubyLexer.g4 by ANTLR 4.7.1
package me.vovak.antlr.parser;

import java.util.List;	
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyLexer extends Lexer {
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
		HERE_DOC_MODE=1, QUOTED_STR_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "HERE_DOC_MODE", "QUOTED_STR_MODE"
	};

	public static final String[] ruleNames = {
		"HereDoc1", "HereDoc2", "HereDoc3", "PercentString", "ALIAS", "BEGIN", 
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
		"ML_COMMENT", "WS", "Identifier", "ShellCommand", "HEX_FLOAT_LITERAL", 
		"HEX_LITERAL", "DEC_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "HexDigits", 
		"HexDigit", "ESCAPED_QUOTE", "Digits", "NumberTypeSuffix", "ExponentPart", 
		"StringFragment", "ShellCommandFrag", "IdentifierFrag", "SingleCharacterString", 
		"EscapedSequenceChar", "PrintableCharacter", "SpecialPrintableCharacter", 
		"HereDocEnd1", "HereDocEnd2", "AnyInHere", "SL_COMMENT_IN_HEREDOC", "ML_COMMENT_IN_HEREDOC", 
		"PercentStringLineEnd", "AnyInQuotedString1", "AnyInQuotedString2"
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


		String hereDocSymbol = "";
	    String quotedStringStartSymbol = "";
		StringBuilder stringBuffer;
	    Queue<Token> tokenList = new LinkedList<>();
		boolean shouldReleaseBufferedToken = false;
		Token next;
		boolean isHereDocSymbol(String text){
			String theSym =  text.replace("\r","").replace("\n","").replace("\"","").replace("`","");
			hereDocSymbol =  hereDocSymbol.replace("\r","").replace("\n","").replace("<<-","").replace("<<","").replace("\"","").replace("`","");
			return theSym.equals(hereDocSymbol);
		}
		
		void startHereDoc(){
			hereDocSymbol = getText(); 
			stringBuffer = new StringBuilder();
			tokenList = new LinkedList<>();
			shouldReleaseBufferedToken = false;
			while(true) {
				next = nextToken();
				if (next==null) break;
				if (next.getType()==CRLF ||
					next.getType()==SL_COMMENT) {
					break;
				}
				tokenList.add(next);
			}
			mode(HERE_DOC_MODE);
			skip();
		}
		void tryEndHereDoc(){
			if ( isHereDocSymbol(getText())){ 
				mode(DEFAULT_MODE);
				setType(String); 
				setText(stringBuffer.toString());
				shouldReleaseBufferedToken = true;
			}else{
		  		stringBuffer.append(getText());
				skip();
			}
		}
		boolean isQuotedPair(String text){
			if (quotedStringStartSymbol.equals("(") && text.equals(")")) return true;
			if (quotedStringStartSymbol.equals("[") && text.equals("]")) return true;
			if (quotedStringStartSymbol.equals("{") && text.equals("}")) return true;
			if (quotedStringStartSymbol.equals("<") && text.equals(">")) return true;
			if (quotedStringStartSymbol.equals("|") && text.equals("|")) return true;
			if (quotedStringStartSymbol.equals(text)) return true;
			return false;
		}
		
		@Override
	    public Token getToken() { 
	    	if (!shouldReleaseBufferedToken) 
	    		return super.getToken();
	    	if (!tokenList.isEmpty()){
	    		return tokenList.peek();
	   		}
	    	return super.getToken();
	    }
	    
		
		@Override
		public Token nextToken() {
			if (!shouldReleaseBufferedToken) 
				return super.nextToken();
			if (!tokenList.isEmpty()){
	    		Token t = tokenList.remove();
	    		return t;
	   		}
	    	return super.nextToken();
		}
		


	public RubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RubyLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			HereDoc1_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			HereDoc2_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			HereDoc3_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			PercentString_action((RuleContext)_localctx, actionIndex);
			break;
		case 127:
			HereDocEnd1_action((RuleContext)_localctx, actionIndex);
			break;
		case 128:
			HereDocEnd2_action((RuleContext)_localctx, actionIndex);
			break;
		case 129:
			AnyInHere_action((RuleContext)_localctx, actionIndex);
			break;
		case 132:
			PercentStringLineEnd_action((RuleContext)_localctx, actionIndex);
			break;
		case 133:
			AnyInQuotedString1_action((RuleContext)_localctx, actionIndex);
			break;
		case 134:
			AnyInQuotedString2_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void HereDoc1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

					    startHereDoc();
					
			break;
		}
	}
	private void HereDoc2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

						startHereDoc();
					
			break;
		}
	}
	private void HereDoc3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

						startHereDoc();
					
			break;
		}
	}
	private void PercentString_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

						quotedStringStartSymbol = getText().substring(2); 
						stringBuffer = new StringBuilder();
						skip();
						mode(QUOTED_STR_MODE);
					
			break;
		}
	}
	private void HereDocEnd1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 
									tryEndHereDoc();
								
			break;
		}
	}
	private void HereDocEnd2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 
									tryEndHereDoc();
								
			break;
		}
	}
	private void AnyInHere_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

									stringBuffer.append(getText());
									skip();
								
			break;
		}
	}
	private void PercentStringLineEnd_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 
									mode(DEFAULT_MODE);
									setType(String); 
									setText(stringBuffer.toString());
								
			break;
		}
	}
	private void AnyInQuotedString1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:

									stringBuffer.append(getText());
									skip();	
								
			break;
		}
	}
	private void AnyInQuotedString2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:

									if (isQuotedPair(getText())){
										setType(String); 
										setText(stringBuffer.toString());
										mode(DEFAULT_MODE);
									}else{
										stringBuffer.append(getText());
										skip();	
									}
								
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2w\u045c\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^"+
		"\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j"+
		"\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu"+
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080"+
		"\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\3\2\3"+
		"\2\3\2\3\2\5\2\u0118\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0121\n\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u012a\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3+\3+\5+\u01ff\n+\3+\3+\5+\u0203\n+\3+\5+\u0206\n+\3+\3+\5"+
		"+\u020a\n+\3+\5+\u020d\n+\3+\3+\5+\u0211\n+\3+\5+\u0214\n+\3+\3+\5+\u0218"+
		"\n+\3+\5+\u021b\n+\3+\3+\5+\u021f\n+\3+\5+\u0222\n+\5+\u0224\n+\3,\3,"+
		"\5,\u0228\n,\3,\7,\u022b\n,\f,\16,\u022e\13,\3,\3,\6,\u0232\n,\r,\16,"+
		"\u0233\3,\5,\u0237\n,\3,\5,\u023a\n,\3-\3-\6-\u023e\n-\r-\16-\u023f\3"+
		"-\3-\5-\u0244\n-\3-\5-\u0247\n-\3.\3.\5.\u024b\n.\3/\3/\3/\3\60\5\60\u0251"+
		"\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u025a\n\61\3\62\3\62\3\62"+
		"\3\62\5\62\u0260\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\3=\3>\3"+
		">\3>\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3R\3S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3[\3[\3[\3\\\3\\\3]\3]\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3a\3a\3a"+
		"\3b\3b\3b\3c\3c\3d\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3h\3h\3h\3i\3i\3j"+
		"\3j\7j\u02f5\nj\fj\16j\u02f8\13j\3j\5j\u02fb\nj\3j\3j\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\7k\u0307\nk\fk\16k\u030a\13k\3k\3k\3k\3k\3k\3k\5k\u0312\nk\3k"+
		"\3k\3k\3k\3l\6l\u0319\nl\rl\16l\u031a\3l\3l\3m\3m\3n\3n\3o\3o\3o\3o\5"+
		"o\u0327\no\3o\5o\u032a\no\3o\3o\5o\u032e\no\3o\3o\5o\u0332\no\3o\3o\5"+
		"o\u0336\no\3p\3p\3p\3p\7p\u033c\np\fp\16p\u033f\13p\3p\5p\u0342\np\3p"+
		"\5p\u0345\np\3q\3q\5q\u0349\nq\3q\3q\7q\u034d\nq\fq\16q\u0350\13q\3q\5"+
		"q\u0353\nq\3q\5q\u0356\nq\3r\3r\5r\u035a\nr\3r\7r\u035d\nr\fr\16r\u0360"+
		"\13r\3r\3r\7r\u0364\nr\fr\16r\u0367\13r\3r\5r\u036a\nr\3r\5r\u036d\nr"+
		"\3s\3s\3s\3s\7s\u0373\ns\fs\16s\u0376\13s\3s\5s\u0379\ns\3s\5s\u037c\n"+
		"s\3t\3t\3t\7t\u0381\nt\ft\16t\u0384\13t\3t\5t\u0387\nt\3u\3u\3v\3v\3v"+
		"\3v\5v\u038f\nv\3w\3w\7w\u0393\nw\fw\16w\u0396\13w\3w\5w\u0399\nw\3x\3"+
		"x\3x\5x\u039e\nx\3y\3y\5y\u03a2\ny\3y\3y\3z\3z\3z\7z\u03a9\nz\fz\16z\u03ac"+
		"\13z\3z\3z\3z\3z\7z\u03b2\nz\fz\16z\u03b5\13z\3z\5z\u03b8\nz\3{\3{\3{"+
		"\7{\u03bd\n{\f{\16{\u03c0\13{\3{\3{\3|\3|\7|\u03c6\n|\f|\16|\u03c9\13"+
		"|\3}\3}\3}\5}\u03ce\n}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\6~\u03ed\n~\r~\16~\u03ee\3~\3"+
		"~\3~\3~\3~\5~\u03f6\n~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0403\n~\3"+
		"~\3~\3~\3~\3~\3~\5~\u040b\n~\3~\3~\3~\3~\5~\u0411\n~\3~\5~\u0414\n~\3"+
		"\177\3\177\5\177\u0418\n\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3"+
		"\u0082\3\u0082\3\u0082\3\u0083\6\u0083\u0423\n\u0083\r\u0083\16\u0083"+
		"\u0424\3\u0083\3\u0083\3\u0084\3\u0084\7\u0084\u042b\n\u0084\f\u0084\16"+
		"\u0084\u042e\13\u0084\3\u0084\5\u0084\u0431\n\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\7\u0085\u043f\n\u0085\f\u0085\16\u0085\u0442\13\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u044a\n\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\6\u0087\u0454"+
		"\n\u0087\r\u0087\16\u0087\u0455\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\b\u0308\u03aa\u03b3\u03be\u0424\u0440\2\u0089\5\3\7\4\t\5\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A"+
		"\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095"+
		"K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5S\u00a7T\u00a9"+
		"U\u00abV\u00adW\u00afX\u00b1Y\u00b3Z\u00b5[\u00b7\\\u00b9]\u00bb^\u00bd"+
		"_\u00bf`\u00c1a\u00c3b\u00c5c\u00c7d\u00c9e\u00cbf\u00cdg\u00cfh\u00d1"+
		"i\u00d3j\u00d5k\u00d7l\u00d9m\u00dbn\u00ddo\u00df\2\u00e1\2\u00e3\2\u00e5"+
		"\2\u00e7\2\u00e9\2\u00eb\2\u00ed\2\u00ef\2\u00f1\2\u00f3\2\u00f5\2\u00f7"+
		"\2\u00f9\2\u00fb\2\u00fd\2\u00ff\2\u0101\2\u0103p\u0105q\u0107r\u0109"+
		"s\u010bt\u010du\u010fv\u0111w\5\2\3\4!\b\2KKSUYZkksuyz\5\2\62;C\\c|\3"+
		"\2\62;\6\2\f\f\17\17\"\"\61\61\4\2\f\f\17\17\4\2\13\13\"\"\4\2ZZzz\4\2"+
		"RRrr\4\2--//\6\2FFHHffhh\5\2\62;CHch\6\2\62;CHaach\4\2NNnn\4\2FFff\3\2"+
		"\629\4\2\629aa\4\2QQqq\4\2DDdd\3\2\62\63\4\2\62\63aa\4\2\62;aa\4\2kkt"+
		"t\4\2GGgg\5\2C\\aac|\6\2\62;C\\aac|\7\2cdghpptvxx\4\2WWww\4\2EEee\4\2"+
		"OOoo\6\2#\61<B]b\u0080\u0080\6\2\"\"\62;C\\c|\2\u04a7\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\3\u0103\3\2\2\2\3\u0105\3\2\2"+
		"\2\3\u0107\3\2\2\2\3\u0109\3\2\2\2\3\u010b\3\2\2\2\4\u010d\3\2\2\2\4\u010f"+
		"\3\2\2\2\4\u0111\3\2\2\2\5\u0113\3\2\2\2\7\u011c\3\2\2\2\t\u0125\3\2\2"+
		"\2\13\u012e\3\2\2\2\r\u0133\3\2\2\2\17\u0139\3\2\2\2\21\u013f\3\2\2\2"+
		"\23\u0145\3\2\2\2\25\u014b\3\2\2\2\27\u0150\3\2\2\2\31\u0156\3\2\2\2\33"+
		"\u015a\3\2\2\2\35\u0163\3\2\2\2\37\u0166\3\2\2\2!\u016b\3\2\2\2#\u0171"+
		"\3\2\2\2%\u0175\3\2\2\2\'\u0179\3\2\2\2)\u0180\3\2\2\2+\u0186\3\2\2\2"+
		"-\u018a\3\2\2\2/\u018d\3\2\2\2\61\u0190\3\2\2\2\63\u0197\3\2\2\2\65\u019c"+
		"\3\2\2\2\67\u01a0\3\2\2\29\u01a4\3\2\2\2;\u01aa\3\2\2\2=\u01af\3\2\2\2"+
		"?\u01b6\3\2\2\2A\u01bc\3\2\2\2C\u01c3\3\2\2\2E\u01c8\3\2\2\2G\u01ce\3"+
		"\2\2\2I\u01d3\3\2\2\2K\u01d8\3\2\2\2M\u01de\3\2\2\2O\u01e5\3\2\2\2Q\u01eb"+
		"\3\2\2\2S\u01f0\3\2\2\2U\u01f6\3\2\2\2W\u0223\3\2\2\2Y\u0227\3\2\2\2["+
		"\u023b\3\2\2\2]\u024a\3\2\2\2_\u024c\3\2\2\2a\u0250\3\2\2\2c\u0259\3\2"+
		"\2\2e\u025f\3\2\2\2g\u0261\3\2\2\2i\u0263\3\2\2\2k\u0265\3\2\2\2m\u0267"+
		"\3\2\2\2o\u026a\3\2\2\2q\u026d\3\2\2\2s\u026f\3\2\2\2u\u0273\3\2\2\2w"+
		"\u0276\3\2\2\2y\u0279\3\2\2\2{\u027b\3\2\2\2}\u027f\3\2\2\2\177\u0282"+
		"\3\2\2\2\u0081\u0284\3\2\2\2\u0083\u0287\3\2\2\2\u0085\u0289\3\2\2\2\u0087"+
		"\u028b\3\2\2\2\u0089\u028d\3\2\2\2\u008b\u028f\3\2\2\2\u008d\u0291\3\2"+
		"\2\2\u008f\u0293\3\2\2\2\u0091\u0295\3\2\2\2\u0093\u0297\3\2\2\2\u0095"+
		"\u029b\3\2\2\2\u0097\u029e\3\2\2\2\u0099\u02a0\3\2\2\2\u009b\u02a3\3\2"+
		"\2\2\u009d\u02a5\3\2\2\2\u009f\u02a7\3\2\2\2\u00a1\u02aa\3\2\2\2\u00a3"+
		"\u02ac\3\2\2\2\u00a5\u02ae\3\2\2\2\u00a7\u02b1\3\2\2\2\u00a9\u02b3\3\2"+
		"\2\2\u00ab\u02b5\3\2\2\2\u00ad\u02b8\3\2\2\2\u00af\u02bc\3\2\2\2\u00b1"+
		"\u02bf\3\2\2\2\u00b3\u02c1\3\2\2\2\u00b5\u02c5\3\2\2\2\u00b7\u02c8\3\2"+
		"\2\2\u00b9\u02cb\3\2\2\2\u00bb\u02cd\3\2\2\2\u00bd\u02cf\3\2\2\2\u00bf"+
		"\u02d2\3\2\2\2\u00c1\u02d6\3\2\2\2\u00c3\u02d9\3\2\2\2\u00c5\u02dc\3\2"+
		"\2\2\u00c7\u02df\3\2\2\2\u00c9\u02e1\3\2\2\2\u00cb\u02e5\3\2\2\2\u00cd"+
		"\u02e8\3\2\2\2\u00cf\u02eb\3\2\2\2\u00d1\u02ed\3\2\2\2\u00d3\u02f0\3\2"+
		"\2\2\u00d5\u02f2\3\2\2\2\u00d7\u02fe\3\2\2\2\u00d9\u0318\3\2\2\2\u00db"+
		"\u031e\3\2\2\2\u00dd\u0320\3\2\2\2\u00df\u0322\3\2\2\2\u00e1\u0337\3\2"+
		"\2\2\u00e3\u0346\3\2\2\2\u00e5\u0357\3\2\2\2\u00e7\u036e\3\2\2\2\u00e9"+
		"\u037d\3\2\2\2\u00eb\u0388\3\2\2\2\u00ed\u038e\3\2\2\2\u00ef\u0390\3\2"+
		"\2\2\u00f1\u039d\3\2\2\2\u00f3\u039f\3\2\2\2\u00f5\u03b7\3\2\2\2\u00f7"+
		"\u03b9\3\2\2\2\u00f9\u03c3\3\2\2\2\u00fb\u03ca\3\2\2\2\u00fd\u0413\3\2"+
		"\2\2\u00ff\u0417\3\2\2\2\u0101\u0419\3\2\2\2\u0103\u041b\3\2\2\2\u0105"+
		"\u041e\3\2\2\2\u0107\u0422\3\2\2\2\u0109\u0428\3\2\2\2\u010b\u0436\3\2"+
		"\2\2\u010d\u044f\3\2\2\2\u010f\u0453\3\2\2\2\u0111\u0459\3\2\2\2\u0113"+
		"\u0114\7>\2\2\u0114\u0115\7>\2\2\u0115\u0117\3\2\2\2\u0116\u0118\7/\2"+
		"\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\5\u00dbm\2\u011a\u011b\b\2\2\2\u011b\6\3\2\2\2\u011c\u011d\7>\2\2\u011d"+
		"\u011e\7>\2\2\u011e\u0120\3\2\2\2\u011f\u0121\7/\2\2\u0120\u011f\3\2\2"+
		"\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5\u00f5z\2\u0123"+
		"\u0124\b\3\3\2\u0124\b\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127\7>\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u012a\7/\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5\u00f7{\2\u012c\u012d\b\4\4\2\u012d"+
		"\n\3\2\2\2\u012e\u012f\7\'\2\2\u012f\u0130\t\2\2\2\u0130\u0131\n\3\2\2"+
		"\u0131\u0132\b\5\5\2\u0132\f\3\2\2\2\u0133\u0134\7c\2\2\u0134\u0135\7"+
		"n\2\2\u0135\u0136\7k\2\2\u0136\u0137\7c\2\2\u0137\u0138\7u\2\2\u0138\16"+
		"\3\2\2\2\u0139\u013a\7d\2\2\u013a\u013b\7g\2\2\u013b\u013c\7i\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e\20\3\2\2\2\u013f\u0140\7D\2\2\u0140"+
		"\u0141\7G\2\2\u0141\u0142\7I\2\2\u0142\u0143\7K\2\2\u0143\u0144\7P\2\2"+
		"\u0144\22\3\2\2\2\u0145\u0146\7d\2\2\u0146\u0147\7t\2\2\u0147\u0148\7"+
		"g\2\2\u0148\u0149\7c\2\2\u0149\u014a\7m\2\2\u014a\24\3\2\2\2\u014b\u014c"+
		"\7e\2\2\u014c\u014d\7c\2\2\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2\u014f"+
		"\26\3\2\2\2\u0150\u0151\7e\2\2\u0151\u0152\7n\2\2\u0152\u0153\7c\2\2\u0153"+
		"\u0154\7u\2\2\u0154\u0155\7u\2\2\u0155\30\3\2\2\2\u0156\u0157\7f\2\2\u0157"+
		"\u0158\7g\2\2\u0158\u0159\7h\2\2\u0159\32\3\2\2\2\u015a\u015b\7f\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7h\2\2\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2"+
		"\u015f\u0160\7g\2\2\u0160\u0161\7f\2\2\u0161\u0162\7A\2\2\u0162\34\3\2"+
		"\2\2\u0163\u0164\7f\2\2\u0164\u0165\7q\2\2\u0165\36\3\2\2\2\u0166\u0167"+
		"\7g\2\2\u0167\u0168\7n\2\2\u0168\u0169\7u\2\2\u0169\u016a\7g\2\2\u016a"+
		" \3\2\2\2\u016b\u016c\7g\2\2\u016c\u016d\7n\2\2\u016d\u016e\7u\2\2\u016e"+
		"\u016f\7k\2\2\u016f\u0170\7h\2\2\u0170\"\3\2\2\2\u0171\u0172\7G\2\2\u0172"+
		"\u0173\7P\2\2\u0173\u0174\7F\2\2\u0174$\3\2\2\2\u0175\u0176\7g\2\2\u0176"+
		"\u0177\7p\2\2\u0177\u0178\7f\2\2\u0178&\3\2\2\2\u0179\u017a\7g\2\2\u017a"+
		"\u017b\7p\2\2\u017b\u017c\7u\2\2\u017c\u017d\7w\2\2\u017d\u017e\7t\2\2"+
		"\u017e\u017f\7g\2\2\u017f(\3\2\2\2\u0180\u0181\7h\2\2\u0181\u0182\7c\2"+
		"\2\u0182\u0183\7n\2\2\u0183\u0184\7u\2\2\u0184\u0185\7g\2\2\u0185*\3\2"+
		"\2\2\u0186\u0187\7h\2\2\u0187\u0188\7q\2\2\u0188\u0189\7t\2\2\u0189,\3"+
		"\2\2\2\u018a\u018b\7k\2\2\u018b\u018c\7h\2\2\u018c.\3\2\2\2\u018d\u018e"+
		"\7k\2\2\u018e\u018f\7p\2\2\u018f\60\3\2\2\2\u0190\u0191\7o\2\2\u0191\u0192"+
		"\7q\2\2\u0192\u0193\7f\2\2\u0193\u0194\7w\2\2\u0194\u0195\7n\2\2\u0195"+
		"\u0196\7g\2\2\u0196\62\3\2\2\2\u0197\u0198\7p\2\2\u0198\u0199\7g\2\2\u0199"+
		"\u019a\7z\2\2\u019a\u019b\7v\2\2\u019b\64\3\2\2\2\u019c\u019d\7p\2\2\u019d"+
		"\u019e\7k\2\2\u019e\u019f\7n\2\2\u019f\66\3\2\2\2\u01a0\u01a1\7p\2\2\u01a1"+
		"\u01a2\7q\2\2\u01a2\u01a3\7v\2\2\u01a38\3\2\2\2\u01a4\u01a5\7t\2\2\u01a5"+
		"\u01a6\7c\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7g\2\2"+
		"\u01a9:\3\2\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7f\2"+
		"\2\u01ad\u01ae\7q\2\2\u01ae<\3\2\2\2\u01af\u01b0\7t\2\2\u01b0\u01b1\7"+
		"g\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5"+
		"\7g\2\2\u01b5>\3\2\2\2\u01b6\u01b7\7t\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9"+
		"\7v\2\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7{\2\2\u01bb@\3\2\2\2\u01bc\u01bd"+
		"\7t\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7w\2\2\u01c0"+
		"\u01c1\7t\2\2\u01c1\u01c2\7p\2\2\u01c2B\3\2\2\2\u01c3\u01c4\7u\2\2\u01c4"+
		"\u01c5\7g\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7h\2\2\u01c7D\3\2\2\2\u01c8"+
		"\u01c9\7u\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cb\7r\2\2\u01cb\u01cc\7g\2\2"+
		"\u01cc\u01cd\7t\2\2\u01cdF\3\2\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7j\2"+
		"\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7p\2\2\u01d2H\3\2\2\2\u01d3\u01d4\7"+
		"v\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7w\2\2\u01d6\u01d7\7g\2\2\u01d7J"+
		"\3\2\2\2\u01d8\u01d9\7w\2\2\u01d9\u01da\7p\2\2\u01da\u01db\7f\2\2\u01db"+
		"\u01dc\7g\2\2\u01dc\u01dd\7h\2\2\u01ddL\3\2\2\2\u01de\u01df\7w\2\2\u01df"+
		"\u01e0\7p\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7u\2\2"+
		"\u01e3\u01e4\7u\2\2\u01e4N\3\2\2\2\u01e5\u01e6\7w\2\2\u01e6\u01e7\7p\2"+
		"\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7k\2\2\u01e9\u01ea\7n\2\2\u01eaP\3\2"+
		"\2\2\u01eb\u01ec\7y\2\2\u01ec\u01ed\7j\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef"+
		"\7p\2\2\u01efR\3\2\2\2\u01f0\u01f1\7y\2\2\u01f1\u01f2\7j\2\2\u01f2\u01f3"+
		"\7k\2\2\u01f3\u01f4\7n\2\2\u01f4\u01f5\7g\2\2\u01f5T\3\2\2\2\u01f6\u01f7"+
		"\7{\2\2\u01f7\u01f8\7k\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7n\2\2\u01fa"+
		"\u01fb\7f\2\2\u01fbV\3\2\2\2\u01fc\u01ff\5g\63\2\u01fd\u01ff\5i\64\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0202\5\u00efw\2\u0201\u0203\5\u00f3y\2\u0202\u0201\3\2\2\2"+
		"\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5\u00f1x\2\u0205"+
		"\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0224\3\2\2\2\u0207\u0209\5\u00e1"+
		"p\2\u0208\u020a\5\u00f3y\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u020d\5\u00f1x\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u0224\3\2\2\2\u020e\u0210\5\u00e5r\2\u020f\u0211\5\u00f3"+
		"y\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0214\5\u00f1x\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0224"+
		"\3\2\2\2\u0215\u0217\5\u00e3q\2\u0216\u0218\5\u00f3y\2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u00f1x\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0224\3\2\2\2\u021c\u021e\5\u00e7"+
		"s\2\u021d\u021f\5\u00f3y\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u0222\5\u00f1x\2\u0221\u0220\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u01fe\3\2\2\2\u0223\u0207\3\2\2\2\u0223"+
		"\u020e\3\2\2\2\u0223\u0215\3\2\2\2\u0223\u021c\3\2\2\2\u0224X\3\2\2\2"+
		"\u0225\u0228\5g\63\2\u0226\u0228\5i\64\2\u0227\u0225\3\2\2\2\u0227\u0226"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022c\3\2\2\2\u0229\u022b\t\4\2\2\u022a"+
		"\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0231\7\60\2\2\u0230"+
		"\u0232\t\4\2\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0237\5\u00f3y\2\u0236"+
		"\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u023a\5\u00f1"+
		"x\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023aZ\3\2\2\2\u023b\u023d"+
		"\7\61\2\2\u023c\u023e\n\5\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2"+
		"\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243"+
		"\7\61\2\2\u0242\u0244\7k\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0246\3\2\2\2\u0245\u0247\7q\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\\\3\2\2\2\u0248\u024b\5\u00f5z\2\u0249\u024b\5\u00fb}\2\u024a"+
		"\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024b^\3\2\2\2\u024c\u024d\7&\2\2\u024d"+
		"\u024e\5\u0101\u0080\2\u024e`\3\2\2\2\u024f\u0251\7\17\2\2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7\f\2\2\u0253"+
		"b\3\2\2\2\u0254\u0255\7c\2\2\u0255\u0256\7p\2\2\u0256\u025a\7f\2\2\u0257"+
		"\u0258\7(\2\2\u0258\u025a\7(\2\2\u0259\u0254\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u025ad\3\2\2\2\u025b\u025c\7q\2\2\u025c\u0260\7t\2\2\u025d\u025e\7"+
		"~\2\2\u025e\u0260\7~\2\2\u025f\u025b\3\2\2\2\u025f\u025d\3\2\2\2\u0260"+
		"f\3\2\2\2\u0261\u0262\7-\2\2\u0262h\3\2\2\2\u0263\u0264\7/\2\2\u0264j"+
		"\3\2\2\2\u0265\u0266\7\'\2\2\u0266l\3\2\2\2\u0267\u0268\7-\2\2\u0268\u0269"+
		"\7?\2\2\u0269n\3\2\2\2\u026a\u026b\7\'\2\2\u026b\u026c\7?\2\2\u026cp\3"+
		"\2\2\2\u026d\u026e\7%\2\2\u026er\3\2\2\2\u026f\u0270\7(\2\2\u0270\u0271"+
		"\7(\2\2\u0271\u0272\7?\2\2\u0272t\3\2\2\2\u0273\u0274\7(\2\2\u0274\u0275"+
		"\7?\2\2\u0275v\3\2\2\2\u0276\u0277\7(\2\2\u0277\u0278\7\60\2\2\u0278x"+
		"\3\2\2\2\u0279\u027a\7(\2\2\u027az\3\2\2\2\u027b\u027c\7,\2\2\u027c\u027d"+
		"\7,\2\2\u027d\u027e\7?\2\2\u027e|\3\2\2\2\u027f\u0280\7,\2\2\u0280\u0281"+
		"\7,\2\2\u0281~\3\2\2\2\u0282\u0283\7,\2\2\u0283\u0080\3\2\2\2\u0284\u0285"+
		"\7,\2\2\u0285\u0286\7?\2\2\u0286\u0082\3\2\2\2\u0287\u0288\7&\2\2\u0288"+
		"\u0084\3\2\2\2\u0289\u028a\7B\2\2\u028a\u0086\3\2\2\2\u028b\u028c\7\177"+
		"\2\2\u028c\u0088\3\2\2\2\u028d\u028e\7}\2\2\u028e\u008a\3\2\2\2\u028f"+
		"\u0290\7_\2\2\u0290\u008c\3\2\2\2\u0291\u0292\7]\2\2\u0292\u008e\3\2\2"+
		"\2\u0293\u0294\7+\2\2\u0294\u0090\3\2\2\2\u0295\u0296\7*\2\2\u0296\u0092"+
		"\3\2\2\2\u0297\u0298\7\60\2\2\u0298\u0299\7\60\2\2\u0299\u029a\7\60\2"+
		"\2\u029a\u0094\3\2\2\2\u029b\u029c\7\60\2\2\u029c\u029d\7\60\2\2\u029d"+
		"\u0096\3\2\2\2\u029e\u029f\7\60\2\2\u029f\u0098\3\2\2\2\u02a0\u02a1\7"+
		"\61\2\2\u02a1\u02a2\7?\2\2\u02a2\u009a\3\2\2\2\u02a3\u02a4\7\61\2\2\u02a4"+
		"\u009c\3\2\2\2\u02a5\u02a6\7A\2\2\u02a6\u009e\3\2\2\2\u02a7\u02a8\7#\2"+
		"\2\u02a8\u02a9\7?\2\2\u02a9\u00a0\3\2\2\2\u02aa\u02ab\7#\2\2\u02ab\u00a2"+
		"\3\2\2\2\u02ac\u02ad\7<\2\2\u02ad\u00a4\3\2\2\2\u02ae\u02af\7<\2\2\u02af"+
		"\u02b0\7<\2\2\u02b0\u00a6\3\2\2\2\u02b1\u02b2\7=\2\2\u02b2\u00a8\3\2\2"+
		"\2\u02b3\u02b4\7.\2\2\u02b4\u00aa\3\2\2\2\u02b5\u02b6\7/\2\2\u02b6\u02b7"+
		"\7?\2\2\u02b7\u00ac\3\2\2\2\u02b8\u02b9\7~\2\2\u02b9\u02ba\7~\2\2\u02ba"+
		"\u02bb\7?\2\2\u02bb\u00ae\3\2\2\2\u02bc\u02bd\7~\2\2\u02bd\u02be\7?\2"+
		"\2\u02be\u00b0\3\2\2\2\u02bf\u02c0\7~\2\2\u02c0\u00b2\3\2\2\2\u02c1\u02c2"+
		"\7@\2\2\u02c2\u02c3\7@\2\2\u02c3\u02c4\7?\2\2\u02c4\u00b4\3\2\2\2\u02c5"+
		"\u02c6\7@\2\2\u02c6\u02c7\7?\2\2\u02c7\u00b6\3\2\2\2\u02c8\u02c9\7@\2"+
		"\2\u02c9\u02ca\7@\2\2\u02ca\u00b8\3\2\2\2\u02cb\u02cc\7@\2\2\u02cc\u00ba"+
		"\3\2\2\2\u02cd\u02ce\7?\2\2\u02ce\u00bc\3\2\2\2\u02cf\u02d0\7?\2\2\u02d0"+
		"\u02d1\7@\2\2\u02d1\u00be\3\2\2\2\u02d2\u02d3\7?\2\2\u02d3\u02d4\7?\2"+
		"\2\u02d4\u02d5\7?\2\2\u02d5\u00c0\3\2\2\2\u02d6\u02d7\7?\2\2\u02d7\u02d8"+
		"\7?\2\2\u02d8\u00c2\3\2\2\2\u02d9\u02da\7?\2\2\u02da\u02db\7\u0080\2\2"+
		"\u02db\u00c4\3\2\2\2\u02dc\u02dd\7>\2\2\u02dd\u02de\7?\2\2\u02de\u00c6"+
		"\3\2\2\2\u02df\u02e0\7>\2\2\u02e0\u00c8\3\2\2\2\u02e1\u02e2\7>\2\2\u02e2"+
		"\u02e3\7>\2\2\u02e3\u02e4\7?\2\2\u02e4\u00ca\3\2\2\2\u02e5\u02e6\7>\2"+
		"\2\u02e6\u02e7\7>\2\2\u02e7\u00cc\3\2\2\2\u02e8\u02e9\7\u0080\2\2\u02e9"+
		"\u02ea\7?\2\2\u02ea\u00ce\3\2\2\2\u02eb\u02ec\7\u0080\2\2\u02ec\u00d0"+
		"\3\2\2\2\u02ed\u02ee\7`\2\2\u02ee\u02ef\7?\2\2\u02ef\u00d2\3\2\2\2\u02f0"+
		"\u02f1\7`\2\2\u02f1\u00d4\3\2\2\2\u02f2\u02f6\7%\2\2\u02f3\u02f5\n\6\2"+
		"\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7"+
		"\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fb\7\17\2\2"+
		"\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd"+
		"\7\f\2\2\u02fd\u00d6\3\2\2\2\u02fe\u02ff\7?\2\2\u02ff\u0300\7d\2\2\u0300"+
		"\u0301\7g\2\2\u0301\u0302\7i\2\2\u0302\u0303\7k\2\2\u0303\u0304\7p\2\2"+
		"\u0304\u0308\3\2\2\2\u0305\u0307\13\2\2\2\u0306\u0305\3\2\2\2\u0307\u030a"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030b\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030b\u030c\7?\2\2\u030c\u030d\7g\2\2\u030d\u030e\7p\2"+
		"\2\u030e\u030f\7f\2\2\u030f\u0311\3\2\2\2\u0310\u0312\7\17\2\2\u0311\u0310"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7\f\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\bk\6\2\u0316\u00d8\3\2\2\2\u0317\u0319\t\7"+
		"\2\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0318\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\bl\6\2\u031d\u00da\3\2"+
		"\2\2\u031e\u031f\5\u00f9|\2\u031f\u00dc\3\2\2\2\u0320\u0321\5\u00f7{\2"+
		"\u0321\u00de\3\2\2\2\u0322\u0323\7\62\2\2\u0323\u032d\t\b\2\2\u0324\u0326"+
		"\5\u00e9t\2\u0325\u0327\7\60\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2"+
		"\2\u0327\u032e\3\2\2\2\u0328\u032a\5\u00e9t\2\u0329\u0328\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\7\60\2\2\u032c\u032e\5"+
		"\u00e9t\2\u032d\u0324\3\2\2\2\u032d\u0329\3\2\2\2\u032e\u032f\3\2\2\2"+
		"\u032f\u0331\t\t\2\2\u0330\u0332\t\n\2\2\u0331\u0330\3\2\2\2\u0331\u0332"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\5\u00efw\2\u0334\u0336\t\13\2"+
		"\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u00e0\3\2\2\2\u0337\u0338"+
		"\7\62\2\2\u0338\u0339\t\b\2\2\u0339\u0341\t\f\2\2\u033a\u033c\t\r\2\2"+
		"\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e"+
		"\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0342\t\f\2\2\u0341"+
		"\u033d\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0345\t\16"+
		"\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u00e2\3\2\2\2\u0346"+
		"\u0348\7\62\2\2\u0347\u0349\t\17\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3"+
		"\2\2\2\u0349\u034a\3\2\2\2\u034a\u0352\t\20\2\2\u034b\u034d\t\21\2\2\u034c"+
		"\u034b\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0353\t\20\2\2\u0352"+
		"\u034e\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0356\t\16"+
		"\2\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u00e4\3\2\2\2\u0357"+
		"\u0359\7\62\2\2\u0358\u035a\t\22\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3"+
		"\2\2\2\u035a\u035e\3\2\2\2\u035b\u035d\7a\2\2\u035c\u035b\3\2\2\2\u035d"+
		"\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2"+
		"\2\2\u0360\u035e\3\2\2\2\u0361\u0369\t\20\2\2\u0362\u0364\t\21\2\2\u0363"+
		"\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2"+
		"\2\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u036a\t\20\2\2\u0369"+
		"\u0365\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u036d\t\16"+
		"\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u00e6\3\2\2\2\u036e"+
		"\u036f\7\62\2\2\u036f\u0370\t\23\2\2\u0370\u0378\t\24\2\2\u0371\u0373"+
		"\t\25\2\2\u0372\u0371\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2"+
		"\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0379"+
		"\t\24\2\2\u0378\u0374\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2"+
		"\u037a\u037c\t\16\2\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u00e8"+
		"\3\2\2\2\u037d\u0386\5\u00ebu\2\u037e\u0381\5\u00ebu\2\u037f\u0381\7a"+
		"\2\2\u0380\u037e\3\2\2\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382"+
		"\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0382\3\2"+
		"\2\2\u0385\u0387\5\u00ebu\2\u0386\u0382\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u00ea\3\2\2\2\u0388\u0389\t\f\2\2\u0389\u00ec\3\2\2\2\u038a\u038b\7^"+
		"\2\2\u038b\u038f\7$\2\2\u038c\u038d\7^\2\2\u038d\u038f\7)\2\2\u038e\u038a"+
		"\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u00ee\3\2\2\2\u0390\u0398\t\4\2\2\u0391"+
		"\u0393\t\26\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3"+
		"\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u0399\t\4\2\2\u0398\u0394\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u00f0\3\2"+
		"\2\2\u039a\u039e\t\27\2\2\u039b\u039c\7t\2\2\u039c\u039e\7k\2\2\u039d"+
		"\u039a\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u00f2\3\2\2\2\u039f\u03a1\t\30"+
		"\2\2\u03a0\u03a2\t\n\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a4\5\u00efw\2\u03a4\u00f4\3\2\2\2\u03a5\u03aa"+
		"\7$\2\2\u03a6\u03a9\5\u00edv\2\u03a7\u03a9\n\6\2\2\u03a8\u03a6\3\2\2\2"+
		"\u03a8\u03a7\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03ab\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03b8\7$\2\2\u03ae"+
		"\u03b3\7)\2\2\u03af\u03b2\5\u00edv\2\u03b0\u03b2\n\6\2\2\u03b1\u03af\3"+
		"\2\2\2\u03b1\u03b0\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b8\7)"+
		"\2\2\u03b7\u03a5\3\2\2\2\u03b7\u03ae\3\2\2\2\u03b8\u00f6\3\2\2\2\u03b9"+
		"\u03be\7b\2\2\u03ba\u03bd\5\u00edv\2\u03bb\u03bd\n\6\2\2\u03bc\u03ba\3"+
		"\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bf\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\7b"+
		"\2\2\u03c2\u00f8\3\2\2\2\u03c3\u03c7\t\31\2\2\u03c4\u03c6\t\32\2\2\u03c5"+
		"\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8\u00fa\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03cd\7A\2\2\u03cb"+
		"\u03ce\t\32\2\2\u03cc\u03ce\5\u00fd~\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc"+
		"\3\2\2\2\u03ce\u00fc\3\2\2\2\u03cf\u03d0\7^\2\2\u03d0\u0414\t\33\2\2\u03d1"+
		"\u03d2\7^\2\2\u03d2\u0414\7^\2\2\u03d3\u03d4\7^\2\2\u03d4\u03d5\5\u00eb"+
		"u\2\u03d5\u03d6\5\u00ebu\2\u03d6\u03d7\5\u00ebu\2\u03d7\u0414\3\2\2\2"+
		"\u03d8\u03d9\7^\2\2\u03d9\u03da\t\b\2\2\u03da\u03db\5\u00ebu\2\u03db\u03dc"+
		"\5\u00ebu\2\u03dc\u0414\3\2\2\2\u03dd\u03de\7^\2\2\u03de\u03df\t\34\2"+
		"\2\u03df\u03e0\5\u00ebu\2\u03e0\u03e1\5\u00ebu\2\u03e1\u03e2\5\u00ebu"+
		"\2\u03e2\u03e3\5\u00ebu\2\u03e3\u0414\3\2\2\2\u03e4\u03e5\7^\2\2\u03e5"+
		"\u03e6\t\34\2\2\u03e6\u03ec\7}\2\2\u03e7\u03e8\5\u00ebu\2\u03e8\u03e9"+
		"\5\u00ebu\2\u03e9\u03ea\5\u00ebu\2\u03ea\u03eb\5\u00ebu\2\u03eb\u03ed"+
		"\3\2\2\2\u03ec\u03e7\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\7\177\2\2\u03f1\u0414\3"+
		"\2\2\2\u03f2\u03f3\7^\2\2\u03f3\u03f5\t\35\2\2\u03f4\u03f6\7/\2\2\u03f5"+
		"\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u0414\5\u00ff"+
		"\177\2\u03f8\u03f9\7^\2\2\u03f9\u03fa\t\36\2\2\u03fa\u03fb\7/\2\2\u03fb"+
		"\u0414\5\u00ff\177\2\u03fc\u03fd\7^\2\2\u03fd\u03fe\t\36\2\2\u03fe\u03ff"+
		"\7/\2\2\u03ff\u0400\7^\2\2\u0400\u0402\t\35\2\2\u0401\u0403\7/\2\2\u0402"+
		"\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0414\5\u00ff"+
		"\177\2\u0405\u0406\7^\2\2\u0406\u0407\t\35\2\2\u0407\u0408\7^\2\2\u0408"+
		"\u040a\t\36\2\2\u0409\u040b\7/\2\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2"+
		"\2\2\u040b\u040c\3\2\2\2\u040c\u0414\5\u00ff\177\2\u040d\u040e\7^\2\2"+
		"\u040e\u0410\t\35\2\2\u040f\u0411\7/\2\2\u0410\u040f\3\2\2\2\u0410\u0411"+
		"\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\7A\2\2\u0413\u03cf\3\2\2\2\u0413"+
		"\u03d1\3\2\2\2\u0413\u03d3\3\2\2\2\u0413\u03d8\3\2\2\2\u0413\u03dd\3\2"+
		"\2\2\u0413\u03e4\3\2\2\2\u0413\u03f2\3\2\2\2\u0413\u03f8\3\2\2\2\u0413"+
		"\u03fc\3\2\2\2\u0413\u0405\3\2\2\2\u0413\u040d\3\2\2\2\u0414\u00fe\3\2"+
		"\2\2\u0415\u0418\t\3\2\2\u0416\u0418\5\u0101\u0080\2\u0417\u0415\3\2\2"+
		"\2\u0417\u0416\3\2\2\2\u0418\u0100\3\2\2\2\u0419\u041a\t\37\2\2\u041a"+
		"\u0102\3\2\2\2\u041b\u041c\5\u00f9|\2\u041c\u041d\b\u0081\7\2\u041d\u0104"+
		"\3\2\2\2\u041e\u041f\5\u00f5z\2\u041f\u0420\b\u0082\b\2\u0420\u0106\3"+
		"\2\2\2\u0421\u0423\13\2\2\2\u0422\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\b\u0083"+
		"\t\2\u0427\u0108\3\2\2\2\u0428\u042c\7%\2\2\u0429\u042b\n\6\2\2\u042a"+
		"\u0429\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2"+
		"\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0431\7\17\2\2\u0430"+
		"\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\7\f"+
		"\2\2\u0433\u0434\3\2\2\2\u0434\u0435\b\u0084\6\2\u0435\u010a\3\2\2\2\u0436"+
		"\u0437\7?\2\2\u0437\u0438\7d\2\2\u0438\u0439\7g\2\2\u0439\u043a\7i\2\2"+
		"\u043a\u043b\7k\2\2\u043b\u043c\7p\2\2\u043c\u0440\3\2\2\2\u043d\u043f"+
		"\13\2\2\2\u043e\u043d\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u0441\3\2\2\2"+
		"\u0440\u043e\3\2\2\2\u0441\u0443\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0444"+
		"\7?\2\2\u0444\u0445\7g\2\2\u0445\u0446\7p\2\2\u0446\u0447\7f\2\2\u0447"+
		"\u0449\3\2\2\2\u0448\u044a\7\17\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3"+
		"\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\7\f\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044e\b\u0085\6\2\u044e\u010c\3\2\2\2\u044f\u0450\t\6\2\2\u0450\u0451"+
		"\b\u0086\n\2\u0451\u010e\3\2\2\2\u0452\u0454\t \2\2\u0453\u0452\3\2\2"+
		"\2\u0454\u0455\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457"+
		"\3\2\2\2\u0457\u0458\b\u0087\13\2\u0458\u0110\3\2\2\2\u0459\u045a\n \2"+
		"\2\u045a\u045b\b\u0088\f\2\u045b\u0112\3\2\2\2X\2\3\4\u0117\u0120\u0129"+
		"\u01fe\u0202\u0205\u0209\u020c\u0210\u0213\u0217\u021a\u021e\u0221\u0223"+
		"\u0227\u022c\u0233\u0236\u0239\u023f\u0243\u0246\u024a\u0250\u0259\u025f"+
		"\u02f6\u02fa\u0308\u0311\u031a\u0326\u0329\u032d\u0331\u0335\u033d\u0341"+
		"\u0344\u0348\u034e\u0352\u0355\u0359\u035e\u0365\u0369\u036c\u0374\u0378"+
		"\u037b\u0380\u0382\u0386\u038e\u0394\u0398\u039d\u03a1\u03a8\u03aa\u03b1"+
		"\u03b3\u03b7\u03bc\u03be\u03c7\u03cd\u03ee\u03f5\u0402\u040a\u0410\u0413"+
		"\u0417\u0424\u042c\u0430\u0440\u0449\u0453\u0455\r\3\2\2\3\3\3\3\4\4\3"+
		"\5\5\b\2\2\3\u0081\6\3\u0082\7\3\u0083\b\3\u0086\t\3\u0087\n\3\u0088\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /Users/yihua/codecraft/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
package com.dianping.tuangou.transfer.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Letter=21, LetterE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "Letter", "LetterE"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\5\26g\n\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30\3\2\4\7\2&&\62\63C\\aac|\4\2\2\u0101\ud802\udc01j\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3"+
		"\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21"+
		"A\3\2\2\2\23C\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2"+
		"\35O\3\2\2\2\37R\3\2\2\2!V\3\2\2\2#X\3\2\2\2%[\3\2\2\2\'^\3\2\2\2)a\3"+
		"\2\2\2+f\3\2\2\2-h\3\2\2\2/\60\7\u6218\2\2\60\61\7\u8007\2\2\61\4\3\2"+
		"\2\2\62\63\7\u6631\2\2\63\6\3\2\2\2\64\65\7\u65f8\2\2\65\b\3\2\2\2\66"+
		"\67\7\u4e0f\2\2\678\7\u7b4b\2\289\7\u4e90\2\29\n\3\2\2\2:;\7\u5929\2\2"+
		";<\7\u4e90\2\2<\f\3\2\2\2=>\7\u5f55\2\2>\16\3\2\2\2?@\7>\2\2@\20\3\2\2"+
		"\2AB\7?\2\2B\22\3\2\2\2CD\7\u5307\2\2DE\7\u542d\2\2E\24\3\2\2\2FG\7\u4e16"+
		"\2\2G\26\3\2\2\2HI\7\u4e3c\2\2I\30\3\2\2\2JK\7@\2\2K\32\3\2\2\2LM\7\u7b4b"+
		"\2\2MN\7\u4e90\2\2N\34\3\2\2\2OP\7\u5e78\2\2PQ\7\u4e16\2\2Q\36\3\2\2\2"+
		"RS\7\u4e0f\2\2ST\7\u5307\2\2TU\7\u542d\2\2U \3\2\2\2VW\7\u6218\2\2W\""+
		"\3\2\2\2XY\7\u800e\2\2YZ\7\u4e16\2\2Z$\3\2\2\2[\\\7\u540e\2\2\\]\7\u65f8"+
		"\2\2]&\3\2\2\2^_\7\u5c11\2\2_`\7\u4e90\2\2`(\3\2\2\2ab\7\u9762\2\2bc\7"+
		"\u8fd3\2\2c*\3\2\2\2dg\t\2\2\2eg\n\3\2\2fd\3\2\2\2fe\3\2\2\2g,\3\2\2\2"+
		"hi\t\2\2\2i.\3\2\2\2\4\2f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
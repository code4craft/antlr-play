// Generated from /Users/yihua/codecraft/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, Letter=20, LetterE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Letter", "LetterE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5\25"+
		"b\n\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\4\7\2&&\62"+
		"\63C\\aac|\4\2\2\u0101\ud802\udc01e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2\2\138"+
		"\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27"+
		"F\3\2\2\2\31H\3\2\2\2\33J\3\2\2\2\35M\3\2\2\2\37P\3\2\2\2!T\3\2\2\2#V"+
		"\3\2\2\2%Y\3\2\2\2\'\\\3\2\2\2)a\3\2\2\2+c\3\2\2\2-.\7\u6218\2\2./\7\u8007"+
		"\2\2/\4\3\2\2\2\60\61\7\u6631\2\2\61\6\3\2\2\2\62\63\7\u65f8\2\2\63\b"+
		"\3\2\2\2\64\65\7\u4e0f\2\2\65\66\7\u7b4b\2\2\66\67\7\u4e90\2\2\67\n\3"+
		"\2\2\289\7\u5929\2\29:\7\u4e90\2\2:\f\3\2\2\2;<\7\u5f55\2\2<\16\3\2\2"+
		"\2=>\7>\2\2>\20\3\2\2\2?@\7?\2\2@\22\3\2\2\2AB\7\u5307\2\2BC\7\u542d\2"+
		"\2C\24\3\2\2\2DE\7\u4e16\2\2E\26\3\2\2\2FG\7\u4e3c\2\2G\30\3\2\2\2HI\7"+
		"@\2\2I\32\3\2\2\2JK\7\u7b4b\2\2KL\7\u4e90\2\2L\34\3\2\2\2MN\7\u5e78\2"+
		"\2NO\7\u4e16\2\2O\36\3\2\2\2PQ\7\u4e0f\2\2QR\7\u5307\2\2RS\7\u542d\2\2"+
		"S \3\2\2\2TU\7\u6218\2\2U\"\3\2\2\2VW\7\u540e\2\2WX\7\u65f8\2\2X$\3\2"+
		"\2\2YZ\7\u5c11\2\2Z[\7\u4e90\2\2[&\3\2\2\2\\]\7\u9762\2\2]^\7\u8fd3\2"+
		"\2^(\3\2\2\2_b\t\2\2\2`b\n\3\2\2a_\3\2\2\2a`\3\2\2\2b*\3\2\2\2cd\t\2\2"+
		"\2d,\3\2\2\2\4\2a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
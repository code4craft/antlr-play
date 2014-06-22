// Generated from /Users/yihua/Downloads/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Letter"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\5\21K\n\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2\3\2\4\6\2&&C\\aac|\4\2\2"+
		"\u0101\ud802\udc01K\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2"+
		"\17\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\259\3\2\2\2\27;\3\2\2\2\31"+
		"=\3\2\2\2\33?\3\2\2\2\35B\3\2\2\2\37E\3\2\2\2!J\3\2\2\2#$\7\u6631\2\2"+
		"$\4\3\2\2\2%&\7z\2\2&\'\7\64\2\2\'\6\3\2\2\2()\7z\2\2)*\7\63\2\2*\b\3"+
		"\2\2\2+,\7\u65f8\2\2,\n\3\2\2\2-.\7>\2\2.\f\3\2\2\2/\60\7\u5929\2\2\60"+
		"\61\7\u4e90\2\2\61\16\3\2\2\2\62\63\7\u5f55\2\2\63\20\3\2\2\2\64\65\7"+
		"?\2\2\65\22\3\2\2\2\66\67\7\u4ef9\2\2\678\7\u683e\2\28\24\3\2\2\29:\7"+
		"\u4e3c\2\2:\26\3\2\2\2;<\7z\2\2<\30\3\2\2\2=>\7@\2\2>\32\3\2\2\2?@\7\u7b4b"+
		"\2\2@A\7\u4e90\2\2A\34\3\2\2\2BC\7\u5c11\2\2CD\7\u4e90\2\2D\36\3\2\2\2"+
		"EF\7\u9762\2\2FG\7\u8fd3\2\2G \3\2\2\2HK\t\2\2\2IK\n\3\2\2JH\3\2\2\2J"+
		"I\3\2\2\2K\"\3\2\2\2\4\2J\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
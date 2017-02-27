// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, OPEQUAL=7, COMMA=8, IF=9, 
		THEN=10, ELSE=11, ENDIF=12, WHILE=13, WEND=14, DO=15, LOOP=16, UNTIL=17, 
		FOR=18, TO=19, STEP=20, NEXT=21, INTEGER=22, SINGLE=23, DOUBLE=24, LONG=25, 
		STRING=26, DIM=27, AS=28, ID=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "OPEQUAL", "COMMA", "IF", 
		"THEN", "ELSE", "ENDIF", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", 
		"TO", "STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", 
		"DIM", "AS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'!'", "'#'", "'askldfj'", null, "'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "INT", "OPEQUAL", "COMMA", "IF", "THEN", 
		"ELSE", "ENDIF", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", 
		"STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", 
		"AS", "ID", "WS"
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


	public QB64Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QB64.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u0138\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7\u0085\n\7\r\7\16\7\u0086"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\6\r\u009e\n\r\r\r\16\r\u009f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\78\u012d\n8\f8\16"+
		"8\u0130\138\39\69\u0133\n9\r9\169\u0134\39\39\2\2:\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\2C\2E\2G\2I"+
		"\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\37q \3\2!\3"+
		"\2\62;\4\2$$))\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0121\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2"+
		"\r\u0084\3\2\2\2\17\u0088\3\2\2\2\21\u008a\3\2\2\2\23\u008c\3\2\2\2\25"+
		"\u008f\3\2\2\2\27\u0094\3\2\2\2\31\u0099\3\2\2\2\33\u00a3\3\2\2\2\35\u00a9"+
		"\3\2\2\2\37\u00ae\3\2\2\2!\u00b1\3\2\2\2#\u00b6\3\2\2\2%\u00bc\3\2\2\2"+
		"\'\u00c0\3\2\2\2)\u00c3\3\2\2\2+\u00c8\3\2\2\2-\u00cd\3\2\2\2/\u00d5\3"+
		"\2\2\2\61\u00dc\3\2\2\2\63\u00e3\3\2\2\2\65\u00e8\3\2\2\2\67\u00ef\3\2"+
		"\2\29\u00f3\3\2\2\2;\u00f6\3\2\2\2=\u00f8\3\2\2\2?\u00fa\3\2\2\2A\u00fc"+
		"\3\2\2\2C\u00fe\3\2\2\2E\u0100\3\2\2\2G\u0102\3\2\2\2I\u0104\3\2\2\2K"+
		"\u0106\3\2\2\2M\u0108\3\2\2\2O\u010a\3\2\2\2Q\u010c\3\2\2\2S\u010e\3\2"+
		"\2\2U\u0110\3\2\2\2W\u0112\3\2\2\2Y\u0114\3\2\2\2[\u0116\3\2\2\2]\u0118"+
		"\3\2\2\2_\u011a\3\2\2\2a\u011c\3\2\2\2c\u011e\3\2\2\2e\u0120\3\2\2\2g"+
		"\u0122\3\2\2\2i\u0124\3\2\2\2k\u0126\3\2\2\2m\u0128\3\2\2\2o\u012a\3\2"+
		"\2\2q\u0132\3\2\2\2st\7\'\2\2t\4\3\2\2\2uv\7(\2\2v\6\3\2\2\2wx\7#\2\2"+
		"x\b\3\2\2\2yz\7%\2\2z\n\3\2\2\2{|\7c\2\2|}\7u\2\2}~\7m\2\2~\177\7n\2\2"+
		"\177\u0080\7f\2\2\u0080\u0081\7h\2\2\u0081\u0082\7l\2\2\u0082\f\3\2\2"+
		"\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\16\3\2\2\2\u0088\u0089\7?\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7.\2\2\u008b\22\3\2\2\2\u008c\u008d\5K&\2\u008d"+
		"\u008e\5E#\2\u008e\24\3\2\2\2\u008f\u0090\5a\61\2\u0090\u0091\5I%\2\u0091"+
		"\u0092\5C\"\2\u0092\u0093\5U+\2\u0093\26\3\2\2\2\u0094\u0095\5C\"\2\u0095"+
		"\u0096\5Q)\2\u0096\u0097\5_\60\2\u0097\u0098\5C\"\2\u0098\30\3\2\2\2\u0099"+
		"\u009a\5C\"\2\u009a\u009b\5U+\2\u009b\u009d\5A!\2\u009c\u009e\n\3\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5\23\n\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\5g\64\2\u00a4\u00a5\5I%\2\u00a5\u00a6\5K&\2\u00a6\u00a7\5Q)\2\u00a7"+
		"\u00a8\5C\"\2\u00a8\34\3\2\2\2\u00a9\u00aa\5g\64\2\u00aa\u00ab\5C\"\2"+
		"\u00ab\u00ac\5U+\2\u00ac\u00ad\5A!\2\u00ad\36\3\2\2\2\u00ae\u00af\5A!"+
		"\2\u00af\u00b0\5W,\2\u00b0 \3\2\2\2\u00b1\u00b2\5Q)\2\u00b2\u00b3\5W,"+
		"\2\u00b3\u00b4\5W,\2\u00b4\u00b5\5Y-\2\u00b5\"\3\2\2\2\u00b6\u00b7\5c"+
		"\62\2\u00b7\u00b8\5U+\2\u00b8\u00b9\5a\61\2\u00b9\u00ba\5K&\2\u00ba\u00bb"+
		"\5Q)\2\u00bb$\3\2\2\2\u00bc\u00bd\5E#\2\u00bd\u00be\5W,\2\u00be\u00bf"+
		"\5]/\2\u00bf&\3\2\2\2\u00c0\u00c1\5a\61\2\u00c1\u00c2\5W,\2\u00c2(\3\2"+
		"\2\2\u00c3\u00c4\5_\60\2\u00c4\u00c5\5a\61\2\u00c5\u00c6\5C\"\2\u00c6"+
		"\u00c7\5Y-\2\u00c7*\3\2\2\2\u00c8\u00c9\5U+\2\u00c9\u00ca\5C\"\2\u00ca"+
		"\u00cb\5i\65\2\u00cb\u00cc\5a\61\2\u00cc,\3\2\2\2\u00cd\u00ce\5K&\2\u00ce"+
		"\u00cf\5U+\2\u00cf\u00d0\5a\61\2\u00d0\u00d1\5C\"\2\u00d1\u00d2\5G$\2"+
		"\u00d2\u00d3\5C\"\2\u00d3\u00d4\5]/\2\u00d4.\3\2\2\2\u00d5\u00d6\5_\60"+
		"\2\u00d6\u00d7\5K&\2\u00d7\u00d8\5U+\2\u00d8\u00d9\5G$\2\u00d9\u00da\5"+
		"Q)\2\u00da\u00db\5C\"\2\u00db\60\3\2\2\2\u00dc\u00dd\5A!\2\u00dd\u00de"+
		"\5W,\2\u00de\u00df\5c\62\2\u00df\u00e0\5=\37\2\u00e0\u00e1\5Q)\2\u00e1"+
		"\u00e2\5C\"\2\u00e2\62\3\2\2\2\u00e3\u00e4\5Q)\2\u00e4\u00e5\5W,\2\u00e5"+
		"\u00e6\5U+\2\u00e6\u00e7\5G$\2\u00e7\64\3\2\2\2\u00e8\u00e9\5_\60\2\u00e9"+
		"\u00ea\5a\61\2\u00ea\u00eb\5]/\2\u00eb\u00ec\5K&\2\u00ec\u00ed\5U+\2\u00ed"+
		"\u00ee\5G$\2\u00ee\66\3\2\2\2\u00ef\u00f0\5A!\2\u00f0\u00f1\5K&\2\u00f1"+
		"\u00f2\5S*\2\u00f28\3\2\2\2\u00f3\u00f4\5;\36\2\u00f4\u00f5\5_\60\2\u00f5"+
		":\3\2\2\2\u00f6\u00f7\t\4\2\2\u00f7<\3\2\2\2\u00f8\u00f9\t\5\2\2\u00f9"+
		">\3\2\2\2\u00fa\u00fb\t\6\2\2\u00fb@\3\2\2\2\u00fc\u00fd\t\7\2\2\u00fd"+
		"B\3\2\2\2\u00fe\u00ff\t\b\2\2\u00ffD\3\2\2\2\u0100\u0101\t\t\2\2\u0101"+
		"F\3\2\2\2\u0102\u0103\t\n\2\2\u0103H\3\2\2\2\u0104\u0105\t\13\2\2\u0105"+
		"J\3\2\2\2\u0106\u0107\t\f\2\2\u0107L\3\2\2\2\u0108\u0109\t\r\2\2\u0109"+
		"N\3\2\2\2\u010a\u010b\t\16\2\2\u010bP\3\2\2\2\u010c\u010d\t\17\2\2\u010d"+
		"R\3\2\2\2\u010e\u010f\t\20\2\2\u010fT\3\2\2\2\u0110\u0111\t\21\2\2\u0111"+
		"V\3\2\2\2\u0112\u0113\t\22\2\2\u0113X\3\2\2\2\u0114\u0115\t\23\2\2\u0115"+
		"Z\3\2\2\2\u0116\u0117\t\24\2\2\u0117\\\3\2\2\2\u0118\u0119\t\25\2\2\u0119"+
		"^\3\2\2\2\u011a\u011b\t\26\2\2\u011b`\3\2\2\2\u011c\u011d\t\27\2\2\u011d"+
		"b\3\2\2\2\u011e\u011f\t\30\2\2\u011fd\3\2\2\2\u0120\u0121\t\31\2\2\u0121"+
		"f\3\2\2\2\u0122\u0123\t\32\2\2\u0123h\3\2\2\2\u0124\u0125\t\33\2\2\u0125"+
		"j\3\2\2\2\u0126\u0127\t\34\2\2\u0127l\3\2\2\2\u0128\u0129\t\35\2\2\u0129"+
		"n\3\2\2\2\u012a\u012e\t\36\2\2\u012b\u012d\t\37\2\2\u012c\u012b\3\2\2"+
		"\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fp"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\t \2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\b9\2\2\u0137r\3\2\2\2\7\2\u0086\u009f\u012e\u0134\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
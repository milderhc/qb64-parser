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
		T__0=1, INT=2, OPEQUAL=3, IF=4, THEN=5, ELSE=6, ENDIF=7, WHILE=8, WEND=9, 
		DO=10, LOOP=11, UNTIL=12, FOR=13, TO=14, STEP=15, NEXT=16, ID=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "INT", "OPEQUAL", "IF", "THEN", "ELSE", "ENDIF", "WHILE", "WEND", 
		"DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'askldfj'", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INT", "OPEQUAL", "IF", "THEN", "ELSE", "ENDIF", "WHILE", 
		"WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00ed\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3e\n\3\r\3\16\3f\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\6\b|\n\b\r\b\16\b}\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\7,\u00e2\n,\f,\16,\u00e5\13,\3-\6-\u00e8\n-\r-"+
		"\16-\u00e9\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\23Y\24\3\2!\3\2\62;\4"+
		"\2$$))\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJj"+
		"j\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00d6\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\3[\3\2\2\2\5d\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13m\3\2\2\2\rr\3\2\2\2"+
		"\17w\3\2\2\2\21\u0081\3\2\2\2\23\u0087\3\2\2\2\25\u008c\3\2\2\2\27\u008f"+
		"\3\2\2\2\31\u0094\3\2\2\2\33\u009a\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3"+
		"\2\2\2!\u00a6\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2"+
		"\63\u00bb\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2\2\2;\u00c3"+
		"\3\2\2\2=\u00c5\3\2\2\2?\u00c7\3\2\2\2A\u00c9\3\2\2\2C\u00cb\3\2\2\2E"+
		"\u00cd\3\2\2\2G\u00cf\3\2\2\2I\u00d1\3\2\2\2K\u00d3\3\2\2\2M\u00d5\3\2"+
		"\2\2O\u00d7\3\2\2\2Q\u00d9\3\2\2\2S\u00db\3\2\2\2U\u00dd\3\2\2\2W\u00df"+
		"\3\2\2\2Y\u00e7\3\2\2\2[\\\7c\2\2\\]\7u\2\2]^\7m\2\2^_\7n\2\2_`\7f\2\2"+
		"`a\7h\2\2ab\7l\2\2b\4\3\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2g\6\3\2\2\2hi\7?\2\2i\b\3\2\2\2jk\5\63\32\2kl\5-\27\2l\n\3\2"+
		"\2\2mn\5I%\2no\5\61\31\2op\5+\26\2pq\5=\37\2q\f\3\2\2\2rs\5+\26\2st\5"+
		"9\35\2tu\5G$\2uv\5+\26\2v\16\3\2\2\2wx\5+\26\2xy\5=\37\2y{\5)\25\2z|\n"+
		"\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\5\t\5\2\u0080\20\3\2\2\2\u0081\u0082\5O(\2\u0082\u0083\5\61\31\2\u0083"+
		"\u0084\5\63\32\2\u0084\u0085\59\35\2\u0085\u0086\5+\26\2\u0086\22\3\2"+
		"\2\2\u0087\u0088\5O(\2\u0088\u0089\5+\26\2\u0089\u008a\5=\37\2\u008a\u008b"+
		"\5)\25\2\u008b\24\3\2\2\2\u008c\u008d\5)\25\2\u008d\u008e\5? \2\u008e"+
		"\26\3\2\2\2\u008f\u0090\59\35\2\u0090\u0091\5? \2\u0091\u0092\5? \2\u0092"+
		"\u0093\5A!\2\u0093\30\3\2\2\2\u0094\u0095\5K&\2\u0095\u0096\5=\37\2\u0096"+
		"\u0097\5I%\2\u0097\u0098\5\63\32\2\u0098\u0099\59\35\2\u0099\32\3\2\2"+
		"\2\u009a\u009b\5-\27\2\u009b\u009c\5? \2\u009c\u009d\5E#\2\u009d\34\3"+
		"\2\2\2\u009e\u009f\5I%\2\u009f\u00a0\5? \2\u00a0\36\3\2\2\2\u00a1\u00a2"+
		"\5G$\2\u00a2\u00a3\5I%\2\u00a3\u00a4\5+\26\2\u00a4\u00a5\5A!\2\u00a5 "+
		"\3\2\2\2\u00a6\u00a7\5=\37\2\u00a7\u00a8\5+\26\2\u00a8\u00a9\5Q)\2\u00a9"+
		"\u00aa\5I%\2\u00aa\"\3\2\2\2\u00ab\u00ac\t\4\2\2\u00ac$\3\2\2\2\u00ad"+
		"\u00ae\t\5\2\2\u00ae&\3\2\2\2\u00af\u00b0\t\6\2\2\u00b0(\3\2\2\2\u00b1"+
		"\u00b2\t\7\2\2\u00b2*\3\2\2\2\u00b3\u00b4\t\b\2\2\u00b4,\3\2\2\2\u00b5"+
		"\u00b6\t\t\2\2\u00b6.\3\2\2\2\u00b7\u00b8\t\n\2\2\u00b8\60\3\2\2\2\u00b9"+
		"\u00ba\t\13\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\t\f\2\2\u00bc\64\3\2\2\2"+
		"\u00bd\u00be\t\r\2\2\u00be\66\3\2\2\2\u00bf\u00c0\t\16\2\2\u00c08\3\2"+
		"\2\2\u00c1\u00c2\t\17\2\2\u00c2:\3\2\2\2\u00c3\u00c4\t\20\2\2\u00c4<\3"+
		"\2\2\2\u00c5\u00c6\t\21\2\2\u00c6>\3\2\2\2\u00c7\u00c8\t\22\2\2\u00c8"+
		"@\3\2\2\2\u00c9\u00ca\t\23\2\2\u00caB\3\2\2\2\u00cb\u00cc\t\24\2\2\u00cc"+
		"D\3\2\2\2\u00cd\u00ce\t\25\2\2\u00ceF\3\2\2\2\u00cf\u00d0\t\26\2\2\u00d0"+
		"H\3\2\2\2\u00d1\u00d2\t\27\2\2\u00d2J\3\2\2\2\u00d3\u00d4\t\30\2\2\u00d4"+
		"L\3\2\2\2\u00d5\u00d6\t\31\2\2\u00d6N\3\2\2\2\u00d7\u00d8\t\32\2\2\u00d8"+
		"P\3\2\2\2\u00d9\u00da\t\33\2\2\u00daR\3\2\2\2\u00db\u00dc\t\34\2\2\u00dc"+
		"T\3\2\2\2\u00dd\u00de\t\35\2\2\u00deV\3\2\2\2\u00df\u00e3\t\36\2\2\u00e0"+
		"\u00e2\t\37\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4X\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8"+
		"\t \2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b-\2\2\u00ecZ\3\2\2\2\7"+
		"\2f}\u00e3\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
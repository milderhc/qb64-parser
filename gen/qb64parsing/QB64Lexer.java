// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
package qb64parsing;
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
		T__0=1, T__1=2, INTEGERSUFFIX=3, LONGSUFFIX=4, SINGLESUFFIX=5, DOUBLESUFFIX=6, 
		STRINGSUFFIX=7, INTEGERVALUE=8, LONGVALUE=9, SINGLEVALUE=10, DOUBLEVALUE=11, 
		STRINGVALUE=12, EQUALOP=13, POTOP=14, DIVOP=15, PRODUCTOP=16, ADDOP=17, 
		SUBOP=18, DIFFOP=19, LESSOP=20, LESSOREQUALOP=21, GREATER=22, GREATEROREQUAL=23, 
		SEMICOLON=24, COLON=25, COMMA=26, LEFTPAR=27, RIGHTPAR=28, INPUT=29, PRINT=30, 
		IF=31, THEN=32, ELSE=33, ENDIF=34, WHILE=35, WEND=36, DO=37, LOOP=38, 
		UNTIL=39, FOR=40, TO=41, STEP=42, NEXT=43, INTEGER=44, SINGLE=45, DOUBLE=46, 
		LONG=47, STRING=48, DIM=49, AS=50, NOT=51, OR=52, AND=53, XOR=54, MOD=55, 
		IDPREFIX=56, WS=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", 
		"STRINGSUFFIX", "INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", 
		"STRINGVALUE", "EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", 
		"DIFFOP", "LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", 
		"COLON", "COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", 
		"ELSE", "ENDIF", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", 
		"STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", 
		"AS", "NOT", "OR", "AND", "XOR", "MOD", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "IDPREFIX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'skdjfksdf'", "'askldfj'", "'%'", "'&'", "'!'", "'#'", "'$'", null, 
		null, null, null, null, "'='", null, "'/'", "'*'", null, null, "'<>'", 
		"'<'", "'<='", "'>'", "'>='", "';'", "':'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", 
		"STRINGSUFFIX", "INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", 
		"STRINGVALUE", "EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", 
		"DIFFOP", "LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", 
		"COLON", "COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", 
		"ELSE", "ENDIF", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", 
		"STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", 
		"AS", "NOT", "OR", "AND", "XOR", "MOD", "IDPREFIX", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u01ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\u00c7\n\t\r\t\16\t"+
		"\u00c8\3\n\6\n\u00cc\n\n\r\n\16\n\u00cd\3\13\6\13\u00d1\n\13\r\13\16\13"+
		"\u00d2\3\13\3\13\3\13\5\13\u00d8\n\13\3\13\5\13\u00db\n\13\3\13\5\13\u00de"+
		"\n\13\3\13\5\13\u00e1\n\13\3\13\5\13\u00e4\n\13\3\f\6\f\u00e7\n\f\r\f"+
		"\16\f\u00e8\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00f3\n\f\r\f\16\f\u00f4"+
		"\3\r\3\r\7\r\u00f9\n\r\f\r\16\r\u00fc\13\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\6#\u0140"+
		"\n#\r#\16#\u0141\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\3:\3:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3"+
		"R\3S\3S\7S\u01e2\nS\fS\16S\u01e5\13S\3T\6T\u01e8\nT\rT\16T\u01e9\3T\3"+
		"T\2\2U\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5:\u00a7;\3\2\"\3\2\62;\3\2\60"+
		"\60\4\2$$))\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4"+
		"\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2"+
		"[[{{\4\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u01e0\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\3\u00a9\3\2\2\2\5\u00b3\3\2\2"+
		"\2\7\u00bb\3\2\2\2\t\u00bd\3\2\2\2\13\u00bf\3\2\2\2\r\u00c1\3\2\2\2\17"+
		"\u00c3\3\2\2\2\21\u00c6\3\2\2\2\23\u00cb\3\2\2\2\25\u00d0\3\2\2\2\27\u00e6"+
		"\3\2\2\2\31\u00f6\3\2\2\2\33\u00ff\3\2\2\2\35\u0101\3\2\2\2\37\u0103\3"+
		"\2\2\2!\u0105\3\2\2\2#\u0107\3\2\2\2%\u0109\3\2\2\2\'\u010b\3\2\2\2)\u010e"+
		"\3\2\2\2+\u0110\3\2\2\2-\u0113\3\2\2\2/\u0115\3\2\2\2\61\u0118\3\2\2\2"+
		"\63\u011a\3\2\2\2\65\u011c\3\2\2\2\67\u011e\3\2\2\29\u0120\3\2\2\2;\u0122"+
		"\3\2\2\2=\u0128\3\2\2\2?\u012e\3\2\2\2A\u0131\3\2\2\2C\u0136\3\2\2\2E"+
		"\u013b\3\2\2\2G\u0145\3\2\2\2I\u014b\3\2\2\2K\u0150\3\2\2\2M\u0153\3\2"+
		"\2\2O\u0158\3\2\2\2Q\u015e\3\2\2\2S\u0162\3\2\2\2U\u0165\3\2\2\2W\u016a"+
		"\3\2\2\2Y\u016f\3\2\2\2[\u0177\3\2\2\2]\u017e\3\2\2\2_\u0185\3\2\2\2a"+
		"\u018a\3\2\2\2c\u0191\3\2\2\2e\u0195\3\2\2\2g\u0198\3\2\2\2i\u019c\3\2"+
		"\2\2k\u019f\3\2\2\2m\u01a3\3\2\2\2o\u01a7\3\2\2\2q\u01ab\3\2\2\2s\u01ad"+
		"\3\2\2\2u\u01af\3\2\2\2w\u01b1\3\2\2\2y\u01b3\3\2\2\2{\u01b5\3\2\2\2}"+
		"\u01b7\3\2\2\2\177\u01b9\3\2\2\2\u0081\u01bb\3\2\2\2\u0083\u01bd\3\2\2"+
		"\2\u0085\u01bf\3\2\2\2\u0087\u01c1\3\2\2\2\u0089\u01c3\3\2\2\2\u008b\u01c5"+
		"\3\2\2\2\u008d\u01c7\3\2\2\2\u008f\u01c9\3\2\2\2\u0091\u01cb\3\2\2\2\u0093"+
		"\u01cd\3\2\2\2\u0095\u01cf\3\2\2\2\u0097\u01d1\3\2\2\2\u0099\u01d3\3\2"+
		"\2\2\u009b\u01d5\3\2\2\2\u009d\u01d7\3\2\2\2\u009f\u01d9\3\2\2\2\u00a1"+
		"\u01db\3\2\2\2\u00a3\u01dd\3\2\2\2\u00a5\u01df\3\2\2\2\u00a7\u01e7\3\2"+
		"\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7m\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad"+
		"\7l\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7f\2\2\u00b1\u00b2\7h\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7f\2\2"+
		"\u00b8\u00b9\7h\2\2\u00b9\u00ba\7l\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7\'"+
		"\2\2\u00bc\b\3\2\2\2\u00bd\u00be\7(\2\2\u00be\n\3\2\2\2\u00bf\u00c0\7"+
		"#\2\2\u00c0\f\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2\16\3\2\2\2\u00c3\u00c4"+
		"\7&\2\2\u00c4\20\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\22\3\2\2"+
		"\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\24\3\2\2\2\u00cf\u00d1\t\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5\u00d7\t\2\2\2\u00d6"+
		"\u00d8\t\2\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00de\t\2\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\t\2\2\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\t\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\26\3\2\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00ec\t\2\2\2\u00ec\u00ed\t\2"+
		"\2\2\u00ed\u00ee\t\2\2\2\u00ee\u00ef\t\2\2\2\u00ef\u00f0\t\2\2\2\u00f0"+
		"\u00f2\t\2\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\30\3\2\2\2\u00f6\u00fa"+
		"\t\4\2\2\u00f7\u00f9\n\4\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\t\4\2\2\u00fe\32\3\2\2\2\u00ff\u0100\7?\2\2\u0100\34"+
		"\3\2\2\2\u0101\u0102\7`\2\2\u0102\36\3\2\2\2\u0103\u0104\7\61\2\2\u0104"+
		" \3\2\2\2\u0105\u0106\7,\2\2\u0106\"\3\2\2\2\u0107\u0108\7-\2\2\u0108"+
		"$\3\2\2\2\u0109\u010a\7/\2\2\u010a&\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d"+
		"\7@\2\2\u010d(\3\2\2\2\u010e\u010f\7>\2\2\u010f*\3\2\2\2\u0110\u0111\7"+
		">\2\2\u0111\u0112\7?\2\2\u0112,\3\2\2\2\u0113\u0114\7@\2\2\u0114.\3\2"+
		"\2\2\u0115\u0116\7@\2\2\u0116\u0117\7?\2\2\u0117\60\3\2\2\2\u0118\u0119"+
		"\7=\2\2\u0119\62\3\2\2\2\u011a\u011b\7<\2\2\u011b\64\3\2\2\2\u011c\u011d"+
		"\7.\2\2\u011d\66\3\2\2\2\u011e\u011f\7*\2\2\u011f8\3\2\2\2\u0120\u0121"+
		"\7+\2\2\u0121:\3\2\2\2\u0122\u0123\5\u0081A\2\u0123\u0124\5\u008bF\2\u0124"+
		"\u0125\5\u008fH\2\u0125\u0126\5\u0099M\2\u0126\u0127\5\u0097L\2\u0127"+
		"<\3\2\2\2\u0128\u0129\5\u008fH\2\u0129\u012a\5\u0093J\2\u012a\u012b\5"+
		"\u0081A\2\u012b\u012c\5\u008bF\2\u012c\u012d\5\u0097L\2\u012d>\3\2\2\2"+
		"\u012e\u012f\5\u0081A\2\u012f\u0130\5{>\2\u0130@\3\2\2\2\u0131\u0132\5"+
		"\u0097L\2\u0132\u0133\5\177@\2\u0133\u0134\5y=\2\u0134\u0135\5\u008bF"+
		"\2\u0135B\3\2\2\2\u0136\u0137\5y=\2\u0137\u0138\5\u0087D\2\u0138\u0139"+
		"\5\u0095K\2\u0139\u013a\5y=\2\u013aD\3\2\2\2\u013b\u013c\5y=\2\u013c\u013d"+
		"\5\u008bF\2\u013d\u013f\5w<\2\u013e\u0140\n\4\2\2\u013f\u013e\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\5? \2\u0144F\3\2\2\2\u0145\u0146\5\u009dO\2\u0146"+
		"\u0147\5\177@\2\u0147\u0148\5\u0081A\2\u0148\u0149\5\u0087D\2\u0149\u014a"+
		"\5y=\2\u014aH\3\2\2\2\u014b\u014c\5\u009dO\2\u014c\u014d\5y=\2\u014d\u014e"+
		"\5\u008bF\2\u014e\u014f\5w<\2\u014fJ\3\2\2\2\u0150\u0151\5w<\2\u0151\u0152"+
		"\5\u008dG\2\u0152L\3\2\2\2\u0153\u0154\5\u0087D\2\u0154\u0155\5\u008d"+
		"G\2\u0155\u0156\5\u008dG\2\u0156\u0157\5\u008fH\2\u0157N\3\2\2\2\u0158"+
		"\u0159\5\u0099M\2\u0159\u015a\5\u008bF\2\u015a\u015b\5\u0097L\2\u015b"+
		"\u015c\5\u0081A\2\u015c\u015d\5\u0087D\2\u015dP\3\2\2\2\u015e\u015f\5"+
		"{>\2\u015f\u0160\5\u008dG\2\u0160\u0161\5\u0093J\2\u0161R\3\2\2\2\u0162"+
		"\u0163\5\u0097L\2\u0163\u0164\5\u008dG\2\u0164T\3\2\2\2\u0165\u0166\5"+
		"\u0095K\2\u0166\u0167\5\u0097L\2\u0167\u0168\5y=\2\u0168\u0169\5\u008f"+
		"H\2\u0169V\3\2\2\2\u016a\u016b\5\u008bF\2\u016b\u016c\5y=\2\u016c\u016d"+
		"\5\u009fP\2\u016d\u016e\5\u0097L\2\u016eX\3\2\2\2\u016f\u0170\5\u0081"+
		"A\2\u0170\u0171\5\u008bF\2\u0171\u0172\5\u0097L\2\u0172\u0173\5y=\2\u0173"+
		"\u0174\5}?\2\u0174\u0175\5y=\2\u0175\u0176\5\u0093J\2\u0176Z\3\2\2\2\u0177"+
		"\u0178\5\u0095K\2\u0178\u0179\5\u0081A\2\u0179\u017a\5\u008bF\2\u017a"+
		"\u017b\5}?\2\u017b\u017c\5\u0087D\2\u017c\u017d\5y=\2\u017d\\\3\2\2\2"+
		"\u017e\u017f\5w<\2\u017f\u0180\5\u008dG\2\u0180\u0181\5\u0099M\2\u0181"+
		"\u0182\5s:\2\u0182\u0183\5\u0087D\2\u0183\u0184\5y=\2\u0184^\3\2\2\2\u0185"+
		"\u0186\5\u0087D\2\u0186\u0187\5\u008dG\2\u0187\u0188\5\u008bF\2\u0188"+
		"\u0189\5}?\2\u0189`\3\2\2\2\u018a\u018b\5\u0095K\2\u018b\u018c\5\u0097"+
		"L\2\u018c\u018d\5\u0093J\2\u018d\u018e\5\u0081A\2\u018e\u018f\5\u008b"+
		"F\2\u018f\u0190\5}?\2\u0190b\3\2\2\2\u0191\u0192\5w<\2\u0192\u0193\5\u0081"+
		"A\2\u0193\u0194\5\u0089E\2\u0194d\3\2\2\2\u0195\u0196\5q9\2\u0196\u0197"+
		"\5\u0095K\2\u0197f\3\2\2\2\u0198\u0199\5\u008bF\2\u0199\u019a\5\u008d"+
		"G\2\u019a\u019b\5\u0097L\2\u019bh\3\2\2\2\u019c\u019d\5\u008dG\2\u019d"+
		"\u019e\5\u0093J\2\u019ej\3\2\2\2\u019f\u01a0\5q9\2\u01a0\u01a1\5\u008b"+
		"F\2\u01a1\u01a2\5w<\2\u01a2l\3\2\2\2\u01a3\u01a4\5\u009fP\2\u01a4\u01a5"+
		"\5\u008dG\2\u01a5\u01a6\5\u0093J\2\u01a6n\3\2\2\2\u01a7\u01a8\5\u0089"+
		"E\2\u01a8\u01a9\5\u008dG\2\u01a9\u01aa\5w<\2\u01aap\3\2\2\2\u01ab\u01ac"+
		"\t\5\2\2\u01acr\3\2\2\2\u01ad\u01ae\t\6\2\2\u01aet\3\2\2\2\u01af\u01b0"+
		"\t\7\2\2\u01b0v\3\2\2\2\u01b1\u01b2\t\b\2\2\u01b2x\3\2\2\2\u01b3\u01b4"+
		"\t\t\2\2\u01b4z\3\2\2\2\u01b5\u01b6\t\n\2\2\u01b6|\3\2\2\2\u01b7\u01b8"+
		"\t\13\2\2\u01b8~\3\2\2\2\u01b9\u01ba\t\f\2\2\u01ba\u0080\3\2\2\2\u01bb"+
		"\u01bc\t\r\2\2\u01bc\u0082\3\2\2\2\u01bd\u01be\t\16\2\2\u01be\u0084\3"+
		"\2\2\2\u01bf\u01c0\t\17\2\2\u01c0\u0086\3\2\2\2\u01c1\u01c2\t\20\2\2\u01c2"+
		"\u0088\3\2\2\2\u01c3\u01c4\t\21\2\2\u01c4\u008a\3\2\2\2\u01c5\u01c6\t"+
		"\22\2\2\u01c6\u008c\3\2\2\2\u01c7\u01c8\t\23\2\2\u01c8\u008e\3\2\2\2\u01c9"+
		"\u01ca\t\24\2\2\u01ca\u0090\3\2\2\2\u01cb\u01cc\t\25\2\2\u01cc\u0092\3"+
		"\2\2\2\u01cd\u01ce\t\26\2\2\u01ce\u0094\3\2\2\2\u01cf\u01d0\t\27\2\2\u01d0"+
		"\u0096\3\2\2\2\u01d1\u01d2\t\30\2\2\u01d2\u0098\3\2\2\2\u01d3\u01d4\t"+
		"\31\2\2\u01d4\u009a\3\2\2\2\u01d5\u01d6\t\32\2\2\u01d6\u009c\3\2\2\2\u01d7"+
		"\u01d8\t\33\2\2\u01d8\u009e\3\2\2\2\u01d9\u01da\t\34\2\2\u01da\u00a0\3"+
		"\2\2\2\u01db\u01dc\t\35\2\2\u01dc\u00a2\3\2\2\2\u01dd\u01de\t\36\2\2\u01de"+
		"\u00a4\3\2\2\2\u01df\u01e3\t\37\2\2\u01e0\u01e2\t \2\2\u01e1\u01e0\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u00a6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\t!\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\bT\2\2\u01ec\u00a8\3\2\2\2\21\2\u00c8\u00cd"+
		"\u00d2\u00d7\u00da\u00dd\u00e0\u00e3\u00e8\u00f4\u00fa\u0141\u01e3\u01e9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
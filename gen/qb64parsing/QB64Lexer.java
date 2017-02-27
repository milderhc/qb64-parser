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
		T__0=1, INTEGERSUFFIX=2, LONGSUFFIX=3, SINGLESUFFIX=4, DOUBLESUFFIX=5, 
		STRINGSUFFIX=6, INTEGERVALUE=7, LONGVALUE=8, SINGLEVALUE=9, DOUBLEVALUE=10, 
		STRINGVALUE=11, EQUALOP=12, POTOP=13, DIVOP=14, PRODUCTOP=15, ADDOP=16, 
		SUBOP=17, DIFFOP=18, LESSOP=19, LESSOREQUALOP=20, GREATER=21, GREATEROREQUAL=22, 
		SEMICOLON=23, COLON=24, COMMA=25, LEFTPAR=26, RIGHTPAR=27, INPUT=28, PRINT=29, 
		IF=30, THEN=31, ELSE=32, END=33, WHILE=34, WEND=35, DO=36, LOOP=37, UNTIL=38, 
		FOR=39, TO=40, STEP=41, NEXT=42, INTEGER=43, SINGLE=44, DOUBLE=45, LONG=46, 
		STRING=47, DIM=48, AS=49, NOT=50, OR=51, AND=52, XOR=53, MOD=54, SUB=55, 
		FUNCTION=56, IDPREFIX=57, COMMENT=58, WS=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", 
		"STRINGSUFFIX", "INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", 
		"STRINGVALUE", "EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", 
		"DIFFOP", "LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", 
		"COLON", "COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", 
		"ELSE", "END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", 
		"NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", "AS", 
		"NOT", "OR", "AND", "XOR", "MOD", "SUB", "FUNCTION", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z", "IDPREFIX", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'skdjfksdf'", "'%'", "'&'", "'!'", "'#'", "'$'", null, null, null, 
		null, null, "'='", null, "'/'", "'*'", null, null, "'<>'", "'<'", "'<='", 
		"'>'", "'>='", "';'", "':'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", 
		"STRINGSUFFIX", "INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", 
		"STRINGVALUE", "EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", 
		"DIFFOP", "LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", 
		"COLON", "COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", 
		"ELSE", "END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", 
		"NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", "AS", 
		"NOT", "OR", "AND", "XOR", "MOD", "SUB", "FUNCTION", "IDPREFIX", "COMMENT", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u01fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b\u00c3\n\b\r\b\16\b\u00c4\3\t\6\t\u00c8"+
		"\n\t\r\t\16\t\u00c9\3\n\6\n\u00cd\n\n\r\n\16\n\u00ce\3\n\3\n\3\n\5\n\u00d4"+
		"\n\n\3\n\5\n\u00d7\n\n\3\n\5\n\u00da\n\n\3\n\5\n\u00dd\n\n\3\n\5\n\u00e0"+
		"\n\n\3\13\6\13\u00e3\n\13\r\13\16\13\u00e4\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\6\13\u00ef\n\13\r\13\16\13\u00f0\3\f\3\f\7\f\u00f5\n\f\f"+
		"\f\16\f\u00f8\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>"+
		"\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J"+
		"\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\7T\u01e5"+
		"\nT\fT\16T\u01e8\13T\3U\3U\3U\3U\7U\u01ee\nU\fU\16U\u01f1\13U\3U\3U\3"+
		"V\6V\u01f6\nV\rV\16V\u01f7\3V\3V\2\2W\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s\2u\2w\2y\2{\2}\2\177\2\u0081"+
		"\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093"+
		"\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7;\u00a9<\u00ab=\3\2#\3\2\62;\3\2\60\60\4\2$$))\4\2CCcc\4\2DDd"+
		"d\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2"+
		"MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\6\2"+
		"\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u01ee\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2\2\5\u00b7"+
		"\3\2\2\2\7\u00b9\3\2\2\2\t\u00bb\3\2\2\2\13\u00bd\3\2\2\2\r\u00bf\3\2"+
		"\2\2\17\u00c2\3\2\2\2\21\u00c7\3\2\2\2\23\u00cc\3\2\2\2\25\u00e2\3\2\2"+
		"\2\27\u00f2\3\2\2\2\31\u00fb\3\2\2\2\33\u00fd\3\2\2\2\35\u00ff\3\2\2\2"+
		"\37\u0101\3\2\2\2!\u0103\3\2\2\2#\u0105\3\2\2\2%\u0107\3\2\2\2\'\u010a"+
		"\3\2\2\2)\u010c\3\2\2\2+\u010f\3\2\2\2-\u0111\3\2\2\2/\u0114\3\2\2\2\61"+
		"\u0116\3\2\2\2\63\u0118\3\2\2\2\65\u011a\3\2\2\2\67\u011c\3\2\2\29\u011e"+
		"\3\2\2\2;\u0124\3\2\2\2=\u012a\3\2\2\2?\u012d\3\2\2\2A\u0132\3\2\2\2C"+
		"\u0137\3\2\2\2E\u013b\3\2\2\2G\u0141\3\2\2\2I\u0146\3\2\2\2K\u0149\3\2"+
		"\2\2M\u014e\3\2\2\2O\u0154\3\2\2\2Q\u0158\3\2\2\2S\u015b\3\2\2\2U\u0160"+
		"\3\2\2\2W\u0165\3\2\2\2Y\u016d\3\2\2\2[\u0174\3\2\2\2]\u017b\3\2\2\2_"+
		"\u0180\3\2\2\2a\u0187\3\2\2\2c\u018b\3\2\2\2e\u018e\3\2\2\2g\u0192\3\2"+
		"\2\2i\u0195\3\2\2\2k\u0199\3\2\2\2m\u019d\3\2\2\2o\u01a1\3\2\2\2q\u01a5"+
		"\3\2\2\2s\u01ae\3\2\2\2u\u01b0\3\2\2\2w\u01b2\3\2\2\2y\u01b4\3\2\2\2{"+
		"\u01b6\3\2\2\2}\u01b8\3\2\2\2\177\u01ba\3\2\2\2\u0081\u01bc\3\2\2\2\u0083"+
		"\u01be\3\2\2\2\u0085\u01c0\3\2\2\2\u0087\u01c2\3\2\2\2\u0089\u01c4\3\2"+
		"\2\2\u008b\u01c6\3\2\2\2\u008d\u01c8\3\2\2\2\u008f\u01ca\3\2\2\2\u0091"+
		"\u01cc\3\2\2\2\u0093\u01ce\3\2\2\2\u0095\u01d0\3\2\2\2\u0097\u01d2\3\2"+
		"\2\2\u0099\u01d4\3\2\2\2\u009b\u01d6\3\2\2\2\u009d\u01d8\3\2\2\2\u009f"+
		"\u01da\3\2\2\2\u00a1\u01dc\3\2\2\2\u00a3\u01de\3\2\2\2\u00a5\u01e0\3\2"+
		"\2\2\u00a7\u01e2\3\2\2\2\u00a9\u01e9\3\2\2\2\u00ab\u01f5\3\2\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7l\2\2"+
		"\u00b1\u00b2\7h\2\2\u00b2\u00b3\7m\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5"+
		"\7f\2\2\u00b5\u00b6\7h\2\2\u00b6\4\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8\6"+
		"\3\2\2\2\u00b9\u00ba\7(\2\2\u00ba\b\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\n"+
		"\3\2\2\2\u00bd\u00be\7%\2\2\u00be\f\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\16"+
		"\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\20\3\2\2\2\u00c6\u00c8\t\2\2"+
		"\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\22\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\t\3\2\2\u00d1\u00d3\t\2\2\2\u00d2\u00d4\t\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\t\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00da\t\2\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00dd\t\2\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00e0\t\2\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\24\3\2\2\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\t\3\2\2\u00e7\u00e8\t\2\2\2\u00e8\u00e9\t\2\2\2\u00e9\u00ea\t\2"+
		"\2\2\u00ea\u00eb\t\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\u00ee\t\2\2\2\u00ed"+
		"\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\26\3\2\2\2\u00f2\u00f6\7$\2\2\u00f3\u00f5"+
		"\n\4\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7$"+
		"\2\2\u00fa\30\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc\32\3\2\2\2\u00fd\u00fe"+
		"\7`\2\2\u00fe\34\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\36\3\2\2\2\u0101\u0102"+
		"\7,\2\2\u0102 \3\2\2\2\u0103\u0104\7-\2\2\u0104\"\3\2\2\2\u0105\u0106"+
		"\7/\2\2\u0106$\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109\7@\2\2\u0109&\3"+
		"\2\2\2\u010a\u010b\7>\2\2\u010b(\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e"+
		"\7?\2\2\u010e*\3\2\2\2\u010f\u0110\7@\2\2\u0110,\3\2\2\2\u0111\u0112\7"+
		"@\2\2\u0112\u0113\7?\2\2\u0113.\3\2\2\2\u0114\u0115\7=\2\2\u0115\60\3"+
		"\2\2\2\u0116\u0117\7<\2\2\u0117\62\3\2\2\2\u0118\u0119\7.\2\2\u0119\64"+
		"\3\2\2\2\u011a\u011b\7*\2\2\u011b\66\3\2\2\2\u011c\u011d\7+\2\2\u011d"+
		"8\3\2\2\2\u011e\u011f\5\u0083B\2\u011f\u0120\5\u008dG\2\u0120\u0121\5"+
		"\u0091I\2\u0121\u0122\5\u009bN\2\u0122\u0123\5\u0099M\2\u0123:\3\2\2\2"+
		"\u0124\u0125\5\u0091I\2\u0125\u0126\5\u0095K\2\u0126\u0127\5\u0083B\2"+
		"\u0127\u0128\5\u008dG\2\u0128\u0129\5\u0099M\2\u0129<\3\2\2\2\u012a\u012b"+
		"\5\u0083B\2\u012b\u012c\5}?\2\u012c>\3\2\2\2\u012d\u012e\5\u0099M\2\u012e"+
		"\u012f\5\u0081A\2\u012f\u0130\5{>\2\u0130\u0131\5\u008dG\2\u0131@\3\2"+
		"\2\2\u0132\u0133\5{>\2\u0133\u0134\5\u0089E\2\u0134\u0135\5\u0097L\2\u0135"+
		"\u0136\5{>\2\u0136B\3\2\2\2\u0137\u0138\5{>\2\u0138\u0139\5\u008dG\2\u0139"+
		"\u013a\5y=\2\u013aD\3\2\2\2\u013b\u013c\5\u009fP\2\u013c\u013d\5\u0081"+
		"A\2\u013d\u013e\5\u0083B\2\u013e\u013f\5\u0089E\2\u013f\u0140\5{>\2\u0140"+
		"F\3\2\2\2\u0141\u0142\5\u009fP\2\u0142\u0143\5{>\2\u0143\u0144\5\u008d"+
		"G\2\u0144\u0145\5y=\2\u0145H\3\2\2\2\u0146\u0147\5y=\2\u0147\u0148\5\u008f"+
		"H\2\u0148J\3\2\2\2\u0149\u014a\5\u0089E\2\u014a\u014b\5\u008fH\2\u014b"+
		"\u014c\5\u008fH\2\u014c\u014d\5\u0091I\2\u014dL\3\2\2\2\u014e\u014f\5"+
		"\u009bN\2\u014f\u0150\5\u008dG\2\u0150\u0151\5\u0099M\2\u0151\u0152\5"+
		"\u0083B\2\u0152\u0153\5\u0089E\2\u0153N\3\2\2\2\u0154\u0155\5}?\2\u0155"+
		"\u0156\5\u008fH\2\u0156\u0157\5\u0095K\2\u0157P\3\2\2\2\u0158\u0159\5"+
		"\u0099M\2\u0159\u015a\5\u008fH\2\u015aR\3\2\2\2\u015b\u015c\5\u0097L\2"+
		"\u015c\u015d\5\u0099M\2\u015d\u015e\5{>\2\u015e\u015f\5\u0091I\2\u015f"+
		"T\3\2\2\2\u0160\u0161\5\u008dG\2\u0161\u0162\5{>\2\u0162\u0163\5\u00a1"+
		"Q\2\u0163\u0164\5\u0099M\2\u0164V\3\2\2\2\u0165\u0166\5\u0083B\2\u0166"+
		"\u0167\5\u008dG\2\u0167\u0168\5\u0099M\2\u0168\u0169\5{>\2\u0169\u016a"+
		"\5\177@\2\u016a\u016b\5{>\2\u016b\u016c\5\u0095K\2\u016cX\3\2\2\2\u016d"+
		"\u016e\5\u0097L\2\u016e\u016f\5\u0083B\2\u016f\u0170\5\u008dG\2\u0170"+
		"\u0171\5\177@\2\u0171\u0172\5\u0089E\2\u0172\u0173\5{>\2\u0173Z\3\2\2"+
		"\2\u0174\u0175\5y=\2\u0175\u0176\5\u008fH\2\u0176\u0177\5\u009bN\2\u0177"+
		"\u0178\5u;\2\u0178\u0179\5\u0089E\2\u0179\u017a\5{>\2\u017a\\\3\2\2\2"+
		"\u017b\u017c\5\u0089E\2\u017c\u017d\5\u008fH\2\u017d\u017e\5\u008dG\2"+
		"\u017e\u017f\5\177@\2\u017f^\3\2\2\2\u0180\u0181\5\u0097L\2\u0181\u0182"+
		"\5\u0099M\2\u0182\u0183\5\u0095K\2\u0183\u0184\5\u0083B\2\u0184\u0185"+
		"\5\u008dG\2\u0185\u0186\5\177@\2\u0186`\3\2\2\2\u0187\u0188\5y=\2\u0188"+
		"\u0189\5\u0083B\2\u0189\u018a\5\u008bF\2\u018ab\3\2\2\2\u018b\u018c\5"+
		"s:\2\u018c\u018d\5\u0097L\2\u018dd\3\2\2\2\u018e\u018f\5\u008dG\2\u018f"+
		"\u0190\5\u008fH\2\u0190\u0191\5\u0099M\2\u0191f\3\2\2\2\u0192\u0193\5"+
		"\u008fH\2\u0193\u0194\5\u0095K\2\u0194h\3\2\2\2\u0195\u0196\5s:\2\u0196"+
		"\u0197\5\u008dG\2\u0197\u0198\5y=\2\u0198j\3\2\2\2\u0199\u019a\5\u00a1"+
		"Q\2\u019a\u019b\5\u008fH\2\u019b\u019c\5\u0095K\2\u019cl\3\2\2\2\u019d"+
		"\u019e\5\u008bF\2\u019e\u019f\5\u008fH\2\u019f\u01a0\5y=\2\u01a0n\3\2"+
		"\2\2\u01a1\u01a2\5\u0097L\2\u01a2\u01a3\5\u009bN\2\u01a3\u01a4\5u;\2\u01a4"+
		"p\3\2\2\2\u01a5\u01a6\5}?\2\u01a6\u01a7\5\u009bN\2\u01a7\u01a8\5\u008d"+
		"G\2\u01a8\u01a9\5w<\2\u01a9\u01aa\5\u0099M\2\u01aa\u01ab\5\u0083B\2\u01ab"+
		"\u01ac\5\u008fH\2\u01ac\u01ad\5\u008dG\2\u01adr\3\2\2\2\u01ae\u01af\t"+
		"\5\2\2\u01aft\3\2\2\2\u01b0\u01b1\t\6\2\2\u01b1v\3\2\2\2\u01b2\u01b3\t"+
		"\7\2\2\u01b3x\3\2\2\2\u01b4\u01b5\t\b\2\2\u01b5z\3\2\2\2\u01b6\u01b7\t"+
		"\t\2\2\u01b7|\3\2\2\2\u01b8\u01b9\t\n\2\2\u01b9~\3\2\2\2\u01ba\u01bb\t"+
		"\13\2\2\u01bb\u0080\3\2\2\2\u01bc\u01bd\t\f\2\2\u01bd\u0082\3\2\2\2\u01be"+
		"\u01bf\t\r\2\2\u01bf\u0084\3\2\2\2\u01c0\u01c1\t\16\2\2\u01c1\u0086\3"+
		"\2\2\2\u01c2\u01c3\t\17\2\2\u01c3\u0088\3\2\2\2\u01c4\u01c5\t\20\2\2\u01c5"+
		"\u008a\3\2\2\2\u01c6\u01c7\t\21\2\2\u01c7\u008c\3\2\2\2\u01c8\u01c9\t"+
		"\22\2\2\u01c9\u008e\3\2\2\2\u01ca\u01cb\t\23\2\2\u01cb\u0090\3\2\2\2\u01cc"+
		"\u01cd\t\24\2\2\u01cd\u0092\3\2\2\2\u01ce\u01cf\t\25\2\2\u01cf\u0094\3"+
		"\2\2\2\u01d0\u01d1\t\26\2\2\u01d1\u0096\3\2\2\2\u01d2\u01d3\t\27\2\2\u01d3"+
		"\u0098\3\2\2\2\u01d4\u01d5\t\30\2\2\u01d5\u009a\3\2\2\2\u01d6\u01d7\t"+
		"\31\2\2\u01d7\u009c\3\2\2\2\u01d8\u01d9\t\32\2\2\u01d9\u009e\3\2\2\2\u01da"+
		"\u01db\t\33\2\2\u01db\u00a0\3\2\2\2\u01dc\u01dd\t\34\2\2\u01dd\u00a2\3"+
		"\2\2\2\u01de\u01df\t\35\2\2\u01df\u00a4\3\2\2\2\u01e0\u01e1\t\36\2\2\u01e1"+
		"\u00a6\3\2\2\2\u01e2\u01e6\t\37\2\2\u01e3\u01e5\t \2\2\u01e4\u01e3\3\2"+
		"\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u00a8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7\61\2\2\u01ea\u01eb\7"+
		"\61\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ee\n!\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\bU\2\2\u01f3\u00aa\3\2\2\2\u01f4"+
		"\u01f6\t\"\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\bV\2\2\u01fa"+
		"\u00ac\3\2\2\2\21\2\u00c4\u00c9\u00ce\u00d3\u00d6\u00d9\u00dc\u00df\u00e4"+
		"\u00f0\u00f6\u01e6\u01ef\u01f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
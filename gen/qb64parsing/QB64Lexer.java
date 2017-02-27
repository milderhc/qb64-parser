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
		IF=31, THEN=32, ELSE=33, END=34, WHILE=35, WEND=36, DO=37, LOOP=38, UNTIL=39, 
		FOR=40, TO=41, STEP=42, NEXT=43, INTEGER=44, SINGLE=45, DOUBLE=46, LONG=47, 
		STRING=48, DIM=49, AS=50, NOT=51, OR=52, AND=53, XOR=54, MOD=55, SUB=56, 
		FUNCTION=57, IDPREFIX=58, COMMENT=59, WS=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", 
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
		null, "'skdjfksdf'", "'skdjf'", "'%'", "'&'", "'!'", "'#'", "'$'", null, 
		null, null, null, null, "'='", null, "'/'", "'*'", null, null, "'<>'", 
		"'<'", "'<='", "'>'", "'>='", "';'", "':'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u0203\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\u00cb\n\t"+
		"\r\t\16\t\u00cc\3\n\6\n\u00d0\n\n\r\n\16\n\u00d1\3\13\6\13\u00d5\n\13"+
		"\r\13\16\13\u00d6\3\13\3\13\3\13\5\13\u00dc\n\13\3\13\5\13\u00df\n\13"+
		"\3\13\5\13\u00e2\n\13\3\13\5\13\u00e5\n\13\3\13\5\13\u00e8\n\13\3\f\6"+
		"\f\u00eb\n\f\r\f\16\f\u00ec\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00f7"+
		"\n\f\r\f\16\f\u00f8\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100\13\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D"+
		"\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O"+
		"\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\7U\u01ed\nU\fU\16U\u01f0\13U\3V\3"+
		"V\3V\3V\7V\u01f6\nV\fV\16V\u01f9\13V\3V\3V\3W\6W\u01fe\nW\rW\16W\u01ff"+
		"\3W\3W\2\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2"+
		"\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9<\u00ab"+
		"=\u00ad>\3\2#\3\2\62;\3\2\60\60\4\2$$))\4\2CCcc\4\2DDdd\4\2EEee\4\2FF"+
		"ff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\u01f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\3\u00af\3\2\2\2\5\u00b9"+
		"\3\2\2\2\7\u00bf\3\2\2\2\t\u00c1\3\2\2\2\13\u00c3\3\2\2\2\r\u00c5\3\2"+
		"\2\2\17\u00c7\3\2\2\2\21\u00ca\3\2\2\2\23\u00cf\3\2\2\2\25\u00d4\3\2\2"+
		"\2\27\u00ea\3\2\2\2\31\u00fa\3\2\2\2\33\u0103\3\2\2\2\35\u0105\3\2\2\2"+
		"\37\u0107\3\2\2\2!\u0109\3\2\2\2#\u010b\3\2\2\2%\u010d\3\2\2\2\'\u010f"+
		"\3\2\2\2)\u0112\3\2\2\2+\u0114\3\2\2\2-\u0117\3\2\2\2/\u0119\3\2\2\2\61"+
		"\u011c\3\2\2\2\63\u011e\3\2\2\2\65\u0120\3\2\2\2\67\u0122\3\2\2\29\u0124"+
		"\3\2\2\2;\u0126\3\2\2\2=\u012c\3\2\2\2?\u0132\3\2\2\2A\u0135\3\2\2\2C"+
		"\u013a\3\2\2\2E\u013f\3\2\2\2G\u0143\3\2\2\2I\u0149\3\2\2\2K\u014e\3\2"+
		"\2\2M\u0151\3\2\2\2O\u0156\3\2\2\2Q\u015c\3\2\2\2S\u0160\3\2\2\2U\u0163"+
		"\3\2\2\2W\u0168\3\2\2\2Y\u016d\3\2\2\2[\u0175\3\2\2\2]\u017c\3\2\2\2_"+
		"\u0183\3\2\2\2a\u0188\3\2\2\2c\u018f\3\2\2\2e\u0193\3\2\2\2g\u0196\3\2"+
		"\2\2i\u019a\3\2\2\2k\u019d\3\2\2\2m\u01a1\3\2\2\2o\u01a5\3\2\2\2q\u01a9"+
		"\3\2\2\2s\u01ad\3\2\2\2u\u01b6\3\2\2\2w\u01b8\3\2\2\2y\u01ba\3\2\2\2{"+
		"\u01bc\3\2\2\2}\u01be\3\2\2\2\177\u01c0\3\2\2\2\u0081\u01c2\3\2\2\2\u0083"+
		"\u01c4\3\2\2\2\u0085\u01c6\3\2\2\2\u0087\u01c8\3\2\2\2\u0089\u01ca\3\2"+
		"\2\2\u008b\u01cc\3\2\2\2\u008d\u01ce\3\2\2\2\u008f\u01d0\3\2\2\2\u0091"+
		"\u01d2\3\2\2\2\u0093\u01d4\3\2\2\2\u0095\u01d6\3\2\2\2\u0097\u01d8\3\2"+
		"\2\2\u0099\u01da\3\2\2\2\u009b\u01dc\3\2\2\2\u009d\u01de\3\2\2\2\u009f"+
		"\u01e0\3\2\2\2\u00a1\u01e2\3\2\2\2\u00a3\u01e4\3\2\2\2\u00a5\u01e6\3\2"+
		"\2\2\u00a7\u01e8\3\2\2\2\u00a9\u01ea\3\2\2\2\u00ab\u01f1\3\2\2\2\u00ad"+
		"\u01fd\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7m\2\2\u00b1\u00b2\7f\2"+
		"\2\u00b2\u00b3\7l\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7m\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7h\2\2\u00b8\4\3\2\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7m\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7l\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\6\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0\b\3\2\2\2\u00c1"+
		"\u00c2\7(\2\2\u00c2\n\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\f\3\2\2\2\u00c5"+
		"\u00c6\7%\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\7&\2\2\u00c8\20\3\2\2\2\u00c9"+
		"\u00cb\t\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\22\3\2\2\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\24\3\2\2\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2"+
		"\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\t\3\2\2\u00d9\u00db\t\2\2\2\u00da\u00dc\t\2\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\t\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\t\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\t\2"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e8\t\2\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\26\3\2\2"+
		"\2\u00e9\u00eb\t\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\t\3\2\2\u00ef"+
		"\u00f0\t\2\2\2\u00f0\u00f1\t\2\2\2\u00f1\u00f2\t\2\2\2\u00f2\u00f3\t\2"+
		"\2\2\u00f3\u00f4\t\2\2\2\u00f4\u00f6\t\2\2\2\u00f5\u00f7\t\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\30\3\2\2\2\u00fa\u00fe\7$\2\2\u00fb\u00fd\n\4\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7$\2\2\u0102\32\3\2\2\2"+
		"\u0103\u0104\7?\2\2\u0104\34\3\2\2\2\u0105\u0106\7`\2\2\u0106\36\3\2\2"+
		"\2\u0107\u0108\7\61\2\2\u0108 \3\2\2\2\u0109\u010a\7,\2\2\u010a\"\3\2"+
		"\2\2\u010b\u010c\7-\2\2\u010c$\3\2\2\2\u010d\u010e\7/\2\2\u010e&\3\2\2"+
		"\2\u010f\u0110\7>\2\2\u0110\u0111\7@\2\2\u0111(\3\2\2\2\u0112\u0113\7"+
		">\2\2\u0113*\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7?\2\2\u0116,\3\2"+
		"\2\2\u0117\u0118\7@\2\2\u0118.\3\2\2\2\u0119\u011a\7@\2\2\u011a\u011b"+
		"\7?\2\2\u011b\60\3\2\2\2\u011c\u011d\7=\2\2\u011d\62\3\2\2\2\u011e\u011f"+
		"\7<\2\2\u011f\64\3\2\2\2\u0120\u0121\7.\2\2\u0121\66\3\2\2\2\u0122\u0123"+
		"\7*\2\2\u01238\3\2\2\2\u0124\u0125\7+\2\2\u0125:\3\2\2\2\u0126\u0127\5"+
		"\u0085C\2\u0127\u0128\5\u008fH\2\u0128\u0129\5\u0093J\2\u0129\u012a\5"+
		"\u009dO\2\u012a\u012b\5\u009bN\2\u012b<\3\2\2\2\u012c\u012d\5\u0093J\2"+
		"\u012d\u012e\5\u0097L\2\u012e\u012f\5\u0085C\2\u012f\u0130\5\u008fH\2"+
		"\u0130\u0131\5\u009bN\2\u0131>\3\2\2\2\u0132\u0133\5\u0085C\2\u0133\u0134"+
		"\5\177@\2\u0134@\3\2\2\2\u0135\u0136\5\u009bN\2\u0136\u0137\5\u0083B\2"+
		"\u0137\u0138\5}?\2\u0138\u0139\5\u008fH\2\u0139B\3\2\2\2\u013a\u013b\5"+
		"}?\2\u013b\u013c\5\u008bF\2\u013c\u013d\5\u0099M\2\u013d\u013e\5}?\2\u013e"+
		"D\3\2\2\2\u013f\u0140\5}?\2\u0140\u0141\5\u008fH\2\u0141\u0142\5{>\2\u0142"+
		"F\3\2\2\2\u0143\u0144\5\u00a1Q\2\u0144\u0145\5\u0083B\2\u0145\u0146\5"+
		"\u0085C\2\u0146\u0147\5\u008bF\2\u0147\u0148\5}?\2\u0148H\3\2\2\2\u0149"+
		"\u014a\5\u00a1Q\2\u014a\u014b\5}?\2\u014b\u014c\5\u008fH\2\u014c\u014d"+
		"\5{>\2\u014dJ\3\2\2\2\u014e\u014f\5{>\2\u014f\u0150\5\u0091I\2\u0150L"+
		"\3\2\2\2\u0151\u0152\5\u008bF\2\u0152\u0153\5\u0091I\2\u0153\u0154\5\u0091"+
		"I\2\u0154\u0155\5\u0093J\2\u0155N\3\2\2\2\u0156\u0157\5\u009dO\2\u0157"+
		"\u0158\5\u008fH\2\u0158\u0159\5\u009bN\2\u0159\u015a\5\u0085C\2\u015a"+
		"\u015b\5\u008bF\2\u015bP\3\2\2\2\u015c\u015d\5\177@\2\u015d\u015e\5\u0091"+
		"I\2\u015e\u015f\5\u0097L\2\u015fR\3\2\2\2\u0160\u0161\5\u009bN\2\u0161"+
		"\u0162\5\u0091I\2\u0162T\3\2\2\2\u0163\u0164\5\u0099M\2\u0164\u0165\5"+
		"\u009bN\2\u0165\u0166\5}?\2\u0166\u0167\5\u0093J\2\u0167V\3\2\2\2\u0168"+
		"\u0169\5\u008fH\2\u0169\u016a\5}?\2\u016a\u016b\5\u00a3R\2\u016b\u016c"+
		"\5\u009bN\2\u016cX\3\2\2\2\u016d\u016e\5\u0085C\2\u016e\u016f\5\u008f"+
		"H\2\u016f\u0170\5\u009bN\2\u0170\u0171\5}?\2\u0171\u0172\5\u0081A\2\u0172"+
		"\u0173\5}?\2\u0173\u0174\5\u0097L\2\u0174Z\3\2\2\2\u0175\u0176\5\u0099"+
		"M\2\u0176\u0177\5\u0085C\2\u0177\u0178\5\u008fH\2\u0178\u0179\5\u0081"+
		"A\2\u0179\u017a\5\u008bF\2\u017a\u017b\5}?\2\u017b\\\3\2\2\2\u017c\u017d"+
		"\5{>\2\u017d\u017e\5\u0091I\2\u017e\u017f\5\u009dO\2\u017f\u0180\5w<\2"+
		"\u0180\u0181\5\u008bF\2\u0181\u0182\5}?\2\u0182^\3\2\2\2\u0183\u0184\5"+
		"\u008bF\2\u0184\u0185\5\u0091I\2\u0185\u0186\5\u008fH\2\u0186\u0187\5"+
		"\u0081A\2\u0187`\3\2\2\2\u0188\u0189\5\u0099M\2\u0189\u018a\5\u009bN\2"+
		"\u018a\u018b\5\u0097L\2\u018b\u018c\5\u0085C\2\u018c\u018d\5\u008fH\2"+
		"\u018d\u018e\5\u0081A\2\u018eb\3\2\2\2\u018f\u0190\5{>\2\u0190\u0191\5"+
		"\u0085C\2\u0191\u0192\5\u008dG\2\u0192d\3\2\2\2\u0193\u0194\5u;\2\u0194"+
		"\u0195\5\u0099M\2\u0195f\3\2\2\2\u0196\u0197\5\u008fH\2\u0197\u0198\5"+
		"\u0091I\2\u0198\u0199\5\u009bN\2\u0199h\3\2\2\2\u019a\u019b\5\u0091I\2"+
		"\u019b\u019c\5\u0097L\2\u019cj\3\2\2\2\u019d\u019e\5u;\2\u019e\u019f\5"+
		"\u008fH\2\u019f\u01a0\5{>\2\u01a0l\3\2\2\2\u01a1\u01a2\5\u00a3R\2\u01a2"+
		"\u01a3\5\u0091I\2\u01a3\u01a4\5\u0097L\2\u01a4n\3\2\2\2\u01a5\u01a6\5"+
		"\u008dG\2\u01a6\u01a7\5\u0091I\2\u01a7\u01a8\5{>\2\u01a8p\3\2\2\2\u01a9"+
		"\u01aa\5\u0099M\2\u01aa\u01ab\5\u009dO\2\u01ab\u01ac\5w<\2\u01acr\3\2"+
		"\2\2\u01ad\u01ae\5\177@\2\u01ae\u01af\5\u009dO\2\u01af\u01b0\5\u008fH"+
		"\2\u01b0\u01b1\5y=\2\u01b1\u01b2\5\u009bN\2\u01b2\u01b3\5\u0085C\2\u01b3"+
		"\u01b4\5\u0091I\2\u01b4\u01b5\5\u008fH\2\u01b5t\3\2\2\2\u01b6\u01b7\t"+
		"\5\2\2\u01b7v\3\2\2\2\u01b8\u01b9\t\6\2\2\u01b9x\3\2\2\2\u01ba\u01bb\t"+
		"\7\2\2\u01bbz\3\2\2\2\u01bc\u01bd\t\b\2\2\u01bd|\3\2\2\2\u01be\u01bf\t"+
		"\t\2\2\u01bf~\3\2\2\2\u01c0\u01c1\t\n\2\2\u01c1\u0080\3\2\2\2\u01c2\u01c3"+
		"\t\13\2\2\u01c3\u0082\3\2\2\2\u01c4\u01c5\t\f\2\2\u01c5\u0084\3\2\2\2"+
		"\u01c6\u01c7\t\r\2\2\u01c7\u0086\3\2\2\2\u01c8\u01c9\t\16\2\2\u01c9\u0088"+
		"\3\2\2\2\u01ca\u01cb\t\17\2\2\u01cb\u008a\3\2\2\2\u01cc\u01cd\t\20\2\2"+
		"\u01cd\u008c\3\2\2\2\u01ce\u01cf\t\21\2\2\u01cf\u008e\3\2\2\2\u01d0\u01d1"+
		"\t\22\2\2\u01d1\u0090\3\2\2\2\u01d2\u01d3\t\23\2\2\u01d3\u0092\3\2\2\2"+
		"\u01d4\u01d5\t\24\2\2\u01d5\u0094\3\2\2\2\u01d6\u01d7\t\25\2\2\u01d7\u0096"+
		"\3\2\2\2\u01d8\u01d9\t\26\2\2\u01d9\u0098\3\2\2\2\u01da\u01db\t\27\2\2"+
		"\u01db\u009a\3\2\2\2\u01dc\u01dd\t\30\2\2\u01dd\u009c\3\2\2\2\u01de\u01df"+
		"\t\31\2\2\u01df\u009e\3\2\2\2\u01e0\u01e1\t\32\2\2\u01e1\u00a0\3\2\2\2"+
		"\u01e2\u01e3\t\33\2\2\u01e3\u00a2\3\2\2\2\u01e4\u01e5\t\34\2\2\u01e5\u00a4"+
		"\3\2\2\2\u01e6\u01e7\t\35\2\2\u01e7\u00a6\3\2\2\2\u01e8\u01e9\t\36\2\2"+
		"\u01e9\u00a8\3\2\2\2\u01ea\u01ee\t\37\2\2\u01eb\u01ed\t \2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u00aa\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7\61\2\2\u01f2\u01f3\7"+
		"\61\2\2\u01f3\u01f7\3\2\2\2\u01f4\u01f6\n!\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\bV\2\2\u01fb\u00ac\3\2\2\2\u01fc"+
		"\u01fe\t\"\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\bW\2\2\u0202"+
		"\u00ae\3\2\2\2\21\2\u00cc\u00d1\u00d6\u00db\u00de\u00e1\u00e4\u00e7\u00ec"+
		"\u00f8\u00fe\u01ee\u01f7\u01ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
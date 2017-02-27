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
		INTEGERSUFFIX=1, LONGSUFFIX=2, SINGLESUFFIX=3, DOUBLESUFFIX=4, STRINGSUFFIX=5, 
		INTEGERVALUE=6, LONGVALUE=7, SINGLEVALUE=8, DOUBLEVALUE=9, STRINGVALUE=10, 
		EQUALOP=11, POTOP=12, DIVOP=13, PRODUCTOP=14, ADDOP=15, SUBOP=16, DIFFOP=17, 
		LESSOP=18, LESSOREQUALOP=19, GREATER=20, GREATEROREQUAL=21, SEMICOLON=22, 
		COLON=23, COMMA=24, LEFTPAR=25, RIGHTPAR=26, INPUT=27, PRINT=28, IF=29, 
		THEN=30, ELSE=31, END=32, WHILE=33, WEND=34, DO=35, LOOP=36, UNTIL=37, 
		FOR=38, TO=39, STEP=40, NEXT=41, INTEGER=42, SINGLE=43, DOUBLE=44, LONG=45, 
		STRING=46, DIM=47, AS=48, NOT=49, OR=50, AND=51, XOR=52, MOD=53, SUB=54, 
		FUNCTION=55, IDPREFIX=56, COMMENT=57, WS=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", "STRINGSUFFIX", 
		"INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", "STRINGVALUE", 
		"EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", "DIFFOP", 
		"LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", "COLON", 
		"COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", "ELSE", 
		"END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", 
		"INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", "AS", "NOT", "OR", 
		"AND", "XOR", "MOD", "SUB", "FUNCTION", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "IDPREFIX", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'!'", "'#'", "'$'", null, null, null, null, null, 
		"'='", null, "'/'", "'*'", null, null, "'<>'", "'<'", "'<='", "'>'", "'>='", 
		"';'", "':'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", "STRINGSUFFIX", 
		"INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", "STRINGVALUE", 
		"EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", "DIFFOP", 
		"LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", "COLON", 
		"COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", "ELSE", 
		"END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", 
		"INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", "AS", "NOT", "OR", 
		"AND", "XOR", "MOD", "SUB", "FUNCTION", "IDPREFIX", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u01ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7\u00b7\n\7\r\7\16"+
		"\7\u00b8\3\b\6\b\u00bc\n\b\r\b\16\b\u00bd\3\t\6\t\u00c1\n\t\r\t\16\t\u00c2"+
		"\3\t\3\t\3\t\5\t\u00c8\n\t\3\t\5\t\u00cb\n\t\3\t\5\t\u00ce\n\t\3\t\5\t"+
		"\u00d1\n\t\3\t\5\t\u00d4\n\t\3\n\6\n\u00d7\n\n\r\n\16\n\u00d8\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00e3\n\n\r\n\16\n\u00e4\3\13\3\13\7\13\u00e9"+
		"\n\13\f\13\16\13\u00ec\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\3:\3:"+
		"\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q"+
		"\3R\3R\3S\3S\7S\u01d9\nS\fS\16S\u01dc\13S\3T\3T\7T\u01e0\nT\fT\16T\u01e3"+
		"\13T\3T\3T\3U\6U\u01e8\nU\rU\16U\u01e9\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2s\2u\2w\2y\2{\2}\2"+
		"\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2"+
		"\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1"+
		"\2\u00a3\2\u00a5:\u00a7;\u00a9<\3\2#\3\2\62;\3\2\60\60\4\2$$))\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C"+
		"\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u01e0\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00ad"+
		"\3\2\2\2\7\u00af\3\2\2\2\t\u00b1\3\2\2\2\13\u00b3\3\2\2\2\r\u00b6\3\2"+
		"\2\2\17\u00bb\3\2\2\2\21\u00c0\3\2\2\2\23\u00d6\3\2\2\2\25\u00e6\3\2\2"+
		"\2\27\u00ef\3\2\2\2\31\u00f1\3\2\2\2\33\u00f3\3\2\2\2\35\u00f5\3\2\2\2"+
		"\37\u00f7\3\2\2\2!\u00f9\3\2\2\2#\u00fb\3\2\2\2%\u00fe\3\2\2\2\'\u0100"+
		"\3\2\2\2)\u0103\3\2\2\2+\u0105\3\2\2\2-\u0108\3\2\2\2/\u010a\3\2\2\2\61"+
		"\u010c\3\2\2\2\63\u010e\3\2\2\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0118"+
		"\3\2\2\2;\u011e\3\2\2\2=\u0121\3\2\2\2?\u0126\3\2\2\2A\u012b\3\2\2\2C"+
		"\u012f\3\2\2\2E\u0135\3\2\2\2G\u013a\3\2\2\2I\u013d\3\2\2\2K\u0142\3\2"+
		"\2\2M\u0148\3\2\2\2O\u014c\3\2\2\2Q\u014f\3\2\2\2S\u0154\3\2\2\2U\u0159"+
		"\3\2\2\2W\u0161\3\2\2\2Y\u0168\3\2\2\2[\u016f\3\2\2\2]\u0174\3\2\2\2_"+
		"\u017b\3\2\2\2a\u017f\3\2\2\2c\u0182\3\2\2\2e\u0186\3\2\2\2g\u0189\3\2"+
		"\2\2i\u018d\3\2\2\2k\u0191\3\2\2\2m\u0195\3\2\2\2o\u0199\3\2\2\2q\u01a2"+
		"\3\2\2\2s\u01a4\3\2\2\2u\u01a6\3\2\2\2w\u01a8\3\2\2\2y\u01aa\3\2\2\2{"+
		"\u01ac\3\2\2\2}\u01ae\3\2\2\2\177\u01b0\3\2\2\2\u0081\u01b2\3\2\2\2\u0083"+
		"\u01b4\3\2\2\2\u0085\u01b6\3\2\2\2\u0087\u01b8\3\2\2\2\u0089\u01ba\3\2"+
		"\2\2\u008b\u01bc\3\2\2\2\u008d\u01be\3\2\2\2\u008f\u01c0\3\2\2\2\u0091"+
		"\u01c2\3\2\2\2\u0093\u01c4\3\2\2\2\u0095\u01c6\3\2\2\2\u0097\u01c8\3\2"+
		"\2\2\u0099\u01ca\3\2\2\2\u009b\u01cc\3\2\2\2\u009d\u01ce\3\2\2\2\u009f"+
		"\u01d0\3\2\2\2\u00a1\u01d2\3\2\2\2\u00a3\u01d4\3\2\2\2\u00a5\u01d6\3\2"+
		"\2\2\u00a7\u01dd\3\2\2\2\u00a9\u01e7\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac"+
		"\4\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7#\2\2\u00b0"+
		"\b\3\2\2\2\u00b1\u00b2\7%\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7&\2\2\u00b4"+
		"\f\3\2\2\2\u00b5\u00b7\t\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\16\3\2\2\2\u00ba\u00bc"+
		"\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\20\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c8\t\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\t\2"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00d1\t\2\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\22\3\2\2\2\u00d5\u00d7\t\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\t\3\2\2\u00db\u00dc\t\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\t\2"+
		"\2\2\u00de\u00df\t\2\2\2\u00df\u00e0\t\2\2\2\u00e0\u00e2\t\2\2\2\u00e1"+
		"\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\24\3\2\2\2\u00e6\u00ea\7$\2\2\u00e7\u00e9"+
		"\n\4\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$"+
		"\2\2\u00ee\26\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0\30\3\2\2\2\u00f1\u00f2"+
		"\7`\2\2\u00f2\32\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\34\3\2\2\2\u00f5\u00f6"+
		"\7,\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8 \3\2\2\2\u00f9\u00fa"+
		"\7/\2\2\u00fa\"\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7@\2\2\u00fd$\3"+
		"\2\2\2\u00fe\u00ff\7>\2\2\u00ff&\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102"+
		"\7?\2\2\u0102(\3\2\2\2\u0103\u0104\7@\2\2\u0104*\3\2\2\2\u0105\u0106\7"+
		"@\2\2\u0106\u0107\7?\2\2\u0107,\3\2\2\2\u0108\u0109\7=\2\2\u0109.\3\2"+
		"\2\2\u010a\u010b\7<\2\2\u010b\60\3\2\2\2\u010c\u010d\7.\2\2\u010d\62\3"+
		"\2\2\2\u010e\u010f\7*\2\2\u010f\64\3\2\2\2\u0110\u0111\7+\2\2\u0111\66"+
		"\3\2\2\2\u0112\u0113\5\u0081A\2\u0113\u0114\5\u008bF\2\u0114\u0115\5\u008f"+
		"H\2\u0115\u0116\5\u0099M\2\u0116\u0117\5\u0097L\2\u01178\3\2\2\2\u0118"+
		"\u0119\5\u008fH\2\u0119\u011a\5\u0093J\2\u011a\u011b\5\u0081A\2\u011b"+
		"\u011c\5\u008bF\2\u011c\u011d\5\u0097L\2\u011d:\3\2\2\2\u011e\u011f\5"+
		"\u0081A\2\u011f\u0120\5{>\2\u0120<\3\2\2\2\u0121\u0122\5\u0097L\2\u0122"+
		"\u0123\5\177@\2\u0123\u0124\5y=\2\u0124\u0125\5\u008bF\2\u0125>\3\2\2"+
		"\2\u0126\u0127\5y=\2\u0127\u0128\5\u0087D\2\u0128\u0129\5\u0095K\2\u0129"+
		"\u012a\5y=\2\u012a@\3\2\2\2\u012b\u012c\5y=\2\u012c\u012d\5\u008bF\2\u012d"+
		"\u012e\5w<\2\u012eB\3\2\2\2\u012f\u0130\5\u009dO\2\u0130\u0131\5\177@"+
		"\2\u0131\u0132\5\u0081A\2\u0132\u0133\5\u0087D\2\u0133\u0134\5y=\2\u0134"+
		"D\3\2\2\2\u0135\u0136\5\u009dO\2\u0136\u0137\5y=\2\u0137\u0138\5\u008b"+
		"F\2\u0138\u0139\5w<\2\u0139F\3\2\2\2\u013a\u013b\5w<\2\u013b\u013c\5\u008d"+
		"G\2\u013cH\3\2\2\2\u013d\u013e\5\u0087D\2\u013e\u013f\5\u008dG\2\u013f"+
		"\u0140\5\u008dG\2\u0140\u0141\5\u008fH\2\u0141J\3\2\2\2\u0142\u0143\5"+
		"\u0099M\2\u0143\u0144\5\u008bF\2\u0144\u0145\5\u0097L\2\u0145\u0146\5"+
		"\u0081A\2\u0146\u0147\5\u0087D\2\u0147L\3\2\2\2\u0148\u0149\5{>\2\u0149"+
		"\u014a\5\u008dG\2\u014a\u014b\5\u0093J\2\u014bN\3\2\2\2\u014c\u014d\5"+
		"\u0097L\2\u014d\u014e\5\u008dG\2\u014eP\3\2\2\2\u014f\u0150\5\u0095K\2"+
		"\u0150\u0151\5\u0097L\2\u0151\u0152\5y=\2\u0152\u0153\5\u008fH\2\u0153"+
		"R\3\2\2\2\u0154\u0155\5\u008bF\2\u0155\u0156\5y=\2\u0156\u0157\5\u009f"+
		"P\2\u0157\u0158\5\u0097L\2\u0158T\3\2\2\2\u0159\u015a\5\u0081A\2\u015a"+
		"\u015b\5\u008bF\2\u015b\u015c\5\u0097L\2\u015c\u015d\5y=\2\u015d\u015e"+
		"\5}?\2\u015e\u015f\5y=\2\u015f\u0160\5\u0093J\2\u0160V\3\2\2\2\u0161\u0162"+
		"\5\u0095K\2\u0162\u0163\5\u0081A\2\u0163\u0164\5\u008bF\2\u0164\u0165"+
		"\5}?\2\u0165\u0166\5\u0087D\2\u0166\u0167\5y=\2\u0167X\3\2\2\2\u0168\u0169"+
		"\5w<\2\u0169\u016a\5\u008dG\2\u016a\u016b\5\u0099M\2\u016b\u016c\5s:\2"+
		"\u016c\u016d\5\u0087D\2\u016d\u016e\5y=\2\u016eZ\3\2\2\2\u016f\u0170\5"+
		"\u0087D\2\u0170\u0171\5\u008dG\2\u0171\u0172\5\u008bF\2\u0172\u0173\5"+
		"}?\2\u0173\\\3\2\2\2\u0174\u0175\5\u0095K\2\u0175\u0176\5\u0097L\2\u0176"+
		"\u0177\5\u0093J\2\u0177\u0178\5\u0081A\2\u0178\u0179\5\u008bF\2\u0179"+
		"\u017a\5}?\2\u017a^\3\2\2\2\u017b\u017c\5w<\2\u017c\u017d\5\u0081A\2\u017d"+
		"\u017e\5\u0089E\2\u017e`\3\2\2\2\u017f\u0180\5q9\2\u0180\u0181\5\u0095"+
		"K\2\u0181b\3\2\2\2\u0182\u0183\5\u008bF\2\u0183\u0184\5\u008dG\2\u0184"+
		"\u0185\5\u0097L\2\u0185d\3\2\2\2\u0186\u0187\5\u008dG\2\u0187\u0188\5"+
		"\u0093J\2\u0188f\3\2\2\2\u0189\u018a\5q9\2\u018a\u018b\5\u008bF\2\u018b"+
		"\u018c\5w<\2\u018ch\3\2\2\2\u018d\u018e\5\u009fP\2\u018e\u018f\5\u008d"+
		"G\2\u018f\u0190\5\u0093J\2\u0190j\3\2\2\2\u0191\u0192\5\u0089E\2\u0192"+
		"\u0193\5\u008dG\2\u0193\u0194\5w<\2\u0194l\3\2\2\2\u0195\u0196\5\u0095"+
		"K\2\u0196\u0197\5\u0099M\2\u0197\u0198\5s:\2\u0198n\3\2\2\2\u0199\u019a"+
		"\5{>\2\u019a\u019b\5\u0099M\2\u019b\u019c\5\u008bF\2\u019c\u019d\5u;\2"+
		"\u019d\u019e\5\u0097L\2\u019e\u019f\5\u0081A\2\u019f\u01a0\5\u008dG\2"+
		"\u01a0\u01a1\5\u008bF\2\u01a1p\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3r\3\2"+
		"\2\2\u01a4\u01a5\t\6\2\2\u01a5t\3\2\2\2\u01a6\u01a7\t\7\2\2\u01a7v\3\2"+
		"\2\2\u01a8\u01a9\t\b\2\2\u01a9x\3\2\2\2\u01aa\u01ab\t\t\2\2\u01abz\3\2"+
		"\2\2\u01ac\u01ad\t\n\2\2\u01ad|\3\2\2\2\u01ae\u01af\t\13\2\2\u01af~\3"+
		"\2\2\2\u01b0\u01b1\t\f\2\2\u01b1\u0080\3\2\2\2\u01b2\u01b3\t\r\2\2\u01b3"+
		"\u0082\3\2\2\2\u01b4\u01b5\t\16\2\2\u01b5\u0084\3\2\2\2\u01b6\u01b7\t"+
		"\17\2\2\u01b7\u0086\3\2\2\2\u01b8\u01b9\t\20\2\2\u01b9\u0088\3\2\2\2\u01ba"+
		"\u01bb\t\21\2\2\u01bb\u008a\3\2\2\2\u01bc\u01bd\t\22\2\2\u01bd\u008c\3"+
		"\2\2\2\u01be\u01bf\t\23\2\2\u01bf\u008e\3\2\2\2\u01c0\u01c1\t\24\2\2\u01c1"+
		"\u0090\3\2\2\2\u01c2\u01c3\t\25\2\2\u01c3\u0092\3\2\2\2\u01c4\u01c5\t"+
		"\26\2\2\u01c5\u0094\3\2\2\2\u01c6\u01c7\t\27\2\2\u01c7\u0096\3\2\2\2\u01c8"+
		"\u01c9\t\30\2\2\u01c9\u0098\3\2\2\2\u01ca\u01cb\t\31\2\2\u01cb\u009a\3"+
		"\2\2\2\u01cc\u01cd\t\32\2\2\u01cd\u009c\3\2\2\2\u01ce\u01cf\t\33\2\2\u01cf"+
		"\u009e\3\2\2\2\u01d0\u01d1\t\34\2\2\u01d1\u00a0\3\2\2\2\u01d2\u01d3\t"+
		"\35\2\2\u01d3\u00a2\3\2\2\2\u01d4\u01d5\t\36\2\2\u01d5\u00a4\3\2\2\2\u01d6"+
		"\u01da\t\37\2\2\u01d7\u01d9\t \2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u00a6\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01e1\7)\2\2\u01de\u01e0\n!\2\2\u01df\u01de\3\2\2"+
		"\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\bT\2\2\u01e5\u00a8\3\2\2\2\u01e6"+
		"\u01e8\t\"\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\bU\2\2\u01ec"+
		"\u00aa\3\2\2\2\21\2\u00b8\u00bd\u00c2\u00c7\u00ca\u00cd\u00d0\u00d3\u00d8"+
		"\u00e4\u00ea\u01da\u01e1\u01e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64v3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGERV=1, DOUBLEV=2, STRINGV=3, EQUAL=4, POT=5, DIV=6, PRODUCT=7, ADD=8, 
		SUBT=9, DIFF=10, LESS=11, LESSOREQUAL=12, GREATER=13, GREATEROREQUAL=14, 
		SEMICOLON=15, COLON=16, COMMA=17, LEFTPAR=18, RIGHTPAR=19, SINGLESUFFIX=20, 
		DOUBLESUFFIX=21, INTEGERSUFFIX=22, LONGSUFFIX=23, STRINGSUFFIX=24, INPUT=25, 
		PRINT=26, IF=27, THEN=28, ELSE=29, ELSEIF=30, END=31, WHILE=32, WEND=33, 
		DO=34, LOOP=35, UNTIL=36, FOR=37, TO=38, STEP=39, NEXT=40, INTEGER=41, 
		SINGLE=42, DOUBLE=43, LONG=44, STRING=45, DIM=46, AS=47, NOT=48, OR=49, 
		AND=50, XOR=51, MOD=52, SUB=53, FUNCTION=54, SELECT=55, CASE=56, SHARED=57, 
		CONST=58, ID=59, COMMENT=60, WS=61;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGERV", "DOUBLEV", "STRINGV", "EQUAL", "POT", "DIV", "PRODUCT", "ADD", 
		"SUBT", "DIFF", "LESS", "LESSOREQUAL", "GREATER", "GREATEROREQUAL", "SEMICOLON", 
		"COLON", "COMMA", "LEFTPAR", "RIGHTPAR", "SINGLESUFFIX", "DOUBLESUFFIX", 
		"INTEGERSUFFIX", "LONGSUFFIX", "STRINGSUFFIX", "INPUT", "PRINT", "IF", 
		"THEN", "ELSE", "ELSEIF", "END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", 
		"FOR", "TO", "STEP", "NEXT", "VALOR_ENTERO", "SINGLE", "DOUBLE", "LONG", "STRING",
		"DIM", "AS", "NOT", "OR", "AND", "XOR", "MOD", "SUB", "FUNCTION", "SELECT", 
		"CASE", "SHARED", "CONST", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z", "ID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'='", "'^'", "'/'", "'*'", "'+'", "'-'", "'<>'", 
		"'<'", "'<='", "'>'", "'>='", "';'", "':'", "','", "'('", "')'", "'!'", 
		"'#'", "'%'", "'&'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGERV", "DOUBLEV", "STRINGV", "EQUAL", "POT", "DIV", "PRODUCT", 
		"ADD", "SUBT", "DIFF", "LESS", "LESSOREQUAL", "GREATER", "GREATEROREQUAL", 
		"SEMICOLON", "COLON", "COMMA", "LEFTPAR", "RIGHTPAR", "SINGLESUFFIX", 
		"DOUBLESUFFIX", "INTEGERSUFFIX", "LONGSUFFIX", "STRINGSUFFIX", "INPUT", 
		"PRINT", "IF", "THEN", "ELSE", "ELSEIF", "END", "WHILE", "WEND", "DO", 
		"LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", "VALOR_ENTERO", "SINGLE", "DOUBLE",
		"LONG", "STRING", "DIM", "AS", "NOT", "OR", "AND", "XOR", "MOD", "SUB", 
		"FUNCTION", "SELECT", "CASE", "SHARED", "CONST", "ID", "COMMENT", "WS"
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


	public QB64v3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QB64v3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u01f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\6\2\u00b3\n\2\r\2\16\2\u00b4\3\3\6\3\u00b8"+
		"\n\3\r\3\16\3\u00b9\3\3\3\3\6\3\u00be\n\3\r\3\16\3\u00bf\3\4\3\4\7\4\u00c4"+
		"\n\4\f\4\16\4\u00c7\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\3T\3T\3U\3U\3V\3V\7V\u01de\nV\fV\16V\u01e1\13V\3W\3W\7W\u01e5"+
		"\nW\fW\16W\u01e8\13W\3W\3W\3X\6X\u01ed\nX\rX\16X\u01ee\3X\3X\2\2Y\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2"+
		"\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab=\u00ad>\u00af"+
		"?\3\2#\3\2\62;\3\2\60\60\4\2\f\f$$\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\u01de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\3\u00b2\3\2\2\2\5"+
		"\u00b7\3\2\2\2\7\u00c1\3\2\2\2\t\u00ca\3\2\2\2\13\u00cc\3\2\2\2\r\u00ce"+
		"\3\2\2\2\17\u00d0\3\2\2\2\21\u00d2\3\2\2\2\23\u00d4\3\2\2\2\25\u00d6\3"+
		"\2\2\2\27\u00d9\3\2\2\2\31\u00db\3\2\2\2\33\u00de\3\2\2\2\35\u00e0\3\2"+
		"\2\2\37\u00e3\3\2\2\2!\u00e5\3\2\2\2#\u00e7\3\2\2\2%\u00e9\3\2\2\2\'\u00eb"+
		"\3\2\2\2)\u00ed\3\2\2\2+\u00ef\3\2\2\2-\u00f1\3\2\2\2/\u00f3\3\2\2\2\61"+
		"\u00f5\3\2\2\2\63\u00f7\3\2\2\2\65\u00fd\3\2\2\2\67\u0103\3\2\2\29\u0106"+
		"\3\2\2\2;\u010b\3\2\2\2=\u0110\3\2\2\2?\u0117\3\2\2\2A\u011b\3\2\2\2C"+
		"\u0121\3\2\2\2E\u0126\3\2\2\2G\u0129\3\2\2\2I\u012e\3\2\2\2K\u0134\3\2"+
		"\2\2M\u0138\3\2\2\2O\u013b\3\2\2\2Q\u0140\3\2\2\2S\u0145\3\2\2\2U\u014d"+
		"\3\2\2\2W\u0154\3\2\2\2Y\u015b\3\2\2\2[\u0160\3\2\2\2]\u0167\3\2\2\2_"+
		"\u016b\3\2\2\2a\u016e\3\2\2\2c\u0172\3\2\2\2e\u0175\3\2\2\2g\u0179\3\2"+
		"\2\2i\u017d\3\2\2\2k\u0181\3\2\2\2m\u0185\3\2\2\2o\u018e\3\2\2\2q\u0195"+
		"\3\2\2\2s\u019a\3\2\2\2u\u01a1\3\2\2\2w\u01a7\3\2\2\2y\u01a9\3\2\2\2{"+
		"\u01ab\3\2\2\2}\u01ad\3\2\2\2\177\u01af\3\2\2\2\u0081\u01b1\3\2\2\2\u0083"+
		"\u01b3\3\2\2\2\u0085\u01b5\3\2\2\2\u0087\u01b7\3\2\2\2\u0089\u01b9\3\2"+
		"\2\2\u008b\u01bb\3\2\2\2\u008d\u01bd\3\2\2\2\u008f\u01bf\3\2\2\2\u0091"+
		"\u01c1\3\2\2\2\u0093\u01c3\3\2\2\2\u0095\u01c5\3\2\2\2\u0097\u01c7\3\2"+
		"\2\2\u0099\u01c9\3\2\2\2\u009b\u01cb\3\2\2\2\u009d\u01cd\3\2\2\2\u009f"+
		"\u01cf\3\2\2\2\u00a1\u01d1\3\2\2\2\u00a3\u01d3\3\2\2\2\u00a5\u01d5\3\2"+
		"\2\2\u00a7\u01d7\3\2\2\2\u00a9\u01d9\3\2\2\2\u00ab\u01db\3\2\2\2\u00ad"+
		"\u01e2\3\2\2\2\u00af\u01ec\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\4\3\2\2\2\u00b6\u00b8\t\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd"+
		"\t\3\2\2\u00bc\u00be\t\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\6\3\2\2\2\u00c1\u00c5\7$\2\2"+
		"\u00c2\u00c4\n\4\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\7$\2\2\u00c9\b\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\n\3\2\2\2\u00cc"+
		"\u00cd\7`\2\2\u00cd\f\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\16\3\2\2\2\u00d0"+
		"\u00d1\7,\2\2\u00d1\20\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3\22\3\2\2\2\u00d4"+
		"\u00d5\7/\2\2\u00d5\24\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8\7@\2\2\u00d8"+
		"\26\3\2\2\2\u00d9\u00da\7>\2\2\u00da\30\3\2\2\2\u00db\u00dc\7>\2\2\u00dc"+
		"\u00dd\7?\2\2\u00dd\32\3\2\2\2\u00de\u00df\7@\2\2\u00df\34\3\2\2\2\u00e0"+
		"\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4"+
		" \3\2\2\2\u00e5\u00e6\7<\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8"+
		"$\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec("+
		"\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7%\2\2\u00f0,\3"+
		"\2\2\2\u00f1\u00f2\7\'\2\2\u00f2.\3\2\2\2\u00f3\u00f4\7(\2\2\u00f4\60"+
		"\3\2\2\2\u00f5\u00f6\7&\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\5\u0087D\2\u00f8"+
		"\u00f9\5\u0091I\2\u00f9\u00fa\5\u0095K\2\u00fa\u00fb\5\u009fP\2\u00fb"+
		"\u00fc\5\u009dO\2\u00fc\64\3\2\2\2\u00fd\u00fe\5\u0095K\2\u00fe\u00ff"+
		"\5\u0099M\2\u00ff\u0100\5\u0087D\2\u0100\u0101\5\u0091I\2\u0101\u0102"+
		"\5\u009dO\2\u0102\66\3\2\2\2\u0103\u0104\5\u0087D\2\u0104\u0105\5\u0081"+
		"A\2\u01058\3\2\2\2\u0106\u0107\5\u009dO\2\u0107\u0108\5\u0085C\2\u0108"+
		"\u0109\5\177@\2\u0109\u010a\5\u0091I\2\u010a:\3\2\2\2\u010b\u010c\5\177"+
		"@\2\u010c\u010d\5\u008dG\2\u010d\u010e\5\u009bN\2\u010e\u010f\5\177@\2"+
		"\u010f<\3\2\2\2\u0110\u0111\5\177@\2\u0111\u0112\5\u008dG\2\u0112\u0113"+
		"\5\u009bN\2\u0113\u0114\5\177@\2\u0114\u0115\5\u0087D\2\u0115\u0116\5"+
		"\u0081A\2\u0116>\3\2\2\2\u0117\u0118\5\177@\2\u0118\u0119\5\u0091I\2\u0119"+
		"\u011a\5}?\2\u011a@\3\2\2\2\u011b\u011c\5\u00a3R\2\u011c\u011d\5\u0085"+
		"C\2\u011d\u011e\5\u0087D\2\u011e\u011f\5\u008dG\2\u011f\u0120\5\177@\2"+
		"\u0120B\3\2\2\2\u0121\u0122\5\u00a3R\2\u0122\u0123\5\177@\2\u0123\u0124"+
		"\5\u0091I\2\u0124\u0125\5}?\2\u0125D\3\2\2\2\u0126\u0127\5}?\2\u0127\u0128"+
		"\5\u0093J\2\u0128F\3\2\2\2\u0129\u012a\5\u008dG\2\u012a\u012b\5\u0093"+
		"J\2\u012b\u012c\5\u0093J\2\u012c\u012d\5\u0095K\2\u012dH\3\2\2\2\u012e"+
		"\u012f\5\u009fP\2\u012f\u0130\5\u0091I\2\u0130\u0131\5\u009dO\2\u0131"+
		"\u0132\5\u0087D\2\u0132\u0133\5\u008dG\2\u0133J\3\2\2\2\u0134\u0135\5"+
		"\u0081A\2\u0135\u0136\5\u0093J\2\u0136\u0137\5\u0099M\2\u0137L\3\2\2\2"+
		"\u0138\u0139\5\u009dO\2\u0139\u013a\5\u0093J\2\u013aN\3\2\2\2\u013b\u013c"+
		"\5\u009bN\2\u013c\u013d\5\u009dO\2\u013d\u013e\5\177@\2\u013e\u013f\5"+
		"\u0095K\2\u013fP\3\2\2\2\u0140\u0141\5\u0091I\2\u0141\u0142\5\177@\2\u0142"+
		"\u0143\5\u00a5S\2\u0143\u0144\5\u009dO\2\u0144R\3\2\2\2\u0145\u0146\5"+
		"\u0087D\2\u0146\u0147\5\u0091I\2\u0147\u0148\5\u009dO\2\u0148\u0149\5"+
		"\177@\2\u0149\u014a\5\u0083B\2\u014a\u014b\5\177@\2\u014b\u014c\5\u0099"+
		"M\2\u014cT\3\2\2\2\u014d\u014e\5\u009bN\2\u014e\u014f\5\u0087D\2\u014f"+
		"\u0150\5\u0091I\2\u0150\u0151\5\u0083B\2\u0151\u0152\5\u008dG\2\u0152"+
		"\u0153\5\177@\2\u0153V\3\2\2\2\u0154\u0155\5}?\2\u0155\u0156\5\u0093J"+
		"\2\u0156\u0157\5\u009fP\2\u0157\u0158\5y=\2\u0158\u0159\5\u008dG\2\u0159"+
		"\u015a\5\177@\2\u015aX\3\2\2\2\u015b\u015c\5\u008dG\2\u015c\u015d\5\u0093"+
		"J\2\u015d\u015e\5\u0091I\2\u015e\u015f\5\u0083B\2\u015fZ\3\2\2\2\u0160"+
		"\u0161\5\u009bN\2\u0161\u0162\5\u009dO\2\u0162\u0163\5\u0099M\2\u0163"+
		"\u0164\5\u0087D\2\u0164\u0165\5\u0091I\2\u0165\u0166\5\u0083B\2\u0166"+
		"\\\3\2\2\2\u0167\u0168\5}?\2\u0168\u0169\5\u0087D\2\u0169\u016a\5\u008f"+
		"H\2\u016a^\3\2\2\2\u016b\u016c\5w<\2\u016c\u016d\5\u009bN\2\u016d`\3\2"+
		"\2\2\u016e\u016f\5\u0091I\2\u016f\u0170\5\u0093J\2\u0170\u0171\5\u009d"+
		"O\2\u0171b\3\2\2\2\u0172\u0173\5\u0093J\2\u0173\u0174\5\u0099M\2\u0174"+
		"d\3\2\2\2\u0175\u0176\5w<\2\u0176\u0177\5\u0091I\2\u0177\u0178\5}?\2\u0178"+
		"f\3\2\2\2\u0179\u017a\5\u00a5S\2\u017a\u017b\5\u0093J\2\u017b\u017c\5"+
		"\u0099M\2\u017ch\3\2\2\2\u017d\u017e\5\u008fH\2\u017e\u017f\5\u0093J\2"+
		"\u017f\u0180\5}?\2\u0180j\3\2\2\2\u0181\u0182\5\u009bN\2\u0182\u0183\5"+
		"\u009fP\2\u0183\u0184\5y=\2\u0184l\3\2\2\2\u0185\u0186\5\u0081A\2\u0186"+
		"\u0187\5\u009fP\2\u0187\u0188\5\u0091I\2\u0188\u0189\5{>\2\u0189\u018a"+
		"\5\u009dO\2\u018a\u018b\5\u0087D\2\u018b\u018c\5\u0093J\2\u018c\u018d"+
		"\5\u0091I\2\u018dn\3\2\2\2\u018e\u018f\5\u009bN\2\u018f\u0190\5\177@\2"+
		"\u0190\u0191\5\u008dG\2\u0191\u0192\5\177@\2\u0192\u0193\5{>\2\u0193\u0194"+
		"\5\u009dO\2\u0194p\3\2\2\2\u0195\u0196\5{>\2\u0196\u0197\5w<\2\u0197\u0198"+
		"\5\u009bN\2\u0198\u0199\5\177@\2\u0199r\3\2\2\2\u019a\u019b\5\u009bN\2"+
		"\u019b\u019c\5\u0085C\2\u019c\u019d\5w<\2\u019d\u019e\5\u0099M\2\u019e"+
		"\u019f\5\177@\2\u019f\u01a0\5}?\2\u01a0t\3\2\2\2\u01a1\u01a2\5{>\2\u01a2"+
		"\u01a3\5\u0093J\2\u01a3\u01a4\5\u0091I\2\u01a4\u01a5\5\u009bN\2\u01a5"+
		"\u01a6\5\u009dO\2\u01a6v\3\2\2\2\u01a7\u01a8\t\5\2\2\u01a8x\3\2\2\2\u01a9"+
		"\u01aa\t\6\2\2\u01aaz\3\2\2\2\u01ab\u01ac\t\7\2\2\u01ac|\3\2\2\2\u01ad"+
		"\u01ae\t\b\2\2\u01ae~\3\2\2\2\u01af\u01b0\t\t\2\2\u01b0\u0080\3\2\2\2"+
		"\u01b1\u01b2\t\n\2\2\u01b2\u0082\3\2\2\2\u01b3\u01b4\t\13\2\2\u01b4\u0084"+
		"\3\2\2\2\u01b5\u01b6\t\f\2\2\u01b6\u0086\3\2\2\2\u01b7\u01b8\t\r\2\2\u01b8"+
		"\u0088\3\2\2\2\u01b9\u01ba\t\16\2\2\u01ba\u008a\3\2\2\2\u01bb\u01bc\t"+
		"\17\2\2\u01bc\u008c\3\2\2\2\u01bd\u01be\t\20\2\2\u01be\u008e\3\2\2\2\u01bf"+
		"\u01c0\t\21\2\2\u01c0\u0090\3\2\2\2\u01c1\u01c2\t\22\2\2\u01c2\u0092\3"+
		"\2\2\2\u01c3\u01c4\t\23\2\2\u01c4\u0094\3\2\2\2\u01c5\u01c6\t\24\2\2\u01c6"+
		"\u0096\3\2\2\2\u01c7\u01c8\t\25\2\2\u01c8\u0098\3\2\2\2\u01c9\u01ca\t"+
		"\26\2\2\u01ca\u009a\3\2\2\2\u01cb\u01cc\t\27\2\2\u01cc\u009c\3\2\2\2\u01cd"+
		"\u01ce\t\30\2\2\u01ce\u009e\3\2\2\2\u01cf\u01d0\t\31\2\2\u01d0\u00a0\3"+
		"\2\2\2\u01d1\u01d2\t\32\2\2\u01d2\u00a2\3\2\2\2\u01d3\u01d4\t\33\2\2\u01d4"+
		"\u00a4\3\2\2\2\u01d5\u01d6\t\34\2\2\u01d6\u00a6\3\2\2\2\u01d7\u01d8\t"+
		"\35\2\2\u01d8\u00a8\3\2\2\2\u01d9\u01da\t\36\2\2\u01da\u00aa\3\2\2\2\u01db"+
		"\u01df\t\37\2\2\u01dc\u01de\t \2\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u00ac\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e6\7)\2\2\u01e3\u01e5\n!\2\2\u01e4\u01e3\3\2\2"+
		"\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\bW\2\2\u01ea\u00ae\3\2\2\2\u01eb"+
		"\u01ed\t\"\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\bX\2\2\u01f1"+
		"\u00b0\3\2\2\2\n\2\u00b4\u00b9\u00bf\u00c5\u01df\u01e6\u01ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
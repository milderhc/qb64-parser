// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v2.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64v2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		INTEGER=53, LONG=54, SINGLE=55, DOUBLE=56, STRING=57, ID=58, COMMENT=59, 
		WS=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", 
		"ID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dim'", "'as'", "'shared'", "'('", "')'", "','", "'$'", "'!'", 
		"'%'", "'&'", "'#'", "'const'", "'='", "'if'", "'then'", "'end'", "'elseif'", 
		"'else'", "'for'", "'to'", "'step'", "'next'", "'while'", "'wend'", "'do'", 
		"'loop'", "'until'", "'select'", "'case'", "'sub'", "'function'", "'input'", 
		"'print'", "';'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'<>'", "'<'", "'>'", "'<='", "'>='", "'not'", "'integer'", "'single'", 
		"'double'", "'long'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", 
		"ID", "COMMENT", "WS"
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


	public QB64v2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QB64v2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u01c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u016b\n\66\3\66\5\66\u016e\n\66\3\66\5\66\u0171\n\66\3"+
		"\66\5\66\u0174\n\66\3\66\5\66\u0177\n\66\3\67\6\67\u017a\n\67\r\67\16"+
		"\67\u017b\38\68\u017f\n8\r8\168\u0180\38\38\38\58\u0186\n8\38\58\u0189"+
		"\n8\38\58\u018c\n8\38\58\u018f\n8\38\58\u0192\n8\39\69\u0195\n9\r9\16"+
		"9\u0196\39\39\39\39\39\39\39\39\69\u01a1\n9\r9\169\u01a2\3:\3:\7:\u01a7"+
		"\n:\f:\16:\u01aa\13:\3:\3:\3;\3;\7;\u01b0\n;\f;\16;\u01b3\13;\3<\3<\7"+
		"<\u01b7\n<\f<\16<\u01ba\13<\3<\3<\3=\6=\u01bf\n=\r=\16=\u01c0\3=\3=\2"+
		"\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>\3\2\23\3\2\65\65\3\2\64\64\3\299\3\288\3\2\629\3\2\62\67"+
		"\3\2\62;\3\2\628\3\2\62\63\3\2\63\64\3\2\62\62\3\2\60\60\4\2\f\f$$\4\2"+
		"C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u01d9\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5"+
		"\177\3\2\2\2\7\u0082\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d"+
		"\3\2\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3"+
		"\2\2\2\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u009f\3\2\2\2\35\u00a1\3\2"+
		"\2\2\37\u00a4\3\2\2\2!\u00a9\3\2\2\2#\u00ad\3\2\2\2%\u00b4\3\2\2\2\'\u00b9"+
		"\3\2\2\2)\u00bd\3\2\2\2+\u00c0\3\2\2\2-\u00c5\3\2\2\2/\u00ca\3\2\2\2\61"+
		"\u00d0\3\2\2\2\63\u00d5\3\2\2\2\65\u00d8\3\2\2\2\67\u00dd\3\2\2\29\u00e3"+
		"\3\2\2\2;\u00ea\3\2\2\2=\u00ef\3\2\2\2?\u00f3\3\2\2\2A\u00fc\3\2\2\2C"+
		"\u0102\3\2\2\2E\u0108\3\2\2\2G\u010a\3\2\2\2I\u010e\3\2\2\2K\u0111\3\2"+
		"\2\2M\u0115\3\2\2\2O\u0117\3\2\2\2Q\u0119\3\2\2\2S\u011b\3\2\2\2U\u011d"+
		"\3\2\2\2W\u0120\3\2\2\2Y\u0122\3\2\2\2[\u0124\3\2\2\2]\u0127\3\2\2\2_"+
		"\u012a\3\2\2\2a\u012e\3\2\2\2c\u0136\3\2\2\2e\u013d\3\2\2\2g\u0144\3\2"+
		"\2\2i\u0149\3\2\2\2k\u0176\3\2\2\2m\u0179\3\2\2\2o\u017e\3\2\2\2q\u0194"+
		"\3\2\2\2s\u01a4\3\2\2\2u\u01ad\3\2\2\2w\u01b4\3\2\2\2y\u01be\3\2\2\2{"+
		"|\7f\2\2|}\7k\2\2}~\7o\2\2~\4\3\2\2\2\177\u0080\7c\2\2\u0080\u0081\7u"+
		"\2\2\u0081\6\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7j\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7f\2\2\u0088"+
		"\b\3\2\2\2\u0089\u008a\7*\2\2\u008a\n\3\2\2\2\u008b\u008c\7+\2\2\u008c"+
		"\f\3\2\2\2\u008d\u008e\7.\2\2\u008e\16\3\2\2\2\u008f\u0090\7&\2\2\u0090"+
		"\20\3\2\2\2\u0091\u0092\7#\2\2\u0092\22\3\2\2\2\u0093\u0094\7\'\2\2\u0094"+
		"\24\3\2\2\2\u0095\u0096\7(\2\2\u0096\26\3\2\2\2\u0097\u0098\7%\2\2\u0098"+
		"\30\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7v\2\2\u009e\32\3\2\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3\36\3\2\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8 \3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7f\2"+
		"\2\u00ac\"\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7"+
		"u\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3$"+
		"\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc(\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"*\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7r\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7z\2\2\u00c8\u00c9\7v\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb"+
		"\u00cc\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf\60\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7"+
		"p\2\2\u00d3\u00d4\7f\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7"+
		"\7q\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7r\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7w\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7n\2\2\u00e2"+
		"8\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9:\3\2\2\2\u00ea"+
		"\u00eb\7e\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee<\3\2\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7d\2"+
		"\2\u00f2>\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7"+
		"p\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7q\2\2\u00fa\u00fb\7p\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe"+
		"\7p\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7v\2\2\u0101"+
		"B\3\2\2\2\u0102\u0103\7r\2\2\u0103\u0104\7t\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107D\3\2\2\2\u0108\u0109\7=\2\2\u0109"+
		"F\3\2\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c\u010d\7f\2\2\u010d"+
		"H\3\2\2\2\u010e\u010f\7q\2\2\u010f\u0110\7t\2\2\u0110J\3\2\2\2\u0111\u0112"+
		"\7z\2\2\u0112\u0113\7q\2\2\u0113\u0114\7t\2\2\u0114L\3\2\2\2\u0115\u0116"+
		"\7-\2\2\u0116N\3\2\2\2\u0117\u0118\7/\2\2\u0118P\3\2\2\2\u0119\u011a\7"+
		",\2\2\u011aR\3\2\2\2\u011b\u011c\7\61\2\2\u011cT\3\2\2\2\u011d\u011e\7"+
		">\2\2\u011e\u011f\7@\2\2\u011fV\3\2\2\2\u0120\u0121\7>\2\2\u0121X\3\2"+
		"\2\2\u0122\u0123\7@\2\2\u0123Z\3\2\2\2\u0124\u0125\7>\2\2\u0125\u0126"+
		"\7?\2\2\u0126\\\3\2\2\2\u0127\u0128\7@\2\2\u0128\u0129\7?\2\2\u0129^\3"+
		"\2\2\2\u012a\u012b\7p\2\2\u012b\u012c\7q\2\2\u012c\u012d\7v\2\2\u012d"+
		"`\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131"+
		"\u0132\7g\2\2\u0132\u0133\7i\2\2\u0133\u0134\7g\2\2\u0134\u0135\7t\2\2"+
		"\u0135b\3\2\2\2\u0136\u0137\7u\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2"+
		"\2\u0139\u013a\7i\2\2\u013a\u013b\7n\2\2\u013b\u013c\7g\2\2\u013cd\3\2"+
		"\2\2\u013d\u013e\7f\2\2\u013e\u013f\7q\2\2\u013f\u0140\7w\2\2\u0140\u0141"+
		"\7d\2\2\u0141\u0142\7n\2\2\u0142\u0143\7g\2\2\u0143f\3\2\2\2\u0144\u0145"+
		"\7n\2\2\u0145\u0146\7q\2\2\u0146\u0147\7p\2\2\u0147\u0148\7i\2\2\u0148"+
		"h\3\2\2\2\u0149\u014a\7u\2\2\u014a\u014b\7v\2\2\u014b\u014c\7t\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e\u014f\7i\2\2\u014fj\3\2\2\2\u0150"+
		"\u0151\t\2\2\2\u0151\u0152\t\3\2\2\u0152\u0153\t\4\2\2\u0153\u0154\t\5"+
		"\2\2\u0154\u0177\t\6\2\2\u0155\u0156\t\2\2\2\u0156\u0157\t\3\2\2\u0157"+
		"\u0158\t\4\2\2\u0158\u0159\t\7\2\2\u0159\u0177\t\b\2\2\u015a\u015b\t\2"+
		"\2\2\u015b\u015c\t\3\2\2\u015c\u015d\t\t\2\2\u015d\u015e\t\b\2\2\u015e"+
		"\u0177\t\b\2\2\u015f\u0160\t\2\2\2\u0160\u0161\t\n\2\2\u0161\u0162\t\b"+
		"\2\2\u0162\u0163\t\b\2\2\u0163\u0177\t\b\2\2\u0164\u0165\t\13\2\2\u0165"+
		"\u0166\t\b\2\2\u0166\u0167\t\b\2\2\u0167\u0168\t\b\2\2\u0168\u0177\t\b"+
		"\2\2\u0169\u016b\t\f\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u016e\t\b\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u0171\t\b\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\t\b\2\2\u0173\u0172\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\t\b\2\2\u0176"+
		"\u0150\3\2\2\2\u0176\u0155\3\2\2\2\u0176\u015a\3\2\2\2\u0176\u015f\3\2"+
		"\2\2\u0176\u0164\3\2\2\2\u0176\u016a\3\2\2\2\u0177l\3\2\2\2\u0178\u017a"+
		"\t\b\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017cn\3\2\2\2\u017d\u017f\t\b\2\2\u017e\u017d\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\t\r\2\2\u0183\u0185\t\b\2\2\u0184\u0186\t\b\2\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189\t\b"+
		"\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u018c\t\b\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018f\t\b\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u0192\t\b\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192p\3\2\2\2\u0193\u0195\t\b\2\2\u0194\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\t\r\2\2\u0199\u019a\t\b\2\2\u019a\u019b\t\b\2\2\u019b\u019c\t\b"+
		"\2\2\u019c\u019d\t\b\2\2\u019d\u019e\t\b\2\2\u019e\u01a0\t\b\2\2\u019f"+
		"\u01a1\t\b\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3r\3\2\2\2\u01a4\u01a8\7$\2\2\u01a5\u01a7"+
		"\n\16\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2"+
		"\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\7$\2\2\u01act\3\2\2\2\u01ad\u01b1\t\17\2\2\u01ae\u01b0\t\20\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2v\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b8\7)\2\2\u01b5\u01b7"+
		"\n\21\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2"+
		"\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc"+
		"\b<\2\2\u01bcx\3\2\2\2\u01bd\u01bf\t\22\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c3\b=\2\2\u01c3z\3\2\2\2\25\2\u016a\u016d\u0170\u0173\u0176"+
		"\u017b\u0180\u0185\u0188\u018b\u018e\u0191\u0196\u01a2\u01a8\u01b1\u01b8"+
		"\u01c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
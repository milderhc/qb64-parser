// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, OPEQUAL=7, COMMA=8, IF=9, 
		THEN=10, ELSE=11, ENDIF=12, WHILE=13, WEND=14, DO=15, LOOP=16, UNTIL=17, 
		FOR=18, TO=19, STEP=20, NEXT=21, INTEGER=22, SINGLE=23, DOUBLE=24, LONG=25, 
		STRING=26, DIM=27, AS=28, ID=29, WS=30;
	public static final int
		RULE_qb = 0, RULE_main = 1, RULE_commands = 2, RULE_command = 3, RULE_if_ = 4, 
		RULE_while_ = 5, RULE_do_while = 6, RULE_do_until = 7, RULE_for_ = 8, 
		RULE_declaration = 9, RULE_id_list = 10, RULE_type = 11, RULE_numeric_asignment = 12, 
		RULE_numeric_id = 13, RULE_id_int = 14, RULE_id_long = 15, RULE_id_single = 16, 
		RULE_id_double = 17, RULE_expression = 18, RULE_numeric_value = 19, RULE_funproc = 20;
	public static final String[] ruleNames = {
		"qb", "main", "commands", "command", "if_", "while_", "do_while", "do_until", 
		"for_", "declaration", "id_list", "type", "numeric_asignment", "numeric_id", 
		"id_int", "id_long", "id_single", "id_double", "expression", "numeric_value", 
		"funproc"
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

	@Override
	public String getGrammarFileName() { return "QB64.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QB64Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QbContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QB64Parser.EOF, 0); }
		public List<FunprocContext> funproc() {
			return getRuleContexts(FunprocContext.class);
		}
		public FunprocContext funproc(int i) {
			return getRuleContext(FunprocContext.class,i);
		}
		public QbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterQb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitQb(this);
		}
	}

	public final QbContext qb() throws RecognitionException {
		QbContext _localctx = new QbContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			main();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(43);
				funproc();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			commands();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case DIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				command();
				setState(54);
				commands();
				}
				break;
			case EOF:
			case T__4:
			case ELSE:
			case ENDIF:
			case WEND:
			case LOOP:
			case STEP:
			case NEXT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public Do_untilContext do_until() {
			return getRuleContext(Do_untilContext.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				while_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				do_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				do_until();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QB64Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(QB64Parser.THEN, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(QB64Parser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(QB64Parser.ELSE, 0); }
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(68);
			expression();
			setState(69);
			match(THEN);
			setState(70);
			commands();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(71);
				match(ELSE);
				setState(72);
				commands();
				}
			}

			setState(75);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(QB64Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode WEND() { return getToken(QB64Parser.WEND, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(WHILE);
			setState(78);
			expression();
			setState(79);
			commands();
			setState(80);
			match(WEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(QB64Parser.DO, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(QB64Parser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(QB64Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitDo_while(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DO);
			setState(83);
			commands();
			setState(84);
			match(LOOP);
			setState(85);
			match(WHILE);
			setState(86);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_untilContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(QB64Parser.DO, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(QB64Parser.LOOP, 0); }
		public TerminalNode UNTIL() { return getToken(QB64Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_untilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterDo_until(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitDo_until(this);
		}
	}

	public final Do_untilContext do_until() throws RecognitionException {
		Do_untilContext _localctx = new Do_untilContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_do_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DO);
			setState(89);
			commands();
			setState(90);
			match(LOOP);
			setState(91);
			match(UNTIL);
			setState(92);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(QB64Parser.FOR, 0); }
		public Numeric_asignmentContext numeric_asignment() {
			return getRuleContext(Numeric_asignmentContext.class,0);
		}
		public TerminalNode TO() { return getToken(QB64Parser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(QB64Parser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(QB64Parser.STEP, 0); }
		public TerminalNode ID() { return getToken(QB64Parser.ID, 0); }
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitFor_(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FOR);
			setState(95);
			numeric_asignment();
			setState(96);
			match(TO);
			setState(97);
			expression();
			setState(98);
			commands();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(99);
				match(STEP);
				setState(100);
				expression();
				}
			}

			setState(103);
			match(NEXT);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(104);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(QB64Parser.DIM, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode AS() { return getToken(QB64Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(DIM);
			setState(108);
			id_list();
			setState(109);
			match(AS);
			setState(110);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64Parser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QB64Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QB64Parser.COMMA, i);
		}
		public List<Id_listContext> id_list() {
			return getRuleContexts(Id_listContext.class);
		}
		public Id_listContext id_list(int i) {
			return getRuleContext(Id_listContext.class,i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					id_list();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(QB64Parser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(QB64Parser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(QB64Parser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(QB64Parser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(QB64Parser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << SINGLE) | (1L << DOUBLE) | (1L << LONG) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_asignmentContext extends ParserRuleContext {
		public Numeric_idContext numeric_id() {
			return getRuleContext(Numeric_idContext.class,0);
		}
		public TerminalNode OPEQUAL() { return getToken(QB64Parser.OPEQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Numeric_asignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_asignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterNumeric_asignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitNumeric_asignment(this);
		}
	}

	public final Numeric_asignmentContext numeric_asignment() throws RecognitionException {
		Numeric_asignmentContext _localctx = new Numeric_asignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numeric_asignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			numeric_id();
			setState(123);
			match(OPEQUAL);
			setState(124);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_idContext extends ParserRuleContext {
		public Id_intContext id_int() {
			return getRuleContext(Id_intContext.class,0);
		}
		public Id_longContext id_long() {
			return getRuleContext(Id_longContext.class,0);
		}
		public Id_singleContext id_single() {
			return getRuleContext(Id_singleContext.class,0);
		}
		public Id_doubleContext id_double() {
			return getRuleContext(Id_doubleContext.class,0);
		}
		public Numeric_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterNumeric_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitNumeric_id(this);
		}
	}

	public final Numeric_idContext numeric_id() throws RecognitionException {
		Numeric_idContext _localctx = new Numeric_idContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numeric_id);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				id_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				id_long();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				id_single();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				id_double();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_intContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64Parser.ID, 0); }
		public Id_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterId_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitId_int(this);
		}
	}

	public final Id_intContext id_int() throws RecognitionException {
		Id_intContext _localctx = new Id_intContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_longContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64Parser.ID, 0); }
		public Id_longContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterId_long(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitId_long(this);
		}
	}

	public final Id_longContext id_long() throws RecognitionException {
		Id_longContext _localctx = new Id_longContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_singleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64Parser.ID, 0); }
		public Id_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterId_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitId_single(this);
		}
	}

	public final Id_singleContext id_single() throws RecognitionException {
		Id_singleContext _localctx = new Id_singleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id_single);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(139);
				match(T__2);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_doubleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64Parser.ID, 0); }
		public Id_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterId_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitId_double(this);
		}
	}

	public final Id_doubleContext id_double() throws RecognitionException {
		Id_doubleContext _localctx = new Id_doubleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Numeric_valueContext numeric_value() {
			return getRuleContext(Numeric_valueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			numeric_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QB64Parser.INT, 0); }
		public Numeric_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterNumeric_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitNumeric_value(this);
		}
	}

	public final Numeric_valueContext numeric_value() throws RecognitionException {
		Numeric_valueContext _localctx = new Numeric_valueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numeric_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunprocContext extends ParserRuleContext {
		public FunprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterFunproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitFunproc(this);
		}
	}

	public final FunprocContext funproc() throws RecognitionException {
		FunprocContext _localctx = new FunprocContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5D\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nh\n\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\7\fv\n\f\f\f\16\fy\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u0085\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\7\22\u008f"+
		"\n\22\f\22\16\22\u0092\13\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2"+
		"\30\34\u0096\2,\3\2\2\2\4\65\3\2\2\2\6;\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2"+
		"\fO\3\2\2\2\16T\3\2\2\2\20Z\3\2\2\2\22`\3\2\2\2\24m\3\2\2\2\26r\3\2\2"+
		"\2\30z\3\2\2\2\32|\3\2\2\2\34\u0084\3\2\2\2\36\u0086\3\2\2\2 \u0089\3"+
		"\2\2\2\"\u008c\3\2\2\2$\u0093\3\2\2\2&\u0096\3\2\2\2(\u0098\3\2\2\2*\u009a"+
		"\3\2\2\2,\60\5\4\3\2-/\5*\26\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65\66"+
		"\5\6\4\2\66\5\3\2\2\2\678\5\b\5\289\5\6\4\29<\3\2\2\2:<\3\2\2\2;\67\3"+
		"\2\2\2;:\3\2\2\2<\7\3\2\2\2=D\5\n\6\2>D\5\f\7\2?D\5\16\b\2@D\5\20\t\2"+
		"AD\5\22\n\2BD\5\24\13\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2"+
		"\2\2CB\3\2\2\2D\t\3\2\2\2EF\7\13\2\2FG\5&\24\2GH\7\f\2\2HK\5\6\4\2IJ\7"+
		"\r\2\2JL\5\6\4\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\16\2\2N\13\3\2\2\2"+
		"OP\7\17\2\2PQ\5&\24\2QR\5\6\4\2RS\7\20\2\2S\r\3\2\2\2TU\7\21\2\2UV\5\6"+
		"\4\2VW\7\22\2\2WX\7\17\2\2XY\5&\24\2Y\17\3\2\2\2Z[\7\21\2\2[\\\5\6\4\2"+
		"\\]\7\22\2\2]^\7\23\2\2^_\5&\24\2_\21\3\2\2\2`a\7\24\2\2ab\5\32\16\2b"+
		"c\7\25\2\2cd\5&\24\2dg\5\6\4\2ef\7\26\2\2fh\5&\24\2ge\3\2\2\2gh\3\2\2"+
		"\2hi\3\2\2\2ik\7\27\2\2jl\7\37\2\2kj\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mn\7"+
		"\35\2\2no\5\26\f\2op\7\36\2\2pq\5\30\r\2q\25\3\2\2\2rw\7\37\2\2st\7\n"+
		"\2\2tv\5\26\f\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\27\3\2\2\2yw"+
		"\3\2\2\2z{\t\2\2\2{\31\3\2\2\2|}\5\34\17\2}~\7\t\2\2~\177\5&\24\2\177"+
		"\33\3\2\2\2\u0080\u0085\5\36\20\2\u0081\u0085\5 \21\2\u0082\u0085\5\""+
		"\22\2\u0083\u0085\5$\23\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\35\3\2\2\2\u0086\u0087\7\37\2"+
		"\2\u0087\u0088\7\3\2\2\u0088\37\3\2\2\2\u0089\u008a\7\37\2\2\u008a\u008b"+
		"\7\4\2\2\u008b!\3\2\2\2\u008c\u0090\7\37\2\2\u008d\u008f\7\5\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091#\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\37\2\2\u0094\u0095"+
		"\7\6\2\2\u0095%\3\2\2\2\u0096\u0097\5(\25\2\u0097\'\3\2\2\2\u0098\u0099"+
		"\7\b\2\2\u0099)\3\2\2\2\u009a\u009b\7\7\2\2\u009b+\3\2\2\2\13\60;CKgk"+
		"w\u0084\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
package qb64parsing;
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
		INTEGERSUFFIX=1, LONGSUFFIX=2, SINGLESUFFIX=3, DOUBLESUFFIX=4, STRINGSUFFIX=5, 
		INTEGERVALUE=6, LONGVALUE=7, SINGLEVALUE=8, DOUBLEVALUE=9, STRINGVALUE=10, 
		EQUALOP=11, POTOP=12, DIVOP=13, PRODUCTOP=14, ADDOP=15, SUBOP=16, DIFFOP=17, 
		LESSOP=18, LESSOREQUALOP=19, GREATER=20, GREATEROREQUAL=21, SEMICOLON=22, 
		COLON=23, COMMA=24, LEFTPAR=25, RIGHTPAR=26, INPUT=27, PRINT=28, IF=29, 
		THEN=30, ELSE=31, END=32, WHILE=33, WEND=34, DO=35, LOOP=36, UNTIL=37, 
		FOR=38, TO=39, STEP=40, NEXT=41, INTEGER=42, SINGLE=43, DOUBLE=44, LONG=45, 
		STRING=46, DIM=47, AS=48, NOT=49, OR=50, AND=51, XOR=52, MOD=53, SUB=54, 
		FUNCTION=55, IDPREFIX=56, COMMENT=57, WS=58, ErrorCharacter=59;
	public static final int
		RULE_qb = 0, RULE_main = 1, RULE_commands = 2, RULE_command = 3, RULE_input = 4, 
		RULE_print = 5, RULE_if_ = 6, RULE_while_ = 7, RULE_do_while = 8, RULE_do_until = 9, 
		RULE_for_ = 10, RULE_declaration = 11, RULE_id_list = 12, RULE_print_list = 13, 
		RULE_assignment = 14, RULE_single_numeric_assignment = 15, RULE_array_numeric_assignment = 16, 
		RULE_id = 17, RULE_single_id = 18, RULE_single_numeric_id = 19, RULE_array_id = 20, 
		RULE_array_numeric_id = 21, RULE_array_id_int = 22, RULE_array_id_long = 23, 
		RULE_array_id_single = 24, RULE_array_id_double = 25, RULE_array_id_string = 26, 
		RULE_single_id_int = 27, RULE_single_id_long = 28, RULE_single_id_single = 29, 
		RULE_single_id_double = 30, RULE_single_id_string = 31, RULE_array = 32, 
		RULE_expression_list = 33, RULE_expression = 34, RULE_value = 35, RULE_numeric_value = 36, 
		RULE_string_value = 37, RULE_type = 38, RULE_funproc = 39, RULE_call_sub = 40, 
		RULE_call_function = 41, RULE_parameters_list = 42, RULE_negop = 43, RULE_compop = 44, 
		RULE_binop = 45, RULE_proop = 46;
	public static final String[] ruleNames = {
		"qb", "main", "commands", "command", "input", "print", "if_", "while_", 
		"do_while", "do_until", "for_", "declaration", "id_list", "print_list", 
		"assignment", "single_numeric_assignment", "array_numeric_assignment", 
		"id", "single_id", "single_numeric_id", "array_id", "array_numeric_id", 
		"array_id_int", "array_id_long", "array_id_single", "array_id_double", 
		"array_id_string", "single_id_int", "single_id_long", "single_id_single", 
		"single_id_double", "single_id_string", "array", "expression_list", "expression", 
		"value", "numeric_value", "string_value", "type", "funproc", "call_sub", 
		"call_function", "parameters_list", "negop", "compop", "binop", "proop"
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
		"AND", "XOR", "MOD", "SUB", "FUNCTION", "IDPREFIX", "COMMENT", "WS", "ErrorCharacter"
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
			setState(94);
			main();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==FUNCTION) {
				{
				{
				setState(95);
				funproc();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
			setState(103);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case PRINT:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case DIM:
			case IDPREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				command();
				setState(106);
				commands();
				}
				break;
			case EOF:
			case ELSE:
			case END:
			case WEND:
			case LOOP:
			case STEP:
			case NEXT:
			case SUB:
			case FUNCTION:
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
		public Call_subContext call_sub() {
			return getRuleContext(Call_subContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				while_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				do_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				do_until();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				call_sub();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				print();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				input();
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(QB64Parser.INPUT, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INPUT);
			setState(124);
			id_list();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(QB64Parser.PRINT, 0); }
		public Print_listContext print_list() {
			return getRuleContext(Print_listContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(PRINT);
			setState(127);
			print_list();
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
		public List<TerminalNode> IF() { return getTokens(QB64Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(QB64Parser.IF, i);
		}
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
		public TerminalNode END() { return getToken(QB64Parser.END, 0); }
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
		enterRule(_localctx, 12, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(130);
			expression(0);
			setState(131);
			match(THEN);
			setState(132);
			commands();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(134);
				commands();
				}
			}

			setState(137);
			match(END);
			setState(138);
			match(IF);
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
		enterRule(_localctx, 14, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(WHILE);
			setState(141);
			expression(0);
			setState(142);
			commands();
			setState(143);
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
		enterRule(_localctx, 16, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DO);
			setState(146);
			commands();
			setState(147);
			match(LOOP);
			setState(148);
			match(WHILE);
			setState(149);
			expression(0);
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
		enterRule(_localctx, 18, RULE_do_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DO);
			setState(152);
			commands();
			setState(153);
			match(LOOP);
			setState(154);
			match(UNTIL);
			setState(155);
			expression(0);
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
		public Single_numeric_assignmentContext single_numeric_assignment() {
			return getRuleContext(Single_numeric_assignmentContext.class,0);
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
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
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
		enterRule(_localctx, 20, RULE_for_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(FOR);
			setState(158);
			single_numeric_assignment();
			setState(159);
			match(TO);
			setState(160);
			expression(0);
			setState(161);
			commands();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(162);
				match(STEP);
				setState(163);
				expression(0);
				}
			}

			setState(166);
			match(NEXT);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(167);
				match(IDPREFIX);
				}
				break;
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
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(DIM);
			setState(171);
			id_list();
			setState(172);
			match(AS);
			setState(173);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_id_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			id();
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(COMMA);
					setState(177);
					id_list();
					}
					} 
				}
				setState(182);
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

	public static class Print_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(QB64Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(QB64Parser.SEMICOLON, i);
		}
		public List<Print_listContext> print_list() {
			return getRuleContexts(Print_listContext.class);
		}
		public Print_listContext print_list(int i) {
			return getRuleContext(Print_listContext.class,i);
		}
		public Print_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterPrint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitPrint_list(this);
		}
	}

	public final Print_listContext print_list() throws RecognitionException {
		Print_listContext _localctx = new Print_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(183);
				expression(0);
				}
				break;
			case 2:
				{
				setState(184);
				id();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(SEMICOLON);
					setState(188);
					print_list();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUALOP() { return getToken(QB64Parser.EQUALOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			id();
			setState(195);
			match(EQUALOP);
			setState(196);
			expression(0);
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

	public static class Single_numeric_assignmentContext extends ParserRuleContext {
		public Single_numeric_idContext single_numeric_id() {
			return getRuleContext(Single_numeric_idContext.class,0);
		}
		public TerminalNode EQUALOP() { return getToken(QB64Parser.EQUALOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Single_numeric_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_numeric_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_numeric_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_numeric_assignment(this);
		}
	}

	public final Single_numeric_assignmentContext single_numeric_assignment() throws RecognitionException {
		Single_numeric_assignmentContext _localctx = new Single_numeric_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_single_numeric_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			single_numeric_id();
			setState(199);
			match(EQUALOP);
			setState(200);
			expression(0);
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

	public static class Array_numeric_assignmentContext extends ParserRuleContext {
		public Array_numeric_idContext array_numeric_id() {
			return getRuleContext(Array_numeric_idContext.class,0);
		}
		public TerminalNode EQUALOP() { return getToken(QB64Parser.EQUALOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_numeric_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_numeric_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_numeric_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_numeric_assignment(this);
		}
	}

	public final Array_numeric_assignmentContext array_numeric_assignment() throws RecognitionException {
		Array_numeric_assignmentContext _localctx = new Array_numeric_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_numeric_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			array_numeric_id();
			setState(203);
			match(EQUALOP);
			setState(204);
			expression(0);
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

	public static class IdContext extends ParserRuleContext {
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				single_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				array_id();
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

	public static class Single_idContext extends ParserRuleContext {
		public Single_numeric_idContext single_numeric_id() {
			return getRuleContext(Single_numeric_idContext.class,0);
		}
		public Single_id_stringContext single_id_string() {
			return getRuleContext(Single_id_stringContext.class,0);
		}
		public Single_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_id(this);
		}
	}

	public final Single_idContext single_id() throws RecognitionException {
		Single_idContext _localctx = new Single_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_single_id);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				single_numeric_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				single_id_string();
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

	public static class Single_numeric_idContext extends ParserRuleContext {
		public Single_id_intContext single_id_int() {
			return getRuleContext(Single_id_intContext.class,0);
		}
		public Single_id_longContext single_id_long() {
			return getRuleContext(Single_id_longContext.class,0);
		}
		public Single_id_singleContext single_id_single() {
			return getRuleContext(Single_id_singleContext.class,0);
		}
		public Single_id_doubleContext single_id_double() {
			return getRuleContext(Single_id_doubleContext.class,0);
		}
		public Single_numeric_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_numeric_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_numeric_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_numeric_id(this);
		}
	}

	public final Single_numeric_idContext single_numeric_id() throws RecognitionException {
		Single_numeric_idContext _localctx = new Single_numeric_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_single_numeric_id);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				single_id_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				single_id_long();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				single_id_single();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				single_id_double();
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

	public static class Array_idContext extends ParserRuleContext {
		public Array_numeric_idContext array_numeric_id() {
			return getRuleContext(Array_numeric_idContext.class,0);
		}
		public Array_id_stringContext array_id_string() {
			return getRuleContext(Array_id_stringContext.class,0);
		}
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_id(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array_id);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				array_numeric_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				array_id_string();
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

	public static class Array_numeric_idContext extends ParserRuleContext {
		public Array_id_intContext array_id_int() {
			return getRuleContext(Array_id_intContext.class,0);
		}
		public Array_id_longContext array_id_long() {
			return getRuleContext(Array_id_longContext.class,0);
		}
		public Array_id_singleContext array_id_single() {
			return getRuleContext(Array_id_singleContext.class,0);
		}
		public Array_id_doubleContext array_id_double() {
			return getRuleContext(Array_id_doubleContext.class,0);
		}
		public Array_numeric_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_numeric_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_numeric_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_numeric_id(this);
		}
	}

	public final Array_numeric_idContext array_numeric_id() throws RecognitionException {
		Array_numeric_idContext _localctx = new Array_numeric_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_numeric_id);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				array_id_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				array_id_long();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				array_id_single();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				array_id_double();
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

	public static class Array_id_intContext extends ParserRuleContext {
		public Single_id_intContext single_id_int() {
			return getRuleContext(Single_id_intContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public Array_id_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_id_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_id_int(this);
		}
	}

	public final Array_id_intContext array_id_int() throws RecognitionException {
		Array_id_intContext _localctx = new Array_id_intContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_id_int);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			single_id_int();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					array();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Array_id_longContext extends ParserRuleContext {
		public Single_id_longContext single_id_long() {
			return getRuleContext(Single_id_longContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public Array_id_longContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_id_long(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_id_long(this);
		}
	}

	public final Array_id_longContext array_id_long() throws RecognitionException {
		Array_id_longContext _localctx = new Array_id_longContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_id_long);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			single_id_long();
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					array();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Array_id_singleContext extends ParserRuleContext {
		public Single_id_singleContext single_id_single() {
			return getRuleContext(Single_id_singleContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public Array_id_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_id_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_id_single(this);
		}
	}

	public final Array_id_singleContext array_id_single() throws RecognitionException {
		Array_id_singleContext _localctx = new Array_id_singleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_array_id_single);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			single_id_single();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					array();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Array_id_doubleContext extends ParserRuleContext {
		public Single_id_doubleContext single_id_double() {
			return getRuleContext(Single_id_doubleContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public Array_id_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_id_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_id_double(this);
		}
	}

	public final Array_id_doubleContext array_id_double() throws RecognitionException {
		Array_id_doubleContext _localctx = new Array_id_doubleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array_id_double);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			single_id_double();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					array();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Array_id_stringContext extends ParserRuleContext {
		public Single_id_stringContext single_id_string() {
			return getRuleContext(Single_id_stringContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public Array_id_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray_id_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray_id_string(this);
		}
	}

	public final Array_id_stringContext array_id_string() throws RecognitionException {
		Array_id_stringContext _localctx = new Array_id_stringContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_id_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			single_id_string();
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259);
					array();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Single_id_intContext extends ParserRuleContext {
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
		public TerminalNode INTEGERSUFFIX() { return getToken(QB64Parser.INTEGERSUFFIX, 0); }
		public Single_id_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_id_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_id_int(this);
		}
	}

	public final Single_id_intContext single_id_int() throws RecognitionException {
		Single_id_intContext _localctx = new Single_id_intContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_single_id_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IDPREFIX);
			setState(266);
			match(INTEGERSUFFIX);
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

	public static class Single_id_longContext extends ParserRuleContext {
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
		public TerminalNode LONGSUFFIX() { return getToken(QB64Parser.LONGSUFFIX, 0); }
		public Single_id_longContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_id_long(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_id_long(this);
		}
	}

	public final Single_id_longContext single_id_long() throws RecognitionException {
		Single_id_longContext _localctx = new Single_id_longContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_single_id_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDPREFIX);
			setState(269);
			match(LONGSUFFIX);
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

	public static class Single_id_singleContext extends ParserRuleContext {
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
		public TerminalNode SINGLESUFFIX() { return getToken(QB64Parser.SINGLESUFFIX, 0); }
		public Single_id_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_id_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_id_single(this);
		}
	}

	public final Single_id_singleContext single_id_single() throws RecognitionException {
		Single_id_singleContext _localctx = new Single_id_singleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_single_id_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IDPREFIX);
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(272);
				match(SINGLESUFFIX);
				}
				break;
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

	public static class Single_id_doubleContext extends ParserRuleContext {
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
		public TerminalNode DOUBLESUFFIX() { return getToken(QB64Parser.DOUBLESUFFIX, 0); }
		public Single_id_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_id_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_id_double(this);
		}
	}

	public final Single_id_doubleContext single_id_double() throws RecognitionException {
		Single_id_doubleContext _localctx = new Single_id_doubleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_single_id_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDPREFIX);
			setState(276);
			match(DOUBLESUFFIX);
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

	public static class Single_id_stringContext extends ParserRuleContext {
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
		public TerminalNode STRINGSUFFIX() { return getToken(QB64Parser.STRINGSUFFIX, 0); }
		public Single_id_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSingle_id_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSingle_id_string(this);
		}
	}

	public final Single_id_stringContext single_id_string() throws RecognitionException {
		Single_id_stringContext _localctx = new Single_id_stringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_single_id_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IDPREFIX);
			setState(279);
			match(STRINGSUFFIX);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(QB64Parser.LEFTPAR, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(QB64Parser.RIGHTPAR, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LEFTPAR);
			setState(282);
			expression_list();
			setState(283);
			match(RIGHTPAR);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(QB64Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QB64Parser.COMMA, i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expression(0);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					match(COMMA);
					setState(287);
					expression_list();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SUBOP() { return getToken(QB64Parser.SUBOP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NegopContext negop() {
			return getRuleContext(NegopContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(QB64Parser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(QB64Parser.RIGHTPAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode POTOP() { return getToken(QB64Parser.POTOP, 0); }
		public ProopContext proop() {
			return getRuleContext(ProopContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(QB64Parser.ADDOP, 0); }
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(294);
				value();
				}
				break;
			case 2:
				{
				setState(295);
				match(SUBOP);
				setState(296);
				expression(7);
				}
				break;
			case 3:
				{
				setState(297);
				negop();
				setState(298);
				expression(6);
				}
				break;
			case 4:
				{
				setState(300);
				call_function();
				}
				break;
			case 5:
				{
				setState(301);
				match(LEFTPAR);
				setState(302);
				expression(0);
				setState(303);
				match(RIGHTPAR);
				}
				break;
			case 6:
				{
				setState(305);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(309);
						match(POTOP);
						setState(310);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(312);
						proop();
						setState(313);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(316);
						match(SUBOP);
						setState(317);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(319);
						match(ADDOP);
						setState(320);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(322);
						compop();
						setState(323);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(326);
						binop();
						setState(327);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Numeric_valueContext numeric_value() {
			return getRuleContext(Numeric_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERVALUE:
			case LONGVALUE:
			case SINGLEVALUE:
			case DOUBLEVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				numeric_value();
				}
				break;
			case STRINGVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				string_value();
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

	public static class Numeric_valueContext extends ParserRuleContext {
		public TerminalNode INTEGERVALUE() { return getToken(QB64Parser.INTEGERVALUE, 0); }
		public TerminalNode LONGVALUE() { return getToken(QB64Parser.LONGVALUE, 0); }
		public TerminalNode SINGLEVALUE() { return getToken(QB64Parser.SINGLEVALUE, 0); }
		public TerminalNode DOUBLEVALUE() { return getToken(QB64Parser.DOUBLEVALUE, 0); }
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
		enterRule(_localctx, 72, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERVALUE) | (1L << LONGVALUE) | (1L << SINGLEVALUE) | (1L << DOUBLEVALUE))) != 0)) ) {
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

	public static class String_valueContext extends ParserRuleContext {
		public TerminalNode STRINGVALUE() { return getToken(QB64Parser.STRINGVALUE, 0); }
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitString_value(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(STRINGVALUE);
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
		enterRule(_localctx, 76, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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

	public static class FunprocContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(QB64Parser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(QB64Parser.FUNCTION, i);
		}
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64Parser.END, 0); }
		public TerminalNode LEFTPAR() { return getToken(QB64Parser.LEFTPAR, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(QB64Parser.RIGHTPAR, 0); }
		public List<TerminalNode> SUB() { return getTokens(QB64Parser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(QB64Parser.SUB, i);
		}
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
		enterRule(_localctx, 78, RULE_funproc);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(FUNCTION);
				setState(345);
				single_id();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(346);
					match(LEFTPAR);
					setState(347);
					id_list();
					setState(348);
					match(RIGHTPAR);
					}
				}

				setState(352);
				commands();
				setState(353);
				match(END);
				setState(354);
				match(FUNCTION);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(SUB);
				setState(357);
				single_id();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(358);
					match(LEFTPAR);
					setState(359);
					id_list();
					setState(360);
					match(RIGHTPAR);
					}
				}

				setState(364);
				commands();
				setState(365);
				match(END);
				setState(366);
				match(SUB);
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

	public static class Call_subContext extends ParserRuleContext {
		public TerminalNode IDPREFIX() { return getToken(QB64Parser.IDPREFIX, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public Call_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterCall_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitCall_sub(this);
		}
	}

	public final Call_subContext call_sub() throws RecognitionException {
		Call_subContext _localctx = new Call_subContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_call_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(IDPREFIX);
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(371);
				parameters_list();
				}
				break;
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

	public static class Call_functionContext extends ParserRuleContext {
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(QB64Parser.LEFTPAR, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(QB64Parser.RIGHTPAR, 0); }
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitCall_function(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			single_id();
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(375);
				match(LEFTPAR);
				setState(376);
				parameters_list();
				setState(377);
				match(RIGHTPAR);
				}
				break;
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

	public static class Parameters_listContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(QB64Parser.LEFTPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(QB64Parser.RIGHTPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QB64Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QB64Parser.COMMA, i);
		}
		public List<Parameters_listContext> parameters_list() {
			return getRuleContexts(Parameters_listContext.class);
		}
		public Parameters_listContext parameters_list(int i) {
			return getRuleContext(Parameters_listContext.class,i);
		}
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterParameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitParameters_list(this);
		}
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameters_list);
		try {
			int _alt;
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(381);
				match(LEFTPAR);
				setState(382);
				expression(0);
				setState(383);
				match(RIGHTPAR);
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						match(COMMA);
						setState(386);
						parameters_list();
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				expression(0);
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(393);
						match(COMMA);
						setState(394);
						parameters_list();
						}
						} 
					}
					setState(399);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
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

	public static class NegopContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(QB64Parser.NOT, 0); }
		public NegopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterNegop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitNegop(this);
		}
	}

	public final NegopContext negop() throws RecognitionException {
		NegopContext _localctx = new NegopContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_negop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(NOT);
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

	public static class CompopContext extends ParserRuleContext {
		public TerminalNode DIFFOP() { return getToken(QB64Parser.DIFFOP, 0); }
		public TerminalNode LESSOP() { return getToken(QB64Parser.LESSOP, 0); }
		public TerminalNode LESSOREQUALOP() { return getToken(QB64Parser.LESSOREQUALOP, 0); }
		public TerminalNode GREATER() { return getToken(QB64Parser.GREATER, 0); }
		public TerminalNode GREATEROREQUAL() { return getToken(QB64Parser.GREATEROREQUAL, 0); }
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFFOP) | (1L << LESSOP) | (1L << LESSOREQUALOP) | (1L << GREATER) | (1L << GREATEROREQUAL))) != 0)) ) {
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(QB64Parser.OR, 0); }
		public TerminalNode AND() { return getToken(QB64Parser.AND, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class ProopContext extends ParserRuleContext {
		public TerminalNode DIVOP() { return getToken(QB64Parser.DIVOP, 0); }
		public TerminalNode PRODUCTOP() { return getToken(QB64Parser.PRODUCTOP, 0); }
		public TerminalNode MOD() { return getToken(QB64Parser.MOD, 0); }
		public ProopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterProop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitProop(this);
		}
	}

	public final ProopContext proop() throws RecognitionException {
		ProopContext _localctx = new ProopContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_proop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVOP) | (1L << PRODUCTOP) | (1L << MOD))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u019d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\f\3\f"+
		"\5\f\u00ab\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00b5\n\16\f\16"+
		"\16\16\u00b8\13\16\3\17\3\17\5\17\u00bc\n\17\3\17\3\17\7\17\u00c0\n\17"+
		"\f\17\16\17\u00c3\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\5\24\u00d7\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\5\26\u00e1\n\26\3\27\3\27\3"+
		"\27\3\27\5\27\u00e7\n\27\3\30\3\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13"+
		"\30\3\31\3\31\7\31\u00f2\n\31\f\31\16\31\u00f5\13\31\3\32\3\32\7\32\u00f9"+
		"\n\32\f\32\16\32\u00fc\13\32\3\33\3\33\7\33\u0100\n\33\f\33\16\33\u0103"+
		"\13\33\3\34\3\34\7\34\u0107\n\34\f\34\16\34\u010a\13\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\5\37\u0114\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\7#\u0123\n#\f#\16#\u0126\13#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u0135\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\7$\u014c\n$\f$\16$\u014f\13$\3%\3%\5%\u0153\n%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\5)\u0161\n)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u016d\n)\3)\3)\3)\3)\5)\u0173\n)\3*\3*\5*\u0177\n*\3+\3+\3"+
		"+\3+\3+\5+\u017e\n+\3,\3,\3,\3,\3,\3,\7,\u0186\n,\f,\16,\u0189\13,\3,"+
		"\3,\3,\7,\u018e\n,\f,\16,\u0191\13,\5,\u0193\n,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\60\2\3F\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\7\3\2\b\13\3\2,\60\3\2\23\27\3\2\64\65"+
		"\4\2\17\20\67\67\u01a2\2`\3\2\2\2\4i\3\2\2\2\6o\3\2\2\2\b{\3\2\2\2\n}"+
		"\3\2\2\2\f\u0080\3\2\2\2\16\u0083\3\2\2\2\20\u008e\3\2\2\2\22\u0093\3"+
		"\2\2\2\24\u0099\3\2\2\2\26\u009f\3\2\2\2\30\u00ac\3\2\2\2\32\u00b1\3\2"+
		"\2\2\34\u00bb\3\2\2\2\36\u00c4\3\2\2\2 \u00c8\3\2\2\2\"\u00cc\3\2\2\2"+
		"$\u00d2\3\2\2\2&\u00d6\3\2\2\2(\u00dc\3\2\2\2*\u00e0\3\2\2\2,\u00e6\3"+
		"\2\2\2.\u00e8\3\2\2\2\60\u00ef\3\2\2\2\62\u00f6\3\2\2\2\64\u00fd\3\2\2"+
		"\2\66\u0104\3\2\2\28\u010b\3\2\2\2:\u010e\3\2\2\2<\u0111\3\2\2\2>\u0115"+
		"\3\2\2\2@\u0118\3\2\2\2B\u011b\3\2\2\2D\u011f\3\2\2\2F\u0134\3\2\2\2H"+
		"\u0152\3\2\2\2J\u0154\3\2\2\2L\u0156\3\2\2\2N\u0158\3\2\2\2P\u0172\3\2"+
		"\2\2R\u0174\3\2\2\2T\u0178\3\2\2\2V\u0192\3\2\2\2X\u0194\3\2\2\2Z\u0196"+
		"\3\2\2\2\\\u0198\3\2\2\2^\u019a\3\2\2\2`d\5\4\3\2ac\5P)\2ba\3\2\2\2cf"+
		"\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\2\2\3h\3\3\2\2\2"+
		"ij\5\6\4\2j\5\3\2\2\2kl\5\b\5\2lm\5\6\4\2mp\3\2\2\2np\3\2\2\2ok\3\2\2"+
		"\2on\3\2\2\2p\7\3\2\2\2q|\5\16\b\2r|\5\20\t\2s|\5\22\n\2t|\5\24\13\2u"+
		"|\5\26\f\2v|\5R*\2w|\5\30\r\2x|\5\36\20\2y|\5\f\7\2z|\5\n\6\2{q\3\2\2"+
		"\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2"+
		"\2{y\3\2\2\2{z\3\2\2\2|\t\3\2\2\2}~\7\35\2\2~\177\5\32\16\2\177\13\3\2"+
		"\2\2\u0080\u0081\7\36\2\2\u0081\u0082\5\34\17\2\u0082\r\3\2\2\2\u0083"+
		"\u0084\7\37\2\2\u0084\u0085\5F$\2\u0085\u0086\7 \2\2\u0086\u0089\5\6\4"+
		"\2\u0087\u0088\7!\2\2\u0088\u008a\5\6\4\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\"\2\2\u008c\u008d\7\37\2\2"+
		"\u008d\17\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\5F$\2\u0090\u0091\5\6"+
		"\4\2\u0091\u0092\7$\2\2\u0092\21\3\2\2\2\u0093\u0094\7%\2\2\u0094\u0095"+
		"\5\6\4\2\u0095\u0096\7&\2\2\u0096\u0097\7#\2\2\u0097\u0098\5F$\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\7%\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7&\2\2"+
		"\u009c\u009d\7\'\2\2\u009d\u009e\5F$\2\u009e\25\3\2\2\2\u009f\u00a0\7"+
		"(\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\5F$\2\u00a3\u00a6"+
		"\5\6\4\2\u00a4\u00a5\7*\2\2\u00a5\u00a7\5F$\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7+\2\2\u00a9\u00ab\7:\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\27\3\2\2\2\u00ac\u00ad"+
		"\7\61\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7\62\2\2\u00af\u00b0\5N(\2"+
		"\u00b0\31\3\2\2\2\u00b1\u00b6\5$\23\2\u00b2\u00b3\7\32\2\2\u00b3\u00b5"+
		"\5\32\16\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc"+
		"\5F$\2\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00c1\3\2\2\2\u00bd\u00be\7\30\2\2\u00be\u00c0\5\34\17\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\35\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\7\r\2"+
		"\2\u00c6\u00c7\5F$\2\u00c7\37\3\2\2\2\u00c8\u00c9\5(\25\2\u00c9\u00ca"+
		"\7\r\2\2\u00ca\u00cb\5F$\2\u00cb!\3\2\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce"+
		"\7\r\2\2\u00ce\u00cf\5F$\2\u00cf#\3\2\2\2\u00d0\u00d3\5&\24\2\u00d1\u00d3"+
		"\5*\26\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3%\3\2\2\2\u00d4"+
		"\u00d7\5(\25\2\u00d5\u00d7\5@!\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2"+
		"\2\u00d7\'\3\2\2\2\u00d8\u00dd\58\35\2\u00d9\u00dd\5:\36\2\u00da\u00dd"+
		"\5<\37\2\u00db\u00dd\5> \2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd)\3\2\2\2\u00de\u00e1\5,\27\2"+
		"\u00df\u00e1\5\66\34\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1+"+
		"\3\2\2\2\u00e2\u00e7\5.\30\2\u00e3\u00e7\5\60\31\2\u00e4\u00e7\5\62\32"+
		"\2\u00e5\u00e7\5\64\33\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7-\3\2\2\2\u00e8\u00ec\58\35\2"+
		"\u00e9\u00eb\5B\"\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed/\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f3\5:\36\2\u00f0\u00f2\5B\"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\61\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00fa\5<\37\2\u00f7\u00f9\5B\"\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\63\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fd\u0101\5> \2\u00fe\u0100\5B\"\2\u00ff\u00fe"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\65\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0108\5@!\2\u0105\u0107\5B\"\2\u0106"+
		"\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\67\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7:\2\2\u010c\u010d"+
		"\7\3\2\2\u010d9\3\2\2\2\u010e\u010f\7:\2\2\u010f\u0110\7\4\2\2\u0110;"+
		"\3\2\2\2\u0111\u0113\7:\2\2\u0112\u0114\7\5\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114=\3\2\2\2\u0115\u0116\7:\2\2\u0116\u0117\7\6\2\2\u0117"+
		"?\3\2\2\2\u0118\u0119\7:\2\2\u0119\u011a\7\7\2\2\u011aA\3\2\2\2\u011b"+
		"\u011c\7\33\2\2\u011c\u011d\5D#\2\u011d\u011e\7\34\2\2\u011eC\3\2\2\2"+
		"\u011f\u0124\5F$\2\u0120\u0121\7\32\2\2\u0121\u0123\5D#\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"E\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\b$\1\2\u0128\u0135\5H%\2\u0129"+
		"\u012a\7\22\2\2\u012a\u0135\5F$\t\u012b\u012c\5X-\2\u012c\u012d\5F$\b"+
		"\u012d\u0135\3\2\2\2\u012e\u0135\5T+\2\u012f\u0130\7\33\2\2\u0130\u0131"+
		"\5F$\2\u0131\u0132\7\34\2\2\u0132\u0135\3\2\2\2\u0133\u0135\5$\23\2\u0134"+
		"\u0127\3\2\2\2\u0134\u0129\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u012e\3\2"+
		"\2\2\u0134\u012f\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u014d\3\2\2\2\u0136"+
		"\u0137\f\r\2\2\u0137\u0138\7\16\2\2\u0138\u014c\5F$\16\u0139\u013a\f\f"+
		"\2\2\u013a\u013b\5^\60\2\u013b\u013c\5F$\r\u013c\u014c\3\2\2\2\u013d\u013e"+
		"\f\13\2\2\u013e\u013f\7\22\2\2\u013f\u014c\5F$\f\u0140\u0141\f\n\2\2\u0141"+
		"\u0142\7\21\2\2\u0142\u014c\5F$\13\u0143\u0144\f\7\2\2\u0144\u0145\5Z"+
		".\2\u0145\u0146\5F$\b\u0146\u014c\3\2\2\2\u0147\u0148\f\6\2\2\u0148\u0149"+
		"\5\\/\2\u0149\u014a\5F$\7\u014a\u014c\3\2\2\2\u014b\u0136\3\2\2\2\u014b"+
		"\u0139\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0143\3\2"+
		"\2\2\u014b\u0147\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014eG\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\5J&\2\u0151"+
		"\u0153\5L\'\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153I\3\2\2\2\u0154"+
		"\u0155\t\2\2\2\u0155K\3\2\2\2\u0156\u0157\7\f\2\2\u0157M\3\2\2\2\u0158"+
		"\u0159\t\3\2\2\u0159O\3\2\2\2\u015a\u015b\79\2\2\u015b\u0160\5&\24\2\u015c"+
		"\u015d\7\33\2\2\u015d\u015e\5\32\16\2\u015e\u015f\7\34\2\2\u015f\u0161"+
		"\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\5\6\4\2\u0163\u0164\7\"\2\2\u0164\u0165\79\2\2\u0165\u0173\3\2"+
		"\2\2\u0166\u0167\78\2\2\u0167\u016c\5&\24\2\u0168\u0169\7\33\2\2\u0169"+
		"\u016a\5\32\16\2\u016a\u016b\7\34\2\2\u016b\u016d\3\2\2\2\u016c\u0168"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\5\6\4\2\u016f"+
		"\u0170\7\"\2\2\u0170\u0171\78\2\2\u0171\u0173\3\2\2\2\u0172\u015a\3\2"+
		"\2\2\u0172\u0166\3\2\2\2\u0173Q\3\2\2\2\u0174\u0176\7:\2\2\u0175\u0177"+
		"\5V,\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177S\3\2\2\2\u0178\u017d"+
		"\5&\24\2\u0179\u017a\7\33\2\2\u017a\u017b\5V,\2\u017b\u017c\7\34\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017e\3\2\2\2\u017eU\3\2\2\2"+
		"\u017f\u0180\7\33\2\2\u0180\u0181\5F$\2\u0181\u0182\7\34\2\2\u0182\u0187"+
		"\3\2\2\2\u0183\u0184\7\32\2\2\u0184\u0186\5V,\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0193\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018f\5F$\2\u018b\u018c\7\32\2\2\u018c"+
		"\u018e\5V,\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u017f"+
		"\3\2\2\2\u0192\u018a\3\2\2\2\u0193W\3\2\2\2\u0194\u0195\7\63\2\2\u0195"+
		"Y\3\2\2\2\u0196\u0197\t\4\2\2\u0197[\3\2\2\2\u0198\u0199\t\5\2\2\u0199"+
		"]\3\2\2\2\u019a\u019b\t\6\2\2\u019b_\3\2\2\2#do{\u0089\u00a6\u00aa\u00b6"+
		"\u00bb\u00c1\u00d2\u00d6\u00dc\u00e0\u00e6\u00ec\u00f3\u00fa\u0101\u0108"+
		"\u0113\u0124\u0134\u014b\u014d\u0152\u0160\u016c\u0172\u0176\u017d\u0187"+
		"\u018f\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		FUNCTION=55, SELECT=56, CASE=57, SHARED=58, CONST=59, IDPREFIX=60, COMMENT=61, 
		WS=62, ErrorCharacter=63;
	public static final int
		RULE_qb = 0, RULE_main = 1, RULE_commands = 2, RULE_command = 3, RULE_input = 4, 
		RULE_print = 5, RULE_print_list = 6, RULE_if_ = 7, RULE_while_ = 8, RULE_do_while = 9, 
		RULE_do_until = 10, RULE_for_ = 11, RULE_select_ = 12, RULE_cases_list = 13, 
		RULE_declaration = 14, RULE_id_list = 15, RULE_const_declaration = 16, 
		RULE_const_declaration_list = 17, RULE_assignment = 18, RULE_single_numeric_assignment = 19, 
		RULE_array_numeric_assignment = 20, RULE_id = 21, RULE_single_id = 22, 
		RULE_single_numeric_id = 23, RULE_array_id = 24, RULE_array_numeric_id = 25, 
		RULE_array_id_int = 26, RULE_array_id_long = 27, RULE_array_id_single = 28, 
		RULE_array_id_double = 29, RULE_array_id_string = 30, RULE_single_id_int = 31, 
		RULE_single_id_long = 32, RULE_single_id_single = 33, RULE_single_id_double = 34, 
		RULE_single_id_string = 35, RULE_array = 36, RULE_expression_list = 37, 
		RULE_expression = 38, RULE_value = 39, RULE_numeric_value = 40, RULE_string_value = 41, 
		RULE_type = 42, RULE_funproc = 43, RULE_call_sub = 44, RULE_call_function = 45, 
		RULE_parameters_list = 46, RULE_negop = 47, RULE_compop = 48, RULE_binop = 49, 
		RULE_proop = 50;
	public static final String[] ruleNames = {
		"qb", "main", "commands", "command", "input", "print", "print_list", "if_", 
		"while_", "do_while", "do_until", "for_", "select_", "cases_list", "declaration", 
		"id_list", "const_declaration", "const_declaration_list", "assignment", 
		"single_numeric_assignment", "array_numeric_assignment", "id", "single_id", 
		"single_numeric_id", "array_id", "array_numeric_id", "array_id_int", "array_id_long", 
		"array_id_single", "array_id_double", "array_id_string", "single_id_int", 
		"single_id_long", "single_id_single", "single_id_double", "single_id_string", 
		"array", "expression_list", "expression", "value", "numeric_value", "string_value", 
		"type", "funproc", "call_sub", "call_function", "parameters_list", "negop", 
		"compop", "binop", "proop"
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
		"AND", "XOR", "MOD", "SUB", "FUNCTION", "SELECT", "CASE", "SHARED", "CONST", 
		"IDPREFIX", "COMMENT", "WS", "ErrorCharacter"
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
			setState(102);
			main();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==FUNCTION) {
				{
				{
				setState(103);
				funproc();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
			setState(111);
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
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case PRINT:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case DIM:
			case SELECT:
			case CONST:
			case IDPREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				command();
				setState(114);
				commands();
				}
				break;
			case EOF:
			case ELSE:
			case END:
			case WEND:
			case LOOP:
			case NEXT:
			case SUB:
			case FUNCTION:
			case CASE:
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
		public Select_Context select_() {
			return getRuleContext(Select_Context.class,0);
		}
		public Call_subContext call_sub() {
			return getRuleContext(Call_subContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Const_declarationContext const_declaration() {
			return getRuleContext(Const_declarationContext.class,0);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				while_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				do_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				do_until();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				select_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				call_sub();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				const_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				assignment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				print();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
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
		public TerminalNode STRINGVALUE() { return getToken(QB64Parser.STRINGVALUE, 0); }
		public TerminalNode COMMA() { return getToken(QB64Parser.COMMA, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(INPUT);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRINGVALUE) {
				{
				setState(134);
				match(STRINGVALUE);
				setState(135);
				match(COMMA);
				}
			}

			setState(138);
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
			setState(140);
			match(PRINT);
			setState(141);
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
		enterRule(_localctx, 12, RULE_print_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(143);
				expression(0);
				}
				break;
			case 2:
				{
				setState(144);
				id();
				}
				break;
			}
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					match(SEMICOLON);
					setState(148);
					print_list();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(154);
				match(SEMICOLON);
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
		enterRule(_localctx, 14, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IF);
			setState(158);
			expression(0);
			setState(159);
			match(THEN);
			setState(160);
			commands();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(161);
				match(ELSE);
				setState(162);
				commands();
				}
			}

			setState(165);
			match(END);
			setState(166);
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
		enterRule(_localctx, 16, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			expression(0);
			setState(170);
			commands();
			setState(171);
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
		enterRule(_localctx, 18, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(DO);
			setState(174);
			commands();
			setState(175);
			match(LOOP);
			setState(176);
			match(WHILE);
			setState(177);
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
		enterRule(_localctx, 20, RULE_do_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(DO);
			setState(180);
			commands();
			setState(181);
			match(LOOP);
			setState(182);
			match(UNTIL);
			setState(183);
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
		enterRule(_localctx, 22, RULE_for_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(FOR);
			setState(186);
			single_numeric_assignment();
			setState(187);
			match(TO);
			setState(188);
			expression(0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(189);
				match(STEP);
				setState(190);
				expression(0);
				}
			}

			setState(193);
			commands();
			setState(194);
			match(NEXT);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(195);
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

	public static class Select_Context extends ParserRuleContext {
		public List<TerminalNode> SELECT() { return getTokens(QB64Parser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(QB64Parser.SELECT, i);
		}
		public List<TerminalNode> CASE() { return getTokens(QB64Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(QB64Parser.CASE, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64Parser.END, 0); }
		public List<Cases_listContext> cases_list() {
			return getRuleContexts(Cases_listContext.class);
		}
		public Cases_listContext cases_list(int i) {
			return getRuleContext(Cases_listContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(QB64Parser.ELSE, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Select_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterSelect_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitSelect_(this);
		}
	}

	public final Select_Context select_() throws RecognitionException {
		Select_Context _localctx = new Select_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(SELECT);
			setState(199);
			match(CASE);
			setState(200);
			id();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					cases_list();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(207);
				match(CASE);
				setState(208);
				match(ELSE);
				setState(209);
				commands();
				}
			}

			setState(212);
			match(END);
			setState(213);
			match(SELECT);
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

	public static class Cases_listContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(QB64Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public List<Cases_listContext> cases_list() {
			return getRuleContexts(Cases_listContext.class);
		}
		public Cases_listContext cases_list(int i) {
			return getRuleContext(Cases_listContext.class,i);
		}
		public Cases_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterCases_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitCases_list(this);
		}
	}

	public final Cases_listContext cases_list() throws RecognitionException {
		Cases_listContext _localctx = new Cases_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cases_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(CASE);
			setState(216);
			expression(0);
			setState(217);
			commands();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					cases_list();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode SHARED() { return getToken(QB64Parser.SHARED, 0); }
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
		enterRule(_localctx, 28, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DIM);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(225);
				match(SHARED);
				}
			}

			setState(228);
			id_list();
			setState(229);
			match(AS);
			setState(230);
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
		enterRule(_localctx, 30, RULE_id_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			id();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(COMMA);
					setState(234);
					id_list();
					}
					} 
				}
				setState(239);
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

	public static class Const_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(QB64Parser.CONST, 0); }
		public Const_declaration_listContext const_declaration_list() {
			return getRuleContext(Const_declaration_listContext.class,0);
		}
		public Const_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterConst_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitConst_declaration(this);
		}
	}

	public final Const_declarationContext const_declaration() throws RecognitionException {
		Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_const_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CONST);
			setState(241);
			const_declaration_list();
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

	public static class Const_declaration_listContext extends ParserRuleContext {
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public TerminalNode EQUALOP() { return getToken(QB64Parser.EQUALOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(QB64Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QB64Parser.COMMA, i);
		}
		public List<Const_declaration_listContext> const_declaration_list() {
			return getRuleContexts(Const_declaration_listContext.class);
		}
		public Const_declaration_listContext const_declaration_list(int i) {
			return getRuleContext(Const_declaration_listContext.class,i);
		}
		public Const_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).enterConst_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64Listener ) ((QB64Listener)listener).exitConst_declaration_list(this);
		}
	}

	public final Const_declaration_listContext const_declaration_list() throws RecognitionException {
		Const_declaration_listContext _localctx = new Const_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_const_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			single_id();
			setState(244);
			match(EQUALOP);
			setState(245);
			expression(0);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					const_declaration_list();
					}
					} 
				}
				setState(252);
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
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			id();
			setState(254);
			match(EQUALOP);
			setState(255);
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
		enterRule(_localctx, 38, RULE_single_numeric_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			single_numeric_id();
			setState(258);
			match(EQUALOP);
			setState(259);
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
		enterRule(_localctx, 40, RULE_array_numeric_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			array_numeric_id();
			setState(262);
			match(EQUALOP);
			setState(263);
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
		enterRule(_localctx, 42, RULE_id);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				single_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		enterRule(_localctx, 44, RULE_single_id);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				single_numeric_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
		enterRule(_localctx, 46, RULE_single_numeric_id);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				single_id_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				single_id_long();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				single_id_single();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
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
		enterRule(_localctx, 48, RULE_array_id);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				array_numeric_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
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
		enterRule(_localctx, 50, RULE_array_numeric_id);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				array_id_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				array_id_long();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				array_id_single();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
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
		enterRule(_localctx, 52, RULE_array_id_int);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			single_id_int();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					array();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 54, RULE_array_id_long);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			single_id_long();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					array();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 56, RULE_array_id_single);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			single_id_single();
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					array();
					}
					} 
				}
				setState(309);
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
		enterRule(_localctx, 58, RULE_array_id_double);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			single_id_double();
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					array();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 60, RULE_array_id_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			single_id_string();
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					array();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 62, RULE_single_id_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IDPREFIX);
			setState(325);
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
		enterRule(_localctx, 64, RULE_single_id_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(IDPREFIX);
			setState(328);
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
		enterRule(_localctx, 66, RULE_single_id_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IDPREFIX);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(331);
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
		enterRule(_localctx, 68, RULE_single_id_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IDPREFIX);
			setState(335);
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
		enterRule(_localctx, 70, RULE_single_id_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IDPREFIX);
			setState(338);
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
		enterRule(_localctx, 72, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(LEFTPAR);
			setState(341);
			expression_list();
			setState(342);
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
		enterRule(_localctx, 74, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expression(0);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					match(COMMA);
					setState(346);
					expression_list();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(353);
				value();
				}
				break;
			case 2:
				{
				setState(354);
				match(SUBOP);
				setState(355);
				expression(7);
				}
				break;
			case 3:
				{
				setState(356);
				negop();
				setState(357);
				expression(6);
				}
				break;
			case 4:
				{
				setState(359);
				call_function();
				}
				break;
			case 5:
				{
				setState(360);
				match(LEFTPAR);
				setState(361);
				expression(0);
				setState(362);
				match(RIGHTPAR);
				}
				break;
			case 6:
				{
				setState(364);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(368);
						match(POTOP);
						setState(369);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(371);
						proop();
						setState(372);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(375);
						match(SUBOP);
						setState(376);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(378);
						match(ADDOP);
						setState(379);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(381);
						compop();
						setState(382);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(385);
						binop();
						setState(386);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERVALUE:
			case LONGVALUE:
			case SINGLEVALUE:
			case DOUBLEVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				numeric_value();
				}
				break;
			case STRINGVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
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
		enterRule(_localctx, 80, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 82, RULE_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 84, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 86, RULE_funproc);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(FUNCTION);
				setState(404);
				single_id();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(405);
					match(LEFTPAR);
					setState(406);
					id_list();
					setState(407);
					match(RIGHTPAR);
					}
				}

				setState(411);
				commands();
				setState(412);
				match(END);
				setState(413);
				match(FUNCTION);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(SUB);
				setState(416);
				single_id();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(417);
					match(LEFTPAR);
					setState(418);
					id_list();
					setState(419);
					match(RIGHTPAR);
					}
				}

				setState(423);
				commands();
				setState(424);
				match(END);
				setState(425);
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
		enterRule(_localctx, 88, RULE_call_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(IDPREFIX);
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(430);
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
		enterRule(_localctx, 90, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			single_id();
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(434);
				match(LEFTPAR);
				setState(435);
				parameters_list();
				setState(436);
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
		enterRule(_localctx, 92, RULE_parameters_list);
		try {
			int _alt;
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(440);
				match(LEFTPAR);
				setState(441);
				expression(0);
				setState(442);
				match(RIGHTPAR);
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(444);
						match(COMMA);
						setState(445);
						parameters_list();
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				expression(0);
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(452);
						match(COMMA);
						setState(453);
						parameters_list();
						}
						} 
					}
					setState(458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 94, RULE_negop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		enterRule(_localctx, 96, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		public TerminalNode XOR() { return getToken(QB64Parser.XOR, 0); }
		public TerminalNode EQUALOP() { return getToken(QB64Parser.EQUALOP, 0); }
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
		enterRule(_localctx, 98, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALOP) | (1L << OR) | (1L << AND) | (1L << XOR))) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_proop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		case 38:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u01d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4x\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5"+
		"\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u0094\n\b\3"+
		"\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00a6\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00c2\n\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\16\3\16\3\16\3\16\7\16\u00cd\n"+
		"\16\f\16\16\16\u00d0\13\16\3\16\3\16\3\16\5\16\u00d5\n\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\7\17\u00de\n\17\f\17\16\17\u00e1\13\17\3\20\3"+
		"\20\5\20\u00e5\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00ee\n\21"+
		"\f\21\16\21\u00f1\13\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00fb"+
		"\n\23\f\23\16\23\u00fe\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\5\27\u010e\n\27\3\30\3\30\5\30\u0112\n\30"+
		"\3\31\3\31\3\31\3\31\5\31\u0118\n\31\3\32\3\32\5\32\u011c\n\32\3\33\3"+
		"\33\3\33\3\33\5\33\u0122\n\33\3\34\3\34\7\34\u0126\n\34\f\34\16\34\u0129"+
		"\13\34\3\35\3\35\7\35\u012d\n\35\f\35\16\35\u0130\13\35\3\36\3\36\7\36"+
		"\u0134\n\36\f\36\16\36\u0137\13\36\3\37\3\37\7\37\u013b\n\37\f\37\16\37"+
		"\u013e\13\37\3 \3 \7 \u0142\n \f \16 \u0145\13 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\5#\u014f\n#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u015e\n"+
		"\'\f\'\16\'\u0161\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0170"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7("+
		"\u0187\n(\f(\16(\u018a\13(\3)\3)\5)\u018e\n)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\5-\u019c\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01a8\n-\3-\3"+
		"-\3-\3-\5-\u01ae\n-\3.\3.\5.\u01b2\n.\3/\3/\3/\3/\3/\5/\u01b9\n/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u01c1\n\60\f\60\16\60\u01c4\13\60\3\60"+
		"\3\60\3\60\7\60\u01c9\n\60\f\60\16\60\u01cc\13\60\5\60\u01ce\n\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\2\3N\65\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\7\3"+
		"\2\b\13\3\2,\60\3\2\23\27\4\2\r\r\64\66\4\2\17\20\67\67\u01e2\2h\3\2\2"+
		"\2\4q\3\2\2\2\6w\3\2\2\2\b\u0085\3\2\2\2\n\u0087\3\2\2\2\f\u008e\3\2\2"+
		"\2\16\u0093\3\2\2\2\20\u009f\3\2\2\2\22\u00aa\3\2\2\2\24\u00af\3\2\2\2"+
		"\26\u00b5\3\2\2\2\30\u00bb\3\2\2\2\32\u00c8\3\2\2\2\34\u00d9\3\2\2\2\36"+
		"\u00e2\3\2\2\2 \u00ea\3\2\2\2\"\u00f2\3\2\2\2$\u00f5\3\2\2\2&\u00ff\3"+
		"\2\2\2(\u0103\3\2\2\2*\u0107\3\2\2\2,\u010d\3\2\2\2.\u0111\3\2\2\2\60"+
		"\u0117\3\2\2\2\62\u011b\3\2\2\2\64\u0121\3\2\2\2\66\u0123\3\2\2\28\u012a"+
		"\3\2\2\2:\u0131\3\2\2\2<\u0138\3\2\2\2>\u013f\3\2\2\2@\u0146\3\2\2\2B"+
		"\u0149\3\2\2\2D\u014c\3\2\2\2F\u0150\3\2\2\2H\u0153\3\2\2\2J\u0156\3\2"+
		"\2\2L\u015a\3\2\2\2N\u016f\3\2\2\2P\u018d\3\2\2\2R\u018f\3\2\2\2T\u0191"+
		"\3\2\2\2V\u0193\3\2\2\2X\u01ad\3\2\2\2Z\u01af\3\2\2\2\\\u01b3\3\2\2\2"+
		"^\u01cd\3\2\2\2`\u01cf\3\2\2\2b\u01d1\3\2\2\2d\u01d3\3\2\2\2f\u01d5\3"+
		"\2\2\2hl\5\4\3\2ik\5X-\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2"+
		"\2\2nl\3\2\2\2op\7\2\2\3p\3\3\2\2\2qr\5\6\4\2r\5\3\2\2\2st\5\b\5\2tu\5"+
		"\6\4\2ux\3\2\2\2vx\3\2\2\2ws\3\2\2\2wv\3\2\2\2x\7\3\2\2\2y\u0086\5\20"+
		"\t\2z\u0086\5\22\n\2{\u0086\5\24\13\2|\u0086\5\26\f\2}\u0086\5\30\r\2"+
		"~\u0086\5\32\16\2\177\u0086\5Z.\2\u0080\u0086\5\36\20\2\u0081\u0086\5"+
		"\"\22\2\u0082\u0086\5&\24\2\u0083\u0086\5\f\7\2\u0084\u0086\5\n\6\2\u0085"+
		"y\3\2\2\2\u0085z\3\2\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2"+
		"\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\t\3\2\2\2\u0087\u008a\7\35\2\2\u0088\u0089\7\f\2\2\u0089\u008b\7\32\2"+
		"\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\5 \21\2\u008d\13\3\2\2\2\u008e\u008f\7\36\2\2\u008f\u0090\5\16\b\2\u0090"+
		"\r\3\2\2\2\u0091\u0094\5N(\2\u0092\u0094\5,\27\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0096\7\30\2\2\u0096\u0098\5"+
		"\16\b\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\30"+
		"\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a0"+
		"\7\37\2\2\u00a0\u00a1\5N(\2\u00a1\u00a2\7 \2\2\u00a2\u00a5\5\6\4\2\u00a3"+
		"\u00a4\7!\2\2\u00a4\u00a6\5\6\4\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7\37\2\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\5N(\2\u00ac\u00ad\5\6\4\2\u00ad"+
		"\u00ae\7$\2\2\u00ae\23\3\2\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1\5\6\4\2"+
		"\u00b1\u00b2\7&\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\5N(\2\u00b4\25\3\2"+
		"\2\2\u00b5\u00b6\7%\2\2\u00b6\u00b7\5\6\4\2\u00b7\u00b8\7&\2\2\u00b8\u00b9"+
		"\7\'\2\2\u00b9\u00ba\5N(\2\u00ba\27\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc\u00bd"+
		"\5(\25\2\u00bd\u00be\7)\2\2\u00be\u00c1\5N(\2\u00bf\u00c0\7*\2\2\u00c0"+
		"\u00c2\5N(\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2"+
		"\2\u00c3\u00c4\5\6\4\2\u00c4\u00c6\7+\2\2\u00c5\u00c7\7>\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\7:\2\2\u00c9"+
		"\u00ca\7;\2\2\u00ca\u00ce\5,\27\2\u00cb\u00cd\5\34\17\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7;\2\2\u00d2\u00d3\7!\2"+
		"\2\u00d3\u00d5\5\6\4\2\u00d4\u00d1\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8\7:\2\2\u00d8\33\3\2\2\2\u00d9"+
		"\u00da\7;\2\2\u00da\u00db\5N(\2\u00db\u00df\5\6\4\2\u00dc\u00de\5\34\17"+
		"\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\35\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\61\2\2\u00e3"+
		"\u00e5\7<\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\7\62\2\2\u00e8\u00e9\5V,\2\u00e9"+
		"\37\3\2\2\2\u00ea\u00ef\5,\27\2\u00eb\u00ec\7\32\2\2\u00ec\u00ee\5 \21"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0!\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3\u00f4"+
		"\5$\23\2\u00f4#\3\2\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\7\r\2\2\u00f7"+
		"\u00fc\5N(\2\u00f8\u00f9\7\32\2\2\u00f9\u00fb\5$\23\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"%\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5,\27\2\u0100\u0101\7\r\2\2"+
		"\u0101\u0102\5N(\2\u0102\'\3\2\2\2\u0103\u0104\5\60\31\2\u0104\u0105\7"+
		"\r\2\2\u0105\u0106\5N(\2\u0106)\3\2\2\2\u0107\u0108\5\64\33\2\u0108\u0109"+
		"\7\r\2\2\u0109\u010a\5N(\2\u010a+\3\2\2\2\u010b\u010e\5.\30\2\u010c\u010e"+
		"\5\62\32\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e-\3\2\2\2\u010f"+
		"\u0112\5\60\31\2\u0110\u0112\5H%\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2"+
		"\2\2\u0112/\3\2\2\2\u0113\u0118\5@!\2\u0114\u0118\5B\"\2\u0115\u0118\5"+
		"D#\2\u0116\u0118\5F$\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118\61\3\2\2\2\u0119\u011c\5\64\33\2\u011a"+
		"\u011c\5> \2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\63\3\2\2\2"+
		"\u011d\u0122\5\66\34\2\u011e\u0122\58\35\2\u011f\u0122\5:\36\2\u0120\u0122"+
		"\5<\37\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\65\3\2\2\2\u0123\u0127\5@!\2\u0124\u0126\5J&\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\67\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e\5B\"\2\u012b\u012d"+
		"\5J&\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f9\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\5D#\2\u0132"+
		"\u0134\5J&\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136;\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c"+
		"\5F$\2\u0139\u013b\5J&\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d=\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013f\u0143\5H%\2\u0140\u0142\5J&\2\u0141\u0140\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144?\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0147\7>\2\2\u0147\u0148\7\3\2\2\u0148A\3\2\2\2\u0149\u014a"+
		"\7>\2\2\u014a\u014b\7\4\2\2\u014bC\3\2\2\2\u014c\u014e\7>\2\2\u014d\u014f"+
		"\7\5\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014fE\3\2\2\2\u0150"+
		"\u0151\7>\2\2\u0151\u0152\7\6\2\2\u0152G\3\2\2\2\u0153\u0154\7>\2\2\u0154"+
		"\u0155\7\7\2\2\u0155I\3\2\2\2\u0156\u0157\7\33\2\2\u0157\u0158\5L\'\2"+
		"\u0158\u0159\7\34\2\2\u0159K\3\2\2\2\u015a\u015f\5N(\2\u015b\u015c\7\32"+
		"\2\2\u015c\u015e\5L\'\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160M\3\2\2\2\u0161\u015f\3\2\2\2"+
		"\u0162\u0163\b(\1\2\u0163\u0170\5P)\2\u0164\u0165\7\22\2\2\u0165\u0170"+
		"\5N(\t\u0166\u0167\5`\61\2\u0167\u0168\5N(\b\u0168\u0170\3\2\2\2\u0169"+
		"\u0170\5\\/\2\u016a\u016b\7\33\2\2\u016b\u016c\5N(\2\u016c\u016d\7\34"+
		"\2\2\u016d\u0170\3\2\2\2\u016e\u0170\5,\27\2\u016f\u0162\3\2\2\2\u016f"+
		"\u0164\3\2\2\2\u016f\u0166\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u016a\3\2"+
		"\2\2\u016f\u016e\3\2\2\2\u0170\u0188\3\2\2\2\u0171\u0172\f\r\2\2\u0172"+
		"\u0173\7\16\2\2\u0173\u0187\5N(\16\u0174\u0175\f\f\2\2\u0175\u0176\5f"+
		"\64\2\u0176\u0177\5N(\r\u0177\u0187\3\2\2\2\u0178\u0179\f\13\2\2\u0179"+
		"\u017a\7\22\2\2\u017a\u0187\5N(\f\u017b\u017c\f\n\2\2\u017c\u017d\7\21"+
		"\2\2\u017d\u0187\5N(\13\u017e\u017f\f\7\2\2\u017f\u0180\5b\62\2\u0180"+
		"\u0181\5N(\b\u0181\u0187\3\2\2\2\u0182\u0183\f\6\2\2\u0183\u0184\5d\63"+
		"\2\u0184\u0185\5N(\7\u0185\u0187\3\2\2\2\u0186\u0171\3\2\2\2\u0186\u0174"+
		"\3\2\2\2\u0186\u0178\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u017e\3\2\2\2\u0186"+
		"\u0182\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189O\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018e\5R*\2\u018c\u018e"+
		"\5T+\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eQ\3\2\2\2\u018f\u0190"+
		"\t\2\2\2\u0190S\3\2\2\2\u0191\u0192\7\f\2\2\u0192U\3\2\2\2\u0193\u0194"+
		"\t\3\2\2\u0194W\3\2\2\2\u0195\u0196\79\2\2\u0196\u019b\5.\30\2\u0197\u0198"+
		"\7\33\2\2\u0198\u0199\5 \21\2\u0199\u019a\7\34\2\2\u019a\u019c\3\2\2\2"+
		"\u019b\u0197\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
		"\5\6\4\2\u019e\u019f\7\"\2\2\u019f\u01a0\79\2\2\u01a0\u01ae\3\2\2\2\u01a1"+
		"\u01a2\78\2\2\u01a2\u01a7\5.\30\2\u01a3\u01a4\7\33\2\2\u01a4\u01a5\5 "+
		"\21\2\u01a5\u01a6\7\34\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\5\6\4\2\u01aa\u01ab\7\""+
		"\2\2\u01ab\u01ac\78\2\2\u01ac\u01ae\3\2\2\2\u01ad\u0195\3\2\2\2\u01ad"+
		"\u01a1\3\2\2\2\u01aeY\3\2\2\2\u01af\u01b1\7>\2\2\u01b0\u01b2\5^\60\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2[\3\2\2\2\u01b3\u01b8\5.\30\2"+
		"\u01b4\u01b5\7\33\2\2\u01b5\u01b6\5^\60\2\u01b6\u01b7\7\34\2\2\u01b7\u01b9"+
		"\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9]\3\2\2\2\u01ba"+
		"\u01bb\7\33\2\2\u01bb\u01bc\5N(\2\u01bc\u01bd\7\34\2\2\u01bd\u01c2\3\2"+
		"\2\2\u01be\u01bf\7\32\2\2\u01bf\u01c1\5^\60\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01ce\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01ca\5N(\2\u01c6\u01c7\7\32\2\2\u01c7"+
		"\u01c9\5^\60\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01ba\3\2\2\2\u01cd\u01c5\3\2\2\2\u01ce_\3\2\2\2\u01cf\u01d0\7\63\2\2"+
		"\u01d0a\3\2\2\2\u01d1\u01d2\t\4\2\2\u01d2c\3\2\2\2\u01d3\u01d4\t\5\2\2"+
		"\u01d4e\3\2\2\2\u01d5\u01d6\t\6\2\2\u01d6g\3\2\2\2*lw\u0085\u008a\u0093"+
		"\u0099\u009d\u00a5\u00c1\u00c6\u00ce\u00d4\u00df\u00e4\u00ef\u00fc\u010d"+
		"\u0111\u0117\u011b\u0121\u0127\u012e\u0135\u013c\u0143\u014e\u015f\u016f"+
		"\u0186\u0188\u018d\u019b\u01a7\u01ad\u01b1\u01b8\u01c2\u01ca\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64v3Parser extends Parser {
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
	public static final int
		RULE_qb = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_dimId = 3, 
		RULE_id = 4, RULE_singleId = 5, RULE_array = 6, RULE_constDeclaration = 7, 
		RULE_assignment = 8, RULE_expression = 9, RULE_callSub = 10, RULE_callId = 11, 
		RULE_parametersList = 12, RULE_funprocArg = 13, RULE_input = 14, RULE_print = 15, 
		RULE_ifBlock = 16, RULE_whileBlock = 17, RULE_doWhileBlock = 18, RULE_doUntilBlock = 19, 
		RULE_forBlock = 20, RULE_selectBlock = 21, RULE_casesList = 22, RULE_funproc = 23, 
		RULE_funprocPar = 24, RULE_suffix = 25;
	public static final String[] ruleNames = {
		"qb", "instruction", "declaration", "dimId", "id", "singleId", "array", 
		"constDeclaration", "assignment", "expression", "callSub", "callId", "parametersList", 
		"funprocArg", "input", "print", "ifBlock", "whileBlock", "doWhileBlock", 
		"doUntilBlock", "forBlock", "selectBlock", "casesList", "funproc", "funprocPar", 
		"suffix"
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
		"LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", 
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

	@Override
	public String getGrammarFileName() { return "QB64v3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QB64v3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QbContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QB64v3Parser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
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
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterQb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitQb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitQb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QbContext qb() throws RecognitionException {
		QbContext _localctx = new QbContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(52);
				instruction();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==FUNCTION) {
				{
				{
				setState(58);
				funproc();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public DoUntilBlockContext doUntilBlock() {
			return getRuleContext(DoUntilBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public SelectBlockContext selectBlock() {
			return getRuleContext(SelectBlockContext.class,0);
		}
		public CallSubContext callSub() {
			return getRuleContext(CallSubContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				constDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				whileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				doWhileBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				doUntilBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				forBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				selectBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				callSub();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				print();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode DIM() { return getToken(QB64v3Parser.DIM, 0); }
		public List<DimIdContext> dimId() {
			return getRuleContexts(DimIdContext.class);
		}
		public DimIdContext dimId(int i) {
			return getRuleContext(DimIdContext.class,i);
		}
		public TerminalNode AS() { return getToken(QB64v3Parser.AS, 0); }
		public TerminalNode INTEGER() { return getToken(QB64v3Parser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(QB64v3Parser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(QB64v3Parser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(QB64v3Parser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(QB64v3Parser.STRING, 0); }
		public TerminalNode SHARED() { return getToken(QB64v3Parser.SHARED, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DIM);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(81);
				match(SHARED);
				}
			}

			setState(84);
			dimId();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				dimId();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(AS);
			setState(93);
			((DeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << SINGLE) | (1L << DOUBLE) | (1L << LONG) | (1L << STRING))) != 0)) ) {
				((DeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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

	public static class DimIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DimIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDimId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDimId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDimId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimIdContext dimId() throws RecognitionException {
		DimIdContext _localctx = new DimIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dimId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAR) {
				{
				setState(96);
				array();
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

	public static class IdContext extends ParserRuleContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			singleId();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAR) {
				{
				setState(100);
				array();
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

	public static class SingleIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public SingleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSingleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSingleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSingleId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleIdContext singleId() throws RecognitionException {
		SingleIdContext _localctx = new SingleIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLESUFFIX) | (1L << DOUBLESUFFIX) | (1L << INTEGERSUFFIX) | (1L << LONGSUFFIX) | (1L << STRINGSUFFIX))) != 0)) {
				{
				setState(104);
				suffix();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LEFTPAR);
			setState(108);
			expression(0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				expression(0);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(QB64v3Parser.CONST, 0); }
		public List<SingleIdContext> singleId() {
			return getRuleContexts(SingleIdContext.class);
		}
		public SingleIdContext singleId(int i) {
			return getRuleContext(SingleIdContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CONST);
			setState(119);
			singleId();
			setState(120);
			match(EQUAL);
			setState(121);
			expression(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				singleId();
				setState(124);
				match(EQUAL);
				setState(125);
				expression(0);
				}
				}
				setState(131);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			id();
			setState(133);
			match(EQUAL);
			setState(134);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(QB64v3Parser.NOT, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(QB64v3Parser.MOD, 0); }
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(QB64v3Parser.OR, 0); }
		public TerminalNode XOR() { return getToken(QB64v3Parser.XOR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterPotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitPotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitPotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QB64v3Parser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCmpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCmpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCmpExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBT:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUBT || _la==NOT) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				expression(2);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(LEFTPAR);
				setState(140);
				expression(0);
				setState(141);
				match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						((OrExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==XOR) ) {
							((OrExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(147);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						match(AND);
						setState(150);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(152);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==DIFF) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						((CmpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSOREQUAL) | (1L << GREATER) | (1L << GREATEROREQUAL))) != 0)) ) {
							((CmpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBT) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						((MulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << PRODUCT) | (1L << MOD))) != 0)) ) {
							((MulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new PotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(POT);
						setState(165);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(170);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallSubContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public CallSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCallSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCallSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCallSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSubContext callSub() throws RecognitionException {
		CallSubContext _localctx = new CallSubContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(172);
				parametersList();
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

	public static class CallIdContext extends ParserRuleContext {
		public CallIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callId; }
	 
		public CallIdContext() { }
		public void copyFrom(CallIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallSingleIdContext extends CallIdContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public CallSingleIdContext(CallIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCallSingleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCallSingleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCallSingleId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionContext extends CallIdContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public CallFunctionContext(CallIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIdContext callId() throws RecognitionException {
		CallIdContext _localctx = new CallIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callId);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CallSingleIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				singleId();
				}
				break;
			case 2:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				singleId();
				setState(177);
				match(LEFTPAR);
				setState(178);
				parametersList();
				setState(179);
				match(RIGHTPAR);
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

	public static class ParametersListContext extends ParserRuleContext {
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
	 
		public ParametersListContext() { }
		public void copyFrom(ParametersListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueParContext extends ParametersListContext {
		public FunprocArgContext funprocArg() {
			return getRuleContext(FunprocArgContext.class,0);
		}
		public List<ParametersListContext> parametersList() {
			return getRuleContexts(ParametersListContext.class);
		}
		public ParametersListContext parametersList(int i) {
			return getRuleContext(ParametersListContext.class,i);
		}
		public ValueParContext(ParametersListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterValuePar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitValuePar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitValuePar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceParContext extends ParametersListContext {
		public FunprocArgContext funprocArg() {
			return getRuleContext(FunprocArgContext.class,0);
		}
		public List<ParametersListContext> parametersList() {
			return getRuleContexts(ParametersListContext.class);
		}
		public ParametersListContext parametersList(int i) {
			return getRuleContext(ParametersListContext.class,i);
		}
		public ReferenceParContext(ParametersListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterReferencePar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitReferencePar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitReferencePar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametersList);
		try {
			int _alt;
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ValueParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(LEFTPAR);
				setState(184);
				funprocArg();
				setState(185);
				match(RIGHTPAR);
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						match(COMMA);
						setState(187);
						parametersList();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new ReferenceParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				funprocArg();
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						match(COMMA);
						setState(195);
						parametersList();
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class FunprocArgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public FunprocArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funprocArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterFunprocArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitFunprocArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitFunprocArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunprocArgContext funprocArg() throws RecognitionException {
		FunprocArgContext _localctx = new FunprocArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funprocArg);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBT:
			case LEFTPAR:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				expression(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ID);
				setState(205);
				match(LEFTPAR);
				setState(206);
				match(RIGHTPAR);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(QB64v3Parser.INPUT, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(INPUT);
			setState(210);
			id();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				id();
				}
				}
				setState(217);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(QB64v3Parser.PRINT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(PRINT);
			setState(219);
			expression(0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(220);
				match(SEMICOLON);
				setState(221);
				expression(0);
				}
				}
				setState(226);
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

	public static class IfBlockContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(QB64v3Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(QB64v3Parser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(QB64v3Parser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(QB64v3Parser.THEN, i);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(QB64v3Parser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(QB64v3Parser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(QB64v3Parser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IF);
			setState(228);
			expression(0);
			setState(229);
			match(THEN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(230);
				instruction();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(236);
				match(ELSEIF);
				setState(237);
				expression(0);
				setState(238);
				match(THEN);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(239);
					instruction();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(250);
				match(ELSE);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(251);
					instruction();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(259);
			match(END);
			setState(260);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(QB64v3Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WEND() { return getToken(QB64v3Parser.WEND, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(WHILE);
			setState(263);
			expression(0);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(264);
				instruction();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(QB64v3Parser.DO, 0); }
		public TerminalNode LOOP() { return getToken(QB64v3Parser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(QB64v3Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doWhileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(DO);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(273);
				instruction();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(LOOP);
			setState(280);
			match(WHILE);
			setState(281);
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

	public static class DoUntilBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(QB64v3Parser.DO, 0); }
		public TerminalNode LOOP() { return getToken(QB64v3Parser.LOOP, 0); }
		public TerminalNode UNTIL() { return getToken(QB64v3Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public DoUntilBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doUntilBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDoUntilBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDoUntilBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDoUntilBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoUntilBlockContext doUntilBlock() throws RecognitionException {
		DoUntilBlockContext _localctx = new DoUntilBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doUntilBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(DO);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(284);
				instruction();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(LOOP);
			setState(291);
			match(UNTIL);
			setState(292);
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(QB64v3Parser.FOR, 0); }
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(QB64v3Parser.TO, 0); }
		public TerminalNode NEXT() { return getToken(QB64v3Parser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(QB64v3Parser.STEP, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(FOR);
			setState(295);
			singleId();
			setState(296);
			match(EQUAL);
			setState(297);
			expression(0);
			setState(298);
			match(TO);
			setState(299);
			expression(0);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(300);
				match(STEP);
				setState(301);
				expression(0);
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(304);
				instruction();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(NEXT);
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

	public static class SelectBlockContext extends ParserRuleContext {
		public List<TerminalNode> SELECT() { return getTokens(QB64v3Parser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(QB64v3Parser.SELECT, i);
		}
		public List<TerminalNode> CASE() { return getTokens(QB64v3Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(QB64v3Parser.CASE, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public CasesListContext casesList() {
			return getRuleContext(CasesListContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(QB64v3Parser.ELSE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public SelectBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSelectBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSelectBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSelectBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectBlockContext selectBlock() throws RecognitionException {
		SelectBlockContext _localctx = new SelectBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(SELECT);
			setState(313);
			match(CASE);
			setState(314);
			id();
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(315);
				casesList();
				}
				break;
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(318);
				match(CASE);
				setState(319);
				match(ELSE);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(320);
					instruction();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			match(END);
			setState(329);
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

	public static class CasesListContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(QB64v3Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CasesListContext casesList() {
			return getRuleContext(CasesListContext.class,0);
		}
		public CasesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCasesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCasesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCasesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesListContext casesList() throws RecognitionException {
		CasesListContext _localctx = new CasesListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_casesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(CASE);
			setState(332);
			expression(0);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(333);
				instruction();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(339);
				casesList();
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

	public static class FunprocContext extends ParserRuleContext {
		public FunprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funproc; }
	 
		public FunprocContext() { }
		public void copyFrom(FunprocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends FunprocContext {
		public List<TerminalNode> SUB() { return getTokens(QB64v3Parser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(QB64v3Parser.SUB, i);
		}
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<FunprocParContext> funprocPar() {
			return getRuleContexts(FunprocParContext.class);
		}
		public FunprocParContext funprocPar(int i) {
			return getRuleContext(FunprocParContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public SubContext(FunprocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends FunprocContext {
		public List<TerminalNode> FUNCTION() { return getTokens(QB64v3Parser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(QB64v3Parser.FUNCTION, i);
		}
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<FunprocParContext> funprocPar() {
			return getRuleContexts(FunprocParContext.class);
		}
		public FunprocParContext funprocPar(int i) {
			return getRuleContext(FunprocParContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionContext(FunprocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunprocContext funproc() throws RecognitionException {
		FunprocContext _localctx = new FunprocContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funproc);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(FUNCTION);
				setState(343);
				singleId();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(344);
					match(LEFTPAR);
					setState(345);
					funprocPar();
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(346);
						match(COMMA);
						setState(347);
						funprocPar();
						}
						}
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(353);
					match(RIGHTPAR);
					}
				}

				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(357);
					instruction();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(END);
				setState(364);
				match(FUNCTION);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(SUB);
				setState(367);
				match(ID);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(368);
					match(LEFTPAR);
					setState(369);
					funprocPar();
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(370);
						match(COMMA);
						setState(371);
						funprocPar();
						}
						}
						setState(376);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(377);
					match(RIGHTPAR);
					}
				}

				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(381);
					instruction();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(END);
				setState(388);
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

	public static class FunprocParContext extends ParserRuleContext {
		public Token type;
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public TerminalNode AS() { return getToken(QB64v3Parser.AS, 0); }
		public TerminalNode INTEGER() { return getToken(QB64v3Parser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(QB64v3Parser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(QB64v3Parser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(QB64v3Parser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(QB64v3Parser.STRING, 0); }
		public FunprocParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funprocPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterFunprocPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitFunprocPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitFunprocPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunprocParContext funprocPar() throws RecognitionException {
		FunprocParContext _localctx = new FunprocParContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funprocPar);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				singleId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				setState(393);
				match(LEFTPAR);
				setState(394);
				match(RIGHTPAR);
				setState(395);
				match(AS);
				setState(396);
				((FunprocParContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << SINGLE) | (1L << DOUBLE) | (1L << LONG) | (1L << STRING))) != 0)) ) {
					((FunprocParContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class SuffixContext extends ParserRuleContext {
		public Token suffixType;
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((SuffixContext)_localctx).suffixType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLESUFFIX) | (1L << DOUBLESUFFIX) | (1L << INTEGERSUFFIX) | (1L << LONGSUFFIX) | (1L << STRINGSUFFIX))) != 0)) ) {
				((SuffixContext)_localctx).suffixType = (Token)_errHandler.recoverInline(this);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\3\4\5\4U\n\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3"+
		"\5\3\5\5\5d\n\5\3\6\3\6\5\6h\n\6\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\7\b"+
		"r\n\b\f\b\16\bu\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082"+
		"\n\t\f\t\16\t\u0085\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0092\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9\n\13"+
		"\f\13\16\13\u00ac\13\13\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00b8\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u00bf\n\16\f\16\16\16\u00c2"+
		"\13\16\3\16\3\16\3\16\7\16\u00c7\n\16\f\16\16\16\u00ca\13\16\5\16\u00cc"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u00d2\n\17\3\20\3\20\3\20\3\20\7\20\u00d8"+
		"\n\20\f\20\16\20\u00db\13\20\3\21\3\21\3\21\3\21\7\21\u00e1\n\21\f\21"+
		"\16\21\u00e4\13\21\3\22\3\22\3\22\3\22\7\22\u00ea\n\22\f\22\16\22\u00ed"+
		"\13\22\3\22\3\22\3\22\3\22\7\22\u00f3\n\22\f\22\16\22\u00f6\13\22\7\22"+
		"\u00f8\n\22\f\22\16\22\u00fb\13\22\3\22\3\22\7\22\u00ff\n\22\f\22\16\22"+
		"\u0102\13\22\5\22\u0104\n\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u010c"+
		"\n\23\f\23\16\23\u010f\13\23\3\23\3\23\3\24\3\24\7\24\u0115\n\24\f\24"+
		"\16\24\u0118\13\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0120\n\25\f\25"+
		"\16\25\u0123\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0131\n\26\3\26\7\26\u0134\n\26\f\26\16\26\u0137\13\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\5\27\u013f\n\27\3\27\3\27\3\27\7\27\u0144"+
		"\n\27\f\27\16\27\u0147\13\27\5\27\u0149\n\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\7\30\u0151\n\30\f\30\16\30\u0154\13\30\3\30\5\30\u0157\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u015f\n\31\f\31\16\31\u0162\13\31\3\31"+
		"\3\31\5\31\u0166\n\31\3\31\7\31\u0169\n\31\f\31\16\31\u016c\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0177\n\31\f\31\16\31\u017a"+
		"\13\31\3\31\3\31\5\31\u017e\n\31\3\31\7\31\u0181\n\31\f\31\16\31\u0184"+
		"\13\31\3\31\3\31\5\31\u0188\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0190"+
		"\n\32\3\33\3\33\3\33\2\3\24\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\n\3\2+/\4\2\13\13\62\62\4\2\63\63\65\65\4\2\6\6\f"+
		"\f\3\2\r\20\3\2\n\13\4\2\b\t\66\66\3\2\26\32\u01b4\29\3\2\2\2\4P\3\2\2"+
		"\2\6R\3\2\2\2\ba\3\2\2\2\ne\3\2\2\2\fi\3\2\2\2\16m\3\2\2\2\20x\3\2\2\2"+
		"\22\u0086\3\2\2\2\24\u0091\3\2\2\2\26\u00ad\3\2\2\2\30\u00b7\3\2\2\2\32"+
		"\u00cb\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 \u00dc\3\2\2\2\"\u00e5"+
		"\3\2\2\2$\u0108\3\2\2\2&\u0112\3\2\2\2(\u011d\3\2\2\2*\u0128\3\2\2\2,"+
		"\u013a\3\2\2\2.\u014d\3\2\2\2\60\u0187\3\2\2\2\62\u018f\3\2\2\2\64\u0191"+
		"\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3"+
		"\2\2\2;9\3\2\2\2<>\5\60\31\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@"+
		"B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DQ\5\6\4\2EQ\5\20\t\2FQ\5\22\n"+
		"\2GQ\5\"\22\2HQ\5$\23\2IQ\5&\24\2JQ\5(\25\2KQ\5*\26\2LQ\5,\27\2MQ\5\26"+
		"\f\2NQ\5 \21\2OQ\5\36\20\2PD\3\2\2\2PE\3\2\2\2PF\3\2\2\2PG\3\2\2\2PH\3"+
		"\2\2\2PI\3\2\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3"+
		"\2\2\2Q\5\3\2\2\2RT\7\60\2\2SU\7;\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2V["+
		"\5\b\5\2WX\7\23\2\2XZ\5\b\5\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\^\3\2\2\2][\3\2\2\2^_\7\61\2\2_`\t\2\2\2`\7\3\2\2\2ac\7=\2\2bd\5\16"+
		"\b\2cb\3\2\2\2cd\3\2\2\2d\t\3\2\2\2eg\5\f\7\2fh\5\16\b\2gf\3\2\2\2gh\3"+
		"\2\2\2h\13\3\2\2\2ik\7=\2\2jl\5\64\33\2kj\3\2\2\2kl\3\2\2\2l\r\3\2\2\2"+
		"mn\7\24\2\2ns\5\24\13\2op\7\23\2\2pr\5\24\13\2qo\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\25\2\2w\17\3\2\2\2xy\7<\2\2y"+
		"z\5\f\7\2z{\7\6\2\2{\u0083\5\24\13\2|}\7\23\2\2}~\5\f\7\2~\177\7\6\2\2"+
		"\177\u0080\5\24\13\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7\6\2\2\u0088\u0089\5\24"+
		"\13\2\u0089\23\3\2\2\2\u008a\u008b\b\13\1\2\u008b\u008c\t\3\2\2\u008c"+
		"\u0092\5\24\13\4\u008d\u008e\7\24\2\2\u008e\u008f\5\24\13\2\u008f\u0090"+
		"\7\25\2\2\u0090\u0092\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0092\u00aa\3\2\2\2\u0093\u0094\f\13\2\2\u0094\u0095\t\4\2\2\u0095\u00a9"+
		"\5\24\13\f\u0096\u0097\f\n\2\2\u0097\u0098\7\64\2\2\u0098\u00a9\5\24\13"+
		"\13\u0099\u009a\f\t\2\2\u009a\u009b\t\5\2\2\u009b\u00a9\5\24\13\n\u009c"+
		"\u009d\f\b\2\2\u009d\u009e\t\6\2\2\u009e\u00a9\5\24\13\t\u009f\u00a0\f"+
		"\7\2\2\u00a0\u00a1\t\7\2\2\u00a1\u00a9\5\24\13\b\u00a2\u00a3\f\6\2\2\u00a3"+
		"\u00a4\t\b\2\2\u00a4\u00a9\5\24\13\7\u00a5\u00a6\f\5\2\2\u00a6\u00a7\7"+
		"\7\2\2\u00a7\u00a9\5\24\13\6\u00a8\u0093\3\2\2\2\u00a8\u0096\3\2\2\2\u00a8"+
		"\u0099\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7=\2\2"+
		"\u00ae\u00b0\5\32\16\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\27"+
		"\3\2\2\2\u00b1\u00b8\5\f\7\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7\24\2\2"+
		"\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\25\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\7\24\2"+
		"\2\u00ba\u00bb\5\34\17\2\u00bb\u00c0\7\25\2\2\u00bc\u00bd\7\23\2\2\u00bd"+
		"\u00bf\5\32\16\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cc\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c8\5\34\17\2\u00c4\u00c5\7\23\2\2\u00c5\u00c7\5\32\16\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00b9\3\2\2\2\u00cb\u00c3\3\2"+
		"\2\2\u00cc\33\3\2\2\2\u00cd\u00d2\5\24\13\2\u00ce\u00cf\7=\2\2\u00cf\u00d0"+
		"\7\24\2\2\u00d0\u00d2\7\25\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2"+
		"\u00d2\35\3\2\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d9\5\n\6\2\u00d5\u00d6"+
		"\7\23\2\2\u00d6\u00d8\5\n\6\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\7\34\2\2\u00dd\u00e2\5\24\13\2\u00de\u00df\7\21\2"+
		"\2\u00df\u00e1\5\24\13\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5\24\13\2\u00e7\u00eb\7\36\2\2\u00e8"+
		"\u00ea\5\4\3\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7 \2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f4\7\36\2\2\u00f1\u00f3\5"+
		"\4\3\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00ee\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u0103\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0100\7\37\2\2\u00fd\u00ff\5"+
		"\4\3\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u00fc\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7!\2\2\u0106"+
		"\u0107\7\35\2\2\u0107#\3\2\2\2\u0108\u0109\7\"\2\2\u0109\u010d\5\24\13"+
		"\2\u010a\u010c\5\4\3\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7#\2\2\u0111%\3\2\2\2\u0112\u0116\7$\2\2\u0113\u0115\5\4\3\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7%\2\2\u011a"+
		"\u011b\7\"\2\2\u011b\u011c\5\24\13\2\u011c\'\3\2\2\2\u011d\u0121\7$\2"+
		"\2\u011e\u0120\5\4\3\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7%\2\2\u0125\u0126\7&\2\2\u0126\u0127\5\24\13\2\u0127)\3\2\2\2"+
		"\u0128\u0129\7\'\2\2\u0129\u012a\5\f\7\2\u012a\u012b\7\6\2\2\u012b\u012c"+
		"\5\24\13\2\u012c\u012d\7(\2\2\u012d\u0130\5\24\13\2\u012e\u012f\7)\2\2"+
		"\u012f\u0131\5\24\13\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0135"+
		"\3\2\2\2\u0132\u0134\5\4\3\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u0139\7*\2\2\u0139+\3\2\2\2\u013a\u013b\79\2\2\u013b\u013c"+
		"\7:\2\2\u013c\u013e\5\n\6\2\u013d\u013f\5.\30\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0148\3\2\2\2\u0140\u0141\7:\2\2\u0141\u0145\7\37"+
		"\2\2\u0142\u0144\5\4\3\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0148\u0140\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\7!\2\2\u014b\u014c\79\2\2\u014c-\3\2\2\2\u014d\u014e\7:\2\2\u014e"+
		"\u0152\5\24\13\2\u014f\u0151\5\4\3\2\u0150\u014f\3\2\2\2\u0151\u0154\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0157\5.\30\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157/\3\2\2\2\u0158\u0159\78\2\2\u0159\u0165\5\f\7\2\u015a\u015b"+
		"\7\24\2\2\u015b\u0160\5\62\32\2\u015c\u015d\7\23\2\2\u015d\u015f\5\62"+
		"\32\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\25"+
		"\2\2\u0164\u0166\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u016a\3\2\2\2\u0167\u0169\5\4\3\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\7!\2\2\u016e\u016f\78\2\2\u016f\u0188\3\2\2"+
		"\2\u0170\u0171\7\67\2\2\u0171\u017d\7=\2\2\u0172\u0173\7\24\2\2\u0173"+
		"\u0178\5\62\32\2\u0174\u0175\7\23\2\2\u0175\u0177\5\62\32\2\u0176\u0174"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7\25\2\2\u017c\u017e\3"+
		"\2\2\2\u017d\u0172\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\3\2\2\2\u017f"+
		"\u0181\5\4\3\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\7!\2\2\u0186\u0188\7\67\2\2\u0187\u0158\3\2\2\2\u0187\u0170\3\2"+
		"\2\2\u0188\61\3\2\2\2\u0189\u0190\5\f\7\2\u018a\u018b\7=\2\2\u018b\u018c"+
		"\7\24\2\2\u018c\u018d\7\25\2\2\u018d\u018e\7\61\2\2\u018e\u0190\t\2\2"+
		"\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2\2\2\u0190\63\3\2\2\2\u0191\u0192"+
		"\t\t\2\2\u0192\65\3\2\2\2.9?PT[cgks\u0083\u0091\u00a8\u00aa\u00af\u00b7"+
		"\u00c0\u00c8\u00cb\u00d1\u00d9\u00e2\u00eb\u00f4\u00f9\u0100\u0103\u010d"+
		"\u0116\u0121\u0130\u0135\u013e\u0145\u0148\u0152\u0156\u0160\u0165\u016a"+
		"\u0178\u017d\u0182\u0187\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
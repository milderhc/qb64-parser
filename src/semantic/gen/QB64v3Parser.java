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
		INTEGERV=1, LONGV=2, SINGLEV=3, DOUBLEV=4, STRINGV=5, EQUAL=6, POT=7, 
		DIV=8, PRODUCT=9, ADD=10, SUBT=11, DIFF=12, LESS=13, LESSOREQUAL=14, GREATER=15, 
		GREATEROREQUAL=16, SEMICOLON=17, COLON=18, COMMA=19, LEFTPAR=20, RIGHTPAR=21, 
		SINGLESUFFIX=22, DOUBLESUFFIX=23, INTEGERSUFFIX=24, LONGSUFFIX=25, STRINGSUFFIX=26, 
		INPUT=27, PRINT=28, IF=29, THEN=30, ELSE=31, ELSEIF=32, END=33, WHILE=34, 
		WEND=35, DO=36, LOOP=37, UNTIL=38, FOR=39, TO=40, STEP=41, NEXT=42, INTEGER=43, 
		SINGLE=44, DOUBLE=45, LONG=46, STRING=47, DIM=48, AS=49, NOT=50, OR=51, 
		AND=52, XOR=53, MOD=54, SUB=55, FUNCTION=56, SELECT=57, CASE=58, SHARED=59, 
		CONST=60, ID=61, COMMENT=62, WS=63;
	public static final int
		RULE_qb = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_dimId = 3, 
		RULE_id = 4, RULE_callId = 5, RULE_singleId = 6, RULE_array = 7, RULE_constDeclaration = 8, 
		RULE_assignment = 9, RULE_expression = 10, RULE_callSub = 11, RULE_parametersList = 12, 
		RULE_funprocArg = 13, RULE_input = 14, RULE_print = 15, RULE_ifBlock = 16, 
		RULE_whileBlock = 17, RULE_doWhileBlock = 18, RULE_doUntilBlock = 19, 
		RULE_forBlock = 20, RULE_selectBlock = 21, RULE_casesList = 22, RULE_instructionBlock = 23, 
		RULE_funproc = 24, RULE_funprocPar = 25, RULE_suffix = 26;
	public static final String[] ruleNames = {
		"qb", "instruction", "declaration", "dimId", "id", "callId", "singleId", 
		"array", "constDeclaration", "assignment", "expression", "callSub", "parametersList", 
		"funprocArg", "input", "print", "ifBlock", "whileBlock", "doWhileBlock", 
		"doUntilBlock", "forBlock", "selectBlock", "casesList", "instructionBlock", 
		"funproc", "funprocPar", "suffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'='", "'^'", "'/'", "'*'", "'+'", 
		"'-'", "'<>'", "'<'", "'<='", "'>'", "'>='", "';'", "':'", "','", "'('", 
		"')'", "'!'", "'#'", "'%'", "'&'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGERV", "LONGV", "SINGLEV", "DOUBLEV", "STRINGV", "EQUAL", "POT", 
		"DIV", "PRODUCT", "ADD", "SUBT", "DIFF", "LESS", "LESSOREQUAL", "GREATER", 
		"GREATEROREQUAL", "SEMICOLON", "COLON", "COMMA", "LEFTPAR", "RIGHTPAR", 
		"SINGLESUFFIX", "DOUBLESUFFIX", "INTEGERSUFFIX", "LONGSUFFIX", "STRINGSUFFIX", 
		"INPUT", "PRINT", "IF", "THEN", "ELSE", "ELSEIF", "END", "WHILE", "WEND", 
		"DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", "INTEGER", "SINGLE", 
		"DOUBLE", "LONG", "STRING", "DIM", "AS", "NOT", "OR", "AND", "XOR", "MOD", 
		"SUB", "FUNCTION", "SELECT", "CASE", "SHARED", "CONST", "ID", "COMMENT", 
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QB64v3Parser.EOF, 0); }
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
			setState(54);
			instructionBlock();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==FUNCTION) {
				{
				{
				setState(55);
				funproc();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				constDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				whileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				doWhileBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				doUntilBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				forBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				selectBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				callSub();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				print();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(74);
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
			setState(77);
			match(DIM);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(78);
				match(SHARED);
				}
			}

			setState(81);
			dimId();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				dimId();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(AS);
			setState(90);
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
			setState(92);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAR) {
				{
				setState(93);
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
			setState(96);
			singleId();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAR) {
				{
				setState(97);
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

	public static class CallIdContext extends ParserRuleContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CallIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCallId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCallId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCallId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIdContext callId() throws RecognitionException {
		CallIdContext _localctx = new CallIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			singleId();
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(101);
				array();
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
		enterRule(_localctx, 12, RULE_singleId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(105);
				suffix();
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
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LEFTPAR);
			setState(109);
			expression(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				expression(0);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		enterRule(_localctx, 16, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(CONST);
			setState(120);
			singleId();
			setState(121);
			match(EQUAL);
			setState(122);
			expression(0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				singleId();
				setState(125);
				match(EQUAL);
				setState(126);
				expression(0);
				}
				}
				setState(132);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			id();
			setState(134);
			match(EQUAL);
			setState(135);
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
	public static class ValueExprContext extends ExpressionContext {
		public Token value;
		public TerminalNode INTEGERV() { return getToken(QB64v3Parser.INTEGERV, 0); }
		public TerminalNode DOUBLEV() { return getToken(QB64v3Parser.DOUBLEV, 0); }
		public TerminalNode STRINGV() { return getToken(QB64v3Parser.STRINGV, 0); }
		public TerminalNode SINGLEV() { return getToken(QB64v3Parser.SINGLEV, 0); }
		public TerminalNode LONGV() { return getToken(QB64v3Parser.LONGV, 0); }
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitValueExpr(this);
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
	public static class IdExprContext extends ExpressionContext {
		public CallIdContext callId() {
			return getRuleContext(CallIdContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitIdExpr(this);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERV:
			case LONGV:
			case SINGLEV:
			case DOUBLEV:
			case STRINGV:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				((ValueExprContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERV) | (1L << LONGV) | (1L << SINGLEV) | (1L << DOUBLEV) | (1L << STRINGV))) != 0)) ) {
					((ValueExprContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				callId();
				}
				break;
			case LEFTPAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(LEFTPAR);
				setState(141);
				expression(0);
				setState(142);
				match(RIGHTPAR);
				}
				break;
			case SUBT:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
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
				setState(145);
				expression(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(149);
						match(POT);
						setState(150);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
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
						setState(153);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(155);
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
						setState(156);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
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
						setState(159);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
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
						setState(162);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						match(AND);
						setState(165);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(167);
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
						setState(168);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(173);
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
		enterRule(_localctx, 22, RULE_callSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(175);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ValueParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(LEFTPAR);
				setState(179);
				funprocArg();
				setState(180);
				match(RIGHTPAR);
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						match(COMMA);
						setState(182);
						parametersList();
						}
						} 
					}
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new ReferenceParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				funprocArg();
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						match(COMMA);
						setState(190);
						parametersList();
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(ID);
				setState(200);
				match(LEFTPAR);
				setState(201);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(QB64v3Parser.INPUT, 0); }
		public List<CallIdContext> callId() {
			return getRuleContexts(CallIdContext.class);
		}
		public CallIdContext callId(int i) {
			return getRuleContext(CallIdContext.class,i);
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
			setState(204);
			match(INPUT);
			setState(205);
			callId();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				callId();
				}
				}
				setState(212);
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
			setState(213);
			match(PRINT);
			setState(214);
			expression(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(215);
				match(SEMICOLON);
				setState(216);
				expression(0);
				}
				}
				setState(221);
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
		public List<InstructionBlockContext> instructionBlock() {
			return getRuleContexts(InstructionBlockContext.class);
		}
		public InstructionBlockContext instructionBlock(int i) {
			return getRuleContext(InstructionBlockContext.class,i);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
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
			setState(222);
			match(IF);
			setState(223);
			expression(0);
			setState(224);
			match(THEN);
			setState(225);
			instructionBlock();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(226);
				match(ELSEIF);
				setState(227);
				expression(0);
				setState(228);
				match(THEN);
				setState(229);
				instructionBlock();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(236);
				match(ELSE);
				setState(237);
				instructionBlock();
				}
			}

			setState(240);
			match(END);
			setState(241);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode WEND() { return getToken(QB64v3Parser.WEND, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WHILE);
			setState(244);
			expression(0);
			setState(245);
			instructionBlock();
			setState(246);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(QB64v3Parser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(QB64v3Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DO);
			setState(249);
			instructionBlock();
			setState(250);
			match(LOOP);
			setState(251);
			match(WHILE);
			setState(252);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(QB64v3Parser.LOOP, 0); }
		public TerminalNode UNTIL() { return getToken(QB64v3Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(DO);
			setState(255);
			instructionBlock();
			setState(256);
			match(LOOP);
			setState(257);
			match(UNTIL);
			setState(258);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(QB64v3Parser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(QB64v3Parser.STEP, 0); }
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
			setState(260);
			match(FOR);
			setState(261);
			singleId();
			setState(262);
			match(EQUAL);
			setState(263);
			expression(0);
			setState(264);
			match(TO);
			setState(265);
			expression(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(266);
				match(STEP);
				setState(267);
				expression(0);
				}
			}

			setState(270);
			instructionBlock();
			setState(271);
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
		public CallIdContext callId() {
			return getRuleContext(CallIdContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public CasesListContext casesList() {
			return getRuleContext(CasesListContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(QB64v3Parser.ELSE, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
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
			setState(273);
			match(SELECT);
			setState(274);
			match(CASE);
			setState(275);
			callId();
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(276);
				casesList();
				}
				break;
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(279);
				match(CASE);
				setState(280);
				match(ELSE);
				setState(281);
				instructionBlock();
				}
			}

			setState(284);
			match(END);
			setState(285);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(CASE);
			setState(288);
			expression(0);
			setState(289);
			instructionBlock();
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(290);
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

	public static class InstructionBlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterInstructionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitInstructionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitInstructionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionBlockContext instructionBlock() throws RecognitionException {
		InstructionBlockContext _localctx = new InstructionBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instructionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(293);
				instruction();
				}
				}
				setState(298);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<FunprocParContext> funprocPar() {
			return getRuleContexts(FunprocParContext.class);
		}
		public FunprocParContext funprocPar(int i) {
			return getRuleContext(FunprocParContext.class,i);
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
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<FunprocParContext> funprocPar() {
			return getRuleContexts(FunprocParContext.class);
		}
		public FunprocParContext funprocPar(int i) {
			return getRuleContext(FunprocParContext.class,i);
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
		enterRule(_localctx, 48, RULE_funproc);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(FUNCTION);
				setState(300);
				singleId();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(301);
					match(LEFTPAR);
					setState(302);
					funprocPar();
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(303);
						match(COMMA);
						setState(304);
						funprocPar();
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310);
					match(RIGHTPAR);
					}
				}

				setState(314);
				instructionBlock();
				setState(315);
				match(END);
				setState(316);
				match(FUNCTION);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(SUB);
				setState(319);
				match(ID);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(320);
					match(LEFTPAR);
					setState(321);
					funprocPar();
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(322);
						match(COMMA);
						setState(323);
						funprocPar();
						}
						}
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(329);
					match(RIGHTPAR);
					}
				}

				setState(333);
				instructionBlock();
				setState(334);
				match(END);
				setState(335);
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
		enterRule(_localctx, 50, RULE_funprocPar);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				singleId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(ID);
				setState(341);
				match(LEFTPAR);
				setState(342);
				match(RIGHTPAR);
				setState(343);
				match(AS);
				setState(344);
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
		enterRule(_localctx, 52, RULE_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\5\4"+
		"R\n\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\3\5\3\5\5\5a\n\5"+
		"\3\6\3\6\5\6e\n\6\3\7\3\7\5\7i\n\7\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\7"+
		"\ts\n\t\f\t\16\tv\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ac\n\f\f\f\16\f\u00af"+
		"\13\f\3\r\3\r\5\r\u00b3\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u00ba\n\16\f"+
		"\16\16\16\u00bd\13\16\3\16\3\16\3\16\7\16\u00c2\n\16\f\16\16\16\u00c5"+
		"\13\16\5\16\u00c7\n\16\3\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20\3"+
		"\20\3\20\7\20\u00d3\n\20\f\20\16\20\u00d6\13\20\3\21\3\21\3\21\3\21\7"+
		"\21\u00dc\n\21\f\21\16\21\u00df\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00ea\n\22\f\22\16\22\u00ed\13\22\3\22\3\22\5\22\u00f1"+
		"\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u010f\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0118\n"+
		"\27\3\27\3\27\3\27\5\27\u011d\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u0126\n\30\3\31\7\31\u0129\n\31\f\31\16\31\u012c\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u0134\n\32\f\32\16\32\u0137\13\32\3\32\3\32"+
		"\5\32\u013b\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0147\n\32\f\32\16\32\u014a\13\32\3\32\3\32\5\32\u014e\n\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0154\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015c\n"+
		"\33\3\34\3\34\3\34\2\3\26\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\13\3\2-\61\3\2\3\7\4\2\r\r\64\64\4\2\n\1388\3\2\f"+
		"\r\3\2\17\22\4\2\b\b\16\16\4\2\65\65\67\67\3\2\30\34\u0176\28\3\2\2\2"+
		"\4M\3\2\2\2\6O\3\2\2\2\b^\3\2\2\2\nb\3\2\2\2\ff\3\2\2\2\16j\3\2\2\2\20"+
		"n\3\2\2\2\22y\3\2\2\2\24\u0087\3\2\2\2\26\u0094\3\2\2\2\30\u00b0\3\2\2"+
		"\2\32\u00c6\3\2\2\2\34\u00cc\3\2\2\2\36\u00ce\3\2\2\2 \u00d7\3\2\2\2\""+
		"\u00e0\3\2\2\2$\u00f5\3\2\2\2&\u00fa\3\2\2\2(\u0100\3\2\2\2*\u0106\3\2"+
		"\2\2,\u0113\3\2\2\2.\u0121\3\2\2\2\60\u012a\3\2\2\2\62\u0153\3\2\2\2\64"+
		"\u015b\3\2\2\2\66\u015d\3\2\2\28<\5\60\31\29;\5\62\32\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\2\2\3@\3\3\2\2\2AN"+
		"\5\6\4\2BN\5\22\n\2CN\5\24\13\2DN\5\"\22\2EN\5$\23\2FN\5&\24\2GN\5(\25"+
		"\2HN\5*\26\2IN\5,\27\2JN\5\30\r\2KN\5 \21\2LN\5\36\20\2MA\3\2\2\2MB\3"+
		"\2\2\2MC\3\2\2\2MD\3\2\2\2ME\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3"+
		"\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OQ\7\62\2\2PR\7=\2\2QP"+
		"\3\2\2\2QR\3\2\2\2RS\3\2\2\2SX\5\b\5\2TU\7\25\2\2UW\5\b\5\2VT\3\2\2\2"+
		"WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\63\2\2\\]\t\2"+
		"\2\2]\7\3\2\2\2^`\7?\2\2_a\5\20\t\2`_\3\2\2\2`a\3\2\2\2a\t\3\2\2\2bd\5"+
		"\16\b\2ce\5\20\t\2dc\3\2\2\2de\3\2\2\2e\13\3\2\2\2fh\5\16\b\2gi\5\20\t"+
		"\2hg\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jl\7?\2\2km\5\66\34\2lk\3\2\2\2lm\3\2"+
		"\2\2m\17\3\2\2\2no\7\26\2\2ot\5\26\f\2pq\7\25\2\2qs\5\26\f\2rp\3\2\2\2"+
		"sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\27\2\2x\21\3\2"+
		"\2\2yz\7>\2\2z{\5\16\b\2{|\7\b\2\2|\u0084\5\26\f\2}~\7\25\2\2~\177\5\16"+
		"\b\2\177\u0080\7\b\2\2\u0080\u0081\5\26\f\2\u0081\u0083\3\2\2\2\u0082"+
		"}\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\23\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\n\6\2\u0088\u0089"+
		"\7\b\2\2\u0089\u008a\5\26\f\2\u008a\25\3\2\2\2\u008b\u008c\b\f\1\2\u008c"+
		"\u0095\t\3\2\2\u008d\u0095\5\f\7\2\u008e\u008f\7\26\2\2\u008f\u0090\5"+
		"\26\f\2\u0090\u0091\7\27\2\2\u0091\u0095\3\2\2\2\u0092\u0093\t\4\2\2\u0093"+
		"\u0095\5\26\f\n\u0094\u008b\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0095\u00ad\3\2\2\2\u0096\u0097\f\t\2\2\u0097"+
		"\u0098\7\t\2\2\u0098\u00ac\5\26\f\n\u0099\u009a\f\b\2\2\u009a\u009b\t"+
		"\5\2\2\u009b\u00ac\5\26\f\t\u009c\u009d\f\7\2\2\u009d\u009e\t\6\2\2\u009e"+
		"\u00ac\5\26\f\b\u009f\u00a0\f\6\2\2\u00a0\u00a1\t\7\2\2\u00a1\u00ac\5"+
		"\26\f\7\u00a2\u00a3\f\5\2\2\u00a3\u00a4\t\b\2\2\u00a4\u00ac\5\26\f\6\u00a5"+
		"\u00a6\f\4\2\2\u00a6\u00a7\7\66\2\2\u00a7\u00ac\5\26\f\5\u00a8\u00a9\f"+
		"\3\2\2\u00a9\u00aa\t\t\2\2\u00aa\u00ac\5\26\f\4\u00ab\u0096\3\2\2\2\u00ab"+
		"\u0099\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2"+
		"\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\27\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b2\7?\2\2\u00b1\u00b3\5\32\16\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\5\34"+
		"\17\2\u00b6\u00bb\7\27\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00ba\5\32\16\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00c7\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c3\5\34\17\2"+
		"\u00bf\u00c0\7\25\2\2\u00c0\u00c2\5\32\16\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00be\3\2\2\2\u00c7"+
		"\33\3\2\2\2\u00c8\u00cd\5\26\f\2\u00c9\u00ca\7?\2\2\u00ca\u00cb\7\26\2"+
		"\2\u00cb\u00cd\7\27\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cf\7\35\2\2\u00cf\u00d4\5\f\7\2\u00d0\u00d1\7\25"+
		"\2\2\u00d1\u00d3\5\f\7\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d8\7\36\2\2\u00d8\u00dd\5\26\f\2\u00d9\u00da\7\23\2\2\u00da"+
		"\u00dc\5\26\f\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de!\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1"+
		"\7\37\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00e3\7 \2\2\u00e3\u00eb\5\60\31"+
		"\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\5\26\f\2\u00e6\u00e7\7 \2\2\u00e7\u00e8"+
		"\5\60\31\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00ef\7!\2\2\u00ef\u00f1\5\60\31\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4"+
		"\7\37\2\2\u00f4#\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\5\26\f\2\u00f7"+
		"\u00f8\5\60\31\2\u00f8\u00f9\7%\2\2\u00f9%\3\2\2\2\u00fa\u00fb\7&\2\2"+
		"\u00fb\u00fc\5\60\31\2\u00fc\u00fd\7\'\2\2\u00fd\u00fe\7$\2\2\u00fe\u00ff"+
		"\5\26\f\2\u00ff\'\3\2\2\2\u0100\u0101\7&\2\2\u0101\u0102\5\60\31\2\u0102"+
		"\u0103\7\'\2\2\u0103\u0104\7(\2\2\u0104\u0105\5\26\f\2\u0105)\3\2\2\2"+
		"\u0106\u0107\7)\2\2\u0107\u0108\5\16\b\2\u0108\u0109\7\b\2\2\u0109\u010a"+
		"\5\26\f\2\u010a\u010b\7*\2\2\u010b\u010e\5\26\f\2\u010c\u010d\7+\2\2\u010d"+
		"\u010f\5\26\f\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0111\5\60\31\2\u0111\u0112\7,\2\2\u0112+\3\2\2\2\u0113\u0114"+
		"\7;\2\2\u0114\u0115\7<\2\2\u0115\u0117\5\f\7\2\u0116\u0118\5.\30\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3\2\2\2\u0119\u011a\7<"+
		"\2\2\u011a\u011b\7!\2\2\u011b\u011d\5\60\31\2\u011c\u0119\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7#\2\2\u011f\u0120\7;\2"+
		"\2\u0120-\3\2\2\2\u0121\u0122\7<\2\2\u0122\u0123\5\26\f\2\u0123\u0125"+
		"\5\60\31\2\u0124\u0126\5.\30\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126/\3\2\2\2\u0127\u0129\5\4\3\2\u0128\u0127\3\2\2\2\u0129\u012c\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\61\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012e\7:\2\2\u012e\u013a\5\16\b\2\u012f\u0130\7\26"+
		"\2\2\u0130\u0135\5\64\33\2\u0131\u0132\7\25\2\2\u0132\u0134\5\64\33\2"+
		"\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\27\2\2"+
		"\u0139\u013b\3\2\2\2\u013a\u012f\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\5\60\31\2\u013d\u013e\7#\2\2\u013e\u013f\7:\2\2\u013f"+
		"\u0154\3\2\2\2\u0140\u0141\79\2\2\u0141\u014d\7?\2\2\u0142\u0143\7\26"+
		"\2\2\u0143\u0148\5\64\33\2\u0144\u0145\7\25\2\2\u0145\u0147\5\64\33\2"+
		"\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\27\2\2"+
		"\u014c\u014e\3\2\2\2\u014d\u0142\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\5\60\31\2\u0150\u0151\7#\2\2\u0151\u0152\79\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u012d\3\2\2\2\u0153\u0140\3\2\2\2\u0154\63\3\2\2"+
		"\2\u0155\u015c\5\16\b\2\u0156\u0157\7?\2\2\u0157\u0158\7\26\2\2\u0158"+
		"\u0159\7\27\2\2\u0159\u015a\7\63\2\2\u015a\u015c\t\2\2\2\u015b\u0155\3"+
		"\2\2\2\u015b\u0156\3\2\2\2\u015c\65\3\2\2\2\u015d\u015e\t\n\2\2\u015e"+
		"\67\3\2\2\2#<MQX`dhlt\u0084\u0094\u00ab\u00ad\u00b2\u00bb\u00c3\u00c6"+
		"\u00cc\u00d4\u00dd\u00eb\u00f0\u010e\u0117\u011c\u0125\u012a\u0135\u013a"+
		"\u0148\u014d\u0153\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
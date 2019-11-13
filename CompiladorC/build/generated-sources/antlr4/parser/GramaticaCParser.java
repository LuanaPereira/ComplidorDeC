// Generated from /home/mayla/NetBeansProjects/CompiladorC/grammar/parser/GramaticaC.g4 by ANTLR 4.6
 package compiladorc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, DOUBLE=3, CHAR=4, BOOL=5, INCLUDE=6, TRUE=7, FALSE=8, 
		READ=9, WRITE=10, IF=11, ELSE=12, GLOBAIS=13, OPC=14, CLC=15, OPP=16, 
		CLP=17, SEP=18, FUNCTION=19, MAIN=20, ATR=21, NOT=22, ADD=23, SUB=24, 
		MUL=25, DIV=26, MOD=27, EOL=28, GR=29, LS=30, EQ=31, GRT=32, LST=33, NEQ=34, 
		STR=35, NUM=36, ID=37, COMMENT=38, LINE_COMMENT=39, WS=40;
	public static final int
		RULE_programa = 0, RULE_includes = 1, RULE_globais = 2, RULE_vars = 3, 
		RULE_functions = 4, RULE_function = 5, RULE_main = 6, RULE_block = 7, 
		RULE_line = 8, RULE_func = 9, RULE_read = 10, RULE_write = 11, RULE_atr = 12, 
		RULE_ifstm = 13, RULE_expr = 14, RULE_term = 15, RULE_fact = 16, RULE_boolExpr = 17, 
		RULE_relop = 18, RULE_type = 19, RULE_ids = 20;
	public static final String[] ruleNames = {
		"programa", "includes", "globais", "vars", "functions", "function", "main", 
		"block", "line", "func", "read", "write", "atr", "ifstm", "expr", "term", 
		"fact", "boolExpr", "relop", "type", "ids"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'double'", "'char'", "'bool'", "'#include'", 
		"'true'", "'false'", "'read'", "'print'", "'if'", "'else'", "'global'", 
		"'{'", "'}'", "'('", "')'", "','", "'function'", "'main'", "'='", null, 
		"'+'", "'-'", "'*'", "'/'", "'%'", "';'", "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "DOUBLE", "CHAR", "BOOL", "INCLUDE", "TRUE", "FALSE", 
		"READ", "WRITE", "IF", "ELSE", "GLOBAIS", "OPC", "CLC", "OPP", "CLP", 
		"SEP", "FUNCTION", "MAIN", "ATR", "NOT", "ADD", "SUB", "MUL", "DIV", "MOD", 
		"EOL", "GR", "LS", "EQ", "GRT", "LST", "NEQ", "STR", "NUM", "ID", "COMMENT", 
		"LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "GramaticaC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public GlobaisContext globais() {
			return getRuleContext(GlobaisContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(42);
				includes();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAIS) {
				{
				setState(45);
				globais();
				}
			}

			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(48);
				functions();
				}
			}

			setState(51);
			main();
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

	public static class IncludesContext extends ParserRuleContext {
		public List<TerminalNode> INCLUDE() { return getTokens(GramaticaCParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(GramaticaCParser.INCLUDE, i);
		}
		public List<TerminalNode> STR() { return getTokens(GramaticaCParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GramaticaCParser.STR, i);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				match(INCLUDE);
				setState(54);
				match(STR);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
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

	public static class GlobaisContext extends ParserRuleContext {
		public TerminalNode GLOBAIS() { return getToken(GramaticaCParser.GLOBAIS, 0); }
		public TerminalNode OPC() { return getToken(GramaticaCParser.OPC, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode CLC() { return getToken(GramaticaCParser.CLC, 0); }
		public GlobaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globais; }
	}

	public final GlobaisContext globais() throws RecognitionException {
		GlobaisContext _localctx = new GlobaisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(GLOBAIS);
			setState(60);
			match(OPC);
			setState(61);
			vars();
			setState(62);
			match(CLC);
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

	public static class VarsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(GramaticaCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(GramaticaCParser.EOL, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				type();
				setState(65);
				ids();
				setState(66);
				match(EOL);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0) );
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				function();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GramaticaCParser.FUNCTION, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaCParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(GramaticaCParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(GramaticaCParser.SEP, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(FUNCTION);
			setState(78);
			type();
			setState(79);
			match(ID);
			setState(80);
			match(OPP);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						type();
						setState(82);
						match(ID);
						setState(83);
						match(SEP);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(90);
				type();
				setState(91);
				match(ID);
				}
			}

			setState(95);
			match(CLP);
			setState(96);
			block();
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
		public TerminalNode INT() { return getToken(GramaticaCParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(GramaticaCParser.MAIN, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(INT);
			setState(99);
			match(MAIN);
			setState(100);
			match(OPP);
			setState(101);
			match(CLP);
			setState(102);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPC() { return getToken(GramaticaCParser.OPC, 0); }
		public TerminalNode CLC() { return getToken(GramaticaCParser.CLC, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(OPC);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				line();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << ID))) != 0) );
			setState(110);
			match(CLC);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineAtrContext extends LineContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public LineAtrContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineReadContext extends LineContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public LineReadContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LinefuncContext extends LineContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LinefuncContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineWriteContext extends LineContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public LineWriteContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineIfStmContext extends LineContext {
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public LineIfStmContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new LineReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				read();
				}
				break;
			case 2:
				_localctx = new LineWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				write();
				}
				break;
			case 3:
				_localctx = new LineAtrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				atr();
				}
				break;
			case 4:
				_localctx = new LineIfStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				ifstm();
				}
				break;
			case 5:
				_localctx = new LinefuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				func();
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

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaCParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public List<TerminalNode> SEP() { return getTokens(GramaticaCParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(GramaticaCParser.SEP, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(OPP);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						match(ID);
						setState(122);
						match(SEP);
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(128);
				match(ID);
				}
			}

			setState(131);
			match(CLP);
			setState(132);
			match(EOL);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GramaticaCParser.READ, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(READ);
			setState(135);
			match(OPP);
			setState(136);
			match(ID);
			setState(137);
			match(CLP);
			setState(138);
			match(EOL);
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

	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStrContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(GramaticaCParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode STR() { return getToken(GramaticaCParser.STR, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public WriteStrContext(WriteContext ctx) { copyFrom(ctx); }
	}
	public static class WriteExprContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(GramaticaCParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public WriteExprContext(WriteContext ctx) { copyFrom(ctx); }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(WRITE);
				setState(141);
				match(OPP);
				setState(142);
				match(STR);
				setState(143);
				match(CLP);
				setState(144);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(WRITE);
				setState(146);
				match(OPP);
				setState(147);
				expr();
				setState(148);
				match(CLP);
				setState(149);
				match(EOL);
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

	public static class AtrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public TerminalNode ATR() { return getToken(GramaticaCParser.ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(ATR);
			setState(155);
			expr();
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

	public static class IfstmContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaCParser.IF, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GramaticaCParser.ELSE, 0); }
		public IfstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstm; }
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstm);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(IF);
				setState(158);
				match(OPP);
				setState(159);
				boolExpr();
				setState(160);
				match(CLP);
				setState(161);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(IF);
				setState(164);
				match(OPP);
				setState(165);
				boolExpr();
				setState(166);
				match(CLP);
				setState(167);
				block();
				setState(168);
				match(ELSE);
				setState(169);
				block();
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GramaticaCParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(GramaticaCParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				term();
				setState(174);
				match(ADD);
				setState(175);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				term();
				setState(178);
				match(SUB);
				setState(179);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GramaticaCParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GramaticaCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GramaticaCParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				fact();
				setState(185);
				match(MUL);
				setState(186);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				fact();
				setState(189);
				match(DIV);
				setState(190);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				fact();
				setState(193);
				match(MOD);
				setState(194);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				fact();
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GramaticaCParser.NUM, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fact);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(NUM);
				}
				break;
			case OPP:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(OPP);
				setState(202);
				expr();
				setState(203);
				match(CLP);
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

	public static class BoolExprContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public TerminalNode NOT() { return getToken(GramaticaCParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(GramaticaCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramaticaCParser.FALSE, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolExpr);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(NOT);
				setState(209);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				fact();
				setState(211);
				relop();
				setState(212);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(FALSE);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GR() { return getToken(GramaticaCParser.GR, 0); }
		public TerminalNode LS() { return getToken(GramaticaCParser.LS, 0); }
		public TerminalNode EQ() { return getToken(GramaticaCParser.EQ, 0); }
		public TerminalNode GRT() { return getToken(GramaticaCParser.GRT, 0); }
		public TerminalNode LST() { return getToken(GramaticaCParser.LST, 0); }
		public TerminalNode NEQ() { return getToken(GramaticaCParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << LS) | (1L << EQ) | (1L << GRT) | (1L << LST) | (1L << NEQ))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GramaticaCParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(GramaticaCParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaCParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(GramaticaCParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\5\2\61\n\2\3"+
		"\2\5\2\64\n\2\3\2\3\2\3\3\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\6\5G\n\5\r\5\16\5H\3\6\6\6L\n\6\r\6\16\6M\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\7\5\7`\n\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\6\tm\n\t\r\t\16\tn\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\5\nx\n\n\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081"+
		"\13\13\3\13\5\13\u0084\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00ae\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00b9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00c8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d0\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00db\n\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\4\3\2\37$\3\2\3\7\u00e9\2-\3\2\2\2\49\3\2\2\2\6=\3\2\2\2\bF"+
		"\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16d\3\2\2\2\20j\3\2\2\2\22w\3\2\2\2\24"+
		"y\3\2\2\2\26\u0088\3\2\2\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u00ad"+
		"\3\2\2\2\36\u00b8\3\2\2\2 \u00c7\3\2\2\2\"\u00cf\3\2\2\2$\u00da\3\2\2"+
		"\2&\u00dc\3\2\2\2(\u00de\3\2\2\2*\u00e0\3\2\2\2,.\5\4\3\2-,\3\2\2\2-."+
		"\3\2\2\2.\60\3\2\2\2/\61\5\6\4\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2"+
		"\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\5\16"+
		"\b\2\66\3\3\2\2\2\678\7\b\2\28:\7%\2\29\67\3\2\2\2:;\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<\5\3\2\2\2=>\7\17\2\2>?\7\20\2\2?@\5\b\5\2@A\7\21\2\2A\7\3"+
		"\2\2\2BC\5(\25\2CD\5*\26\2DE\7\36\2\2EG\3\2\2\2FB\3\2\2\2GH\3\2\2\2HF"+
		"\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JL\5\f\7\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2N\13\3\2\2\2OP\7\25\2\2PQ\5(\25\2QR\7\'\2\2R_\7\22\2\2ST\5("+
		"\25\2TU\7\'\2\2UV\7\24\2\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5(\25\2]^\7\'\2\2^`\3\2\2\2_Y\3\2\2\2_"+
		"`\3\2\2\2`a\3\2\2\2ab\7\23\2\2bc\5\20\t\2c\r\3\2\2\2de\7\3\2\2ef\7\26"+
		"\2\2fg\7\22\2\2gh\7\23\2\2hi\5\20\t\2i\17\3\2\2\2jl\7\20\2\2km\5\22\n"+
		"\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\21\2\2q\21\3"+
		"\2\2\2rx\5\26\f\2sx\5\30\r\2tx\5\32\16\2ux\5\34\17\2vx\5\24\13\2wr\3\2"+
		"\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2yz\7\'\2\2z\u0083"+
		"\7\22\2\2{|\7\'\2\2|~\7\24\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7\'\2"+
		"\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\7\23\2\2\u0086\u0087\7\36\2\2\u0087\25\3\2\2\2\u0088\u0089\7\13\2\2\u0089"+
		"\u008a\7\22\2\2\u008a\u008b\7\'\2\2\u008b\u008c\7\23\2\2\u008c\u008d\7"+
		"\36\2\2\u008d\27\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7\22\2\2\u0090"+
		"\u0091\7%\2\2\u0091\u0092\7\23\2\2\u0092\u009a\7\36\2\2\u0093\u0094\7"+
		"\f\2\2\u0094\u0095\7\22\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7\23\2\2"+
		"\u0097\u0098\7\36\2\2\u0098\u009a\3\2\2\2\u0099\u008e\3\2\2\2\u0099\u0093"+
		"\3\2\2\2\u009a\31\3\2\2\2\u009b\u009c\7\'\2\2\u009c\u009d\7\27\2\2\u009d"+
		"\u009e\5\36\20\2\u009e\33\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\7\22"+
		"\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\5\20\t\2\u00a4"+
		"\u00ae\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5"+
		"$\23\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\16\2\2"+
		"\u00ab\u00ac\5\20\t\2\u00ac\u00ae\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a5"+
		"\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\7\31\2\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\u00b9\3\2\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7"+
		"\32\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\5 \21\2"+
		"\u00b8\u00af\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\37"+
		"\3\2\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\5 \21\2"+
		"\u00bd\u00c8\3\2\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1"+
		"\5 \21\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\7\35\2\2"+
		"\u00c4\u00c5\5 \21\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8\5\"\22\2\u00c7\u00ba"+
		"\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"!\3\2\2\2\u00c9\u00d0\7\'\2\2\u00ca\u00d0\7&\2\2\u00cb\u00cc\7\22\2\2"+
		"\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7\23\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0#\3\2\2\2"+
		"\u00d1\u00db\5\"\22\2\u00d2\u00d3\7\30\2\2\u00d3\u00db\5$\23\2\u00d4\u00d5"+
		"\5\"\22\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\5\"\22\2\u00d7\u00db\3\2\2\2"+
		"\u00d8\u00db\7\t\2\2\u00d9\u00db\7\n\2\2\u00da\u00d1\3\2\2\2\u00da\u00d2"+
		"\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"%\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\'\3\2\2\2\u00de\u00df\t\3\2\2\u00df"+
		")\3\2\2\2\u00e0\u00e1\7\'\2\2\u00e1+\3\2\2\2\24-\60\63;HMY_nw\177\u0083"+
		"\u0099\u00ad\u00b8\u00c7\u00cf\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
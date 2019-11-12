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
		RULE_line = 8, RULE_whileLoop = 9, RULE_forLoop = 10, RULE_read = 11, 
		RULE_write = 12, RULE_atr = 13, RULE_ifstm = 14, RULE_expr = 15, RULE_term = 16, 
		RULE_fact = 17, RULE_boolExpr = 18, RULE_relop = 19, RULE_type = 20, RULE_ids = 21;
	public static final String[] ruleNames = {
		"programa", "includes", "globais", "vars", "functions", "function", "main", 
		"block", "line", "whileLoop", "forLoop", "read", "write", "atr", "ifstm", 
		"expr", "term", "fact", "boolExpr", "relop", "type", "ids"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'double'", "'char'", "'bool'", "'#include'", 
		"'true'", "'false'", "'read'", "'write'", "'if'", "'else'", "'global'", 
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
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public GlobaisContext globais() {
			return getRuleContext(GlobaisContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCLUDE) {
					{
					setState(44);
					includes();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAIS) {
					{
					setState(47);
					globais();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(50);
					functions();
					}
				}

				setState(53);
				main();
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
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				match(INCLUDE);
				setState(57);
				match(STR);
				}
				}
				setState(60); 
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
			setState(62);
			match(GLOBAIS);
			setState(63);
			match(OPC);
			setState(64);
			vars();
			setState(65);
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				type();
				setState(68);
				ids();
				setState(69);
				match(EOL);
				}
				}
				setState(73); 
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
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				function();
				}
				}
				setState(78); 
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
		public List<TerminalNode> ID() { return getTokens(GramaticaCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaCParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(80);
			match(FUNCTION);
			setState(81);
			match(ID);
			setState(82);
			match(OPP);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						type();
						setState(84);
						match(ID);
						setState(85);
						match(SEP);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(92);
				type();
				setState(93);
				match(ID);
				}
			}

			setState(97);
			match(CLP);
			setState(98);
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
		public TerminalNode MAIN() { return getToken(GramaticaCParser.MAIN, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaCParser.ID, i);
		}
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(GramaticaCParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(GramaticaCParser.SEP, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(MAIN);
			setState(101);
			match(ID);
			setState(102);
			match(OPP);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(103);
						type();
						setState(104);
						match(ID);
						setState(105);
						match(SEP);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(112);
				type();
				setState(113);
				match(ID);
				}
			}

			setState(117);
			match(CLP);
			setState(118);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(OPC);
			setState(121);
			line();
			setState(122);
			match(CLP);
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
	public static class LineWhileLoopContext extends LineContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public LineWhileLoopContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineWriteContext extends LineContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public LineWriteContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineForLoopContext extends LineContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LineForLoopContext(LineContext ctx) { copyFrom(ctx); }
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new LineReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				read();
				}
				break;
			case 2:
				_localctx = new LineWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				write();
				}
				break;
			case 3:
				_localctx = new LineAtrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				atr();
				}
				break;
			case 4:
				_localctx = new LineIfStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				ifstm();
				}
				break;
			case 5:
				_localctx = new LineWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				whileLoop();
				}
				break;
			case 6:
				_localctx = new LineForLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				forLoop();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(READ);
			setState(137);
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
		public TerminalNode STR() { return getToken(GramaticaCParser.STR, 0); }
		public WriteStrContext(WriteContext ctx) { copyFrom(ctx); }
	}
	public static class WriteExprContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(GramaticaCParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteExprContext(WriteContext ctx) { copyFrom(ctx); }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(WRITE);
				setState(140);
				match(STR);
				}
				break;
			case 2:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(WRITE);
				setState(142);
				expr();
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
		enterRule(_localctx, 26, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(ATR);
			setState(147);
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
		enterRule(_localctx, 28, RULE_ifstm);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(IF);
				setState(150);
				match(OPP);
				setState(151);
				boolExpr();
				setState(152);
				match(CLP);
				setState(153);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(IF);
				setState(156);
				match(OPP);
				setState(157);
				boolExpr();
				setState(158);
				match(CLP);
				setState(159);
				block();
				setState(160);
				match(ELSE);
				setState(161);
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
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				term();
				setState(166);
				match(ADD);
				setState(167);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				term();
				setState(170);
				match(SUB);
				setState(171);
				expr();
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
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				fact();
				setState(176);
				match(MUL);
				setState(177);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				fact();
				setState(180);
				match(DIV);
				setState(181);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				fact();
				setState(184);
				match(MOD);
				setState(185);
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
		enterRule(_localctx, 34, RULE_fact);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(NUM);
				}
				break;
			case OPP:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(OPP);
				setState(192);
				expr();
				setState(193);
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
		enterRule(_localctx, 36, RULE_boolExpr);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NOT);
				setState(199);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				fact();
				setState(201);
				relop();
				setState(202);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
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
		enterRule(_localctx, 38, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 42, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\5\2\60\n\2\3\2"+
		"\5\2\63\n\2\3\2\5\2\66\n\2\3\2\5\29\n\2\3\3\3\3\6\3=\n\3\r\3\16\3>\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5J\n\5\r\5\16\5K\3\6\6\6O\n\6\r\6\16"+
		"\6P\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\7\5"+
		"\7b\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13"+
		"\b\3\b\3\b\3\b\5\bv\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0085\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\5\16\u0092\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00b0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00be\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00c6\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d1"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\4\3\2\37$\3\2\3\7\u00de\28\3\2\2\2\4<\3\2\2"+
		"\2\6@\3\2\2\2\bI\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16f\3\2\2\2\20z\3\2\2\2"+
		"\22\u0084\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32"+
		"\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u00a5\3\2\2\2 \u00af\3\2\2\2\"\u00bd"+
		"\3\2\2\2$\u00c5\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00d4\3\2\2\2,"+
		"\u00d6\3\2\2\2.\60\5\4\3\2/.\3\2\2\2/\60\3\2\2\2\609\3\2\2\2\61\63\5\6"+
		"\4\2\62\61\3\2\2\2\62\63\3\2\2\2\639\3\2\2\2\64\66\5\n\6\2\65\64\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\679\5\16\b\28/\3\2\2\28\62\3\2\2\28\65"+
		"\3\2\2\29\3\3\2\2\2:;\7\b\2\2;=\7%\2\2<:\3\2\2\2=>\3\2\2\2><\3\2\2\2>"+
		"?\3\2\2\2?\5\3\2\2\2@A\7\17\2\2AB\7\20\2\2BC\5\b\5\2CD\7\21\2\2D\7\3\2"+
		"\2\2EF\5*\26\2FG\5,\27\2GH\7\36\2\2HJ\3\2\2\2IE\3\2\2\2JK\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2L\t\3\2\2\2MO\5\f\7\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ"+
		"\3\2\2\2Q\13\3\2\2\2RS\7\25\2\2ST\7\'\2\2Ta\7\22\2\2UV\5*\26\2VW\7\'\2"+
		"\2WX\7\24\2\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3"+
		"\2\2\2][\3\2\2\2^_\5*\26\2_`\7\'\2\2`b\3\2\2\2a[\3\2\2\2ab\3\2\2\2bc\3"+
		"\2\2\2cd\7\23\2\2de\5\20\t\2e\r\3\2\2\2fg\7\26\2\2gh\7\'\2\2hu\7\22\2"+
		"\2ij\5*\26\2jk\7\'\2\2kl\7\24\2\2ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\5*\26\2st\7\'\2\2tv\3\2\2\2uo\3\2"+
		"\2\2uv\3\2\2\2vw\3\2\2\2wx\7\23\2\2xy\5\20\t\2y\17\3\2\2\2z{\7\20\2\2"+
		"{|\5\22\n\2|}\7\23\2\2}\21\3\2\2\2~\u0085\5\30\r\2\177\u0085\5\32\16\2"+
		"\u0080\u0085\5\34\17\2\u0081\u0085\5\36\20\2\u0082\u0085\5\24\13\2\u0083"+
		"\u0085\5\26\f\2\u0084~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\23\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\3\2\2\2\u0089\27\3"+
		"\2\2\2\u008a\u008b\7\13\2\2\u008b\u008c\7\'\2\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\f\2\2\u008e\u0092\7%\2\2\u008f\u0090\7\f\2\2\u0090\u0092\5 \21"+
		"\2\u0091\u008d\3\2\2\2\u0091\u008f\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094"+
		"\7\'\2\2\u0094\u0095\7\27\2\2\u0095\u0096\5 \21\2\u0096\35\3\2\2\2\u0097"+
		"\u0098\7\r\2\2\u0098\u0099\7\22\2\2\u0099\u009a\5&\24\2\u009a\u009b\7"+
		"\23\2\2\u009b\u009c\5\20\t\2\u009c\u00a6\3\2\2\2\u009d\u009e\7\r\2\2\u009e"+
		"\u009f\7\22\2\2\u009f\u00a0\5&\24\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5"+
		"\20\t\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a6\3\2\2\2"+
		"\u00a5\u0097\3\2\2\2\u00a5\u009d\3\2\2\2\u00a6\37\3\2\2\2\u00a7\u00a8"+
		"\5\"\22\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\5 \21\2\u00aa\u00b0\3\2\2\2"+
		"\u00ab\u00ac\5\"\22\2\u00ac\u00ad\7\32\2\2\u00ad\u00ae\5 \21\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0!\3\2\2\2\u00b1"+
		"\u00b2\5$\23\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00be\3"+
		"\2\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5\"\22\2\u00b8"+
		"\u00be\3\2\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc\5"+
		"\"\22\2\u00bc\u00be\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c6\7\'\2\2\u00c0\u00c6\7&\2\2\u00c1"+
		"\u00c2\7\22\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\7\23\2\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6"+
		"%\3\2\2\2\u00c7\u00d1\5$\23\2\u00c8\u00c9\7\30\2\2\u00c9\u00d1\5&\24\2"+
		"\u00ca\u00cb\5$\23\2\u00cb\u00cc\5(\25\2\u00cc\u00cd\5$\23\2\u00cd\u00d1"+
		"\3\2\2\2\u00ce\u00d1\7\t\2\2\u00cf\u00d1\7\n\2\2\u00d0\u00c7\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3)\3\2\2\2\u00d4\u00d5\t"+
		"\3\2\2\u00d5+\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7-\3\2\2\2\24/\62\658>K"+
		"P[aou\u0084\u0091\u00a5\u00af\u00bd\u00c5\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
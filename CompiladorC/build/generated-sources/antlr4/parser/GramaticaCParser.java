// Generated from C:\Users\bruno\Desktop\CompiladorC\grammar\parser\GramaticaC.g4 by ANTLR 4.6
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
		CLP=17, SEP=18, FUNCTION=19, MAIN=20, WHILE=21, FOR=22, ATR=23, NOT=24, 
		ADD=25, SUB=26, MUL=27, DIV=28, MOD=29, EOL=30, GR=31, LS=32, EQ=33, GRT=34, 
		LST=35, NEQ=36, STR=37, NUM=38, ID=39, COMMENT=40, LINE_COMMENT=41, WS=42;
	public static final int
		RULE_programa = 0, RULE_includes = 1, RULE_globais = 2, RULE_functions = 3, 
		RULE_function = 4, RULE_main = 5, RULE_block = 6, RULE_line = 7, RULE_vars = 8, 
		RULE_func = 9, RULE_whileLoop = 10, RULE_forLoop = 11, RULE_read = 12, 
		RULE_write = 13, RULE_ifstm = 14, RULE_atr = 15, RULE_expr = 16, RULE_term = 17, 
		RULE_fact = 18, RULE_boolExpr = 19, RULE_relop = 20, RULE_type = 21, RULE_ids = 22;
	public static final String[] ruleNames = {
		"programa", "includes", "globais", "functions", "function", "main", "block", 
		"line", "vars", "func", "whileLoop", "forLoop", "read", "write", "ifstm", 
		"atr", "expr", "term", "fact", "boolExpr", "relop", "type", "ids"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'double'", "'char'", "'bool'", "'#include'", 
		"'true'", "'false'", "'read'", "'print'", "'if'", "'else'", "'global'", 
		"'{'", "'}'", "'('", "')'", "','", "'function'", "'main'", "'while'", 
		"'for'", "'='", null, "'+'", "'-'", "'*'", "'/'", "'%'", "';'", "'>'", 
		"'<'", "'=='", "'>='", "'<='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "DOUBLE", "CHAR", "BOOL", "INCLUDE", "TRUE", "FALSE", 
		"READ", "WRITE", "IF", "ELSE", "GLOBAIS", "OPC", "CLC", "OPP", "CLP", 
		"SEP", "FUNCTION", "MAIN", "WHILE", "FOR", "ATR", "NOT", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "EOL", "GR", "LS", "EQ", "GRT", "LST", "NEQ", "STR", 
		"NUM", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(46);
				includes();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAIS) {
				{
				setState(49);
				globais();
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(52);
				functions();
				}
			}

			setState(55);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitIncludes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(INCLUDE);
				setState(58);
				match(STR);
				}
				}
				setState(61); 
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
		public TerminalNode CLC() { return getToken(GramaticaCParser.CLC, 0); }
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public GlobaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterGlobais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitGlobais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitGlobais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobaisContext globais() throws RecognitionException {
		GlobaisContext _localctx = new GlobaisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(GLOBAIS);
			setState(64);
			match(OPC);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				vars();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0) );
			setState(70);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functions);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLineAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLineAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLineAtr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineReadContext extends LineContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public LineReadContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLineRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLineRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLineRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinevarsContext extends LineContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public LinevarsContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLinevars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLinevars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLinevars(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinefuncContext extends LineContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LinefuncContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLinefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLinefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLinefunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineWhileLoopContext extends LineContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public LineWhileLoopContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLineWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLineWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLineWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineWriteContext extends LineContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public LineWriteContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLineWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLineWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLineWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineForLoopContext extends LineContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LineForLoopContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLineForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLineForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLineForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineIfStmContext extends LineContext {
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public LineIfStmContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterLineIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitLineIfStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitLineIfStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		try {
			setState(120);
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
			case 6:
				_localctx = new LinevarsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				vars();
				}
				break;
			case 7:
				_localctx = new LineWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				whileLoop();
				}
				break;
			case 8:
				_localctx = new LineForLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
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

	public static class VarsContext extends ParserRuleContext {
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	 
		public VarsContext() { }
		public void copyFrom(VarsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends VarsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public VarContext(VarsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vars);
		try {
			_localctx = new VarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			type();
			setState(123);
			ids();
			setState(124);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(OPP);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(ID);
						setState(129);
						match(SEP);
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(135);
				match(ID);
				}
			}

			setState(138);
			match(CLP);
			setState(139);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	 
		public WhileLoopContext() { }
		public void copyFrom(WhileLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends WhileLoopContext {
		public TerminalNode WHILE() { return getToken(GramaticaCParser.WHILE, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(WhileLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(WHILE);
			setState(142);
			match(OPP);
			setState(143);
			boolExpr();
			setState(144);
			match(CLP);
			setState(145);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaCParser.FOR, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public List<AtrContext> atr() {
			return getRuleContexts(AtrContext.class);
		}
		public AtrContext atr(int i) {
			return getRuleContext(AtrContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			match(OPP);
			setState(149);
			atr();
			setState(150);
			boolExpr();
			setState(151);
			match(EOL);
			setState(152);
			atr();
			setState(153);
			match(CLP);
			setState(154);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(READ);
			setState(157);
			match(OPP);
			setState(158);
			match(ID);
			setState(159);
			match(CLP);
			setState(160);
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
	public static class WriteIDContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(GramaticaCParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public WriteIDContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterWriteID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitWriteID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitWriteID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteStrContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(GramaticaCParser.WRITE, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public TerminalNode STR() { return getToken(GramaticaCParser.STR, 0); }
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public WriteStrContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterWriteStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitWriteStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitWriteStr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterWriteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitWriteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitWriteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(WRITE);
				setState(163);
				match(OPP);
				setState(164);
				match(STR);
				setState(165);
				match(CLP);
				setState(166);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new WriteIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(WRITE);
				setState(168);
				match(OPP);
				setState(169);
				match(ID);
				setState(170);
				match(CLP);
				setState(171);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(WRITE);
				setState(173);
				match(OPP);
				setState(174);
				expr();
				setState(175);
				match(CLP);
				setState(176);
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

	public static class IfstmContext extends ParserRuleContext {
		public IfstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstm; }
	 
		public IfstmContext() { }
		public void copyFrom(IfstmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfComElseContext extends IfstmContext {
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
		public IfComElseContext(IfstmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterIfComElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitIfComElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitIfComElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSemElseContext extends IfstmContext {
		public TerminalNode IF() { return getToken(GramaticaCParser.IF, 0); }
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfSemElseContext(IfstmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterIfSemElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitIfSemElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitIfSemElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifstm);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IfSemElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(IF);
				setState(181);
				match(OPP);
				setState(182);
				boolExpr();
				setState(183);
				match(CLP);
				setState(184);
				block();
				}
				break;
			case 2:
				_localctx = new IfComElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(IF);
				setState(187);
				match(OPP);
				setState(188);
				boolExpr();
				setState(189);
				match(CLP);
				setState(190);
				block();
				setState(191);
				match(ELSE);
				setState(192);
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

	public static class AtrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public TerminalNode ATR() { return getToken(GramaticaCParser.ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(GramaticaCParser.EOL, 0); }
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(ATR);
			setState(198);
			expr();
			setState(199);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSubContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUB() { return getToken(GramaticaCParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GramaticaCParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ExprAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				term();
				setState(202);
				match(ADD);
				setState(203);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprSubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				term();
				setState(206);
				match(SUB);
				setState(207);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDivContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GramaticaCParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTermDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTermDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermModContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MOD() { return getToken(GramaticaCParser.MOD, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermModContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTermMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTermMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTermMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermMulContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GramaticaCParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTermMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTermMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTermMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermFactContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermFactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTermFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTermFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTermFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new TermMulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				fact();
				setState(213);
				match(MUL);
				setState(214);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				fact();
				setState(217);
				match(DIV);
				setState(218);
				term();
				}
				break;
			case 3:
				_localctx = new TermModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				fact();
				setState(221);
				match(MOD);
				setState(222);
				term();
				}
				break;
			case 4:
				_localctx = new TermFactContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
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
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactNumContext extends FactContext {
		public TerminalNode NUM() { return getToken(GramaticaCParser.NUM, 0); }
		public FactNumContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFactNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFactNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFactNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactIdContext extends FactContext {
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public FactIdContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFactId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFactId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFactId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactExprContext extends FactContext {
		public TerminalNode OPP() { return getToken(GramaticaCParser.OPP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLP() { return getToken(GramaticaCParser.CLP, 0); }
		public FactExprContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFactExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFactExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFactExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fact);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new FactIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new FactNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(NUM);
				}
				break;
			case OPP:
				_localctx = new FactExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(OPP);
				setState(230);
				expr();
				setState(231);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolExpr);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(NOT);
				setState(237);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				fact();
				setState(239);
				relop();
				setState(240);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(GramaticaCParser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(GramaticaCParser.FLOAT, 0); }
		public TypeFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTypeFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTypeFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTypeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeCharContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(GramaticaCParser.CHAR, 0); }
		public TypeCharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(GramaticaCParser.BOOL, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDoubleContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(GramaticaCParser.DOUBLE, 0); }
		public TypeDoubleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTypeDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTypeDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTypeDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(DOUBLE);
				}
				break;
			case CHAR:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(CHAR);
				}
				break;
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(BOOL);
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaCParser.ID, 0); }
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\5\2\65\n\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\6\3>\n\3\r\3\16\3?\3"+
		"\4\3\4\3\4\6\4E\n\4\r\4\16\4F\3\4\3\4\3\5\6\5L\n\5\r\5\16\5M\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\5\6`\n\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\bm\n\b\r\b\16\bn\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\13\5\13\u008b\n\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c5"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00d5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00e4\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ec"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f7\n\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0100\n\27\3\30\3\30\3\30\2\2\31\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2!&\u0110\2\61\3"+
		"\2\2\2\4=\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\nO\3\2\2\2\fd\3\2\2\2\16j\3\2"+
		"\2\2\20z\3\2\2\2\22|\3\2\2\2\24\u0080\3\2\2\2\26\u008f\3\2\2\2\30\u0095"+
		"\3\2\2\2\32\u009e\3\2\2\2\34\u00b4\3\2\2\2\36\u00c4\3\2\2\2 \u00c6\3\2"+
		"\2\2\"\u00d4\3\2\2\2$\u00e3\3\2\2\2&\u00eb\3\2\2\2(\u00f6\3\2\2\2*\u00f8"+
		"\3\2\2\2,\u00ff\3\2\2\2.\u0101\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\668\5\b\5\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\f\7\2"+
		":\3\3\2\2\2;<\7\b\2\2<>\7\'\2\2=;\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@\5\3\2\2\2AB\7\17\2\2BD\7\20\2\2CE\5\22\n\2DC\3\2\2\2EF\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\21\2\2I\7\3\2\2\2JL\5\n\6\2KJ\3\2\2\2L"+
		"M\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\7\25\2\2PQ\5,\27\2QR\7)\2\2"+
		"R_\7\22\2\2ST\5,\27\2TU\7)\2\2UV\7\24\2\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5,\27\2]^\7)\2\2^`\3\2"+
		"\2\2_Y\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\23\2\2bc\5\16\b\2c\13\3\2\2\2d"+
		"e\7\3\2\2ef\7\26\2\2fg\7\22\2\2gh\7\23\2\2hi\5\16\b\2i\r\3\2\2\2jl\7\20"+
		"\2\2km\5\20\t\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7"+
		"\21\2\2q\17\3\2\2\2r{\5\32\16\2s{\5\34\17\2t{\5 \21\2u{\5\36\20\2v{\5"+
		"\24\13\2w{\5\22\n\2x{\5\26\f\2y{\5\30\r\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2"+
		"\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\21\3\2\2\2|}\5,"+
		"\27\2}~\5.\30\2~\177\7 \2\2\177\23\3\2\2\2\u0080\u0081\7)\2\2\u0081\u008a"+
		"\7\22\2\2\u0082\u0083\7)\2\2\u0083\u0085\7\24\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7)\2\2\u008a\u0086\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\23\2\2\u008d\u008e\7"+
		" \2\2\u008e\25\3\2\2\2\u008f\u0090\7\27\2\2\u0090\u0091\7\22\2\2\u0091"+
		"\u0092\5(\25\2\u0092\u0093\7\23\2\2\u0093\u0094\5\16\b\2\u0094\27\3\2"+
		"\2\2\u0095\u0096\7\30\2\2\u0096\u0097\7\22\2\2\u0097\u0098\5 \21\2\u0098"+
		"\u0099\5(\25\2\u0099\u009a\7 \2\2\u009a\u009b\5 \21\2\u009b\u009c\7\23"+
		"\2\2\u009c\u009d\5\16\b\2\u009d\31\3\2\2\2\u009e\u009f\7\13\2\2\u009f"+
		"\u00a0\7\22\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00a3\7"+
		" \2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\7\22\2\2\u00a6"+
		"\u00a7\7\'\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00b5\7 \2\2\u00a9\u00aa\7\f"+
		"\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ad\7\23\2\2\u00ad"+
		"\u00b5\7 \2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\5\""+
		"\22\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\7 \2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00a4\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b5\35\3\2\2"+
		"\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\5(\25\2\u00b9"+
		"\u00ba\7\23\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00c5\3\2\2\2\u00bc\u00bd\7"+
		"\r\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\5(\25\2\u00bf\u00c0\7\23\2\2\u00c0"+
		"\u00c1\5\16\b\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c5\37\3\2\2\2\u00c6"+
		"\u00c7\7)\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7"+
		" \2\2\u00ca!\3\2\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce"+
		"\5\"\22\2\u00ce\u00d5\3\2\2\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\7\34\2\2"+
		"\u00d1\u00d2\5\"\22\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5$\23\2\u00d4\u00cb"+
		"\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5#\3\2\2\2\u00d6"+
		"\u00d7\5&\24\2\u00d7\u00d8\7\35\2\2\u00d8\u00d9\5$\23\2\u00d9\u00e4\3"+
		"\2\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7\36\2\2\u00dc\u00dd\5$\23\2\u00dd"+
		"\u00e4\3\2\2\2\u00de\u00df\5&\24\2\u00df\u00e0\7\37\2\2\u00e0\u00e1\5"+
		"$\23\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\5&\24\2\u00e3\u00d6\3\2\2\2\u00e3"+
		"\u00da\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4%\3\2\2\2"+
		"\u00e5\u00ec\7)\2\2\u00e6\u00ec\7(\2\2\u00e7\u00e8\7\22\2\2\u00e8\u00e9"+
		"\5\"\22\2\u00e9\u00ea\7\23\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e5\3\2\2\2"+
		"\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\'\3\2\2\2\u00ed\u00f7\5"+
		"&\24\2\u00ee\u00ef\7\32\2\2\u00ef\u00f7\5(\25\2\u00f0\u00f1\5&\24\2\u00f1"+
		"\u00f2\5*\26\2\u00f2\u00f3\5&\24\2\u00f3\u00f7\3\2\2\2\u00f4\u00f7\7\t"+
		"\2\2\u00f5\u00f7\7\n\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
		"\u00f0\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7)\3\2\2\2"+
		"\u00f8\u00f9\t\2\2\2\u00f9+\3\2\2\2\u00fa\u0100\7\3\2\2\u00fb\u0100\7"+
		"\4\2\2\u00fc\u0100\7\5\2\2\u00fd\u0100\7\6\2\2\u00fe\u0100\7\7\2\2\u00ff"+
		"\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100-\3\2\2\2\u0101\u0102\7)\2\2\u0102/\3\2"+
		"\2\2\25\61\64\67?FMY_nz\u0086\u008a\u00b4\u00c4\u00d4\u00e3\u00eb\u00f6"+
		"\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
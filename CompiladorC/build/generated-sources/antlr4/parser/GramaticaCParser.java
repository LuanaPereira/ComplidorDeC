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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
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
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << ID))) != 0) );
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
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(118);
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
			setState(120);
			match(ID);
			setState(121);
			match(OPP);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						match(ID);
						setState(123);
						match(SEP);
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(129);
				match(ID);
				}
			}

			setState(132);
			match(CLP);
			setState(133);
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
		enterRule(_localctx, 20, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(READ);
			setState(136);
			match(OPP);
			setState(137);
			match(ID);
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
		enterRule(_localctx, 22, RULE_write);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(WRITE);
				setState(142);
				match(OPP);
				setState(143);
				match(STR);
				setState(144);
				match(CLP);
				setState(145);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(WRITE);
				setState(147);
				match(OPP);
				setState(148);
				expr();
				setState(149);
				match(CLP);
				setState(150);
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
		enterRule(_localctx, 24, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(155);
			match(ATR);
			setState(156);
			expr();
			setState(157);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterIfstm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitIfstm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitIfstm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstm);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(IF);
				setState(160);
				match(OPP);
				setState(161);
				boolExpr();
				setState(162);
				match(CLP);
				setState(163);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(IF);
				setState(166);
				match(OPP);
				setState(167);
				boolExpr();
				setState(168);
				match(CLP);
				setState(169);
				block();
				setState(170);
				match(ELSE);
				setState(171);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				term();
				setState(176);
				match(ADD);
				setState(177);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				term();
				setState(180);
				match(SUB);
				setState(181);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				fact();
				setState(187);
				match(MUL);
				setState(188);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				fact();
				setState(191);
				match(DIV);
				setState(192);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				fact();
				setState(195);
				match(MOD);
				setState(196);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fact);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(NUM);
				}
				break;
			case OPP:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(OPP);
				setState(204);
				expr();
				setState(205);
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
		enterRule(_localctx, 34, RULE_boolExpr);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(NOT);
				setState(211);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				fact();
				setState(213);
				relop();
				setState(214);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
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
		enterRule(_localctx, 36, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCListener ) ((GramaticaCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCVisitor ) return ((GramaticaCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 40, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\5\2\61\n\2\3"+
		"\2\5\2\64\n\2\3\2\3\2\3\3\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\6\5G\n\5\r\5\16\5H\3\6\6\6L\n\6\r\6\16\6M\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\7\5\7`\n\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\6\tm\n\t\r\t\16\tn\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16"+
		"\13\u0082\13\13\3\13\5\13\u0085\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00d2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00dd\n"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\4\3\2\37$\3\2\3\7\u00ec\2-\3\2\2\2\49\3\2\2\2"+
		"\6=\3\2\2\2\bF\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16d\3\2\2\2\20j\3\2\2\2\22"+
		"x\3\2\2\2\24z\3\2\2\2\26\u0089\3\2\2\2\30\u009a\3\2\2\2\32\u009c\3\2\2"+
		"\2\34\u00af\3\2\2\2\36\u00ba\3\2\2\2 \u00c9\3\2\2\2\"\u00d1\3\2\2\2$\u00dc"+
		"\3\2\2\2&\u00de\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\6\4\2\60/\3\2\2\2\60\61\3\2\2\2\61\63"+
		"\3\2\2\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\5\16\b\2\66\3\3\2\2\2\678\7\b\2\28:\7%\2\29\67\3\2\2\2:;\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<\5\3\2\2\2=>\7\17\2\2>?\7\20\2\2?@\5\b\5\2@A\7\21\2\2"+
		"A\7\3\2\2\2BC\5(\25\2CD\5*\26\2DE\7\36\2\2EG\3\2\2\2FB\3\2\2\2GH\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JL\5\f\7\2KJ\3\2\2\2LM\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2N\13\3\2\2\2OP\7\25\2\2PQ\5(\25\2QR\7\'\2\2R_\7\22\2\2S"+
		"T\5(\25\2TU\7\'\2\2UV\7\24\2\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2"+
		"YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5(\25\2]^\7\'\2\2^`\3\2\2\2_Y\3\2\2"+
		"\2_`\3\2\2\2`a\3\2\2\2ab\7\23\2\2bc\5\20\t\2c\r\3\2\2\2de\7\3\2\2ef\7"+
		"\26\2\2fg\7\22\2\2gh\7\23\2\2hi\5\20\t\2i\17\3\2\2\2jl\7\20\2\2km\5\22"+
		"\n\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\21\2\2q\21"+
		"\3\2\2\2ry\5\26\f\2sy\5\30\r\2ty\5\32\16\2uy\5\34\17\2vy\5\24\13\2wy\5"+
		"\b\5\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\23"+
		"\3\2\2\2z{\7\'\2\2{\u0084\7\22\2\2|}\7\'\2\2}\177\7\24\2\2~|\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0085\7\'\2\2\u0084\u0080\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\7\36\2\2"+
		"\u0088\25\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008b\7\22\2\2\u008b\u008c"+
		"\7\'\2\2\u008c\u008d\7\23\2\2\u008d\u008e\7\36\2\2\u008e\27\3\2\2\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0091\7\22\2\2\u0091\u0092\7%\2\2\u0092\u0093\7\23"+
		"\2\2\u0093\u009b\7\36\2\2\u0094\u0095\7\f\2\2\u0095\u0096\7\22\2\2\u0096"+
		"\u0097\5\36\20\2\u0097\u0098\7\23\2\2\u0098\u0099\7\36\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0094\3\2\2\2\u009b\31\3\2\2\2\u009c"+
		"\u009d\7\'\2\2\u009d\u009e\7\27\2\2\u009e\u009f\5\36\20\2\u009f\u00a0"+
		"\7\36\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\7\22\2\2\u00a3"+
		"\u00a4\5$\23\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00b0\3"+
		"\2\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\5$\23\2\u00aa"+
		"\u00ab\7\23\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae"+
		"\5\20\t\2\u00ae\u00b0\3\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a7\3\2\2\2"+
		"\u00b0\35\3\2\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7\31\2\2\u00b3\u00b4"+
		"\5\36\20\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\7\32\2"+
		"\2\u00b7\u00b8\5\36\20\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5 \21\2\u00ba"+
		"\u00b1\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\37\3\2\2"+
		"\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\33\2\2\u00be\u00bf\5 \21\2\u00bf"+
		"\u00ca\3\2\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\34\2\2\u00c2\u00c3\5"+
		" \21\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\7\35\2\2\u00c6"+
		"\u00c7\5 \21\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00bc\3"+
		"\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"!\3\2\2\2\u00cb\u00d2\7\'\2\2\u00cc\u00d2\7&\2\2\u00cd\u00ce\7\22\2\2"+
		"\u00ce\u00cf\5\36\20\2\u00cf\u00d0\7\23\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2#\3\2\2\2"+
		"\u00d3\u00dd\5\"\22\2\u00d4\u00d5\7\30\2\2\u00d5\u00dd\5$\23\2\u00d6\u00d7"+
		"\5\"\22\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\5\"\22\2\u00d9\u00dd\3\2\2\2"+
		"\u00da\u00dd\7\t\2\2\u00db\u00dd\7\n\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d4"+
		"\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"%\3\2\2\2\u00de\u00df\t\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\t\3\2\2\u00e1"+
		")\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3+\3\2\2\2\24-\60\63;HMY_nx\u0080\u0084"+
		"\u009a\u00af\u00ba\u00c9\u00d1\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
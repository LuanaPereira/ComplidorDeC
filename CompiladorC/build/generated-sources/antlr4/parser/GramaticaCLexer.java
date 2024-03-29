// Generated from C:\Users\bruno\Desktop\CompiladorC\grammar\parser\GramaticaC.g4 by ANTLR 4.6
 package compiladorc.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaCLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "DOUBLE", "CHAR", "BOOL", "INCLUDE", "TRUE", "FALSE", 
		"READ", "WRITE", "IF", "ELSE", "GLOBAIS", "OPC", "CLC", "OPP", "CLP", 
		"SEP", "FUNCTION", "MAIN", "WHILE", "FOR", "ATR", "NOT", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "EOL", "GR", "LS", "EQ", "GRT", "LST", "NEQ", "STR", 
		"NUM", "ID", "COMMENT", "LINE_COMMENT", "WS"
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


	public GramaticaCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\5\31\u00c9\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\7&\u00e9\n&\f&\16&\u00ec\13&\3&\3&\3\'\5\'\u00f1\n\'\3\'\6\'\u00f4"+
		"\n\'\r\'\16\'\u00f5\3\'\3\'\6\'\u00fa\n\'\r\'\16\'\u00fb\5\'\u00fe\n\'"+
		"\3(\3(\7(\u0102\n(\f(\16(\u0105\13(\3)\3)\3)\3)\7)\u010b\n)\f)\16)\u010e"+
		"\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u0119\n*\f*\16*\u011c\13*\3*\3*\3+"+
		"\6+\u0121\n+\r+\16+\u0122\3+\3+\3\u010c\2,\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,\3\2\t\6\2\f\f\17\17$$^^\4\2--//\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2"+
		"\f\f\17\17\5\2\13\f\17\17\"\"\u012f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5[\3\2\2\2\7a"+
		"\3\2\2\2\th\3\2\2\2\13m\3\2\2\2\rr\3\2\2\2\17{\3\2\2\2\21\u0080\3\2\2"+
		"\2\23\u0086\3\2\2\2\25\u008b\3\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2\2\2"+
		"\33\u0099\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00a6"+
		"\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00b3\3\2\2\2+\u00b8\3\2\2\2"+
		"-\u00be\3\2\2\2/\u00c2\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2\2\65\u00cc"+
		"\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4\3\2\2\2"+
		"?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00dd\3\2\2\2G\u00e0\3"+
		"\2\2\2I\u00e3\3\2\2\2K\u00e6\3\2\2\2M\u00f0\3\2\2\2O\u00ff\3\2\2\2Q\u0106"+
		"\3\2\2\2S\u0114\3\2\2\2U\u0120\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z\4\3"+
		"\2\2\2[\\\7h\2\2\\]\7n\2\2]^\7q\2\2^_\7c\2\2_`\7v\2\2`\6\3\2\2\2ab\7f"+
		"\2\2bc\7q\2\2cd\7w\2\2de\7d\2\2ef\7n\2\2fg\7g\2\2g\b\3\2\2\2hi\7e\2\2"+
		"ij\7j\2\2jk\7c\2\2kl\7t\2\2l\n\3\2\2\2mn\7d\2\2no\7q\2\2op\7q\2\2pq\7"+
		"n\2\2q\f\3\2\2\2rs\7%\2\2st\7k\2\2tu\7p\2\2uv\7e\2\2vw\7n\2\2wx\7w\2\2"+
		"xy\7f\2\2yz\7g\2\2z\16\3\2\2\2{|\7v\2\2|}\7t\2\2}~\7w\2\2~\177\7g\2\2"+
		"\177\20\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7c\2\2\u0082\u0083\7n\2"+
		"\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\22\3\2\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089\u008a\7f\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\26\3\2\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7h\2\2\u0093\30\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\32\3\2\2\2\u0099\u009a\7i\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7d\2\2\u009d\u009e\7c\2\2"+
		"\u009e\u009f\7n\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7}\2\2\u00a1\36\3\2\2"+
		"\2\u00a2\u00a3\7\177\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\"\3\2"+
		"\2\2\u00a6\u00a7\7+\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9&\3\2\2"+
		"\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7e\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd,\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2"+
		"\2\u00c1.\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\60\3\2\2\2\u00c4\u00c9\7#\2"+
		"\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c9\7V\2\2\u00c8\u00c4"+
		"\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb"+
		"\64\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3"+
		"<\3\2\2\2\u00d4\u00d5\7=\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7@"+
		"\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9B\3\2\2\2\u00da\u00db\7?\2\2\u00db\u00dc"+
		"\7?\2\2\u00dcD\3\2\2\2\u00dd\u00de\7@\2\2\u00de\u00df\7?\2\2\u00dfF\3"+
		"\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2\7?\2\2\u00e2H\3\2\2\2\u00e3\u00e4"+
		"\7#\2\2\u00e4\u00e5\7?\2\2\u00e5J\3\2\2\2\u00e6\u00ea\7$\2\2\u00e7\u00e9"+
		"\n\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$"+
		"\2\2\u00eeL\3\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fd\3\2"+
		"\2\2\u00f7\u00f9\7\60\2\2\u00f8\u00fa\t\4\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feN\3\2\2\2\u00ff\u0103"+
		"\t\5\2\2\u0100\u0102\t\6\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104P\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0106\u0107\7\61\2\2\u0107\u0108\7,\2\2\u0108\u010c\3\2\2\2\u0109\u010b"+
		"\13\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110"+
		"\7,\2\2\u0110\u0111\7\61\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b)\2\2\u0113"+
		"R\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116\7\61\2\2\u0116\u011a\3\2\2"+
		"\2\u0117\u0119\n\7\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\b*\2\2\u011eT\3\2\2\2\u011f\u0121\t\b\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\b+\2\2\u0125V\3\2\2\2\r\2\u00c8\u00ea\u00f0\u00f5\u00fb"+
		"\u00fd\u0103\u010c\u011a\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
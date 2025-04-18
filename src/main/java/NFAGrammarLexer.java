// Generated from NFAGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NFAGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, CHAR=11, EPSILON=12, ID=13, LETTER=14, INT=15, DIGIT=16, WS=17, 
		BLOCK_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "CHAR", "EPSILON", "ID", "LETTER", "INT", "DIGIT", "WS", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'states'", "'='", "'{'", "','", "'}'", "'transitions'", "'('", 
			"')'", "'ini'", "'finals'", null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "CHAR", 
			"EPSILON", "ID", "LETTER", "INT", "DIGIT", "WS", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public NFAGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NFAGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\fT\n\f\3\r\3\r"+
		"\3\16\3\16\6\16Z\n\16\r\16\16\16[\3\17\6\17_\n\17\r\17\16\17`\3\20\6\20"+
		"d\n\20\r\20\16\20e\3\21\3\21\3\22\6\22k\n\22\r\22\16\22l\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\7\23u\n\23\f\23\16\23x\13\23\3\23\3\23\3\23\3\23\3\23"+
		"\3v\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0084"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\13\64"+
		"\3\2\2\2\r\66\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25J\3\2\2\2"+
		"\27S\3\2\2\2\31U\3\2\2\2\33Y\3\2\2\2\35^\3\2\2\2\37c\3\2\2\2!g\3\2\2\2"+
		"#j\3\2\2\2%p\3\2\2\2\'(\7u\2\2()\7v\2\2)*\7c\2\2*+\7v\2\2+,\7g\2\2,-\7"+
		"u\2\2-\4\3\2\2\2./\7?\2\2/\6\3\2\2\2\60\61\7}\2\2\61\b\3\2\2\2\62\63\7"+
		".\2\2\63\n\3\2\2\2\64\65\7\177\2\2\65\f\3\2\2\2\66\67\7v\2\2\678\7t\2"+
		"\289\7c\2\29:\7p\2\2:;\7u\2\2;<\7k\2\2<=\7v\2\2=>\7k\2\2>?\7q\2\2?@\7"+
		"p\2\2@A\7u\2\2A\16\3\2\2\2BC\7*\2\2C\20\3\2\2\2DE\7+\2\2E\22\3\2\2\2F"+
		"G\7k\2\2GH\7p\2\2HI\7k\2\2I\24\3\2\2\2JK\7h\2\2KL\7k\2\2LM\7p\2\2MN\7"+
		"c\2\2NO\7n\2\2OP\7u\2\2P\26\3\2\2\2QT\5\35\17\2RT\5!\21\2SQ\3\2\2\2SR"+
		"\3\2\2\2T\30\3\2\2\2UV\7&\2\2V\32\3\2\2\2WZ\5\35\17\2XZ\5!\21\2YW\3\2"+
		"\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\34\3\2\2\2]_\t\2\2\2^"+
		"]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\36\3\2\2\2bd\5!\21\2cb\3\2\2"+
		"\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f \3\2\2\2gh\t\3\2\2h\"\3\2\2\2ik\t\4"+
		"\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\22\2\2o$\3"+
		"\2\2\2pq\7\61\2\2qr\7,\2\2rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw"+
		"\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7,\2\2z{\7\61\2\2{|\3\2\2\2|"+
		"}\b\23\2\2}&\3\2\2\2\n\2SY[`elv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/Baxi/Desktop/Compi/tests\MiScanner.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, DOSPUNTOS=2, ASIGN=3, PIZQ=4, PDER=5, VIR=6, SUMA=7, RESTA=8, 
		MULT=9, DIV=10, FN=11, IF=12, THEN=13, ELSE=14, WHILE=15, DO=16, LET=17, 
		IN=18, BEGIN=19, END=20, CONST=21, VAR=22, IDENT=23, LITERAL=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "DOSPUNTOS", "ASIGN", "PIZQ", "PDER", "VIR", "SUMA", "RESTA", 
			"MULT", "DIV", "FN", "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", 
			"BEGIN", "END", "CONST", "VAR", "IDENT", "LITERAL", "LETRA", "DIGITO", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "':='", "'('", "')'", "'~'", "'+'", "'-'", "'*'", 
			"'/'", "'fn'", "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", 
			"'in'", "'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "DOSPUNTOS", "ASIGN", "PIZQ", "PDER", "VIR", "SUMA", 
			"RESTA", "MULT", "DIV", "FN", "IF", "THEN", "ELSE", "WHILE", "DO", "LET", 
			"IN", "BEGIN", "END", "CONST", "VAR", "IDENT", "LITERAL", "WS"
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


	public MiScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0086\n\30\f\30\16\30\u0089"+
		"\13\30\3\31\3\31\7\31\u008d\n\31\f\31\16\31\u0090\13\31\3\32\3\32\3\33"+
		"\3\33\3\34\6\34\u0097\n\34\r\34\16\34\u0098\3\34\3\34\2\2\35\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\33\3\2\4\4\2C\\c|\5\2"+
		"\13\f\17\17\"\"\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2"+
		"\2\7=\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2\2"+
		"\2\23J\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31Q\3\2\2\2\33T\3\2\2\2\35Y\3\2"+
		"\2\2\37^\3\2\2\2!d\3\2\2\2#g\3\2\2\2%k\3\2\2\2\'n\3\2\2\2)t\3\2\2\2+x"+
		"\3\2\2\2-~\3\2\2\2/\u0082\3\2\2\2\61\u008a\3\2\2\2\63\u0091\3\2\2\2\65"+
		"\u0093\3\2\2\2\67\u0096\3\2\2\29:\7=\2\2:\4\3\2\2\2;<\7<\2\2<\6\3\2\2"+
		"\2=>\7<\2\2>?\7?\2\2?\b\3\2\2\2@A\7*\2\2A\n\3\2\2\2BC\7+\2\2C\f\3\2\2"+
		"\2DE\7\u0080\2\2E\16\3\2\2\2FG\7-\2\2G\20\3\2\2\2HI\7/\2\2I\22\3\2\2\2"+
		"JK\7,\2\2K\24\3\2\2\2LM\7\61\2\2M\26\3\2\2\2NO\7h\2\2OP\7p\2\2P\30\3\2"+
		"\2\2QR\7k\2\2RS\7h\2\2S\32\3\2\2\2TU\7v\2\2UV\7j\2\2VW\7g\2\2WX\7p\2\2"+
		"X\34\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\36\3\2\2\2^_\7y\2"+
		"\2_`\7j\2\2`a\7k\2\2ab\7n\2\2bc\7g\2\2c \3\2\2\2de\7f\2\2ef\7q\2\2f\""+
		"\3\2\2\2gh\7n\2\2hi\7g\2\2ij\7v\2\2j$\3\2\2\2kl\7k\2\2lm\7p\2\2m&\3\2"+
		"\2\2no\7d\2\2op\7g\2\2pq\7i\2\2qr\7k\2\2rs\7p\2\2s(\3\2\2\2tu\7g\2\2u"+
		"v\7p\2\2vw\7f\2\2w*\3\2\2\2xy\7e\2\2yz\7q\2\2z{\7p\2\2{|\7u\2\2|}\7v\2"+
		"\2},\3\2\2\2~\177\7x\2\2\177\u0080\7c\2\2\u0080\u0081\7t\2\2\u0081.\3"+
		"\2\2\2\u0082\u0087\5\63\32\2\u0083\u0086\5\63\32\2\u0084\u0086\5\65\33"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\60\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008e\5\65\33\2\u008b\u008d\5\65\33\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\62\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\t\2\2\2\u0092\64\3\2\2\2\u0093\u0094\4\62;"+
		"\2\u0094\66\3\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\34\2\2\u009b8\3\2\2\2\7\2\u0085\u0087\u008e\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
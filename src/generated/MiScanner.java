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
		MULT=9, DIV=10, IF=11, THEN=12, ELSE=13, WHILE=14, DO=15, LET=16, IN=17, 
		BEGIN=18, END=19, CONST=20, VAR=21, IDENT=22, LITERAL=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "DOSPUNTOS", "ASIGN", "PIZQ", "PDER", "VIR", "SUMA", "RESTA", 
			"MULT", "DIV", "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", 
			"END", "CONST", "VAR", "IDENT", "LITERAL", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "':='", "'('", "')'", "'~'", "'+'", "'-'", "'*'", 
			"'/'", "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", "'in'", 
			"'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "DOSPUNTOS", "ASIGN", "PIZQ", "PDER", "VIR", "SUMA", 
			"RESTA", "MULT", "DIV", "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", 
			"BEGIN", "END", "CONST", "VAR", "IDENT", "LITERAL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\7\27\u0081\n\27\f\27\16\27\u0084\13\27\3\30\3\30\7\30"+
		"\u0088\n\30\f\30\16\30\u008b\13\30\3\31\3\31\3\32\3\32\3\33\6\33\u0092"+
		"\n\33\r\33\16\33\u0093\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\2\63\2\65\32\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0098\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2"+
		"\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2"+
		"\2\31O\3\2\2\2\33T\3\2\2\2\35Y\3\2\2\2\37_\3\2\2\2!b\3\2\2\2#f\3\2\2\2"+
		"%i\3\2\2\2\'o\3\2\2\2)s\3\2\2\2+y\3\2\2\2-}\3\2\2\2/\u0085\3\2\2\2\61"+
		"\u008c\3\2\2\2\63\u008e\3\2\2\2\65\u0091\3\2\2\2\678\7=\2\28\4\3\2\2\2"+
		"9:\7<\2\2:\6\3\2\2\2;<\7<\2\2<=\7?\2\2=\b\3\2\2\2>?\7*\2\2?\n\3\2\2\2"+
		"@A\7+\2\2A\f\3\2\2\2BC\7\u0080\2\2C\16\3\2\2\2DE\7-\2\2E\20\3\2\2\2FG"+
		"\7/\2\2G\22\3\2\2\2HI\7,\2\2I\24\3\2\2\2JK\7\61\2\2K\26\3\2\2\2LM\7k\2"+
		"\2MN\7h\2\2N\30\3\2\2\2OP\7v\2\2PQ\7j\2\2QR\7g\2\2RS\7p\2\2S\32\3\2\2"+
		"\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\34\3\2\2\2YZ\7y\2\2Z[\7j\2\2["+
		"\\\7k\2\2\\]\7n\2\2]^\7g\2\2^\36\3\2\2\2_`\7f\2\2`a\7q\2\2a \3\2\2\2b"+
		"c\7n\2\2cd\7g\2\2de\7v\2\2e\"\3\2\2\2fg\7k\2\2gh\7p\2\2h$\3\2\2\2ij\7"+
		"d\2\2jk\7g\2\2kl\7i\2\2lm\7k\2\2mn\7p\2\2n&\3\2\2\2op\7g\2\2pq\7p\2\2"+
		"qr\7f\2\2r(\3\2\2\2st\7e\2\2tu\7q\2\2uv\7p\2\2vw\7u\2\2wx\7v\2\2x*\3\2"+
		"\2\2yz\7x\2\2z{\7c\2\2{|\7t\2\2|,\3\2\2\2}\u0082\5\61\31\2~\u0081\5\61"+
		"\31\2\177\u0081\5\63\32\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083.\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0089\5\63\32\2\u0086\u0088\5\63\32\2\u0087\u0086"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\60\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\t\2\2\2\u008d\62\3\2\2\2\u008e"+
		"\u008f\4\62;\2\u008f\64\3\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2"+
		"\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\b\33\2\2\u0096\66\3\2\2\2\7\2\u0080\u0082\u0089\u0093"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
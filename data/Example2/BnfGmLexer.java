// Generated from BnfGm.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BnfGmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PLUS=7, MINUS=8, MULT=9, 
		DIV=10, INT=11, REAL=12, ID=13, NEWLINE=14, WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PLUS", "MINUS", "MULT", 
		"DIV", "INT", "REAL", "ID", "NEWLINE", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "';'", "':='", "'('", "')'", "','", "'+'", "'-'", "'*'", 
		"'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "PLUS", "MINUS", "MULT", "DIV", 
		"INT", "REAL", "ID", "NEWLINE", "WHITESPACE"
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


	public BnfGmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BnfGm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\6\f8\n\f\r\f\16\f9\3\r\3\r\3\r\5\r?\n\r\5\rA\n\r\3\16\6\16D\n\16\r\16"+
		"\16\16E\3\17\6\17I\n\17\r\17\16\17J\3\20\6\20N\n\20\r\20\16\20O\3\20\3"+
		"\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21\3\2\5\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2X\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2"+
		"\7%\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2"+
		"\2\23\62\3\2\2\2\25\64\3\2\2\2\27\67\3\2\2\2\31;\3\2\2\2\33C\3\2\2\2\35"+
		"H\3\2\2\2\37M\3\2\2\2!\"\7<\2\2\"\4\3\2\2\2#$\7=\2\2$\6\3\2\2\2%&\7<\2"+
		"\2&\'\7?\2\2\'\b\3\2\2\2()\7*\2\2)\n\3\2\2\2*+\7+\2\2+\f\3\2\2\2,-\7."+
		"\2\2-\16\3\2\2\2./\7-\2\2/\20\3\2\2\2\60\61\7/\2\2\61\22\3\2\2\2\62\63"+
		"\7,\2\2\63\24\3\2\2\2\64\65\7\61\2\2\65\26\3\2\2\2\668\4\62;\2\67\66\3"+
		"\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\30\3\2\2\2;@\5\27\f\2<>\7\60\2"+
		"\2=?\5\27\f\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@<\3\2\2\2@A\3\2\2\2A\32\3"+
		"\2\2\2BD\t\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\34\3\2\2\2G"+
		"I\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\36\3\2\2\2LN\t\4\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\20\2\2R \3\2"+
		"\2\2\t\29>@EJO\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
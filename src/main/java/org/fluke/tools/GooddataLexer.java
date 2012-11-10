// $ANTLR ANTLRVersion> GooddataLexer.java generatedTimestamp>

package org.fluke.tools;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooddataLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, And=5, In=6, Or=7, All=8, Count=9, Where=10, 
		By=11, Eqls=12, Agg=13, Left_paren=14, Right_paren=15, Select=16, String=17, 
		Single_quoted_string=18, Double_quoted_string=19, Uri=20, NUMBER=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'ALL OTHER'", "'BY ALL IN ALL OTHER DIMENSIONS'", "'WITHOUT PF'", 
		"'AND'", "'IN'", "'OR'", "'ALL'", "'COUNT'", "'WHERE'", "'BY'", "'='", 
		"Agg", "'('", "')'", "'SELECT'", "String", "Single_quoted_string", "Double_quoted_string", 
		"Uri", "NUMBER", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "And", "In", "Or", "All", "Count", "Where", 
		"By", "Eqls", "Agg", "Left_paren", "Right_paren", "Select", "String", 
		"Single_quoted_string", "Double_quoted_string", "Uri", "NUMBER", "WS"
	};


	public GooddataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gooddata.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }


	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch ( ruleIndex ) {
			case 0 : T__3_action((RuleContext)_localctx, actionIndex); break;
			case 1 : T__2_action((RuleContext)_localctx, actionIndex); break;
			case 2 : T__1_action((RuleContext)_localctx, actionIndex); break;
			case 3 : T__0_action((RuleContext)_localctx, actionIndex); break;
			case 4 : And_action((RuleContext)_localctx, actionIndex); break;
			case 5 : In_action((RuleContext)_localctx, actionIndex); break;
			case 6 : Or_action((RuleContext)_localctx, actionIndex); break;
			case 7 : All_action((RuleContext)_localctx, actionIndex); break;
			case 8 : Count_action((RuleContext)_localctx, actionIndex); break;
			case 9 : Where_action((RuleContext)_localctx, actionIndex); break;
			case 10 : By_action((RuleContext)_localctx, actionIndex); break;
			case 11 : Eqls_action((RuleContext)_localctx, actionIndex); break;
			case 12 : Agg_action((RuleContext)_localctx, actionIndex); break;
			case 13 : Left_paren_action((RuleContext)_localctx, actionIndex); break;
			case 14 : Right_paren_action((RuleContext)_localctx, actionIndex); break;
			case 15 : Select_action((RuleContext)_localctx, actionIndex); break;
			case 16 : String_action((RuleContext)_localctx, actionIndex); break;
			case 17 : Single_quoted_string_action((RuleContext)_localctx, actionIndex); break;
			case 18 : Double_quoted_string_action((RuleContext)_localctx, actionIndex); break;
			case 19 : Uri_action((RuleContext)_localctx, actionIndex); break;
			case 20 : NUMBER_action((RuleContext)_localctx, actionIndex); break;
			case 21 : WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void Left_paren_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void By_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void In_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Count_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void WS_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 0 : skip();  break;
		}
	}
	public void All_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__1_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__0_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__3_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__2_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Where_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Select_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Right_paren_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void String_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Eqls_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Uri_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Single_quoted_string_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Or_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Double_quoted_string_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void And_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Agg_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\26\u00df\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\2\1\2\1\2\1\2"+
		"\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1"+
		"\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3"+
		"\1\3\1\3\1\3\1\4\1\4\1\4\1\4\1\5\1\5\1\5\1\6\1\6\1\6\1\7\1\7\1\7\1\7\1"+
		"\b\1\b\1\b\1\b\1\b\1\b\1\t\1\t\1\t\1\t\1\t\1\t\1\n\1\n\1\n\1\13\1\13\1"+
		"\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f"+
		"\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1"+
		"\f\3\f\u00a7\b\f\1\r\1\r\1\16\1\16\1\17\1\17\1\17\1\17\1\17\1\17\1\17"+
		"\1\20\4\20\u00b5\b\20\13\20\f\20\u00b6\1\21\1\21\4\21\u00bb\b\21\13\21"+
		"\f\21\u00bc\1\21\1\21\1\22\1\22\4\22\u00c3\b\22\13\22\f\22\u00c4\1\22"+
		"\1\22\1\23\1\23\1\23\4\23\u00cc\b\23\13\23\f\23\u00cd\5\23\u00d0\b\23"+
		"\n\23\f\23\u00d3\t\23\1\23\1\23\1\24\4\24\u00d8\b\24\13\24\f\24\u00d9"+
		"\1\25\1\25\1\25\1\25\26\1\1\uffff\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff"+
		"\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff\25\13\uffff\27"+
		"\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff!\21\uffff#\22"+
		"\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\0\1\0\6\2AZaz\4  ,,AZaz\4  "+
		",,AZaz\3\609AZaz\1\609\2\t\t  \u00eb\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0"+
		"\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21"+
		"\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0"+
		"\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1"+
		"\0\0\0\0)\1\0\0\0\0+\1\0\0\0\1-\1\0\0\0\3/\1\0\0\0\59\1\0\0\0\7X\1\0\0"+
		"\0\tc\1\0\0\0\13g\1\0\0\0\rj\1\0\0\0\17m\1\0\0\0\21q\1\0\0\0\23w\1\0\0"+
		"\0\25}\1\0\0\0\27\u0080\1\0\0\0\31\u00a6\1\0\0\0\33\u00a8\1\0\0\0\35\u00aa"+
		"\1\0\0\0\37\u00ac\1\0\0\0!\u00b4\1\0\0\0#\u00b8\1\0\0\0%\u00c0\1\0\0\0"+
		"\'\u00c8\1\0\0\0)\u00d7\1\0\0\0+\u00db\1\0\0\0-.\5,\0\0.\2\1\0\0\0/\60"+
		"\5A\0\0\60\61\5L\0\0\61\62\5L\0\0\62\63\5 \0\0\63\64\5O\0\0\64\65\5T\0"+
		"\0\65\66\5H\0\0\66\67\5E\0\0\678\5R\0\08\4\1\0\0\09:\5B\0\0:;\5Y\0\0;"+
		"<\5 \0\0<=\5A\0\0=>\5L\0\0>?\5L\0\0?@\5 \0\0@A\5I\0\0AB\5N\0\0BC\5 \0"+
		"\0CD\5A\0\0DE\5L\0\0EF\5L\0\0FG\5 \0\0GH\5O\0\0HI\5T\0\0IJ\5H\0\0JK\5"+
		"E\0\0KL\5R\0\0LM\5 \0\0MN\5D\0\0NO\5I\0\0OP\5M\0\0PQ\5E\0\0QR\5N\0\0R"+
		"S\5S\0\0ST\5I\0\0TU\5O\0\0UV\5N\0\0VW\5S\0\0W\6\1\0\0\0XY\5W\0\0YZ\5I"+
		"\0\0Z[\5T\0\0[\\\5H\0\0\\]\5O\0\0]^\5U\0\0^_\5T\0\0_`\5 \0\0`a\5P\0\0"+
		"ab\5F\0\0b\b\1\0\0\0cd\5A\0\0de\5N\0\0ef\5D\0\0f\n\1\0\0\0gh\5I\0\0hi"+
		"\5N\0\0i\f\1\0\0\0jk\5O\0\0kl\5R\0\0l\16\1\0\0\0mn\5A\0\0no\5L\0\0op\5"+
		"L\0\0p\20\1\0\0\0qr\5C\0\0rs\5O\0\0st\5U\0\0tu\5N\0\0uv\5T\0\0v\22\1\0"+
		"\0\0wx\5W\0\0xy\5H\0\0yz\5E\0\0z{\5R\0\0{|\5E\0\0|\24\1\0\0\0}~\5B\0\0"+
		"~\177\5Y\0\0\177\26\1\0\0\0\u0080\u0081\5=\0\0\u0081\30\1\0\0\0\u0082"+
		"\u0083\5S\0\0\u0083\u0084\5U\0\0\u0084\u00a7\5M\0\0\u0085\u0086\5A\0\0"+
		"\u0086\u0087\5V\0\0\u0087\u00a7\5G\0\0\u0088\u0089\5M\0\0\u0089\u008a"+
		"\5A\0\0\u008a\u00a7\5X\0\0\u008b\u008c\5M\0\0\u008c\u008d\5I\0\0\u008d"+
		"\u00a7\5N\0\0\u008e\u008f\5R\0\0\u008f\u0090\5U\0\0\u0090\u0091\5N\0\0"+
		"\u0091\u0092\5S\0\0\u0092\u0093\5U\0\0\u0093\u00a7\5M\0\0\u0094\u0095"+
		"\5R\0\0\u0095\u0096\5U\0\0\u0096\u0097\5N\0\0\u0097\u0098\5A\0\0\u0098"+
		"\u0099\5V\0\0\u0099\u00a7\5G\0\0\u009a\u009b\5R\0\0\u009b\u009c\5U\0\0"+
		"\u009c\u009d\5N\0\0\u009d\u009e\5M\0\0\u009e\u009f\5I\0\0\u009f\u00a7"+
		"\5N\0\0\u00a0\u00a1\5R\0\0\u00a1\u00a2\5U\0\0\u00a2\u00a3\5N\0\0\u00a3"+
		"\u00a4\5M\0\0\u00a4\u00a5\5A\0\0\u00a5\u00a7\5X\0\0\u00a6\u0082\1\0\0"+
		"\0\u00a6\u0085\1\0\0\0\u00a6\u0088\1\0\0\0\u00a6\u008b\1\0\0\0\u00a6\u008e"+
		"\1\0\0\0\u00a6\u0094\1\0\0\0\u00a6\u009a\1\0\0\0\u00a6\u00a0\1\0\0\0\u00a7"+
		"\32\1\0\0\0\u00a8\u00a9\5(\0\0\u00a9\34\1\0\0\0\u00aa\u00ab\5)\0\0\u00ab"+
		"\36\1\0\0\0\u00ac\u00ad\5S\0\0\u00ad\u00ae\5E\0\0\u00ae\u00af\5L\0\0\u00af"+
		"\u00b0\5E\0\0\u00b0\u00b1\5C\0\0\u00b1\u00b2\5T\0\0\u00b2 \1\0\0\0\u00b3"+
		"\u00b5\7\0\0\0\u00b4\u00b3\1\0\0\0\u00b5\u00b6\1\0\0\0\u00b6\u00b4\1\0"+
		"\0\0\u00b6\u00b7\1\0\0\0\u00b7\"\1\0\0\0\u00b8\u00ba\5\'\0\0\u00b9\u00bb"+
		"\7\1\0\0\u00ba\u00b9\1\0\0\0\u00bb\u00bc\1\0\0\0\u00bc\u00ba\1\0\0\0\u00bc"+
		"\u00bd\1\0\0\0\u00bd\u00be\1\0\0\0\u00be\u00bf\5\'\0\0\u00bf$\1\0\0\0"+
		"\u00c0\u00c2\5\"\0\0\u00c1\u00c3\7\2\0\0\u00c2\u00c1\1\0\0\0\u00c3\u00c4"+
		"\1\0\0\0\u00c4\u00c2\1\0\0\0\u00c4\u00c5\1\0\0\0\u00c5\u00c6\1\0\0\0\u00c6"+
		"\u00c7\5\"\0\0\u00c7&\1\0\0\0\u00c8\u00d1\5[\0\0\u00c9\u00cb\5/\0\0\u00ca"+
		"\u00cc\7\3\0\0\u00cb\u00ca\1\0\0\0\u00cc\u00cd\1\0\0\0\u00cd\u00cb\1\0"+
		"\0\0\u00cd\u00ce\1\0\0\0\u00ce\u00d0\1\0\0\0\u00cf\u00c9\1\0\0\0\u00d0"+
		"\u00d3\1\0\0\0\u00d1\u00cf\1\0\0\0\u00d1\u00d2\1\0\0\0\u00d2\u00d4\1\0"+
		"\0\0\u00d3\u00d1\1\0\0\0\u00d4\u00d5\5]\0\0\u00d5(\1\0\0\0\u00d6\u00d8"+
		"\7\4\0\0\u00d7\u00d6\1\0\0\0\u00d8\u00d9\1\0\0\0\u00d9\u00d7\1\0\0\0\u00d9"+
		"\u00da\1\0\0\0\u00da*\1\0\0\0\u00db\u00dc\7\5\0\0\u00dc\u00dd\1\0\0\0"+
		"\u00dd\u00de\6\25\0\0\u00de,\1\0\0\0\b\0\1\u00a6\1\u00b6\1\u00bc\1\u00c4"+
		"\1\u00cd\1\u00d1\1\u00d9\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}
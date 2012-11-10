// $ANTLR ANTLRVersion> GooddataParser.java generatedTimestamp>

package org.fluke.tools;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooddataParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, And=5, In=6, Or=7, All=8, Count=9, Where=10, 
		By=11, Eqls=12, Agg=13, Left_paren=14, Right_paren=15, Select=16, String=17, 
		Single_quoted_string=18, Double_quoted_string=19, Uri=20, NUMBER=21, WS=22;
	public static final String[] tokenNames = {
        "<INVALID>", "','", "'ALL OTHER'", "'BY ALL IN ALL OTHER DIMENSIONS'", 
        "'WITHOUT PF'", "'AND'", "'IN'", "'OR'", "'ALL'", "'COUNT'", "'WHERE'", 
        "'BY'", "'='", "Agg", "'('", "')'", "'SELECT'", "String", "Single_quoted_string", 
        "Double_quoted_string", "Uri", "NUMBER", "WS"
	};
	public static final int
		RULE_query = 0, RULE_what = 1, RULE_agg_form = 2, RULE_count_form = 3, 
		RULE_metric_form = 4, RULE_query_form = 5, RULE_where_clause = 6, RULE_conditions = 7, 
		RULE_condition = 8, RULE_attribute_condition = 9, RULE_in_condition = 10, 
		RULE_query_condition = 11, RULE_by_clause = 12, RULE_by_attribute = 13, 
		RULE_all_other = 14, RULE_by_all_in_all = 15, RULE_without_pf_clause = 16, 
		RULE_fact = 17, RULE_attribute_list = 18, RULE_value_list = 19, RULE_attribute = 20, 
		RULE_fact_name = 21, RULE_fact_uri = 22, RULE_attribute_name = 23, RULE_attribute_uri = 24, 
		RULE_metric = 25, RULE_attribute_element = 26, RULE_attribute_element_uri = 27, 
		RULE_attribute_element_name = 28;
	public static final String[] ruleNames = {
		"query", "what", "agg_form", "count_form", "metric_form", "query_form", 
		"where_clause", "conditions", "condition", "attribute_condition", "in_condition", 
		"query_condition", "by_clause", "by_attribute", "all_other", "by_all_in_all", 
		"without_pf_clause", "fact", "attribute_list", "value_list", "attribute", 
		"fact_name", "fact_uri", "attribute_name", "attribute_uri", "metric", 
		"attribute_element", "attribute_element_uri", "attribute_element_name"
	};

	@Override
	public String getGrammarFileName() { return "Gooddata.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GooddataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator<Token>(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext<Token> {
		public By_clauseContext by_clause() {
		    return getRuleContext(By_clauseContext.class,0);
		}
		public TerminalNode<Token> Select() { return getToken(GooddataParser.Select, 0); }
		public Where_clauseContext where_clause() {
		    return getRuleContext(Where_clauseContext.class,0);
		}
		public WhatContext what() {
		    return getRuleContext(WhatContext.class,0);
		}
		public Without_pf_clauseContext without_pf_clause() {
		    return getRuleContext(Without_pf_clauseContext.class,0);
		}
		public QueryContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitQuery(this);
			else return null;
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, 0);
		enterRule(_localctx, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(Select);
			setState(59); what();
			setState(61);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==3 || _la==By ) {
				{
				setState(60); by_clause();
				}
			}

			setState(64);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==Where ) {
				{
				setState(63); where_clause();
				}
			}

			setState(67);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==4 ) {
				{
				setState(66); without_pf_clause();
				}
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

	public static class WhatContext extends ParserRuleContext<Token> {
		public Agg_formContext agg_form() {
		    return getRuleContext(Agg_formContext.class,0);
		}
		public Count_formContext count_form() {
		    return getRuleContext(Count_formContext.class,0);
		}
		public TerminalNode<Token> NUMBER() { return getToken(GooddataParser.NUMBER, 0); }
		public WhatContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_what; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterWhat(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitWhat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitWhat(this);
			else return null;
		}
	}

	public final WhatContext what() throws RecognitionException {
		WhatContext _localctx = new WhatContext(_ctx, 2);
		enterRule(_localctx, RULE_what);
		try {
			setState(72);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case NUMBER:
					enterOuterAlt(_localctx, 1);
					{
					setState(69); match(NUMBER);
					}
					break;
				case Agg:
					enterOuterAlt(_localctx, 2);
					{
					setState(70); agg_form();
					}
					break;
				case Count:
					enterOuterAlt(_localctx, 3);
					{
					setState(71); count_form();
					}
					break;
				default :
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

	public static class Agg_formContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Left_paren() { return getToken(GooddataParser.Left_paren, 0); }
		public Query_formContext query_form() {
		    return getRuleContext(Query_formContext.class,0);
		}
		public TerminalNode<Token> Right_paren() { return getToken(GooddataParser.Right_paren, 0); }
		public FactContext fact() {
		    return getRuleContext(FactContext.class,0);
		}
		public TerminalNode<Token> Agg() { return getToken(GooddataParser.Agg, 0); }
		public Agg_formContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_agg_form; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAgg_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAgg_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAgg_form(this);
			else return null;
		}
	}

	public final Agg_formContext agg_form() throws RecognitionException {
		Agg_formContext _localctx = new Agg_formContext(_ctx, 4);
		enterRule(_localctx, RULE_agg_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(Agg);
			setState(75); match(Left_paren);
			setState(78);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case String:
				case Single_quoted_string:
				case Double_quoted_string:
				case Uri:
					{
					setState(76); fact();
					}
					break;
				case Left_paren:
					{
					setState(77); query_form();
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			setState(80); match(Right_paren);
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

	public static class Count_formContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Left_paren() { return getToken(GooddataParser.Left_paren, 0); }
		public TerminalNode<Token> Right_paren() { return getToken(GooddataParser.Right_paren, 0); }
		public TerminalNode<Token> Count() { return getToken(GooddataParser.Count, 0); }
		public List<? extends AttributeContext> attribute() {
		    return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
		    return getRuleContext(AttributeContext.class,i);
		}
		public Count_formContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_count_form; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterCount_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitCount_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitCount_form(this);
			else return null;
		}
	}

	public final Count_formContext count_form() throws RecognitionException {
		Count_formContext _localctx = new Count_formContext(_ctx, 6);
		enterRule(_localctx, RULE_count_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(Count);
			setState(83); match(Left_paren);
			setState(84); attribute();
			setState(87);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==1 ) {
				{
				setState(85); match(1);
				setState(86); attribute();
				}
			}

			setState(89); match(Right_paren);
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

	public static class Metric_formContext extends ParserRuleContext<Token> {
		public MetricContext metric() {
		    return getRuleContext(MetricContext.class,0);
		}
		public Metric_formContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_metric_form; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterMetric_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitMetric_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitMetric_form(this);
			else return null;
		}
	}

	public final Metric_formContext metric_form() throws RecognitionException {
		Metric_formContext _localctx = new Metric_formContext(_ctx, 8);
		enterRule(_localctx, RULE_metric_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); metric();
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

	public static class Query_formContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Left_paren() { return getToken(GooddataParser.Left_paren, 0); }
		public TerminalNode<Token> Right_paren() { return getToken(GooddataParser.Right_paren, 0); }
		public QueryContext query() {
		    return getRuleContext(QueryContext.class,0);
		}
		public Query_formContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_query_form; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterQuery_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitQuery_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitQuery_form(this);
			else return null;
		}
	}

	public final Query_formContext query_form() throws RecognitionException {
		Query_formContext _localctx = new Query_formContext(_ctx, 10);
		enterRule(_localctx, RULE_query_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(Left_paren);
			setState(94); query();
			setState(95); match(Right_paren);
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

	public static class Where_clauseContext extends ParserRuleContext<Token> {
		public ConditionsContext conditions() {
		    return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode<Token> Where() { return getToken(GooddataParser.Where, 0); }
		public Where_clauseContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitWhere_clause(this);
			else return null;
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, 12);
		enterRule(_localctx, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(Where);
			setState(98); conditions();
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

	public static class ConditionsContext extends ParserRuleContext<Token> {
		public ConditionContext condition(int i) {
		    return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode<Token> And(int i) {
		    return getToken(GooddataParser.And, i);
		}
		public TerminalNode<Token> Or(int i) {
		    return getToken(GooddataParser.Or, i);
		}
		public List<? extends ConditionContext> condition() {
		    return getRuleContexts(ConditionContext.class);
		}
		public List<TerminalNode<Token>> Or() { return getTokens(GooddataParser.Or); }
		public List<TerminalNode<Token>> And() { return getTokens(GooddataParser.And); }
		public ConditionsContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitConditions(this);
			else return null;
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, 14);
		enterRule(_localctx, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); condition();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==And || _la==Or ) {
				{
				{
				setState(101);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==And || _la==Or) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(102); condition();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionContext extends ParserRuleContext<Token> {
		public Attribute_conditionContext attribute_condition() {
		    return getRuleContext(Attribute_conditionContext.class,0);
		}
		public Query_conditionContext query_condition() {
		    return getRuleContext(Query_conditionContext.class,0);
		}
		public In_conditionContext in_condition() {
		    return getRuleContext(In_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitCondition(this);
			else return null;
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, 16);
		enterRule(_localctx, RULE_condition);
		try {
			setState(111);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(108); attribute_condition();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(109); in_condition();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(110); query_condition();
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

	public static class Attribute_conditionContext extends ParserRuleContext<Token> {
		public Attribute_elementContext attribute_element() {
		    return getRuleContext(Attribute_elementContext.class,0);
		}
		public TerminalNode<Token> Eqls() { return getToken(GooddataParser.Eqls, 0); }
		public AttributeContext attribute() {
		    return getRuleContext(AttributeContext.class,0);
		}
		public Attribute_conditionContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_condition; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_condition(this);
			else return null;
		}
	}

	public final Attribute_conditionContext attribute_condition() throws RecognitionException {
		Attribute_conditionContext _localctx = new Attribute_conditionContext(_ctx, 18);
		enterRule(_localctx, RULE_attribute_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); attribute();
			setState(114); match(Eqls);
			setState(115); attribute_element();
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

	public static class In_conditionContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Left_paren() { return getToken(GooddataParser.Left_paren, 0); }
		public TerminalNode<Token> Right_paren() { return getToken(GooddataParser.Right_paren, 0); }
		public TerminalNode<Token> In() { return getToken(GooddataParser.In, 0); }
		public AttributeContext attribute() {
		    return getRuleContext(AttributeContext.class,0);
		}
		public Value_listContext value_list() {
		    return getRuleContext(Value_listContext.class,0);
		}
		public In_conditionContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_in_condition; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterIn_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitIn_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitIn_condition(this);
			else return null;
		}
	}

	public final In_conditionContext in_condition() throws RecognitionException {
		In_conditionContext _localctx = new In_conditionContext(_ctx, 20);
		enterRule(_localctx, RULE_in_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); attribute();
			setState(118); match(In);
			setState(119); match(Left_paren);
			setState(120); value_list();
			setState(121); match(Right_paren);
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

	public static class Query_conditionContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Left_paren() { return getToken(GooddataParser.Left_paren, 0); }
		public TerminalNode<Token> Right_paren() { return getToken(GooddataParser.Right_paren, 0); }
		public TerminalNode<Token> Eqls() { return getToken(GooddataParser.Eqls, 0); }
		public QueryContext query() {
		    return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode<Token> NUMBER() { return getToken(GooddataParser.NUMBER, 0); }
		public Query_conditionContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_query_condition; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterQuery_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitQuery_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitQuery_condition(this);
			else return null;
		}
	}

	public final Query_conditionContext query_condition() throws RecognitionException {
		Query_conditionContext _localctx = new Query_conditionContext(_ctx, 22);
		enterRule(_localctx, RULE_query_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(Left_paren);
			setState(124); query();
			setState(125); match(Right_paren);
			setState(126); match(Eqls);
			setState(127); match(NUMBER);
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

	public static class By_clauseContext extends ParserRuleContext<Token> {
		public By_all_in_allContext by_all_in_all() {
		    return getRuleContext(By_all_in_allContext.class,0);
		}
		public By_attributeContext by_attribute() {
		    return getRuleContext(By_attributeContext.class,0);
		}
		public By_clauseContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_by_clause; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterBy_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitBy_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitBy_clause(this);
			else return null;
		}
	}

	public final By_clauseContext by_clause() throws RecognitionException {
		By_clauseContext _localctx = new By_clauseContext(_ctx, 24);
		enterRule(_localctx, RULE_by_clause);
		try {
			setState(131);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case By:
					enterOuterAlt(_localctx, 1);
					{
					setState(129); by_attribute();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 2);
					{
					setState(130); by_all_in_all();
					}
					break;
				default :
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

	public static class By_attributeContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> By() { return getToken(GooddataParser.By, 0); }
		public Attribute_listContext attribute_list() {
		    return getRuleContext(Attribute_listContext.class,0);
		}
		public All_otherContext all_other() {
		    return getRuleContext(All_otherContext.class,0);
		}
		public By_attributeContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_by_attribute; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterBy_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitBy_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitBy_attribute(this);
			else return null;
		}
	}

	public final By_attributeContext by_attribute() throws RecognitionException {
		By_attributeContext _localctx = new By_attributeContext(_ctx, 26);
		enterRule(_localctx, RULE_by_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(By);
			setState(134); attribute_list();
			setState(137);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==1 ) {
				{
				setState(135); match(1);
				setState(136); all_other();
				}
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

	public static class All_otherContext extends ParserRuleContext<Token> {
		public All_otherContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_all_other; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAll_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAll_other(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAll_other(this);
			else return null;
		}
	}

	public final All_otherContext all_other() throws RecognitionException {
		All_otherContext _localctx = new All_otherContext(_ctx, 28);
		enterRule(_localctx, RULE_all_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(2);
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

	public static class By_all_in_allContext extends ParserRuleContext<Token> {
		public By_all_in_allContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_by_all_in_all; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterBy_all_in_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitBy_all_in_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitBy_all_in_all(this);
			else return null;
		}
	}

	public final By_all_in_allContext by_all_in_all() throws RecognitionException {
		By_all_in_allContext _localctx = new By_all_in_allContext(_ctx, 30);
		enterRule(_localctx, RULE_by_all_in_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(3);
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

	public static class Without_pf_clauseContext extends ParserRuleContext<Token> {
		public Without_pf_clauseContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_without_pf_clause; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterWithout_pf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitWithout_pf_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitWithout_pf_clause(this);
			else return null;
		}
	}

	public final Without_pf_clauseContext without_pf_clause() throws RecognitionException {
		Without_pf_clauseContext _localctx = new Without_pf_clauseContext(_ctx, 32);
		enterRule(_localctx, RULE_without_pf_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(4);
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

	public static class FactContext extends ParserRuleContext<Token> {
		public Fact_nameContext fact_name() {
		    return getRuleContext(Fact_nameContext.class,0);
		}
		public Fact_uriContext fact_uri() {
		    return getRuleContext(Fact_uriContext.class,0);
		}
		public FactContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitFact(this);
			else return null;
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, 34);
		enterRule(_localctx, RULE_fact);
		try {
			setState(147);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case String:
				case Single_quoted_string:
				case Double_quoted_string:
					enterOuterAlt(_localctx, 1);
					{
					setState(145); fact_name();
					}
					break;
				case Uri:
					enterOuterAlt(_localctx, 2);
					{
					setState(146); fact_uri();
					}
					break;
				default :
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

	public static class Attribute_listContext extends ParserRuleContext<Token> {
		public List<? extends AttributeContext> attribute() {
		    return getRuleContexts(AttributeContext.class);
		}
		public List<TerminalNode<Token>> All() { return getTokens(GooddataParser.All); }
		public TerminalNode<Token> All(int i) {
		    return getToken(GooddataParser.All, i);
		}
		public AttributeContext attribute(int i) {
		    return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_list(this);
			else return null;
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, 36);
		enterRule(_localctx, RULE_attribute_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==All ) {
				{
				setState(149); match(All);
				}
			}

			setState(152); attribute();
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(153); match(1);
					setState(155);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==All ) {
						{
						setState(154); match(All);
						}
					}

					setState(157); attribute();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Value_listContext extends ParserRuleContext<Token> {
		public List<? extends Attribute_elementContext> attribute_element() {
		    return getRuleContexts(Attribute_elementContext.class);
		}
		public Attribute_elementContext attribute_element(int i) {
		    return getRuleContext(Attribute_elementContext.class,i);
		}
		public Value_listContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitValue_list(this);
			else return null;
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, 38);
		enterRule(_localctx, RULE_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); attribute_element();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==1 ) {
				{
				{
				setState(164); match(1);
				setState(165); attribute_element();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AttributeContext extends ParserRuleContext<Token> {
		public Attribute_uriContext attribute_uri() {
		    return getRuleContext(Attribute_uriContext.class,0);
		}
		public Attribute_nameContext attribute_name() {
		    return getRuleContext(Attribute_nameContext.class,0);
		}
		public AttributeContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute(this);
			else return null;
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, 40);
		enterRule(_localctx, RULE_attribute);
		try {
			setState(173);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case String:
				case Single_quoted_string:
				case Double_quoted_string:
					enterOuterAlt(_localctx, 1);
					{
					setState(171); attribute_name();
					}
					break;
				case Uri:
					enterOuterAlt(_localctx, 2);
					{
					setState(172); attribute_uri();
					}
					break;
				default :
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

	public static class Fact_nameContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> String() { return getToken(GooddataParser.String, 0); }
		public TerminalNode<Token> Single_quoted_string() { return getToken(GooddataParser.Single_quoted_string, 0); }
		public TerminalNode<Token> Double_quoted_string() { return getToken(GooddataParser.Double_quoted_string, 0); }
		public Fact_nameContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_fact_name; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterFact_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitFact_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitFact_name(this);
			else return null;
		}
	}

	public final Fact_nameContext fact_name() throws RecognitionException {
		Fact_nameContext _localctx = new Fact_nameContext(_ctx, 42);
		enterRule(_localctx, RULE_fact_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Single_quoted_string || _la==Double_quoted_string) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Fact_uriContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Uri() { return getToken(GooddataParser.Uri, 0); }
		public Fact_uriContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_fact_uri; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterFact_uri(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitFact_uri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitFact_uri(this);
			else return null;
		}
	}

	public final Fact_uriContext fact_uri() throws RecognitionException {
		Fact_uriContext _localctx = new Fact_uriContext(_ctx, 44);
		enterRule(_localctx, RULE_fact_uri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(Uri);
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

	public static class Attribute_nameContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> String() { return getToken(GooddataParser.String, 0); }
		public TerminalNode<Token> Single_quoted_string() { return getToken(GooddataParser.Single_quoted_string, 0); }
		public TerminalNode<Token> Double_quoted_string() { return getToken(GooddataParser.Double_quoted_string, 0); }
		public Attribute_nameContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_name(this);
			else return null;
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, 46);
		enterRule(_localctx, RULE_attribute_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Single_quoted_string || _la==Double_quoted_string) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Attribute_uriContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Uri() { return getToken(GooddataParser.Uri, 0); }
		public Attribute_uriContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_uri; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_uri(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_uri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_uri(this);
			else return null;
		}
	}

	public final Attribute_uriContext attribute_uri() throws RecognitionException {
		Attribute_uriContext _localctx = new Attribute_uriContext(_ctx, 48);
		enterRule(_localctx, RULE_attribute_uri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(Uri);
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

	public static class MetricContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> String() { return getToken(GooddataParser.String, 0); }
		public MetricContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_metric; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterMetric(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitMetric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitMetric(this);
			else return null;
		}
	}

	public final MetricContext metric() throws RecognitionException {
		MetricContext _localctx = new MetricContext(_ctx, 50);
		enterRule(_localctx, RULE_metric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(String);
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

	public static class Attribute_elementContext extends ParserRuleContext<Token> {
		public Attribute_element_uriContext attribute_element_uri() {
		    return getRuleContext(Attribute_element_uriContext.class,0);
		}
		public Attribute_element_nameContext attribute_element_name() {
		    return getRuleContext(Attribute_element_nameContext.class,0);
		}
		public Attribute_elementContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_element; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_element(this);
			else return null;
		}
	}

	public final Attribute_elementContext attribute_element() throws RecognitionException {
		Attribute_elementContext _localctx = new Attribute_elementContext(_ctx, 52);
		enterRule(_localctx, RULE_attribute_element);
		try {
			setState(187);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case String:
				case Single_quoted_string:
				case Double_quoted_string:
					enterOuterAlt(_localctx, 1);
					{
					setState(185); attribute_element_name();
					}
					break;
				case Uri:
					enterOuterAlt(_localctx, 2);
					{
					setState(186); attribute_element_uri();
					}
					break;
				default :
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

	public static class Attribute_element_uriContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Uri() { return getToken(GooddataParser.Uri, 0); }
		public Attribute_element_uriContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_element_uri; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_element_uri(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_element_uri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_element_uri(this);
			else return null;
		}
	}

	public final Attribute_element_uriContext attribute_element_uri() throws RecognitionException {
		Attribute_element_uriContext _localctx = new Attribute_element_uriContext(_ctx, 54);
		enterRule(_localctx, RULE_attribute_element_uri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(Uri);
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

	public static class Attribute_element_nameContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> String() { return getToken(GooddataParser.String, 0); }
		public TerminalNode<Token> Single_quoted_string() { return getToken(GooddataParser.Single_quoted_string, 0); }
		public TerminalNode<Token> Double_quoted_string() { return getToken(GooddataParser.Double_quoted_string, 0); }
		public Attribute_element_nameContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_attribute_element_name; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).enterAttribute_element_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof GooddataListener ) ((GooddataListener)listener).exitAttribute_element_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooddataVisitor ) return ((GooddataVisitor<T>)visitor).visitAttribute_element_name(this);
			else return null;
		}
	}

	public final Attribute_element_nameContext attribute_element_name() throws RecognitionException {
		Attribute_element_nameContext _localctx = new Attribute_element_nameContext(_ctx, 56);
		enterRule(_localctx, RULE_attribute_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Single_quoted_string || _la==Double_quoted_string) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\26\u00c2\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2"+
		"\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7\16\2\17"+
		"\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25\7\25\2\26"+
		"\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34\7\34\1\0"+
		"\1\0\1\0\3\0>\b\0\1\0\3\0A\b\0\1\0\3\0D\b\0\1\1\1\1\1\1\3\1I\b\1\1\2\1"+
		"\2\1\2\1\2\3\2O\b\2\1\2\1\2\1\3\1\3\1\3\1\3\1\3\3\3X\b\3\1\3\1\3\1\4\1"+
		"\4\1\5\1\5\1\5\1\5\1\6\1\6\1\6\1\7\1\7\1\7\5\7h\b\7\n\7\f\7k\t\7\1\b\1"+
		"\b\1\b\3\bp\b\b\1\t\1\t\1\t\1\t\1\n\1\n\1\n\1\n\1\n\1\n\1\13\1\13\1\13"+
		"\1\13\1\13\1\13\1\f\1\f\3\f\u0084\b\f\1\r\1\r\1\r\1\r\3\r\u008a\b\r\1"+
		"\16\1\16\1\17\1\17\1\20\1\20\1\21\1\21\3\21\u0094\b\21\1\22\3\22\u0097"+
		"\b\22\1\22\1\22\1\22\3\22\u009c\b\22\1\22\5\22\u009f\b\22\n\22\f\22\u00a2"+
		"\t\22\1\23\1\23\1\23\5\23\u00a7\b\23\n\23\f\23\u00aa\t\23\1\24\1\24\3"+
		"\24\u00ae\b\24\1\25\1\25\1\26\1\26\1\27\1\27\1\30\1\30\1\31\1\31\1\32"+
		"\1\32\3\32\u00bc\b\32\1\33\1\33\1\34\1\34\1\34\35\0\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\0\4\2\5\5\7\7\1\21\23\1\21"+
		"\23\1\21\23\u00b7\0:\1\0\0\0\2H\1\0\0\0\4J\1\0\0\0\6R\1\0\0\0\b[\1\0\0"+
		"\0\n]\1\0\0\0\fa\1\0\0\0\16d\1\0\0\0\20o\1\0\0\0\22q\1\0\0\0\24u\1\0\0"+
		"\0\26{\1\0\0\0\30\u0083\1\0\0\0\32\u0085\1\0\0\0\34\u008b\1\0\0\0\36\u008d"+
		"\1\0\0\0 \u008f\1\0\0\0\"\u0093\1\0\0\0$\u0096\1\0\0\0&\u00a3\1\0\0\0"+
		"(\u00ad\1\0\0\0*\u00af\1\0\0\0,\u00b1\1\0\0\0.\u00b3\1\0\0\0\60\u00b5"+
		"\1\0\0\0\62\u00b7\1\0\0\0\64\u00bb\1\0\0\0\66\u00bd\1\0\0\08\u00bf\1\0"+
		"\0\0:;\5\20\0\0;=\3\2\1\0<>\3\30\f\0=<\1\0\0\0=>\1\0\0\0>@\1\0\0\0?A\3"+
		"\f\6\0@?\1\0\0\0@A\1\0\0\0AC\1\0\0\0BD\3 \20\0CB\1\0\0\0CD\1\0\0\0D\1"+
		"\1\0\0\0EI\5\25\0\0FI\3\4\2\0GI\3\6\3\0HE\1\0\0\0HF\1\0\0\0HG\1\0\0\0"+
		"I\3\1\0\0\0JK\5\r\0\0KN\5\16\0\0LO\3\"\21\0MO\3\n\5\0NL\1\0\0\0NM\1\0"+
		"\0\0OP\1\0\0\0PQ\5\17\0\0Q\5\1\0\0\0RS\5\t\0\0ST\5\16\0\0TW\3(\24\0UV"+
		"\5\1\0\0VX\3(\24\0WU\1\0\0\0WX\1\0\0\0XY\1\0\0\0YZ\5\17\0\0Z\7\1\0\0\0"+
		"[\\\3\62\31\0\\\t\1\0\0\0]^\5\16\0\0^_\3\0\0\0_`\5\17\0\0`\13\1\0\0\0"+
		"ab\5\n\0\0bc\3\16\7\0c\r\1\0\0\0di\3\20\b\0ef\7\0\0\0fh\3\20\b\0ge\1\0"+
		"\0\0hk\1\0\0\0ig\1\0\0\0ij\1\0\0\0j\17\1\0\0\0ki\1\0\0\0lp\3\22\t\0mp"+
		"\3\24\n\0np\3\26\13\0ol\1\0\0\0om\1\0\0\0on\1\0\0\0p\21\1\0\0\0qr\3(\24"+
		"\0rs\5\f\0\0st\3\64\32\0t\23\1\0\0\0uv\3(\24\0vw\5\6\0\0wx\5\16\0\0xy"+
		"\3&\23\0yz\5\17\0\0z\25\1\0\0\0{|\5\16\0\0|}\3\0\0\0}~\5\17\0\0~\177\5"+
		"\f\0\0\177\u0080\5\25\0\0\u0080\27\1\0\0\0\u0081\u0084\3\32\r\0\u0082"+
		"\u0084\3\36\17\0\u0083\u0081\1\0\0\0\u0083\u0082\1\0\0\0\u0084\31\1\0"+
		"\0\0\u0085\u0086\5\13\0\0\u0086\u0089\3$\22\0\u0087\u0088\5\1\0\0\u0088"+
		"\u008a\3\34\16\0\u0089\u0087\1\0\0\0\u0089\u008a\1\0\0\0\u008a\33\1\0"+
		"\0\0\u008b\u008c\5\2\0\0\u008c\35\1\0\0\0\u008d\u008e\5\3\0\0\u008e\37"+
		"\1\0\0\0\u008f\u0090\5\4\0\0\u0090!\1\0\0\0\u0091\u0094\3*\25\0\u0092"+
		"\u0094\3,\26\0\u0093\u0091\1\0\0\0\u0093\u0092\1\0\0\0\u0094#\1\0\0\0"+
		"\u0095\u0097\5\b\0\0\u0096\u0095\1\0\0\0\u0096\u0097\1\0\0\0\u0097\u0098"+
		"\1\0\0\0\u0098\u00a0\3(\24\0\u0099\u009b\5\1\0\0\u009a\u009c\5\b\0\0\u009b"+
		"\u009a\1\0\0\0\u009b\u009c\1\0\0\0\u009c\u009d\1\0\0\0\u009d\u009f\3("+
		"\24\0\u009e\u0099\1\0\0\0\u009f\u00a2\1\0\0\0\u00a0\u009e\1\0\0\0\u00a0"+
		"\u00a1\1\0\0\0\u00a1%\1\0\0\0\u00a2\u00a0\1\0\0\0\u00a3\u00a8\3\64\32"+
		"\0\u00a4\u00a5\5\1\0\0\u00a5\u00a7\3\64\32\0\u00a6\u00a4\1\0\0\0\u00a7"+
		"\u00aa\1\0\0\0\u00a8\u00a6\1\0\0\0\u00a8\u00a9\1\0\0\0\u00a9\'\1\0\0\0"+
		"\u00aa\u00a8\1\0\0\0\u00ab\u00ae\3.\27\0\u00ac\u00ae\3\60\30\0\u00ad\u00ab"+
		"\1\0\0\0\u00ad\u00ac\1\0\0\0\u00ae)\1\0\0\0\u00af\u00b0\7\1\0\0\u00b0"+
		"+\1\0\0\0\u00b1\u00b2\5\24\0\0\u00b2-\1\0\0\0\u00b3\u00b4\7\2\0\0\u00b4"+
		"/\1\0\0\0\u00b5\u00b6\5\24\0\0\u00b6\61\1\0\0\0\u00b7\u00b8\5\21\0\0\u00b8"+
		"\63\1\0\0\0\u00b9\u00bc\38\34\0\u00ba\u00bc\3\66\33\0\u00bb\u00b9\1\0"+
		"\0\0\u00bb\u00ba\1\0\0\0\u00bc\65\1\0\0\0\u00bd\u00be\5\24\0\0\u00be\67"+
		"\1\0\0\0\u00bf\u00c0\7\3\0\0\u00c09\1\0\0\0\21=\1@\1C\1H\1N\1W\1i\1o\1"+
		"\u0083\1\u0089\1\u0093\1\u0096\1\u009b\1\u00a0\1\u00a8\1\u00ad\1\u00bb"+
		"\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}
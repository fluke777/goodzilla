
package org.fluke.tools;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GooddataBaseListener implements GooddataListener {
	@Override public void enterBy_clause(GooddataParser.By_clauseContext ctx) { }
	@Override public void exitBy_clause(GooddataParser.By_clauseContext ctx) { }
	@Override public void enterFact_name(GooddataParser.Fact_nameContext ctx) { }
	@Override public void exitFact_name(GooddataParser.Fact_nameContext ctx) { }
	@Override public void enterQuery(GooddataParser.QueryContext ctx) { }
	@Override public void exitQuery(GooddataParser.QueryContext ctx) { }
	@Override public void enterAttribute(GooddataParser.AttributeContext ctx) { }
	@Override public void exitAttribute(GooddataParser.AttributeContext ctx) { }
	@Override public void enterValue_list(GooddataParser.Value_listContext ctx) { }
	@Override public void exitValue_list(GooddataParser.Value_listContext ctx) { }
	@Override public void enterMetric_form(GooddataParser.Metric_formContext ctx) { }
	@Override public void exitMetric_form(GooddataParser.Metric_formContext ctx) { }
	@Override public void enterQuery_form(GooddataParser.Query_formContext ctx) { }
	@Override public void exitQuery_form(GooddataParser.Query_formContext ctx) { }
	@Override public void enterQuery_condition(GooddataParser.Query_conditionContext ctx) { }
	@Override public void exitQuery_condition(GooddataParser.Query_conditionContext ctx) { }
	@Override public void enterIn_condition(GooddataParser.In_conditionContext ctx) { }
	@Override public void exitIn_condition(GooddataParser.In_conditionContext ctx) { }
	@Override public void enterAttribute_element_uri(GooddataParser.Attribute_element_uriContext ctx) { }
	@Override public void exitAttribute_element_uri(GooddataParser.Attribute_element_uriContext ctx) { }
	@Override public void enterAttribute_element(GooddataParser.Attribute_elementContext ctx) { }
	@Override public void exitAttribute_element(GooddataParser.Attribute_elementContext ctx) { }
	@Override public void enterAgg_form(GooddataParser.Agg_formContext ctx) { }
	@Override public void exitAgg_form(GooddataParser.Agg_formContext ctx) { }
	@Override public void enterAttribute_uri(GooddataParser.Attribute_uriContext ctx) { }
	@Override public void exitAttribute_uri(GooddataParser.Attribute_uriContext ctx) { }
	@Override public void enterBy_attribute(GooddataParser.By_attributeContext ctx) { }
	@Override public void exitBy_attribute(GooddataParser.By_attributeContext ctx) { }
	@Override public void enterWithout_pf_clause(GooddataParser.Without_pf_clauseContext ctx) { }
	@Override public void exitWithout_pf_clause(GooddataParser.Without_pf_clauseContext ctx) { }
	@Override public void enterAll_other(GooddataParser.All_otherContext ctx) { }
	@Override public void exitAll_other(GooddataParser.All_otherContext ctx) { }
	@Override public void enterFact_uri(GooddataParser.Fact_uriContext ctx) { }
	@Override public void exitFact_uri(GooddataParser.Fact_uriContext ctx) { }
	@Override public void enterCondition(GooddataParser.ConditionContext ctx) { }
	@Override public void exitCondition(GooddataParser.ConditionContext ctx) { }
	@Override public void enterWhere_clause(GooddataParser.Where_clauseContext ctx) { }
	@Override public void exitWhere_clause(GooddataParser.Where_clauseContext ctx) { }
	@Override public void enterAttribute_element_name(GooddataParser.Attribute_element_nameContext ctx) { }
	@Override public void exitAttribute_element_name(GooddataParser.Attribute_element_nameContext ctx) { }
	@Override public void enterAttribute_name(GooddataParser.Attribute_nameContext ctx) { }
	@Override public void exitAttribute_name(GooddataParser.Attribute_nameContext ctx) { }
	@Override public void enterConditions(GooddataParser.ConditionsContext ctx) { }
	@Override public void exitConditions(GooddataParser.ConditionsContext ctx) { }
	@Override public void enterAttribute_condition(GooddataParser.Attribute_conditionContext ctx) { }
	@Override public void exitAttribute_condition(GooddataParser.Attribute_conditionContext ctx) { }
	@Override public void enterFact(GooddataParser.FactContext ctx) { }
	@Override public void exitFact(GooddataParser.FactContext ctx) { }
	@Override public void enterWhat(GooddataParser.WhatContext ctx) { }
	@Override public void exitWhat(GooddataParser.WhatContext ctx) { }
	@Override public void enterMetric(GooddataParser.MetricContext ctx) { }
	@Override public void exitMetric(GooddataParser.MetricContext ctx) { }
	@Override public void enterBy_all_in_all(GooddataParser.By_all_in_allContext ctx) { }
	@Override public void exitBy_all_in_all(GooddataParser.By_all_in_allContext ctx) { }
	@Override public void enterAttribute_list(GooddataParser.Attribute_listContext ctx) { }
	@Override public void exitAttribute_list(GooddataParser.Attribute_listContext ctx) { }
	@Override public void enterCount_form(GooddataParser.Count_formContext ctx) { }
	@Override public void exitCount_form(GooddataParser.Count_formContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(TerminalNode<Token> node) { }
	@Override public void visitErrorNode(ErrorNode<Token> node) { }
}
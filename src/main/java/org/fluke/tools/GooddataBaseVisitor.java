
package org.fluke.tools;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class GooddataBaseVisitor<T> extends ParseTreeVisitor<T> implements GooddataVisitor<T> {
	@Override public T visitBy_clause(GooddataParser.By_clauseContext ctx) { return visitChildren(ctx); }
	@Override public T visitFact_name(GooddataParser.Fact_nameContext ctx) { return visitChildren(ctx); }
	@Override public T visitQuery(GooddataParser.QueryContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute(GooddataParser.AttributeContext ctx) { return visitChildren(ctx); }
	@Override public T visitValue_list(GooddataParser.Value_listContext ctx) { return visitChildren(ctx); }
	@Override public T visitMetric_form(GooddataParser.Metric_formContext ctx) { return visitChildren(ctx); }
	@Override public T visitQuery_form(GooddataParser.Query_formContext ctx) { return visitChildren(ctx); }
	@Override public T visitQuery_condition(GooddataParser.Query_conditionContext ctx) { return visitChildren(ctx); }
	@Override public T visitIn_condition(GooddataParser.In_conditionContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_element_uri(GooddataParser.Attribute_element_uriContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_element(GooddataParser.Attribute_elementContext ctx) { return visitChildren(ctx); }
	@Override public T visitAgg_form(GooddataParser.Agg_formContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_uri(GooddataParser.Attribute_uriContext ctx) { return visitChildren(ctx); }
	@Override public T visitBy_attribute(GooddataParser.By_attributeContext ctx) { return visitChildren(ctx); }
	@Override public T visitWithout_pf_clause(GooddataParser.Without_pf_clauseContext ctx) { return visitChildren(ctx); }
	@Override public T visitAll_other(GooddataParser.All_otherContext ctx) { return visitChildren(ctx); }
	@Override public T visitFact_uri(GooddataParser.Fact_uriContext ctx) { return visitChildren(ctx); }
	@Override public T visitCondition(GooddataParser.ConditionContext ctx) { return visitChildren(ctx); }
	@Override public T visitWhere_clause(GooddataParser.Where_clauseContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_element_name(GooddataParser.Attribute_element_nameContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_name(GooddataParser.Attribute_nameContext ctx) { return visitChildren(ctx); }
	@Override public T visitConditions(GooddataParser.ConditionsContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_condition(GooddataParser.Attribute_conditionContext ctx) { return visitChildren(ctx); }
	@Override public T visitFact(GooddataParser.FactContext ctx) { return visitChildren(ctx); }
	@Override public T visitWhat(GooddataParser.WhatContext ctx) { return visitChildren(ctx); }
	@Override public T visitMetric(GooddataParser.MetricContext ctx) { return visitChildren(ctx); }
	@Override public T visitBy_all_in_all(GooddataParser.By_all_in_allContext ctx) { return visitChildren(ctx); }
	@Override public T visitAttribute_list(GooddataParser.Attribute_listContext ctx) { return visitChildren(ctx); }
	@Override public T visitCount_form(GooddataParser.Count_formContext ctx) { return visitChildren(ctx); }
}
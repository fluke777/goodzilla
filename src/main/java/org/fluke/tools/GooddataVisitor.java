
package org.fluke.tools;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GooddataVisitor<T> {
	T visitBy_clause(GooddataParser.By_clauseContext ctx);
	T visitFact_name(GooddataParser.Fact_nameContext ctx);
	T visitQuery(GooddataParser.QueryContext ctx);
	T visitAttribute(GooddataParser.AttributeContext ctx);
	T visitValue_list(GooddataParser.Value_listContext ctx);
	T visitMetric_form(GooddataParser.Metric_formContext ctx);
	T visitQuery_form(GooddataParser.Query_formContext ctx);
	T visitQuery_condition(GooddataParser.Query_conditionContext ctx);
	T visitIn_condition(GooddataParser.In_conditionContext ctx);
	T visitAttribute_element_uri(GooddataParser.Attribute_element_uriContext ctx);
	T visitAttribute_element(GooddataParser.Attribute_elementContext ctx);
	T visitAgg_form(GooddataParser.Agg_formContext ctx);
	T visitAttribute_uri(GooddataParser.Attribute_uriContext ctx);
	T visitBy_attribute(GooddataParser.By_attributeContext ctx);
	T visitWithout_pf_clause(GooddataParser.Without_pf_clauseContext ctx);
	T visitAll_other(GooddataParser.All_otherContext ctx);
	T visitFact_uri(GooddataParser.Fact_uriContext ctx);
	T visitCondition(GooddataParser.ConditionContext ctx);
	T visitWhere_clause(GooddataParser.Where_clauseContext ctx);
	T visitAttribute_element_name(GooddataParser.Attribute_element_nameContext ctx);
	T visitAttribute_name(GooddataParser.Attribute_nameContext ctx);
	T visitConditions(GooddataParser.ConditionsContext ctx);
	T visitAttribute_condition(GooddataParser.Attribute_conditionContext ctx);
	T visitFact(GooddataParser.FactContext ctx);
	T visitWhat(GooddataParser.WhatContext ctx);
	T visitMetric(GooddataParser.MetricContext ctx);
	T visitBy_all_in_all(GooddataParser.By_all_in_allContext ctx);
	T visitAttribute_list(GooddataParser.Attribute_listContext ctx);
	T visitCount_form(GooddataParser.Count_formContext ctx);
}
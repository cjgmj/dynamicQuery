package com.cjgmj.dynamicQuery.filter.predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.cjgmj.dynamicQuery.filter.FalseFieldFilter;
import com.cjgmj.dynamicQuery.filter.FieldFilter;

public class FalsePredicate implements QueryPredicate {

	@Override
	public Predicate buildPredicate(CriteriaBuilder criteriaBuilder, Root<?> root, Expression<String> expression,
			FieldFilter<?> fieldFilter) {
		return criteriaBuilder.isFalse(criteriaBuilder.equal(expression, ((FalseFieldFilter) fieldFilter).getValue()));
	}

}

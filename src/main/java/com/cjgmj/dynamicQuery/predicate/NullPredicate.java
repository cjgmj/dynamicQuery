package com.cjgmj.dynamicQuery.predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.cjgmj.dynamicQuery.modifier.ValueFilter;

public class NullPredicate implements QueryPredicate {

	@Override
	public Predicate buildPredicate(CriteriaBuilder criteriaBuilder, Root<?> root, Expression<String> expression,
			ValueFilter<?> valueFilter) {
		return criteriaBuilder.isNull(expression);
	}

}

package com.design.pattern.filter;

import java.util.List;

public class And implements Criteria {

	private Criteria criteria1;
	private Criteria criteria2;

	public And(Criteria criteria1, Criteria criteria2) {
	      this.criteria1 = criteria1;
	      this.criteria2 = criteria2; 
	   }

	@Override
	public List<Student> meetCriteria(List<Student> students) {

		return criteria2.meetCriteria(criteria1.meetCriteria(students));

	}
}

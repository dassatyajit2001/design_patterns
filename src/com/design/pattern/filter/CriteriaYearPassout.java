package com.design.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaYearPassout implements Criteria {

	int passOutYear;

	public CriteriaYearPassout(int passOutYear) {
		this.passOutYear = passOutYear;
	}

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		return students.stream().filter(student -> student.getPassOutYear() == passOutYear)
				.collect(Collectors.toList());
	}

}

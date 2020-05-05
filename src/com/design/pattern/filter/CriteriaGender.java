package com.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriteriaGender implements Criteria {

	public CriteriaGender(String gender) {
		super();
		this.gender = gender;
	}

	String gender;

	@Override
	public List<Student> meetCriteria(List<Student> students) {
		return students.stream()
				.filter(student -> student.getGender().equalsIgnoreCase(gender))
				.collect(Collectors.toList());
	}
}

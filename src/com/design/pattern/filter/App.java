package com.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Sam", "Male", 2008));
		students.add(new Student("Johnny", "Male", 2008));
		students.add(new Student("Jessie", "Female", 2001));
		students.add(new Student("Rebecca", "Female", 2019));
		students.add(new Student("Jim", "Male", 2019));
		students.add(new Student("Catie", "Female", 2020));
		students.add(new Student("Roman", "Male", 2020));
		students.add(new Student("Parth", "Male", 2020));

		Criteria male = new CriteriaGender("Male");
		Criteria female = new CriteriaGender("Female");
		Criteria passOut2020 = new CriteriaYearPassout(2020);

		Criteria maleAnd2020 = new And(passOut2020, male);
		Criteria femaleOr2020 = new Or(passOut2020, female);

		System.out.println("Male Students-> ");
		printStudents(male.meetCriteria(students));

		System.out.println("Female Students->  ");
		printStudents(female.meetCriteria(students));

		System.out.println("Male Students 2020 passout->  ");
		printStudents(maleAnd2020.meetCriteria(students));

		System.out.println("Female Students 2020 passout-> :");
		printStudents(femaleOr2020.meetCriteria(students));
	}

	public static void printStudents(List<Student> students) {
		students.stream().forEach(student -> System.out.println(student));
	}

}

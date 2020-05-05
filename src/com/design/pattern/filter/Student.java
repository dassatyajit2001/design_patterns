package com.design.pattern.filter;

public class Student {
	
		
		   private String name;
		   private String gender;
		   private int passOutYear;

		   public Student(String name, String gender, int passOutYear){
		      this.name = name;
		      this.gender = gender;
		      this.passOutYear = passOutYear;		
		   }

		   public String getName() {
		      return name;
		   }
		   public String getGender() {
		      return gender;
		   }
		   public int getPassOutYear() {
		      return passOutYear;
		   }

		@Override
		public String toString() {
			return "Student [name=" + name + ", gender=" + gender + ", passOutYear=" + passOutYear + "]";
		}	
		
}

package com.design.pattern.filter;

import java.util.List;

public class Or implements Criteria {

		   private Criteria criteria1;
		   private Criteria criteria2;

		   public Or(Criteria criteria1, Criteria criteria2) {
		      this.criteria1 = criteria1;
		      this.criteria2 = criteria2; 
		   }

		   @Override
		   public List<Student> meetCriteria(List<Student> students) {
		   
			   List<Student> result=criteria2.meetCriteria(students);
			   result.addAll(criteria1.meetCriteria(students));
			   return result;
		      
		   }
		}


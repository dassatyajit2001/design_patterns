package com.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	   private List<Product> products = new ArrayList<Product>();	

	   public void addItem(Product item){
		   products.add(item);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Product product : products) {
	         cost += product.getCost();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Product product : products) {
	         System.out.print("Product : " + product.getName());
	         System.out.print(", Size : " + product.getSize());
	         System.out.println(", Price : " + product.getCost());
	      }		
	   }	
	}

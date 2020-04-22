package com.design.adapter;

public class App {

	public static void main(String[] args) {
		Tiger tiger = new Tiger(); 
        ToyTiger toyTiger = new ToyTiger(); 
  
      
        ToyAnimal animalAdapter = new AnimalAdapter(tiger); 
  
        System.out.println("tiger..."); 
        tiger.eat(); 
        tiger.move(); 
  
        System.out.println("toyTiger..."); 
        toyTiger.roll(); 
  
      
        System.out.println("animalAdapter..."); 
        animalAdapter.roll(); 

	}

}

package com.design.pattern.builder;
public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger.VegBurgerBuilder("Cheese", 13)
    		  .add("Cheese", 1)
    		  .add("corn", 1)
    		  .add("mushroom", 2).build());
      
      return meal;
   }   

  
}
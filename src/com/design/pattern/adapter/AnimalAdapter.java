package com.design.pattern.adapter;

/**
 * This is the adapter class that wraps the Animal behaviour using the Toyanimal as 
 * external interface to client
 * @author satyajitdas
 *
 */
public class AnimalAdapter implements ToyAnimal{

	Animal animal;

	AnimalAdapter(Animal animal){
		this.animal=animal;
	}
	@Override
	public void roll() {
		animal.move();
		
	}
	
}

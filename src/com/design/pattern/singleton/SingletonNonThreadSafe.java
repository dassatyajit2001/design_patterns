package com.design.pattern.singleton;

/**
 * This shows a non threadsafe way of creating singleton class
 * The call to create the object is through lazy initialization;
 * @author satyajitdas
 *
 */
public class SingletonNonThreadSafe {
	//lazy initialization
	private static SingletonNonThreadSafe instance=null;
	
	//eagerly loading the object.
	//private static SingletonNonThreadSafe instance=null;
	
	/**
	 * private constructor
	 */
	private SingletonNonThreadSafe() {
		
	}
	
	/**
	 * this instantiates the object if it is null and returns it
	 * @return
	 */
	public SingletonNonThreadSafe getInstance() {
		if(instance==null)
			instance=new SingletonNonThreadSafe();
		return instance;
	}
	
	/**
	 * sample operation method
	 */
	public void printMessage() {
		System.out.println("Carry out some operation");
	}
	
}



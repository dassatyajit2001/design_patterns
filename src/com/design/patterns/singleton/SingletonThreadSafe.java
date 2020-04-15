package com.design.patterns.singleton;

/**
 * This shows a thread safe way of creating singleton class The call to create
 * the object is through lazy initialization;
 * 
 * @author satyajitdas
 *
 */
public class SingletonThreadSafe {
	// lazy initialization
	private static SingletonThreadSafe instance = null;

	/**
	 * private constructor
	 */
	private SingletonThreadSafe() {

	}

	/**
	 * this instantiates the object by using a double null check
	 * @return
	 */
	public SingletonThreadSafe getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafe.class) {
				if (instance == null)
					instance = new SingletonThreadSafe();
			}
		}
		return instance;
	}


	/**
	 * sample operation method
	 */
	public void printMessage() {
		System.out.println("Carry out some operation");
	}
}

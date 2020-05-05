package com.design.pattern.decorator;

public class App {

	public static void main(String[] args) {
		Vehicle carObj = new Car();

		Vehicle v2Car = new V2EngineDecorator(new Car());
		Vehicle v6Car = new V6EngineDecorator(new Car());

		System.out.println("Moving a normal car");
		carObj.move();
		System.out.println();
		System.out.println("Build a V2 Engine car");
		v2Car.move();
		System.out.println();
		System.out.println("Build a V6 Engine car");
		v6Car.move();

	}

}

package com.design.pattern.facade;

public class App {

	public static void main(String[] args) {
		VehicleHandler handler=new VehicleHandler(new Car(), new Bus(), new Truck());
		handler.moveCar();
		handler.moveBus();
		handler.moveTruck();
	}

}

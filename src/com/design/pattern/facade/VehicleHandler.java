package com.design.pattern.facade;

public class VehicleHandler {
	public VehicleHandler(Vehicle car, Vehicle bus, Vehicle truck) {
		super();
		this.car = car;
		this.bus = bus;
		this.truck = truck;
	}

	Vehicle car;
	Vehicle bus;
	Vehicle truck;

	public void moveCar() {
		car.move();
	}

	public void moveTruck() {
		truck.move();
	}

	public void moveBus() {
		bus.move();
	}
}

package com.design.pattern.decorator;

public abstract class VehicleDecorator implements Vehicle {
	protected Vehicle decoratedVehicle;

	public VehicleDecorator(Vehicle decoratedVehicle) {
		this.decoratedVehicle = decoratedVehicle;
	}
	
	@Override
	public void move() {
		decoratedVehicle.move();
	}
}

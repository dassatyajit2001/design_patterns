package com.design.pattern.decorator;

public class V6EngineDecorator extends VehicleDecorator{

	public V6EngineDecorator(Vehicle decoratedVehicle) {
		super(decoratedVehicle);
	}
	
	@Override
	public void move() {
		addV6Engine();
		decoratedVehicle.move();
	}
	
	public void addV6Engine() {
		System.out.println(" Added V6 Engine");
	}

}

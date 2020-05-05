package com.design.pattern.decorator;

public class V2EngineDecorator  extends VehicleDecorator{

	public V2EngineDecorator(Vehicle decoratedVehicle) {
		super(decoratedVehicle);
	}

	@Override
	public void move() {
		addV2Engine();
		decoratedVehicle.move();
	}
	
	public void addV2Engine() {
		System.out.println(" Added V2 Engine");
	}
}

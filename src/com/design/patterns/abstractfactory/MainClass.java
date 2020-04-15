package com.design.patterns.abstractfactory;

public class MainClass {

	public static void main(String[] args) {

		AbstractVehicleFactory airFactory = FactoryBuilder.getFactory("air");

		Vehicle aeroplane = airFactory.getVehicle("aeroplane");

		aeroplane.move();

		Vehicle helic = airFactory.getVehicle("helicopter");

		helic.move();

		AbstractVehicleFactory landFactory = FactoryBuilder.getFactory("land");

		Vehicle bus = landFactory.getVehicle("bus");

		bus.move();

		Vehicle truck = landFactory.getVehicle("truck");

		truck.move();

	}

}

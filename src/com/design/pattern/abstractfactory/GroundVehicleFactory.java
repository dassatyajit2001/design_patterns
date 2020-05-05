package com.design.pattern.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class GroundVehicleFactory implements AbstractVehicleFactory{

	public static Map<String, Vehicle> cache = new HashMap<>();

	/**
	 * factory method that returns the type of object if creation of object is a
	 * costly affair and we can reuse the objects; then we can cache the objects
	 * 
	 * @param vehicleType
	 * @return
	 */
	public Vehicle getVehicle(String vehicleType) {
		vehicleType = vehicleType.toLowerCase();
		Vehicle obj = null;
		obj = cache.get(vehicleType);
		if (obj != null)
			return obj;
		else {
			switch (vehicleType) {
			case "car":
				cache.put(vehicleType, new Car());
				break;

			case "truck":
				cache.put(vehicleType, new Truck());
				break;

			case "bus":
				cache.put(vehicleType, new Bus());
				break;
			}
		}
		return obj = cache.get(vehicleType);

	}
}

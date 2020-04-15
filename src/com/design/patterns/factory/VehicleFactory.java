package com.design.patterns.factory;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

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

			case "truck":
				cache.put(vehicleType, new Truck());

			case "bus":
				cache.put(vehicleType, new Bus());
			}
		}
		return obj = cache.get(vehicleType);

	}
}

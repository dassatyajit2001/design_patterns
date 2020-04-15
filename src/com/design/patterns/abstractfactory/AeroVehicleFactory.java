package com.design.patterns.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class AeroVehicleFactory  implements AbstractVehicleFactory{

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
			case "aeroplane":
				cache.put(vehicleType, new Aeroplane());
				break;

			case "helicopter":
				cache.put(vehicleType, new Helicopter());
				break;
			}
		}
		return obj = cache.get(vehicleType);

	}
}

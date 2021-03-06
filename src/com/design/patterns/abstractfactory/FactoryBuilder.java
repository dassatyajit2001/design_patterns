package com.design.patterns.abstractfactory;

public class FactoryBuilder {
	public static AbstractVehicleFactory getFactory(String factoryType){   
	      if(factoryType.toLowerCase()=="air"){
	         return new AeroVehicleFactory();         
	      }else{
	         return new GroundVehicleFactory();
	      }
	   }
}

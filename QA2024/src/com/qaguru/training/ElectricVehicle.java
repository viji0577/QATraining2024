package com.qaguru.training;

public class ElectricVehicle extends Vehicle {
	
	
	public ElectricVehicle(){
		System.out.println("This is from ElectricVehicle....");
		
	}
	

	public void checkBattery(int battery) {
		
		if (battery == 40) {
			System.out.println("The car is a smaall car");
		}
	    else if (battery== 100) {
	    	System.out.println("The car is a big car");	
	    }
	    else 
	    	System.out.println("Invalid Input");
	    	
	}
	
	
	
	
	public static void main(String[] args) {
		ElectricVehicle ev=new ElectricVehicle();
		ev.checkBattery(40);
		ev.checkBattery(100);
		ev.checkBattery(35);
	    ev.viewEngineCapacity(3);//this from parent class
	    ev.viewEngineCapacity(4);
	}
	

}

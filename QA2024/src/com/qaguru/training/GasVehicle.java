package com.qaguru.training;

public class GasVehicle extends Vehicle {
	
	
	public GasVehicle(){
		System.out.println("This is from GasVehicle....");
		
	}
	

	public void checkCylinderSize(int Cylinder) {
		
		if (Cylinder <= 4) {
			System.out.println("The car is a smaall enzine car");
		}
	    else if (Cylinder >=6 && Cylinder <= 8) {
	    	System.out.println("The car is a big enzine car");	
	    }
	    else 
	    	System.out.println("Invalid Input");
	    	
	}
	
	
	
	
	public static void main(String[] args) {
		GasVehicle gv=new GasVehicle();
		gv.checkCylinderSize(6);
		gv.checkCylinderSize(8);
	    gv.viewEngineCapacity(3);//this from parent class
	    gv.viewEngineCapacity(4);
	}
	

}

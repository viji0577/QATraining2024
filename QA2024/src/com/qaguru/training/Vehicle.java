package com.qaguru.training;

public class Vehicle {

	
	public Vehicle(){
		System.out.println("This from Vehicle");
	}
	
	
	public void viewEngineCapacity(int fuelGrade) {
	
	if ( fuelGrade >=1 && fuelGrade <=2) {
		System.out.println("The vehicle is a small car");
	}
	else if(fuelGrade >=1 && fuelGrade <=3) {
		System.out.println("The vehicle is a family size car");
	}
	else if(fuelGrade >3 ) {
		System.out.println("The vehicle is a SUV");
	}
	
	
	}
	
	
	public static void main(String[] args) {
		Vehicle eng = new Vehicle();
		
		eng.viewEngineCapacity(1);
		eng.viewEngineCapacity(2);
		eng.viewEngineCapacity(3);
		eng.viewEngineCapacity(4);
	}

	}

package com.qaguru.training;

public class HybridVehicle extends ElectricVehicle implements IA , IB{
	 
	public HybridVehicle() {
	System.out.println("This is from hybrid vehicle");
	}
	public void FuelBatteryCheck(int fuelGrade, int batteryType) {
		if (fuelGrade >= 1 && fuelGrade <= 2 && batteryType == 40) {
			System.out.println("This car is a small electric car");	
		}
		else if (fuelGrade >3 && batteryType == 100) {
			System.out.println("This car is a big electric car");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	
	public static void main(String[] args) {
		HybridVehicle hv = new HybridVehicle();
		hv.FuelBatteryCheck(1, 40);
		hv.FuelBatteryCheck(4, 100);
		hv.FuelBatteryCheck(2, 100);
		hv.checkBattery(100);
		hv.viewEngineCapacity(1);
	}
	
	public void method1() {
		System.out.println("This is method 1");
		
	}

	public void method2() {
		System.out.println("This is method 2");
		
	}
	
	public void method3() {
		System.out.println("This is method 3");
		
	}
	
	public void method4() {
		System.out.println("This is method 4");
		
	}
	@Override
	public void method5() {
		System.out.println("This is method 5");
		
	}
	
	public void methodA() {
		System.out.println("This is method A");
		
	}
	@Override
	public void methodB() {
		System.out.println("This is method B");			
		
	}
	@Override
	public void methodC() {
		System.out.println("This is method C");
	}
	@Override
	public void methodD() {
		System.out.println("This is method D");
		
	}
	@Override
	public void methodE() {
			System.out.println("This is method E");
		
	}
	@Override
	public void methodA1() {
	System.out.println("This is method A1");
		
	}
	@Override
	public void methodB2() {
		System.out.println("This is method B2");
		
	}
	@Override
	public void methodC3() {
	System.out.println("This is method C3");
		
	}
	@Override
	public void methodD4() {
			System.out.println("This is method D4");
		
	}
	@Override
	public void methodE5() {
		System.out.println("This is method E5");
		
	}

}

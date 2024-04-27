package com.test.feb2024;
import com.qaguru.training.*;
public class PlayInh {

	
	//Inheritance examples
	public static void main(String[] args) {
		
		System.out.println("Single inheritance Example:");
		
		//Single inheritance
		ElectricVehicle ev = new ElectricVehicle();
		ev.checkBattery(100);// child self method
		ev.viewEngineCapacity(2);//method from parent vehicle
		
		
		System.out.println("Multilevel inheritance Example:");
		//Multilevel Inheritance
		HybridVehicle hv = new HybridVehicle();
		hv.FuelBatteryCheck(1, 40);//child self method
		hv.checkBattery(100);//parent method
		hv.viewEngineCapacity(4);//parent of paremt method
		
		
		System.out.println(" Hierarchical inheritance Example:");
		//Hierarchical inheritance
		//(GaVehicle and ElectricVehicle parent is same Vehicle)
		/**
		 * Hierarchical inheritance
		 */
		GasVehicle gv = new GasVehicle();
		gv.checkCylinderSize(6);//child self method
		gv.viewEngineCapacity(2);//main parent method
		
		
		
		

	}

}

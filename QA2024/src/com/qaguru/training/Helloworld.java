package com.qaguru.training;

import com.test.feb2024.Hello;

public class Helloworld {
	
	int instanceVar = 5;

	public static void main(String[] args) {
		int localVar = 15;
		System.out.println("Hello world!!" + localVar);
		

		//create instance of class and store it in object variable hw
		Helloworld hw = new Helloworld();
		
		//Execute non static method test1 passing parameter or argument
		hw.test1("SSM");
		
		//call static method directly from main method
		test2("SSM2");
		
		System.out.println("Test!!" + hw.instanceVar);
	}
	
	
	
	
	public void test1 (String param1) {
		
		//create localvar
		int localVar2 = 25;
		
		System.out.println("Hello world!!" + param1 + instanceVar);
		System.out.println("Hello world!!" + localVar2);
		
		Hello hll = new Hello();
		hll.firstName = "SM";
		hll.lastName = "Mishra";
		hll.printName();
		
	}
	
	public  static void test2 (String param1) {
		
		//create new object
		Helloworld hw2 = new Helloworld();
		//override value
		hw2.instanceVar = 75;
		System.out.println("Hello static world!!" + param1 + hw2.instanceVar);
		
		
		Hello hll = new Hello();
		hll.firstName = "Vijaya";
		hll.lastName = "Mishra";
		hll.printName();
		
	}
}

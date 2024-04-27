package com.test.feb2024;

public class Hello {
	
	public String firstName;  //instance variable
	public String lastName;  //instance variable
	
	public Hello(){
		
	}
	public void printName() {
		String fullName;    //local variable
		fullName = firstName + " " + lastName;
		System.out.println (fullName);
		
	}
	
	public static void main(String[] agrs) { //main method which gets call when application 
		System.out.println ("Hello");
		
		
		Hello myNameHello = new Hello();
		myNameHello.firstName ="Vijaya";
		myNameHello.lastName ="Mishra";
		myNameHello.printName();
		
		
		
		Hello myNameHello1 = new Hello();
		
		
		myNameHello1.firstName="SANTOSH";
		myNameHello1.lastName="SANTOSH";
				
		myNameHello1.printName();
		
		Hello myNameHello2 = new Hello();
		myNameHello2.firstName="Shaurya";
		myNameHello2.lastName="Mishra";
		
		myNameHello2.printName();
		
	}
}

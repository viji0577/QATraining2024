package com.qaguru.training;

public class CheckGreaterNumber {

	public static int checkGreaterOfTwo(int a , int b) {
		System.out.println("The inputs are : "+a+ " "+ b);
		int greater = 0;
		
		if (a > b) {
			greater = a;
		}
		else {
			greater = b;
		}
		
		return greater;
		
	}
	
	public static void main(String[] args) {
		int gt = checkGreaterOfTwo(15,10);
		System.out.println("The greater Number is : " + gt);
		
		int gt1 = checkGreaterOfTwo(2,10);
		System.out.println("The greater Number is : " + gt1);
		
		int gt2 = checkGreaterOfTwo(5,10);
		System.out.println("The greater Number is : " + gt2);
		
		int gt3 = checkGreaterOfTwo(15,100);
		System.out.println("The greater Number is : " + gt3);
		
		int ls1 = checkLesserOfTwo(7,9);
		System.out.println("The leser Number is : " + ls1);
		
		int gt4 = checkGreaterOfTwo(17, 9);
		System.out.println("The greater Number from program argumaent is : " + gt4);
			
	}
	
	public static int checkLesserOfTwo(int a , int b) {
		System.out.println("The inputs are : "+a+ " "+ b);
		int lesser = 0;
		
		if (a < b) 
			lesser = a;
		else 
			lesser = b;
		
		
		return lesser;
		
	}
	
	
}

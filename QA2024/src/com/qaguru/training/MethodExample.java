package com.qaguru.training;

public class MethodExample {
	
	public void CheckEvenOdd(int a) {
		
		if (a%2==0) {
			System.out.println(a + " is even number");
		
		}
		else {
			System.out.println(a + " is odd number");
			 
		}
		
	}
	

	public static void main(String[] args) {
		
		MethodExample me = new MethodExample();
		me.CheckEvenOdd(100);
		me.CheckEvenOdd(50);	
		me.CheckEvenOdd(25);
		me.CheckEvenOdd(127);
		me.CheckEvenOdd(200);
		me.CheckEvenOdd(109);
		me.CheckEvenOdd(61);
	}

}

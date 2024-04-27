package com.qaguru.training;

public class OperatorsExamplea {

	public static void main(String[] args) {
	// Logical operators && ||
 	int x = 19;
 	int y = 25;
 	int z = 40;
	
 	System.out.println(x>y && y < z);		
 	System.out.println(x>y || y < z);
 	System.out.println(x + y);
 	System.out.println(x - y);
 	System.out.println(y * z);
 	System.out.println(z/y);
 	System.out.println(z % y);
 	//System.out.println(x++ + x++);
 	//System.out.println(y-- + y--);
 	
 	//System.out.println(++x + ++x);
 	//System.out.println(--y + --y);
 	System.out.println(++x + x++); // 20+20 = 40
 	System.out.println(--y + y--); //24+24 =48
 	
	} 

}

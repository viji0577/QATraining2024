package com.selenium;

public class ExceptionExample {
	static String name;
    public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c[] = new int[5];
		try {	
			
			System.out.println(a/b);
			c[5] = 10;
			System.out.println(name.length());
			
		} 
		/* catch(ArithmeticException e) {
			System.out.println("Exception has occured");
			System.out.println("Cannot divide by zero");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception");
		}
		catch(Exception e) {
			System.out.println("Exception has occured");
			} */
		finally {
			System.out.println("finally block"); // Finally block is always executed
			System.out.println("done");
		}
	}
}

// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero (//runtime exception)
//try and catch block is used to handle the exception
package com.qaguru.training;

public class RevStr {

	public static void main(String[] args) {

		String input = "Festivals";
		
		String revInput = "";
	
		for	(int i = input.length()-1; i >= 0; i--) {
		
			revInput= revInput + input.charAt(i);
		}
		
		System.out.println("Reveresed string is: " +  revInput);
 }
}
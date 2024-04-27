package com.qaguru.training;

public class StringMethod {

	public static void main(String[] args) {
		String str1 = "How are you?";
		String str2 = "How Are You?";
		
		System.out.println("Equality Check1: "+str1.equals(str2));
		System.out.println("Equality Check Ignore Case: "+str1.equalsIgnoreCase(str2));
		
		System.out.println("Length Check: "+str1.length());
		System.out.println("Character Print at index 5 : "+str1.charAt(5));
		System.out.println("Chek index of the character : "+str1.indexOf('w'));
		System.out.println("Concatanate string : "+str1.concat("doing"));
		System.out.println("Contain check : "+str1.contains("doing"));
		System.out.println("Contain check : "+str1.contains("are"));
		
		
		if (str1.equals(str2)){
			System.out.println("Both Strings are equal");
		}
		else {
			System.out.println("Both Strings are NOT equal");
		}

	}

}

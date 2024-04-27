package com.qaguru.training;

public class SplitString {

	public static void main(String[] args) {
		
		String str= "How are you?";
		String[] strarr = str.split(" ");
		
		for(String word: strarr ) {
		System.out.println( word);

	}
	}
}

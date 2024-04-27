package com.qaguru.training;

public class SplitSentence {

	public static void main(String[] args) {
		String str= "How are you?";
		String[] strarr = str.split(" ");
		System.out.println("Array length after split: "+strarr.length);
		for(int i=0 ; i < strarr.length; i++) {
		System.out.println(strarr[i]);

	    }
	}


}


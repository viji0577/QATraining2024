package com.selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) throws FileNotFoundException { // another way to handle checked Exception
		File myObj = new File("filename.txt");
	      Scanner myReader = null;
		//try {
			System.out.println("Try block");
			myReader = new Scanner(myObj);
			System.out.println("File found");
			while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
              }
		//}// catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//System.out.println("An error occurred.");
			//e.printStackTrace();
		
	     
   //finally {
	   System.out.println("finally block");
	      myReader.close();
	      //}

	  }
	}

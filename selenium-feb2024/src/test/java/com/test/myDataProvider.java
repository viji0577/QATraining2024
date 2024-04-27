package com.test;

import org.testng.annotations.DataProvider;

public class myDataProvider {

	 @DataProvider(name = "data")
	  public Object[][] getdata() {
	       Object[][] data = {
	          {10,20,30},
	          {20,30,50},
	          {30,40,70},
	          {40,50,90},
	          {50,60,111}, // this test will fail and other tests will run
	          {60,70,130}
	        
	          
	      };
	      return data;
	  }
	}
//DataProvider is a feature in TestNG that allows you to run the same test multiple times with different data sets

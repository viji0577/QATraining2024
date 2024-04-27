package com.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.WindowHandle;

public class DataProviderExample {
	
	@Test(dataProvider = "data", dataProviderClass = myDataProvider.class) // data provider is in different class
	
	//@Test(dataProvider="data") // data provider is in same class
	public void testadd(int a, int b, int result) {
		
		 int sum = a+b;
	Assert.assertEquals(sum, result);
		System.out.println("sum is " + result);
		
		//System.out.println(WindowHandle.name2);
	
	}
	
	
}

// data provider in same class

  /* @DataProvider(name = "data")
  public Object[][] getData() {
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
}*/

//data provider is a feature in TestNG that allows you to run the same test multiple times with different data sets
//data driven testing is running a single test multiple times with multiple sets of data
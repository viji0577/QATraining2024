package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {

	@Test
	public void testAssert1() {
		
		String str1= "hello";
		
		String  str2 = "hello";
		//String str2 = "hi!";
        Assert.assertEquals(str1, str2, "Strings are not equal");
        boolean status = false;
        String message = "One item added to cart";
        Assert.assertTrue(message.contains("added"), "Item not added to cart");
        Assert.assertFalse(status, "Status is true");
	}
	
    @Test
	public void testAssert2() {
			String str1= "hello";
	        //String  str2 = "hello";
		   String str2 = "hi!";
	       
	        SoftAssert sa = new SoftAssert();
	        sa.assertEquals(str1, str2, "Strings are not equal");
	        
	        boolean status = false;
	        String message = "One item added to cart";
	        sa.assertTrue(message.contains("added"), "Item not added to cart");
	        sa.assertFalse(status, "Status is true");
	        
	        sa.assertAll();
	}
		
}

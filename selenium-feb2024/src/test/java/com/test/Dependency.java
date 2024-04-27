package com.test;

import org.testng.annotations.Test;

public class Dependency {

	@Test (priority = 0)
	public void addItems() {
		System.out.println("Adding items to cart");
		//Assert.assertEquals(1, 2);
	}
	
	@Test (priority = 1, dependsOnMethods = {"addItems"}) 
	public void editItems() {
		System.out.println("Editing items in cart");
	}
	
	@Test (priority = 2, dependsOnMethods = {"addItems", "editItems"})
	public void deleteItems() {
		System.out.println("Deleting items from cart");
	}
}


package com.test;

import org.testng.annotations.Test;

public class TestAttributes {

	@Test(priority = 0, description = "This is a test, which has a priority of 0")
	
	public void test2() {
		System.out.println("TestNG: test2");
	}
	@Test (priority = 1)
	public void test1() {
		System.out.println("TestNG: test1");
	}
    @Test (priority = 2, enabled = false)
	public void test4() {
		System.out.println("TestNG: test4");
	}
    @Test (priority = 3)
	public void test3() {
        System.out.println("TestNG: test3");
        
    }

	
	
}

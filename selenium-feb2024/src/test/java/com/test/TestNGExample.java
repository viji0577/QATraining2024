package com.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	
public class TestNGExample {
	
	@BeforeSuite
	public void setupSuite() {
		System.out.println("TestNG: @BeforeSuite Setup");
	}
	@AfterSuite
	public void teardownSuite() {
		System.out.println("TestNG: @AfterSuite Teardown");
	}
	@BeforeTest
	public void setupTest() {
		System.out.println("TestNG: @BeforeTest Setup");
	}
	@AfterTest
	public void teardownTest() {
		System.out.println("TestNG: @AfterTest Teardown");
	}
	
	@BeforeClass
	public void setupClass() {
		System.out.println("TestNG: @BeforeClass Setup");
	}
	@AfterClass		
	public void teardownClass() {
		System.out.println("TestNG: @AfterClass Teardown");
	}
	
	@BeforeMethod
	public void setup() {
	System.out.println("TestNG:@BeforeMethod Setup");
}

	@AfterMethod
	public void teardown() {
		System.out.println("TestNg, @AfterMethod Teardown");
	}

	@Test
	public void testAssert() {
		
		//Assert.assertTrue(false);
		System.out.println("TestNG: testAssert");
		
	}
	@Test
	public void test2() {
		System.out.println("TestNG: test2");	
	}
	

	@Test
	public void test1() {
		System.out.println("TestNG: test1");	
	}
	
	
}

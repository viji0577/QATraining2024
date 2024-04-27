package com.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksSteps {
	static WebDriver driver;
	
	@Before
	public void setUp() {
		System.out.println("This will run before the Scenario");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	   
	}

	@After
	public void tearDown() {
		System.out.println("This will run after the Scenario");
		driver.quit();
	}

}

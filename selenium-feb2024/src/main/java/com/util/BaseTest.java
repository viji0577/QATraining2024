package com.util;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	protected String appUrl; 
	protected String username;
	protected String password;
	protected String usereamil;
	
	@BeforeMethod
	public void setUp() throws IOException {
		appUrl = Configartion.Config("Url");
		username = Configartion.Config("UserName");
		password = Configartion.Config("UserPassword");
		usereamil = Configartion.Config("UserEmail");
		
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
		@AfterMethod
		public void tearDown() {
            System.out.println("Closing browser");
          driver.quit();
	}
}

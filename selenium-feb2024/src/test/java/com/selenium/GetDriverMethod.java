package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetDriverMethod {

	
	@Test
	
	public void testFacebook() {
		System.out.println("Facebook test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Facebook - log in or sign up");
		
		driver.findElement(By.linkText("Forgot password?")).click();
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		System.out.println(driver.getPageSource());
		
        driver.quit();
	}   
        
	}
     
            

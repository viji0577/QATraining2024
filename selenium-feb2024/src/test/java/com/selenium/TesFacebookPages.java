package com.selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesFacebookPages {
	
	@Test
	
	public void testFacebook() {
		System.out.println("Facebook test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement emailelement = driver.findElement(By.id("email"));
		emailelement.sendKeys("123@gmail.com");
		WebElement passwordelement = driver.findElement(By.id("pass"));
		passwordelement.sendKeys("123");
		WebElement loginbutton = driver.findElement(By.name("login"));
		
	    loginbutton.click();
	    driver.quit();
	}

}

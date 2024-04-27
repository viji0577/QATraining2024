package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	
	
WebDriver driver;
	
	@Test
	public void testNavigation() throws InterruptedException {
    driver = new ChromeDriver();
		driver.get("https://facebook.com"); //get method will delete the cookies and history
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.id("email"));  
		email.sendKeys("test123@gamil.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	    //driver.navigate().to("https://www.facebook.com");//same as get method but it will not delete the cookies and history
		
		driver.navigate().back(); //go back to the previous page
		Thread.sleep(2000); //not recommended to use in automation testing
		driver.navigate().forward(); //go forward to the next page
		Thread.sleep(2000);
		driver.navigate().refresh(); //refresh the page
	}
}

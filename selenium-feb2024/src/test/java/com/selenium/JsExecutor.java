package com.selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JsExecutor {
	WebDriver driver;
	
	@Test
	public void testJsExecutor() {
    driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.id("email"));  
		email.sendKeys("test123@gamil.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test");
		
		WebElement login = driver.findElement(By.name("login"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", login); //click on the login button using javascript executor
        
      //scroll the page down by 1000 pixels, using console in the inspect element to get the height of the page
        js.executeScript("window.scrollBy(1000,1000)"); 
		

}

	
}
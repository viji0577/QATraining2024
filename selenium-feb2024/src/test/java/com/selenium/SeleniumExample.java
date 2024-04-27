package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
	
	public static void main(String[] args) {
		System.out.println("Selenium WebDriver example");
		
		// 1.open browser
		// 2.navigate to URL
		// 3.find element
		// 4.perform action
		// 5.close browser
		
		
		//1. openBrowser();
		 WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new SafariDriver();	
		// WebDriver driver = new EdgeDriver();
		
		//2. navigateToURL();
		driver.get("https://www.google.com");
		
		//3. findElement();
		WebElement element = driver.findElement(By.id("input"));
		
	
		//4. performAction();
		element.sendKeys("Selenium WebDriver");
		element.submit();
		
		//5. closeBrowser();
		//driver.quit();
	}

}













// JDK
// Eclipse intellij
//Senium webdriver	
//TestNG
//Maven
//Jenkins
//Gecodriver
//ChromeDriver
//IDE driver
// SafariDriver
// OperaDriver
// EdgeDriver
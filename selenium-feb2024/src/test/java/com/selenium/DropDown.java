package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
	
	@Test
	public void testDropDown() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
	
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		dropdown.click();
		
		WebElement option1 = driver.findElement(By.xpath("//option[@value='1']"));
		option1.click();
		
		System.out.println(option1.getText());
		
		WebElement option2 = driver.findElement(By.xpath("//option[@value='2']"));
		option2.click();
		System.out.println(option2.getText());
		
		driver.quit();
		
	}

}

package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptAlerts {
	@Test
	
	public void testAlerts() {
		System.out.println("Alert test");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement jsalert = driver.findElement(By.xpath("//button[@ onclick='jsAlert()']"));
		jsalert.click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		WebElement jsconfirm = driver.findElement(By.xpath("//button[@ onclick='jsConfirm()']"));
		jsconfirm.click();
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		WebElement jsPrompt= driver.findElement(By.xpath("//button[@ onclick='jsPrompt()']"));
		jsPrompt.click();
		
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("1234");
		alert3.accept();
		
		
		
	}

}

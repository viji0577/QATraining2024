package com.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.AssertExample;

public class Alerts {

	@Test

	public void HandleAlert() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("alertButton")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		
        alert1.accept(); 
		
		//driver.findElement(By.id("confirmButton")).click();
	}
	
	
	public static void main(String[] args) {
		
		
		//WindowHandle wh = new WindowHandle();
		//System.out.println(wh.i);
		//System.out.println(wh.name);
		
		System.out.println(WindowHandle.name2);
		

		
		
		//WindowHandle wh2 = new WindowHandle(7,"Shaurya");
		//System.out.println(wh2.i);
		//System.out.println(wh2.name);
		
		
	}

}


package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement checkBox1 = driver.findElement(By.className("rct-checkbox"));
		boolean status = checkBox1.isSelected();
		System.out.println("Status of checkbox: "+status);
		
		checkBox1.click();
	
		status = checkBox1.isSelected();
		System.out.println("Status of checkbox: "+status);
		
        //driver.quit();
	}

}

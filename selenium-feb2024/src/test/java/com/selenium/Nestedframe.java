package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nestedframe {

	@Test
	public void testNestedFrames() {
		System.out.println("Nested Frames test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-top");
		
		WebElement topLftFrame = driver.findElement(By.xpath("//frame[@name ='frame-left']"));
		System.out.println(" Left frame found" + topLftFrame.getTagName());
		
		driver.switchTo().frame("frame-left");
		String leftText = driver.findElement(By.xpath("//body")).getText();
		System.out.println(" leftText: " + leftText);
		Assert.assertEquals(leftText, "LEFT");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		
		String middleText = driver.findElement(By.xpath("//body")).getText();
		System.out.println(" middleText: " + middleText);
		Assert.assertEquals(middleText, "MIDDLE");

		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		String rightText = driver.findElement(By.xpath("//body")).getText();
	    System.out.println(" rightText: " + rightText);
	    Assert.assertEquals(rightText, "RIGHT");
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame-bottom");
	    
	   
	    String bottomText = driver.findElement(By.xpath("//body")).getText();
	    System.out.println(" bottomText: " + bottomText);
	    Assert.assertEquals(bottomText, "BOTTOM");
	
		driver.quit();
		
		
		
		
	
	}
}

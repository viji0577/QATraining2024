package com.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	
	
	public int i = 0;
	public String name = "S1";
	
	public static String name2 = "S2";

	
	WindowHandle(){
		this.i = 5;
		this.name = "Vijaya";
	}
	
	WindowHandle(int i, String name) {
		this.i=i;
		this.name=name;
	}
	
	@Test
	
	public void testWindowHandle() {
        WebDriver driver = new ChromeDriver();
        String name ="testing";
        System.out.println(name);
        		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("tabButton")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windowids = driver.getWindowHandles();
	
		
		for (String winId : windowids) {
			
			
			
			driver.switchTo().window(winId);
		}
		
		System.out.println(i);
		String  text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		//driver.close(); // close the current window
		driver.quit(); // close all the windows
		
		driver.switchTo().window(parentWindow);
	
		driver.findElement(By.id("windowButton")).click();
		
	}
	@Test
	public void testWindowTab() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.switchTo().newWindow(WindowType.TAB); // open a new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // open a new window
		driver.navigate().to("https://www.google.com");
		
		
	}
}

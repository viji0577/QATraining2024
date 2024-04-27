package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureScreen {
	WebDriver driver;
	@Test
	public void testCaptureScreen() throws IOException{
	    driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement logoElemt = driver.findElement(By.cssSelector("img[alt='Facebook']"));
		 logoElemt.getScreenshotAs(OutputType.FILE);
		 File file = logoElemt.getScreenshotAs(OutputType.FILE);
		 File file2 = new File("logoElemt.png");
			FileUtils.copyFile(file, file2);
		 
		
		WebElement email = driver.findElement(By.id("email"));  // wrong locator, should be id="email" the test will fail and teardown method will be executed
		email.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test");
		
		WebElement login = driver.findElement(By.name("login"));
        login.click();
        
       
	}
		/* TakesScreenshot scrnShot= ((TakesScreenshot)driver);
		scrnShot.getScreenshotAs(OutputType.FILE);
		File file = scrnShot.getScreenshotAs(OutputType.FILE);
		File file2 = new File("screenshot.png");
		FileUtils.copyFile(file, file2); */
		
		
		 @AfterMethod
		public void tearDown (ITestResult result) {
			if (result.getStatus() == ITestResult.FAILURE) {
				TakesScreenshot scrnShot= ((TakesScreenshot)driver);
				scrnShot.getScreenshotAs(OutputType.FILE);
			
				File file = scrnShot.getScreenshotAs(OutputType.FILE);
				File file2 = new File("screenshot.png");
				try {
				FileUtils.copyFile(file, file2);
				}
						catch (IOException e) {
                    e.printStackTrace();
				
				
			}
			
            //driver.quit();
        } 
		
		
		
				
		
	}
}

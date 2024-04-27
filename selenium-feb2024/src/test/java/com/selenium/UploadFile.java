package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFile {
@Test
public void testUpload() {
	System.out.println("File upload test");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("file-upload")).sendKeys("/Users/vijayamishra/VijayaDocs/QAGuru/Week8/week8assignment.pdf");
	
	WebElement uploadButton = driver.findElement(By.id("file-submit"));
	uploadButton.click();
	
	WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
	String uploadedFileName = uploadedFile.getText();
	
	System.out.println("Uploaded name is :" + uploadedFileName);
	Assert.assertEquals(uploadedFileName, "week8assignment.pdf");
	
	driver.quit();
}
}

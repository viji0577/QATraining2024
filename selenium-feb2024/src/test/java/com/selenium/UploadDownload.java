package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadDownload {
	@Test
	public void testUpload() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download\"");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.findElement(By.id("downloadButton")).click();
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\admin\\Downloads\\sampleFile.jpeg");
	}

}


// for uploading the file we have to inspect the element, if it has input tag with type= file then we can use sendkeys method and specify the file path to upload the file
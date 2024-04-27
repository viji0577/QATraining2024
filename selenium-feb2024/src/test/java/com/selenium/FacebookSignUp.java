package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignUp {
@Test
	
	public void testFacebookSingnUp() {
		System.out.println("Facebook test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement SignUpButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUpButton .click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.clear();
		firstName.sendKeys("Ajay");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.clear();
		lastName.sendKeys("Smith");
		
		WebElement email = driver.findElement(By.name("reg_email__"));	
		email.clear();
		email.sendKeys("ajsm@gmail.com");
		
		WebElement newpassword = driver.findElement(By.id("password_step_input"));
		newpassword.clear();
		newpassword.sendKeys("aj123");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("10");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		//month.selectByIndex(2);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1990");
		//year.selectByIndex(2);
		
		//driver.quit();
		
	    
}

}

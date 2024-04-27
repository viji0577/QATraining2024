package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUsers {
	
	
	WebDriver driver = new ChromeDriver();
	
@Test (priority = 1)

public void testUserLogin() {
	System.out.println("Login test");
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.name("username"));
	username.clear();
	username.sendKeys("Admin");
	WebElement password = driver.findElement(By.name("password"));
	password.clear();
	password.sendKeys("admin123");
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	String expectedUserText = "Dashboard"; 
	WebElement Element = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
	String actualUserText = Element.getText();
	Assert.assertEquals(actualUserText, expectedUserText);
	
	System.out.println("login successful");
	//driver.close();
}

@Test (enabled = false)
public void testLoginFail() {
	System.out.println("Login test");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();

	WebElement username = driver.findElement(By.name("username"));
	username.clear();
	username.sendKeys("Admin");
	WebElement password = driver.findElement(By.name("password"));
	password.clear();
	password.sendKeys("adin124");

	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();

	String expectedForgotText = "Forgot your password?";
	WebElement Element = driver.findElement(By.xpath("//p[@ class= 'oxd-text oxd-text--p orangehrm-login-forgot-header']"));
	String actualForgotText = Element.getText();
	System.out.println("login failed: invalid password");
	driver.close();
}
@Test (priority = 2)

public void testAddUser() {
	System.out.println("Add user test");
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	WebElement Admin= driver.findElement(By.xpath("//a[@ class='oxd-main-menu-item active']"));
	Admin.click();
	WebElement Add = driver.findElement(By.xpath("(//button[@ type = 'button'])[5]"));
	Add.click();
	
	WebElement userRole = driver.findElement(By.xpath("(//div[@ class = 'oxd-select-text oxd-select-text--active'] )[1]"));
    userRole.click();
    
    WebElement userRoleList= driver.findElement(By.xpath("//div[div[@ role = 'option']]"));
    userRoleList.click();
    
   
    
    System.out.println("User Role selected");
    
	WebElement employeeName = driver.findElement(By.xpath("//input[@ placeholder = 'Type for hints...']"));
	employeeName.clear();
	employeeName.sendKeys("Admin");
	
	WebElement status = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
    status.click();
    
    WebElement statusList= driver.findElement(By.xpath("//div[div[@ role = 'option']]"));
    statusList.click();
        
    WebElement username = driver.findElement(By.xpath("(//input[@ class = 'oxd-input oxd-input--active'])[2]"));
    username.clear();
    username.sendKeys("QAViji");
    
    WebElement password = driver.findElement(By.xpath("(//input[@ type='password'])[1]"));
    password.clear();
    password.sendKeys("viji123");
       
    WebElement confirmPassword = driver.findElement(By.xpath("(//input[@ type='password'])[2]"));
    confirmPassword.clear();
    confirmPassword.sendKeys("viji123");
    WebElement save = driver.findElement(By.xpath("//button[@ type='submit']"));
    save.click();
    System.out.println("User added successfully");
        
    
  
}


}

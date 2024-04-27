package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class GetVerify {
	
	WebDriver driver = null;
	@BeforeMethod
	    
	       @Parameters({"browser"})
	    
public void setup(String browser) {
	 
    	
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			;
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} 
	}
		@Test
	    public void testFacebook() {
	    	
	    	
			System.out.println("Facebook test");
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			String ExpectedMsg = "Connect with friends and the world around you on Facebook.";
			WebElement Element = driver.findElement(By.className("_8eso"));
			String actualMsg = Element.getText();
			System.out.println(actualMsg);
			Assert.assertEquals(actualMsg, ExpectedMsg); // to verify the actual message with expected message
			String Eplaceholder = driver.findElement(By.id("email")).getAttribute("placeholder"); // to get the value of the attribute
			System.out.println(Eplaceholder);
			Assert.assertEquals(Eplaceholder, "Email or phone number");
			String Pplaceholder = driver.findElement(By.id("pass")).getAttribute("placeholder");
			System.out.println(Pplaceholder);
			Assert.assertEquals(Pplaceholder, "Password");
		    WebElement element =  driver.findElement(By.name("login"));
		    String fontsize = element.getCssValue("font-size"); // to get the value of the css property
		    String lineheight = element.getCssValue("line-height");
		    String padding = element.getCssValue("padding");
		    System.out.println(fontsize);
		    System.out.println(lineheight);
		    System.out.println(padding);
		   
		    Assert.assertEquals(fontsize, "20px");
		    Assert.assertEquals(lineheight, "48px");
		    Assert.assertEquals(padding, "0px 16px");
		      
		}    
		    @AfterMethod
		    public void tearDown() {
            	driver.quit();
            }
			
		

}




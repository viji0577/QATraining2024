package com.jcpenny.tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.ProductDetailPage;
import com.util.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseTest {
	@Test
	
	public void searchTest() {
		System.out.println("Search test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jcpenney.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String  productName = "Home Expressions Harper Bedspread";
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct(productName);
		
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProductTitle(productName);
		
	}

}

package com.jcpenny.tests;

import java.time.Duration;

import org.testng.annotations.Test;

import com.util.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddRemoveCart extends BaseTest {
	@Test
	public void addRemoveCart() {
		System.out.println("Add Remove Cart test");
		
		
		
		String  productName = "Home Expressions Harper Bedspread";
		WebElement search = driver.findElement(By.id("searchInputId"));
		search.clear();
		search.sendKeys(productName);
		
		WebElement searchButton = driver.findElement(By.cssSelector("button[title='search']"));
		searchButton.click();
		
		
		WebElement product = driver.findElement(By.id("productTitle-false"));
		String productTitle = product.getText();
		Assert.assertEquals(productTitle, productName);
		
		WebElement addToCart = driver.findElement(By.cssSelector("p[data-automation-id='addToCart']"));
		addToCart.click();
		
		WebElement viewCart = driver.findElement(By.cssSelector("button[data-automation-id='at-panel-checkout-button']"));
		viewCart.click();
		
		WebElement cartProduct = driver.findElement(By.cssSelector("div[data-automation-id=\"ocProductTitle\"] >a >span"));
		Assert.assertEquals(cartProduct.getText(), productName);
		
		WebElement remove = driver.findElement(By.cssSelector("button[data-automation-id='at-remove-item-link']"));
		remove.click();

	
	    WebElement EmptyCart= driver.findElement(By.cssSelector("div[data-automation-id=\"cart-is-empty\"]"));
	    Assert.assertEquals(EmptyCart.getText(), "Start with an Empty Cart, Finish in Style");
		
	    
	}
}

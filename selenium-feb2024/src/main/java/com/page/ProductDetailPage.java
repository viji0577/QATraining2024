package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

	public class ProductDetailPage {
	
	WebDriver driver;
	public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

	
	@FindBy(id = "productTitle-false")
	private WebElement producTitle;
	
	@FindBy(css="p[data-automation-id='addToCart")
    private WebElement addToCart;
	
	@FindBy(css= "button[data-automation-id='at-panel-checkout-button']")
	private WebElement Checkoutbutton;
	
	public void addToCart() {
        addToCart.click();
    }
	
	public void clickCheckout() {
        Checkoutbutton.click();
    }
	
	public void verifyProductTitle(String productName) {
	
	
	String actualproductTitle = producTitle.getText();
	Assert.assertEquals(actualproductTitle, productName);
	
	
}	
}

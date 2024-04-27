package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
        this.driver = driver;
    }

	@FindBy(css= "div[data-automation-id=\"ocProductTitle\"] >a >span")
    private WebElement cartProduct;
	
	@FindBy(css = "button[data-automation-id='at-panel-checkout-button']")
	    private WebElement viewCart;
	
	
	@FindBy(id= "checkoutButton")
	private WebElement checkOut;
	
	public void clickViewCart() {

		viewCart.click();
	}
	
	public void clickCheckout() {
			
			checkOut.click();
		}

	public void VerifyCartProduct(String productName) {
			Assert.assertEquals(cartProduct.getText(), productName);
			
		}
}

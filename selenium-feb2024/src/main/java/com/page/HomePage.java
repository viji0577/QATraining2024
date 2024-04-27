package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	String productName = "Home Expressions Harper Bedspread";
	
	@FindBy(id = "searchInputId")
	private WebElement search;
    
    @FindBy(css = "button[title='search")
    private WebElement searchButton;
    
    
	public  HomePage(WebDriver driver) {
		this.driver = driver;
	}
  

	public void searchProduct(String productName) {
		search.clear();
		search.sendKeys(productName);
		searchButton.click();
	}
}

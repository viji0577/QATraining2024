package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignPage{
 
	WebDriver driver;
	
	public void SignPage(WebDriver driver) {
        this.driver = driver;
    }
		
	@FindBy(id = "email")
	private WebElement emailInput;
	@FindBy(id = "cartSignInPassword")
	private WebElement passwordInput;
	@FindBy(xpath = "//button[span[ text()= 'Sign In']]")
	private WebElement signInButton;
	
	@FindBy(css = "button[data-automation-id='at-continue-as-guest']")
	private WebElement GuestButton;
	
	public void clickGuestButton() {
		GuestButton.click();
	}
	
   public void signIn(String email , String password) {
	           emailInput.sendKeys("email");
	           passwordInput.sendKeys("password");
	           signInButton.click();
   }

}
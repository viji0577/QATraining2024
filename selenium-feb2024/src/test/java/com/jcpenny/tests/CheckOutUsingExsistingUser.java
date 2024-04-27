package com.jcpenny.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.support.PageFactory;


import com.page.CartPage;
import com.page.HomePage;
import com.page.ProductDetailPage;
import com.page.SignPage;
import com.util.BaseTest;

public class CheckOutUsingExsistingUser extends BaseTest{

	// Test case to check out using existing user
	@Test
	public void TestcheckOutUsingExsistingUser() {
		System.out.println("Check Out Using Exsisting User test");
		
		String  productName = "Home Expressions Harper Bedspread";

		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		homepage.searchProduct(productName);
		
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProductTitle(productName);
		
		
		productDetailPage.addToCart();
		productDetailPage.verifyProductTitle(productName);
		
		
		
		
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		
	
		
		
		
		cartPage.clickViewCart();
		
		cartPage.VerifyCartProduct(productName);
		
		
		cartPage.clickCheckout();
		
		
		SignPage singInPage = PageFactory.initElements(driver, SignPage.class);
		singInPage.signIn("useremail", "password");
		
	}

}

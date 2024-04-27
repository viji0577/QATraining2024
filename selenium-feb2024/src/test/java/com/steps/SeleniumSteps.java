package com.steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumSteps {
	
	@Given("I navigate Url on browser")
	public void i_navigate_url_on_browser() {
		
		
	   HooksSteps.driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("I put user name in user input field")
	public void i_put_user_name_in_user_input_field() {
		HooksSteps.driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("I enter password in password input field")
	public void i_enter_password_in_password_input_field() {
		HooksSteps.driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("I click on loging button")
	public void i_click_on_loging_button() {
		HooksSteps.driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("I verify user login successfully")
	public void i_verify_user_login_successfully() {
		Assert.assertTrue(HooksSteps.driver.findElement(By.cssSelector("img[alt='client brand banner']")).isDisplayed());
	    
	}

	@Then("Verify all menu options")
	public void verify_all_menu_options(io.cucumber.datatable.DataTable dataTable) {
		
		/* List<ListString> datas1 = dataTable.asLists();
		 for (ListString data : datas1) {
		             System.out.println(data.get(0));
		  Assert.assertTrue(HooksSteps.driver.findElement(By.xpath("//*[@class=\"oxd-main-menu-item-wrapper\"]/a/span[text()='"+ data.get(0)+ "']")).isDisplayed());
		 
		 */	// this code is used when we have multiple columns in data table to display
	  
		List<Map<String, String>> datas = dataTable.asMaps();
		
		for (Map<String, String> map : datas) {
			System.out.println(map.get("Header"));
			Assert.assertTrue(HooksSteps.driver.findElement(By.xpath("//*[@class=\"oxd-main-menu-item-wrapper\"]/a/span[text()='"+ map.get("Header")+ "']")).isDisplayed());
		}
	}



}

// run the code in selenium.feature file
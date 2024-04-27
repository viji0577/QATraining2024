package com.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsdef {
	
	
	int a, b, result;
	@Given("I am a calculator")
	public void i_am_a_calculator() {
	   
	}

	
	@Given("two integers numbers {int} and {int}")
	public void two_integers_numbers_and(Integer int1, Integer int2) {
	    a= int1;
	    b= int2;
	}

	@When("I add two numbers")
	public void i_add_two_numbers() {
	    result = a+b;
	}

	@Then("I verify the result is {int}")
	public void i_verify_the_result(int expectedResuly) {
	    Assert.assertEquals(expectedResuly, result);
	}




}

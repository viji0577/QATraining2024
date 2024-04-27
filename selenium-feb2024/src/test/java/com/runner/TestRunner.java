package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(features = "src/test/resources/feature", 
glue = { "com.steps" }, 
plugin = { "json:target/report/Execution.json",
			"html:target/report/Execution.html"},
dryRun = false,

tags = "@regression or @smoke")  	      

public class TestRunner {
	
	
}

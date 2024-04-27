package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableT {
	
	
	@Test
	public void testWebTable() {
		System.out.println("Web Table test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.id("customers"));
		System.out.println(table.getText());
		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		
		for (WebElement rows : row) {
			List<WebElement> col = rows.findElements(By.tagName("td"));
			for (WebElement cols : col) {
				System.out.print(cols.getText() + "\t ");
			}
			System.out.println();
		}
		driver.quit();
	}
	
	@Test
	public void testWebTable1() {
		System.out.println("Web Table test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();

		List<WebElement> emailelements = driver.findElements(By.xpath("//div[@ class ='rt-table']/div[2]/div/div/div[4]"));
		for (WebElement email : emailelements) {
			System.out.println(email.getText());
		}
		
		driver.quit();
	}
		
}
	
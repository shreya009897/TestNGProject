package com.Module3TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PprallelTesting2 {

	@Test
	void loginOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test
	void sauceOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

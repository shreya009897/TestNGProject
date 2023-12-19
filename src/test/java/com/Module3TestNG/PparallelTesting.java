package com.Module3TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PparallelTesting {

	@Test
	void googleOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		}
	
	@Test
	void amazonOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		
	}
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

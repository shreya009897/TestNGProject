package Assertion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	
	@Test
	void googlrTitleVerify() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement e1 = driver.findElement(By.name("q"));
		Assert.assertTrue(e1.isDisplayed());
	System.out.println("passed assertTrue");
		
		
		
		
		
	}
}

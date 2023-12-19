package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertEquals {

	@Test
	void googleTitleVerify() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String ExpTille = "Google";
		String ActTitle = driver.getTitle();
		Assert.assertEquals(ExpTille, ActTitle);
		System.out.println("Hello");
		
		
	}
}

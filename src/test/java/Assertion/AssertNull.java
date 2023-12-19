package Assertion;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertNull {

	@Test
	void verifynull() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
       // Assert.assertNull(driver);
	Assert.assertNotNull(driver);
	
	}
}

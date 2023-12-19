package Module4TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount=3)
	void loginOpen() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

}

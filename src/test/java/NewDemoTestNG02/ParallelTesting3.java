package NewDemoTestNG02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting3 {

	@Test
	void loginOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.javatpoint.com/");
	}
	
	@Test
	void sauceOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://4achievers.com/");
		
	}
}

package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	void verifySoftAssertion() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		SoftAssert sa = new SoftAssert();
		String exp = "Google";
		String Act = driver.getTitle();
		sa.assertEquals(exp, Act);
		System.out.println("hello");
		sa.assertAll();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package Module4TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Module4TestNG.ListenerssClass.class)
public class Baseclass2 extends BaseClass1 {

	 @Test
	 void login() {
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		 driver.findElement(By.id("usernam")).sendKeys("student");
		 driver.findElement(By.id("password")).sendKeys("Password123");
		 driver.findElement(By.id("submit")).click();
	 }
}

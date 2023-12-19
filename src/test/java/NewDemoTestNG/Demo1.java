package NewDemoTestNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void sampleAutomation() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		
		 WebDriver driver = new FirefoxDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	driver.findElement(By.id("alert1")).click();
	
	
	
	
	}

}

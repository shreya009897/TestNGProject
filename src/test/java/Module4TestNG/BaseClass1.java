package Module4TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass1 {

	
	public static WebDriver driver = null;
	@BeforeSuite
	void browserLaunch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public void ScreenShot() throws IOException{
		File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("D:\\Shreya_code\\Eclipse_workspace\\MyTestNGProject\\src\\test\\java\\Module4TestNG\\Takesscreenshot\\hello.png");
		FileUtils.copyFile(Source, Destination);
		
	}
}

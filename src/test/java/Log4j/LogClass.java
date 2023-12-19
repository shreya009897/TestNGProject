package Log4j;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogClass {

	public static void main(String[] args) {
		
		Logger l = LogManager.getLogger("LogClass");
		l.info("Browser Launch");
	
		WebDriver driver = new ChromeDriver();
		l.info("Url Open");
		driver.get("https://www.google.com");
		l.info("Get Title");
		driver.getTitle();
	}
}

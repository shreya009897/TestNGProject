package Module_5TestNG;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReport {
	
	ExtentSparkReporter createReport;
	ExtentReports createTest;
	ExtentTest createLog;
	@BeforeTest
	void setup() {
		createReport = new ExtentSparkReporter("MyProjectReport.html");
		createTest = new ExtentReports();
		createTest.attachReporter(createReport);
		
		createTest.setSystemInfo("OperatingSystem", "Windown");
		createTest.setSystemInfo("Browesr", "Firfox");
		
		createTest.setSystemInfo("BrowesrVersion", "181.91.22.01");
		createTest.setSystemInfo("MACAddress", "00-B0-D0-63-C2-26");
		createTest.setSystemInfo("Environment", "Testing");
		createTest.setSystemInfo("User Name", "Shreya Kumari");
		createReport.config().setDocumentTitle("MyprojectReportInfo");
		createReport.config().setReportName("Module-6-Reports");
		createReport.config().setTheme(Theme.DARK);
		}
		@Test
		void Testl()
		{ createLog=createTest.createTest("Test1");
		createLog.log(Status.PASS,MarkupHelper.createLabel("TestCase pass", ExtentColor.GREEN));
		}
		@Test
		void Test2()
		{ createLog=createTest.createTest("Test2");
		createLog.log(Status.FAIL,MarkupHelper.createLabel("TestCase Failed", ExtentColor.RED));
		}
		@Test
		void Test3()
		{ createLog=createTest.createTest("Test3");
		createLog.log(Status.SKIP,MarkupHelper.createLabel("TestCase Skipped", ExtentColor.YELLOW));
		}
		@AfterTest
		void close()
		{
		createTest.flush();
		}

}

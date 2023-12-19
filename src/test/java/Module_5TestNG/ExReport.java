package Module_5TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExReport {

	ExtentSparkReporter createreport;
	ExtentReports createtest1;
	ExtentTest createlog;
	
	void setup() {
		createreport = new ExtentSparkReporter("MyExtentReport1.html");
		createtest1 = new ExtentReports();
		createtest1.attachReporter(createreport);
		
		createtest1.setSystemInfo("Os", "Window");
		createtest1.setSystemInfo("Browser", "Firefox");
		createtest1.setSystemInfo("User", "Shreya");
		createtest1.setSystemInfo("Environment", "Testing");
		createtest1.setSystemInfo("Browser", "Firefox");
		
		createreport.config().setDocumentTitle("MynewReport");
	createreport.config().setReportName("TestNG_Report_Today");
	createreport.config().setTheme(Theme.DARK);
	}
	
	@Test
	void test1() {
		createlog=createtest1.createTest("Test1");
	createlog.log(Status.PASS,MarkupHelper.createLabel("TestCasepass",ExtentColor.GREEN));
	System.out.println("TestCasePass");
	}
	
	
	@Test
	void Test2() {
		
		createlog = createtest1.createTest("Test2");
		createlog.log(Status.FAIL,MarkupHelper.createLabel("testcaseFail",ExtentColor.RED));
		System.out.println("Fail");
	}
	@AfterClass
	void after() {
		createtest1.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

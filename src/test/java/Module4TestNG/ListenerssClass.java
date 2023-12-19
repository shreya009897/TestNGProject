package Module4TestNG;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerssClass extends BaseClass1 implements ITestListener {

	public void onStart(ITestContext result) {
	      System.out.println("All TestCase Start");
		
	}
	public void onTestStart(ITestResult Result) {
		System.out.println("ontestStart");
	}
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Post:"+Result.getName());
	}

	public void onTestFailure(ITestResult Result) {
		try {
			ScreenShot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Post:"+Result.getName());
		
	}
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Post:"+Result.getName());
	}
	public void onFinish(ITestResult Result) {
		System.out.println("Post:"+Result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
	}
	public static void main(String[] args) {
		
	}
}

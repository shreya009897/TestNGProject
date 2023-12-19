package NewDemoTestNG;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups="Developer")
	void java()
	{
		System.out.println("java");
	}
	
	@Test(groups="Developer")
		void python() {
		System.out.println("python");
	}
	@Test(groups="Testing")
	void Selenium() {
		System.out.println("Selenium");
	}
	

}

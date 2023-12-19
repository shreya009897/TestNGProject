package NewDemoTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Attribute2 {

	// DependsOn
	@Test(dependsOnMethods= {"Python"})
	void Java() {
		System.out.println("java");
	}

	@Test()
	void selenium() {
		System.out.println("selenium");
	}
	@Test()
	void automation() {
		System.out.println("automation");
	}
	@Test()
	void Python() {
		// Assert.assertTrue(false);
		
	}

	@Test()
	void ruby() {
		System.out.println("ruby");
	}

	
}

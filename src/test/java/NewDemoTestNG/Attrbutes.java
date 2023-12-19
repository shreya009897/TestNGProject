package NewDemoTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Attrbutes {
	
	@Test(description="This is description attributes")
	void Description() {
		System.out.println("Description parameter");
	}

	
// Priority Attribute	
@Test(priority=-1)
void java() {
	
}

@Test(priority=1)
void python() {
	
}

// Default priority
@Test()
void Automation() {
	
}

// Enable Attrubute
@Test(enabled=false)
void Test1() {
	
}

@Test()
void Test2() {
	
}

@Test()
void Test3() {
	
}

// Include and Exclude methods fromTest.xml file
@Test()
void in() {
	
}

@Test()
void into() {
	
}
@Test()
void into1() {
	
}







}

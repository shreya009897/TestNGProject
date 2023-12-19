package NewDemoTestNG;

import org.testng.annotations.Test;

public class timeOut {
	
	@Test(timeOut=2000)
	void TimeOut() throws InterruptedException{
		
		Thread.sleep(5000);
	System.out.println("This is timeOut");
	}
	
@Test()
void TimeOut2() {
	System.out.println("This timeout two");
}
}

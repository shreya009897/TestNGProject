package Listenerss;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.testng.SkipException;
@Listeners(Listenerss.ListenersMethodsClass.class)
public class ListenersClass {

	@Test
	void SuccesMethod() {
		System.out.println("sucess");
	}
	@Test
	void failedMethod() {
		System.out.println("failedMethod");
	Assert.assertTrue(false);
	}

	@Test
	void skippedMethod() {
		System.out.println("skippedMethod");
		throw new SkipException("skipped");
	}
	

	/* <listeners>
<listener class-name="Listenerss.ListenersMethodsClass"></listener>
</listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="Listenerss.ListenersClass"/>
    </classes>
 
	  */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

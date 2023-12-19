package NewDemoTestNG02;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
@Parameters({"p","q"})
	void runClass1(int a, int b){
		System.out.println(a+b);
	}
	
	/* <suite name="Suite">
  <test thread-count="5" name="com.Module2TestNG">
    <parameter name="i" value="9"></parameter>
    <parameter name="j" value="6"></parameter>
    <parameter name="x" value="10"></parameter>
    <parameter name="y" value="11"></parameter>  
    <classes>
      <class name="com.Module2TestNG.TestNGParameter"/>   
    <class name="com.Module2TestNG.TestNGPara2"/>   
    </classes>
    
    
  </test> <!-- Test -->
  <test thread-count="5" name="NewDemoTestNG02">
   <parameter name="p" value="44"></parameter>
    <parameter name="q" value="55"></parameter>
    <classes>
    <class name = "NewDemoTestNG02.Class1"></class>
</classes>
</test> <!-- Test -->
</suite> <!-- Suite -->

	  */

}

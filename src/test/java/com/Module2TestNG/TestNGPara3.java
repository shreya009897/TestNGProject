package com.Module2TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGPara3 {

	@Test
	@Parameters({"i","j"})
	void Para3(@Optional("9")int a, int b) {
		
	System.out.println(a+b);
	}

	/*   <parameter name ="j" value = "6"></parameter>
  
  <classes>
  <class name= "com.Module2TestNG.TestNGPara3"></class>
  </classes>    
	 
	  */
	 
		}

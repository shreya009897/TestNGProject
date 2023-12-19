package com.Module2TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPara2 {

	@Test()
	@Parameters({"x","y"})
	void java(int a, int b) {
		System.out.println(a + b);
	}

	/*  <test thread-count="5" name="com.Module2TestNG">
    <parameter name="i" value="9"></parameter>
    <parameter name="j" value="6"></parameter>
    <parameter name="x" value="10"></parameter>
    <parameter name="y" value="11"></parameter>
    
    
    <classes>
      <class name="com.Module2TestNG.TestNGParameter"/>   
    <class name="com.Module2TestNG.TestNGPara2"/>   
    
    </classes>
	  */
	
}

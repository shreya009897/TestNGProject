package com.Module2TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

	@Test
	@Parameters({"i","j"})
	void java(int a, int b) {
		System.out.println(a + b);
	}
}

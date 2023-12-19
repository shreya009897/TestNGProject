package com.Module2TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DdataProvider {

	
	@DataProvider(name="DataStore")
//	public Integer[][] getData()
//	{
//	Integer[] a = new Integer[4];
//	a[0]=6;
//	a[1]=5;
//	a[2]=8;
//	a[3]=9;
		
//		Integer[][] a = new Integer[2][2];
//		a[0][0]=6;
//		a[0][1]=5;
//		a[1][0]=8;
//		a[1][1]=9;
//return a;

public Object[][] getData(){
	Object[][] a = new Object[2][2];
	a[0][0]="hello";
	a[0][1]=5;
	a[1][0]="Shreya";
	a[1][1]=9;
	return a;
}
	
	@Test(dataProvider="DataStore")
//	void m1(int a, int b)
	void m1(Object a, Object b)
	{
	//	System.out.println(a+b);
	System.out.println(a);
	System.out.println(b);
	} 
}

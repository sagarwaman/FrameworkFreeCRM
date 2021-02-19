package com.common.utilities;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertClass {
	
	public static SoftAssert softassert = new SoftAssert(); 
	
	public static void AssertEqual(String Actual,String Expected,String Message) {
		
		softassert.assertEquals(Actual, Expected,Message);
	
	}
	
	public static void AssertTrue(boolean a,String Message) {
		softassert.assertTrue(a, Message);
	}
	
	public static void Assertall() {
		softassert.assertAll();
	}
	

}

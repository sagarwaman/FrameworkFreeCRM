package com.common.method;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.common.Dataprep.AllData;
import com.common.utilities.DriverManager;


public class BaseClass {
	
	
	@BeforeClass
	@Parameters({"Browser"})
	public void initiateclass(String Browser) {
		DriverManager.initiateWebDriver(Browser);
		DriverManager.getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AllData.generateData();
	}
	
	@AfterMethod
	public void stopbrowser() {
		DriverManager.getdriver().close();
		DriverManager.getdriver().quit();
	}
}

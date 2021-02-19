package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.method.BaseClass;
import com.common.utilities.AssertClass;
import com.constants.Config;
import com.pageutils.Loginpageutils;

public class LoginTest extends BaseClass{
	
	Loginpageutils loginutil;
	
	@BeforeMethod
	public void init() {
		loginutil = new Loginpageutils();
	}
	
	@Test
	public void TestLogin() throws Throwable {
		loginutil.LaunchApp(Config.url);
		loginutil.LoginMethod(Config.username,Config.password);
		AssertClass.Assertall();
	}

}

package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.method.BaseClass;
import com.constants.Config;
import com.pageutils.AboutUsPageutils;
import com.pageutils.Loginpageutils;

public class AboutUsTest extends BaseClass{
	
	AboutUsPageutils aboutpageutil;
	Loginpageutils loginutil;
	
	@BeforeMethod
	public void init() {
		loginutil = new Loginpageutils();
		aboutpageutil  = new AboutUsPageutils();
	}
    
	@Test
	public void AboutUsPageTest() throws Throwable {
		loginutil.LaunchApp(Config.url);
		aboutpageutil.GetAboutuspage();
	}
}

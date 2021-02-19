package com.pageutils;

import com.common.utilities.AssertClass;
import com.common.utilities.Selenium;
import com.common.utilities.WebInteract;
import com.pages.AboutPage;
import com.pages.LoginPage;

public class AboutUsPageutils {
	
	AboutPage aboutpage;
	LoginPage loginpage;
	
	public AboutUsPageutils() {
		
		aboutpage = new AboutPage();
		loginpage = new LoginPage();
	}

	public void GetAboutuspage() throws Throwable {
		Selenium.click(loginpage.About);
		WebInteract.waitforvisibility(aboutpage.Aboutus);
		WebInteract.validatetitle("Free CRM About cloud CRM software and services");
		AssertClass.AssertEqual(Selenium.gettext(aboutpage.AboutUsHeadline), "Free CRM About Us","Correct head line is displayed on page");
		Selenium.click(aboutpage.Homebtn);
		//WebInteract.waitforvisibility(loginpage.Login);
		WebInteract.validatetitle("#1 Free CRM customer relationship management software cloud");
		
	}
}

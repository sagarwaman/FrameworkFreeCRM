package com.pageutils;

import com.common.utilities.AssertClass;
import com.common.utilities.DriverManager;
import com.common.utilities.Selenium;
import com.common.utilities.WebInteract;
import com.pages.HomePage;
import com.pages.LoginPage;

public class Loginpageutils {
	
	LoginPage loginpage;
	HomePage hmpage;
	
	public Loginpageutils() {
		loginpage = new LoginPage();
		hmpage = new HomePage();
	}
	
	public boolean LaunchApp(String url) throws Throwable {
		Boolean status = false;
		DriverManager.getdriver().get(url);
		WebInteract.WaitforPageload(DriverManager.getdriver());
		WebInteract.waitforvisibility(loginpage.logoimg);
		if(loginpage.logoimg.isDisplayed()) {
		System.out.println("Login page is displayed");
		status = true;
		}
		return status;
		
	}
	
	public void LoginMethod(String username,String password) throws Throwable {
		WebInteract.waitforvisibility(loginpage.logoimg);
		AssertClass.AssertTrue(Selenium.isDisplayed(loginpage.logoimg), "Logo image is displayed on login page");
		Selenium.click(loginpage.Loginbtn);
		WebInteract.waitforvisibility(loginpage.email);
		Selenium.sendkeys(loginpage.email, username);
		Selenium.sendkeys(loginpage.password, password);
		Selenium.click(loginpage.Login);	
	}
	
	public void Logout() throws Throwable {
		WebInteract.waitforvisibility(hmpage.Listbox);
		Selenium.click(hmpage.Listbox);
		WebInteract.waitforvisibility(hmpage.logout);
		Selenium.click(hmpage.logout);
	}
}

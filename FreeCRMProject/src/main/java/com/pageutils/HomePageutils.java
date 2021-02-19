package com.pageutils;

import com.common.utilities.Selenium;
import com.common.utilities.WebInteract;
import com.pages.HomePage;

public class HomePageutils {
	
	HomePage hmpage;
	
	public HomePageutils() {
		
		hmpage = new HomePage();
	}
	
	public void ContactPage() throws Throwable {
		WebInteract.waitforvisibility(hmpage.contacts);
		Selenium.click(hmpage.contacts);
	}

}

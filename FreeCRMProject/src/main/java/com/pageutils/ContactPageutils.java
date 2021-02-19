package com.pageutils;

import com.common.utilities.AssertClass;
import com.common.utilities.Selenium;
import com.common.utilities.WebInteract;
import com.pages.ContactPage;

public class ContactPageutils {
	
	ContactPage contactpage;
	
	public ContactPageutils() {
		contactpage = new ContactPage();
	}
	
	public void AddContact(String Firstname,String Lastname,String Middlename,String company,
			String Description,String Department,String Position) throws Throwable {
		WebInteract.waitforvisibility(contactpage.New);
		AssertClass.AssertEqual(Selenium.gettext(contactpage.Contactpage), "Contacts", "Correct page is displayed after clicking on contacts option");
		Selenium.click(contactpage.New);
		WebInteract.waitforvisibility(contactpage.firstname);
		Selenium.sendkeys(contactpage.firstname, Firstname);
		Selenium.sendkeys(contactpage.Lastname, Lastname);
		Selenium.sendkeys(contactpage.Middlename, Middlename);
		Selenium.sendkeys(contactpage.company, company);
		Selenium.sendkeys(contactpage.description, Description);
		Selenium.sendkeys(contactpage.position, Position);
	    Selenium.sendkeys(contactpage.department, Department);
	    Selenium.click(contactpage.save);
	    WebInteract.waitforvisibility(contactpage.addedcontact);
	    AssertClass.AssertEqual(Selenium.gettext(contactpage.addedcontact), Firstname+" "+Lastname,"Correct added contact name is displayed on contact page" );
	    Selenium.click(contactpage.contacts);
	}

}

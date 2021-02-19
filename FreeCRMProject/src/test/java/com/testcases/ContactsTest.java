package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.common.method.BaseClass;
import com.common.utilities.AssertClass;
import com.common.utilities.ExcelData;
import com.constants.Config;
import com.pageutils.ContactPageutils;
import com.pageutils.HomePageutils;
import com.pageutils.Loginpageutils;

public class ContactsTest extends BaseClass{
	
    HomePageutils hmpageutil;
    Loginpageutils loginutil;
    ContactPageutils contactutil;
    
    @BeforeMethod
    public void init() {
    	hmpageutil = new HomePageutils();
    	loginutil = new Loginpageutils();
    	contactutil = new ContactPageutils();
    }
    
    @Test(dataProvider = "DataReader")
    public void Validatecontactpage(String Firstname,String Lastname,String Middlename,
    		String company,String Description,String Department,String Position) throws Throwable {
    	boolean status = loginutil.LaunchApp(Config.url);
        AssertClass.AssertTrue(status, "Login page is displayed");
		loginutil.LoginMethod(Config.username,Config.password);
		hmpageutil.ContactPage();
		contactutil.AddContact(Firstname, Lastname, Middlename, company, Description, Department, Position);
		loginutil.Logout();
		AssertClass.Assertall();
    }
    
    @DataProvider(name="DataReader")
    public Object[][] Datareader() throws Exception{
    	Object[][] reader = ExcelData.getData(Config.Filepath, this.getClass().getSimpleName());
    	return reader;
    } 
}

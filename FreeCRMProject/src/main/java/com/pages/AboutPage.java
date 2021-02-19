package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.utilities.DriverManager;

public class AboutPage {
	
	@FindBy(xpath="//li[contains(text(),'About us')]")
	public WebElement Aboutus;
	
	@FindBy(xpath="//h1[contains(text(),'Free CRM About Us')]")
	public WebElement AboutUsHeadline;
	
	@FindBy(xpath="//a[contains(text(),'Free CRM Home')]")
	public WebElement Homebtn;
	
	
	
	public AboutPage() {
		PageFactory.initElements(DriverManager.getdriver(), this);
	}

}

package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.utilities.DriverManager;

public class HomePage {
	
	@FindBy(xpath="//a[contains(text(),'Free account')]")
	public WebElement Freeacc;
	
	@FindBy(xpath="//div[@role='listbox']")
	public WebElement Listbox;
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	public WebElement logout;
	
	@FindBy(xpath="//a[@href='/contacts']")
	public WebElement contacts;
	
	public HomePage() {
		PageFactory.initElements(DriverManager.getdriver(), this);
	}

}

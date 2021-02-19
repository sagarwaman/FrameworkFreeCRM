package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.utilities.DriverManager;

public class LoginPage {
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	public WebElement Loginbtn;
	
	@FindBy(xpath="(//span[text()='free'])[1]")
	public WebElement logoimg;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	public WebElement About;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement Login;
	
	public LoginPage() {
		PageFactory.initElements(DriverManager.getdriver(), this);
	}

}

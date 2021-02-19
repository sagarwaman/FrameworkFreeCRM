package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.utilities.DriverManager;

public class ContactPage {
	
	@FindBy(xpath="//button[text()='New']")
	public WebElement New;
	
	@FindBy(xpath="//div[text()='Contacts']")
	public WebElement Contactpage;
	
	@FindBy(xpath="//button[text()='Export']")
	public WebElement Export;
	
	@FindBy(xpath="//input[@name='first_name']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	public WebElement Lastname;
	
	@FindBy(xpath="//input[@name='middle_name']")
	public WebElement Middlename;
	
	@FindBy(xpath="//div[@name='company']//input")
	public WebElement company;
	
	@FindBy(xpath="//textarea[@name='description']")
	public WebElement description;
	
	@FindBy(xpath="//input[@name='position']")
	public WebElement position;
	
	@FindBy(xpath="//input[@name='department']")
	public WebElement department;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement save;
	
	@FindBy(xpath="(//div[@id='dashboard-toolbar']//div[1])[1]")
	public WebElement addedcontact;
	
	@FindBy(xpath="//a[@href='/contacts']")
	public WebElement contacts;
	
	public ContactPage() {
		PageFactory.initElements(DriverManager.getdriver(), this);
	}
}

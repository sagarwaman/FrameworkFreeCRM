package com.common.utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import com.common.exceptions.CannotfindElementPageException;
import com.common.exceptions.HTMLElementExpiredExcpetion;
import com.common.exceptions.InvalidHTMLElementStateException;
import com.common.exceptions.UnableTointeractWithElementException;
import com.common.exceptions.UnableToselectElement;
import com.common.exceptions.WaitingForElementLoad;
import com.common.implementations.LocatorExtractor;


public class Selenium {

	public static void click(WebElement element) throws Throwable {
		try {	
			element.click();
		}catch (ElementClickInterceptedException e) {
			element.sendKeys(Keys.RETURN);
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
	}

	public static void sendkeys(WebElement element,String text) throws Throwable {
		try {
			element.sendKeys(text);
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
	}

	public static String gettext(WebElement element) throws Throwable {
		String text = "";
		try {
			text = element.getText();
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
		return text;
	}
	
	public static void getAttribute(WebElement element,String text) throws Throwable {
		try {
			element.getAttribute(text);
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
	}
	
	public static void clear(WebElement element) throws Throwable {
		try{element.clear();
	}catch (ElementNotInteractableException e) {
		throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
	}catch(ElementNotSelectableException e) {
		throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
	}catch(InvalidElementStateException e) {
		throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
	}catch (InvalidSelectorException e) {
		throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
	}catch (NoSuchElementException e) {
		throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
	}catch (StaleElementReferenceException e) {
		throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
	}catch(TimeoutException e) {
		throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
	}
    }
	
	public static void submit(WebElement element) throws Throwable {
		try {
			element.submit();
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
	}

	public static boolean isselected(WebElement element) throws Throwable {
		boolean status = false;
		try{
			status =  element.isSelected();
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
		return status;
	} 
	
	public static boolean isEnabled(WebElement element) throws Throwable {
		boolean status = false;
		try{
			status =  element.isEnabled();
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
		return status;
	} 
	
	public static boolean isDisplayed(WebElement element) throws Throwable {
		boolean status = false;
		try{
			status =  element.isDisplayed();
		}catch (ElementNotInteractableException e) {
			throw new UnableTointeractWithElementException("Unable to interact with HTML element "+ LocatorExtractor.Extractby(element)+ " on :"+ DriverManager.getdriver().getCurrentUrl()  , e);
		}catch(ElementNotSelectableException e) {
			throw new UnableToselectElement("Unable to select select HTML location "+ LocatorExtractor.Extractby(element)+" on :"+ DriverManager.getdriver().getCurrentUrl(), e);
		}catch(InvalidElementStateException e) {
			throw new InvalidHTMLElementStateException("Unable to interact due to invalid state of element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (InvalidSelectorException e) {
			throw new UnableToselectElement("Selector is invalid for given element "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (NoSuchElementException e) {
			throw new CannotfindElementPageException("Unable to find HTML locator "+ LocatorExtractor.Extractby(element)+" on :" +DriverManager.getdriver().getCurrentUrl(), e);
		}catch (StaleElementReferenceException e) {
			throw new HTMLElementExpiredExcpetion("Unable to click as element is stale for HTML locator "+ LocatorExtractor.Extractby(element)+" on :" + DriverManager.getdriver().getCurrentUrl(), e);
		}catch(TimeoutException e) {
			throw new WaitingForElementLoad("cannot find element on webpage "+ LocatorExtractor.Extractby(element)+ " on : " +DriverManager.getdriver().getCurrentUrl(), e);
		}
		return status;
	} 
	
}
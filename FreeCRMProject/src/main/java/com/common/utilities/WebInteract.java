package com.common.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.exceptions.CannotfindElementPageException;
import com.common.exceptions.HTMLElementExpiredExcpetion;
import com.common.exceptions.InvalidHTMLElementStateException;
import com.common.exceptions.UnableTointeractWithElementException;
import com.common.exceptions.UnableToselectElement;
import com.common.exceptions.WaitingForElementLoad;
import com.common.implementations.LocatorExtractor;

public class WebInteract {
	
	public static FluentWait<WebDriver> fluentwait(){
		return new FluentWait<WebDriver>(DriverManager.getdriver()).
				withTimeout(Duration.ofSeconds(1000)).
				pollingEvery(Duration.ofSeconds(1000));
	}
	
	public static void selectrecordbytext(WebElement element,String text) throws Throwable {
		try{
			new Select(element).selectByVisibleText(text);
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
	
	public static void selectrecordByvalue(WebElement element,String text) throws Throwable {
		try{
			new Select(element).selectByValue(text);
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
	
	public static void movetoelement(WebElement element) throws Throwable {
		try {
			((JavascriptExecutor) DriverManager.getdriver()).executeScript("arguments[0].scrollIntoView(true);", element);
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
	
	public static void waitforvisibility(WebElement element) throws Throwable {
		try{
			fluentwait().until(ExpectedConditions.visibilityOf(element));
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
	
	public static void WaitforPageload(WebDriver driver) {
		ExpectedCondition<Boolean> pageloadcondition = new ExpectedCondition<Boolean>()
				{
			        public Boolean apply(WebDriver driver) {
			        	return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			        }
				};
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(pageloadcondition);
	}
	
	public static void waitforNonvisibility(WebElement element) {
		try{
			fluentwait().until(ExpectedConditions.invisibilityOf(element));
	}catch (Exception e) {
		
	 }
	}
	
	public static void Mouseover(WebElement element) throws IllegalAccessException {
		try{
			new Actions(DriverManager.getdriver()).moveToElement(element).build().perform();
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
	
	public static void clickbyjs(WebElement element) throws Throwable {
		try{
			((JavascriptExecutor) DriverManager.getdriver()).executeScript("arguments[0].click();",element);
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
	
	public static void validatetitle(String title) {
		try {
			String Pagetitle = DriverManager.getdriver().getTitle();
			AssertClass.AssertEqual(Pagetitle, title, "User navigate to correct page");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void navigateurl(String url) {
		try {
			DriverManager.getdriver().navigate().to(url);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void Acceptalert() {
		DriverManager.getdriver().switchTo().alert().accept();
	}
	
	public static void DismissAlert() {
		DriverManager.getdriver().switchTo().alert().dismiss();
	}
	
	public static String Getalerttext() {
		String message = DriverManager.getdriver().switchTo().alert().getText();
	    return message;
	}
	
	public static boolean alertpresent() {
		try {
			DriverManager.getdriver().switchTo().alert();
			return true;
		}catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	public static boolean WaitforAlert() throws InterruptedException {
		boolean alertexits = false;
		for(int i =1;i<=10;i++) {
			if(alertpresent()) {
				alertexits = true;
				break;
			}else {
				Thread.sleep(2000);
				continue;
			}
		}
		return alertexits;
	}
}

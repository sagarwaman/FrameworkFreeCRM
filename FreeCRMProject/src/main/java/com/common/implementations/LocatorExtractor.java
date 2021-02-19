package com.common.implementations;


import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.WebElement;

public class LocatorExtractor {
	
	public static String Extractby(WebElement element) throws IllegalAccessException {
		Object proxyorigin = FieldUtils.readField(element, "h", true);
		Object locator = FieldUtils.readField(proxyorigin, "locator", true);
		Object findby = FieldUtils.readField(locator, "by", true);
		return findby.toString();
	}

}

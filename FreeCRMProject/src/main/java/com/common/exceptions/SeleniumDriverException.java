package com.common.exceptions;

import org.openqa.selenium.WebDriverException;

public class SeleniumDriverException extends WebDriverException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SeleniumDriverException(String message,Throwable cause) {
		
		super(message,cause);
	}

}

package com.common.exceptions;

import org.openqa.selenium.TimeoutException;

public class WaitingForElementLoad extends TimeoutException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WaitingForElementLoad(String message,Throwable cause) {
		
		super(message,cause);
	}

}

package com.common.exceptions;

import org.openqa.selenium.InvalidElementStateException;

public class InvalidHTMLElementStateException extends InvalidElementStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidHTMLElementStateException(String message,Throwable cause) {
		
		super(message, cause);
		
	}

}

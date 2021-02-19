package com.common.exceptions;

import org.openqa.selenium.ElementNotInteractableException;

public class UnableTointeractWithElementException extends ElementNotInteractableException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnableTointeractWithElementException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}

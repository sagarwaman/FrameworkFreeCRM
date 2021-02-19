package com.common.exceptions;

import org.openqa.selenium.InvalidSelectorException;

public class InvalidWebLocatorWebException extends InvalidSelectorException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidWebLocatorWebException(String reason, Throwable cause) {
		super(reason, cause);
		// TODO Auto-generated constructor stub
	}

}

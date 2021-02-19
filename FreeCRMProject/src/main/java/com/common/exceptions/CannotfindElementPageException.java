package com.common.exceptions;

import org.openqa.selenium.NoSuchElementException;

public class CannotfindElementPageException extends NoSuchElementException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CannotfindElementPageException(String message,Throwable reason) {
		super(message,reason);
		// TODO Auto-generated constructor stub
	}

}

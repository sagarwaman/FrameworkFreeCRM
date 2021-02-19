package com.common.exceptions;

import org.openqa.selenium.StaleElementReferenceException;

public class HTMLElementExpiredExcpetion extends StaleElementReferenceException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HTMLElementExpiredExcpetion(String message,Throwable reason) {
		super(message,reason);
		// TODO Auto-generated constructor stub
	}

}

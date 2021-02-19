package com.common.exceptions;

public class UnknownException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UnknownException(String message,Throwable cause) {
		super(message,cause);
	}
}

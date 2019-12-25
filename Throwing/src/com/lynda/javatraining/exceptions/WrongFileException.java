package com.lynda.javatraining.exceptions;

public class WrongFileException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public String getMessage() {
		return "You chose the wrong file!";
	}
}

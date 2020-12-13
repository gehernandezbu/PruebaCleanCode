/*
 * File containing the
 * class code GerException
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.core;

/**
 * Class GerException
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class GerException extends Exception {
	private static final long serialVersionUID = 1L;
	private boolean showMessage;

	public GerException(String message, boolean showMessage, Throwable cause) {
		super(message, cause);
		this.setShowMessage(showMessage);
	}

	/**
	 * @return the attribute showMessage
	 */
	public boolean isShowMessage() {
		return showMessage;
	}

	/**
	 * Update the attribute value showMessage
	 * 
	 * @param showMessage value to be updated
	 */
	public void setShowMessage(boolean showMessage) {
		this.showMessage = showMessage;
	}
}

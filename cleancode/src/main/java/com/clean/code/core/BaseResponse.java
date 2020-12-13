/*
 * File containing the
 * class code BaseResponse
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.core;

/**
 * Class BaseResponse
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class BaseResponse {
	private boolean state;
	private boolean showMessage;
	private String message;

	/**
	 * Class constructor.
	 */
	public BaseResponse() {
		this.state = true;
	}

	/**
	 * @return the attribute state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * Update the attribute value state
	 * 
	 * @param state value to be updated
	 */
	public void setState(boolean state) {
		this.state = state;
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

	/**
	 * @return the attribute message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Update the attribute value message
	 * 
	 * @param message value to be updated
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseResponse [state=" + state + ", showMessage=" + showMessage + ", message=" + message + "]";
	}

}

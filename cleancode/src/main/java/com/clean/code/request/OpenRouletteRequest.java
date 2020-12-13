/*
 * File containing the
 * class code OpenRouletteRequest
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.request;

/**
 * Class OpenRouletteRequest
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class OpenRouletteRequest {
	private int stateId;

	/**
	 * @return the attribute stateId
	 */
	public int getStateId() {
		return stateId;
	}

	/**
	 * Update the attribute value stateId
	 * @param stateId value to be updated
	 */
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OpenRouletteRequest [stateId=" + stateId + "]";
	}
}

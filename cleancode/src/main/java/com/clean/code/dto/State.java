/*
 * File containing the
 * class code State
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.dto;

/**
 * Class State
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class State {
	private int stateId;
	private String code;
	private String description;

	/**
	 * @return the attribute stateId
	 */
	public int getStateId() {
		return stateId;
	}

	/**
	 * Update the attribute value stateId
	 * 
	 * @param stateId value to be updated
	 */
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the attribute code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Update the attribute value code
	 * 
	 * @param code value to be updated
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the attribute description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Update the attribute value description
	 * 
	 * @param description value to be updated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", code=" + code + ", description=" + description + "]";
	}

}

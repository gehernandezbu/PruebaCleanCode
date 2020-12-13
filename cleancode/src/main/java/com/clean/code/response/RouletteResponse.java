/*
 * File containing the
 * class code RouletteResponse
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.response;

import com.clean.code.core.BaseResponse;

/**
 * Class RouletteResponse
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class RouletteResponse extends BaseResponse {
	private int rouletteId;

	/**
	 * @return the attribute rouletteId
	 */
	public int getRouletteId() {
		return rouletteId;
	}

	/**
	 * Update the attribute value rouletteId
	 * @param rouletteId value to be updated
	 */
	public void setRouletteId(int rouletteId) {
		this.rouletteId = rouletteId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RouletteResponse [rouletteId=" + rouletteId + "]";
	}

}

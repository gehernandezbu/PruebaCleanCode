/*
 * File containing the
 * class code CloseRouletteResponse
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.response;

import java.util.List;

import com.clean.code.core.BaseResponse;
import com.clean.code.dto.RouletteTx;

/**
 * Class CloseRouletteResponse
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class CloseRouletteResponse extends BaseResponse {
	private int winningNumber;
	private List<RouletteTx> listRouletteTx;

	/**
	 * @return the attribute winningNumber
	 */
	public int getWinningNumber() {
		return winningNumber;
	}

	/**
	 * Update the attribute value winningNumber
	 * 
	 * @param winningNumber value to be updated
	 */
	public void setWinningNumber(int winningNumber) {
		this.winningNumber = winningNumber;
	}

	/**
	 * @return the attribute listRouletteTx
	 */
	public List<RouletteTx> getListRouletteTx() {
		return listRouletteTx;
	}

	/**
	 * Update the attribute value listRouletteTx
	 * 
	 * @param listRouletteTx value to be updated
	 */
	public void setListRouletteTx(List<RouletteTx> listRouletteTx) {
		this.listRouletteTx = listRouletteTx;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CloseRouletteResponse [winningNumber=" + winningNumber + ", listRouletteTx=" + listRouletteTx + "]";
	}

}

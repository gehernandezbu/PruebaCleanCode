/*
 * File containing the
 * class code RoulettesResponse
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.response;

import java.util.List;

import com.clean.code.core.BaseResponse;
import com.clean.code.dto.Roulette;

/**
 * Class RoulettesResponse
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class RoulettesResponse extends BaseResponse {
	private List<Roulette> listRoulette;

	/**
	 * @return the attribute listRoulette
	 */
	public List<Roulette> getListRoulette() {
		return listRoulette;
	}

	/**
	 * Update the attribute value listRoulette
	 * @param listRoulette value to be updated
	 */
	public void setListRoulette(List<Roulette> listRoulette) {
		this.listRoulette = listRoulette;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RoulettesResponse [listRoulette=" + listRoulette + "]";
	}

}

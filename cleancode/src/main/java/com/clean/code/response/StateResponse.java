/*
 * File containing the
 * class code StateResponse
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.response;

import java.util.ArrayList;
import java.util.List;

import com.clean.code.core.BaseResponse;
import com.clean.code.dto.State;

/**
 * Class StateResponse
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class StateResponse extends BaseResponse {
	List<State> listStates = new ArrayList<>();

	/**
	 * @return the attribute listStates
	 */
	public List<State> getListStates() {
		return listStates;
	}

	/**
	 * Update the attribute value listStates
	 * 
	 * @param listStates value to be updated
	 */
	public void setListStates(List<State> listStates) {
		this.listStates = listStates;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StateResponse [listStates=" + listStates + "]";
	}

}

/*
 * File containing the
 * class code Roulette
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.dto;

/**
 * Class Roulette
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class Roulette {
	private int rouletteId;
	private int minNumber;
	private int maxNumber;
	private State state;

	/**
	 * @return the attribute rouletteId
	 */
	public int getRouletteId() {
		return rouletteId;
	}

	/**
	 * Update the attribute value rouletteId
	 * 
	 * @param rouletteId value to be updated
	 */
	public void setRouletteId(int rouletteId) {
		this.rouletteId = rouletteId;
	}

	/**
	 * @return the attribute minNumber
	 */
	public int getMinNumber() {
		return minNumber;
	}

	/**
	 * Update the attribute value minNumber
	 * 
	 * @param minNumber value to be updated
	 */
	public void setMinNumber(int minNumber) {
		this.minNumber = minNumber;
	}

	/**
	 * @return the attribute maxNumber
	 */
	public int getMaxNumber() {
		return maxNumber;
	}

	/**
	 * Update the attribute value maxNumber
	 * 
	 * @param maxNumber value to be updated
	 */
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	/**
	 * @return the attribute state
	 */
	public State getState() {
		return state;
	}

	/**
	 * Update the attribute value state
	 * 
	 * @param state value to be updated
	 */
	public void setState(State state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Roulette [rouletteId=" + rouletteId + ", minNumber=" + minNumber + ", maxNumber=" + maxNumber
				+ ", state=" + state + "]";
	}

}

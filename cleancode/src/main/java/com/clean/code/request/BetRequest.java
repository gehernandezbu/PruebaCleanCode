/*
 * File containing the
 * class code BetRequest
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.request;

/**
 * Class BetRequest
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class BetRequest {
	private int number;
	private String color;
	private Long rouletteId;
	private Double amount;
	private int usuarioId;

	/**
	 * @return the attribute number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Update the attribute value number
	 * 
	 * @param number value to be updated
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the attribute color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Update the attribute value color
	 * 
	 * @param color value to be updated
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the attribute rouletteId
	 */
	public Long getRouletteId() {
		return rouletteId;
	}

	/**
	 * Update the attribute value rouletteId
	 * 
	 * @param rouletteId value to be updated
	 */
	public void setRouletteId(Long rouletteId) {
		this.rouletteId = rouletteId;
	}

	/**
	 * @return the attribute amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * Update the attribute value amount
	 * 
	 * @param amount value to be updated
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the attribute usuarioId
	 */
	public int getUsuarioId() {
		return usuarioId;
	}

	/**
	 * Update the attribute value usuarioId
	 * 
	 * @param usuarioId value to be updated
	 */
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BetRequest [number=" + number + ", color=" + color + ", rouletteId=" + rouletteId + ", amount=" + amount
				+ ", usuarioId=" + usuarioId + "]";
	}

}

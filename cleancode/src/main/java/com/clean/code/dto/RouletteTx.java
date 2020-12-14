/*
 * File containing the
 * class code RouletteTx
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 13/12/2020
 */
package com.clean.code.dto;

/**
 * Class RouletteTx
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class RouletteTx {

	private int trRouletteId;
	private int numberBet;
	private String colorBet;
	private Double amountBet;
	private Double amountPaid;
	private int usuarioId;
	private int rouletteId;

	/**
	 * @return the attribute trRouletteId
	 */
	public int getTrRouletteId() {
		return trRouletteId;
	}

	/**
	 * Update the attribute value trRouletteId
	 * 
	 * @param trRouletteId value to be updated
	 */
	public void setTrRouletteId(int trRouletteId) {
		this.trRouletteId = trRouletteId;
	}

	/**
	 * @return the attribute numberBet
	 */
	public int getNumberBet() {
		return numberBet;
	}

	/**
	 * Update the attribute value numberBet
	 * 
	 * @param numberBet value to be updated
	 */
	public void setNumberBet(int numberBet) {
		this.numberBet = numberBet;
	}

	/**
	 * @return the attribute colorBet
	 */
	public String getColorBet() {
		return colorBet;
	}

	/**
	 * Update the attribute value colorBet
	 * 
	 * @param colorBet value to be updated
	 */
	public void setColorBet(String colorBet) {
		this.colorBet = colorBet;
	}

	/**
	 * @return the attribute amountBet
	 */
	public Double getAmountBet() {
		return amountBet;
	}

	/**
	 * Update the attribute value amountBet
	 * 
	 * @param amountBet value to be updated
	 */
	public void setAmountBet(Double amountBet) {
		this.amountBet = amountBet;
	}

	/**
	 * @return the attribute amountPaid
	 */
	public Double getAmountPaid() {
		return amountPaid;
	}

	/**
	 * Update the attribute value amountPaid
	 * 
	 * @param amountPaid value to be updated
	 */
	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RouletteTx [trRouletteId=" + trRouletteId + ", numberBet=" + numberBet + ", colorBet=" + colorBet
				+ ", amountBet=" + amountBet + ", amountPaid=" + amountPaid + ", usuarioId=" + usuarioId
				+ ", rouletteId=" + rouletteId + "]";
	}

}

/*
 * File containing the
 * class code IRouletteDao
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.persistence;

import java.util.List;

import com.clean.code.core.GerException;
import com.clean.code.dto.Roulette;
import com.clean.code.dto.RouletteTx;
import com.clean.code.request.BetRequest;
import com.clean.code.response.BetResponse;
import com.clean.code.response.OpenRouletteResponse;
import com.clean.code.response.RouletteResponse;
import com.clean.code.response.RoulettesResponse;
import com.clean.code.response.StateResponse;

/**
 * Class IRouletteDao
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public interface IRouletteDao {

	public StateResponse findStates() throws GerException;

	public RouletteResponse createRoulettes() throws GerException;

	public OpenRouletteResponse openRoulettes(Roulette roulette) throws GerException;

	public BetResponse betRoulettes(BetRequest betRequest) throws GerException;

	public RoulettesResponse findAllRoulettes() throws GerException;
	
	public List<RouletteTx> findAllTxRoulettes(Roulette roulette) throws GerException;

}

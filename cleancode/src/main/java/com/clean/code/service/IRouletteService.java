/*
 * File containing the
 * class code IRouletteService
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.service;

import com.clean.code.core.GerException;
import com.clean.code.dto.Roulette;
import com.clean.code.response.OpenRouletteResponse;
import com.clean.code.response.RouletteResponse;
import com.clean.code.response.StateResponse;

/**
 * Class IRouletteService
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public interface IRouletteService {

	public StateResponse findStates() throws GerException;

	public RouletteResponse createRoulettes() throws GerException;

	public OpenRouletteResponse openRoulettes(Roulette roulette) throws GerException;

}

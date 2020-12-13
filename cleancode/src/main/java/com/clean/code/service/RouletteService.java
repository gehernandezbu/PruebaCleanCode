/*
 * File containing the
 * class code RouletteService
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clean.code.core.GerException;
import com.clean.code.dto.Roulette;
import com.clean.code.persistence.IRouletteDao;
import com.clean.code.response.OpenRouletteResponse;
import com.clean.code.response.RouletteResponse;
import com.clean.code.response.StateResponse;

/**
 * Class RouletteService
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
@Service
public class RouletteService implements IRouletteService {

	@Autowired
	IRouletteDao rouletteDao;

	@Override
	public StateResponse findStates() throws GerException {
		return rouletteDao.findStates();
	}

	@Override
	public RouletteResponse createRoulettes() throws GerException {
		return rouletteDao.createRoulettes();
	}

	@Override
	public OpenRouletteResponse openRoulettes(Roulette roulette) throws GerException {
		return rouletteDao.openRoulettes(roulette);
	}

}

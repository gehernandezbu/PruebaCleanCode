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

import com.clean.code.persistence.IRouletteDao;
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
	IRouletteDao rouletteService;

	@Override
	public StateResponse findStates() {

		return rouletteService.findStates();
	}

}

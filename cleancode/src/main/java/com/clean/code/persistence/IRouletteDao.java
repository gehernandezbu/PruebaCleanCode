/*
 * File containing the
 * class code IRouletteDao
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.persistence;

import com.clean.code.response.RouletteResponse;
import com.clean.code.response.StateResponse;

/**
 * Class IRouletteDao
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public interface IRouletteDao {

	public StateResponse findStates();

	public RouletteResponse createRoulettes();

}

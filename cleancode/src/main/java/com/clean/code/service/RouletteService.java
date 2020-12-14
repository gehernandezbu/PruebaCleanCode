/*
 * File containing the
 * class code RouletteService
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clean.code.core.GerException;
import com.clean.code.dto.Roulette;
import com.clean.code.dto.RouletteTx;
import com.clean.code.persistence.IRouletteDao;
import com.clean.code.request.BetRequest;
import com.clean.code.request.CloseRouletteRequest;
import com.clean.code.response.BetResponse;
import com.clean.code.response.CloseRouletteResponse;
import com.clean.code.response.OpenRouletteResponse;
import com.clean.code.response.RouletteResponse;
import com.clean.code.response.RoulettesResponse;
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

	@Override
	public BetResponse betRoulettes(BetRequest betRequest) throws GerException {
		validateColor(betRequest.getColor());
		validateNumber(betRequest.getNumber());
		validateAmount(betRequest.getAmount());
		return rouletteDao.betRoulettes(betRequest);
	}

	@Override
	public RoulettesResponse findAllRoulettes() throws GerException {
		return rouletteDao.findAllRoulettes();
	}

	@Override
	public CloseRouletteResponse closeRoulettes(CloseRouletteRequest request) throws GerException {

		Roulette roulette = new Roulette();
		roulette.setRouletteId(request.getRouletteId());
		List<RouletteTx> list = rouletteDao.findAllTxRoulettes(roulette);
		int winningNumber = getWinningNumber();

		return null;
	}

	private void validateColor(String color) throws GerException {
		if (!(color.equals("NEGRO") || color.equals("ROJO"))) {
			throw new GerException("Los colores válidos para la apuesta son 'NEGRO' ó 'ROJO'", true, null);
		}

	}

	private void validateNumber(int number) throws GerException {
		if (number < 0 || number > 36) {
			throw new GerException("El rango de números válidos para la apuesta es de '0' a '36'", true, null);
		}
	}

	private void validateAmount(Double amount) throws GerException {
		if (amount <= 1 || amount > 10000) {
			throw new GerException(
					"Se debe ingresar un monto válido para la apuesta entre '1,00' y '10.000,00' dólares ", true, null);
		}
	}

	private int getWinningNumber() throws GerException {
		int n = (int) (Math.random() * (37 - 0)) + 0;
		return n;
	}

}

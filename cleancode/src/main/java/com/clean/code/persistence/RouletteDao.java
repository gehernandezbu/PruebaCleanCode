/*
 * File containing the
 * class code RouletteDao
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.clean.code.core.GerException;
import com.clean.code.dto.Roulette;
import com.clean.code.dto.State;
import com.clean.code.response.OpenRouletteResponse;
import com.clean.code.response.RouletteResponse;
import com.clean.code.response.StateResponse;

/**
 * Class RouletteDao
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
@Repository
public class RouletteDao implements IRouletteDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public StateResponse findStates() throws GerException {
		try {

			String sql = "select * from ger.ma_state";
			List<State> listState = jdbcTemplate.query(sql, new BeanPropertyRowMapper<State>(State.class));
			StateResponse response = new StateResponse();
			response.setListStates(listState);
			return response;

		} catch (Exception e) {
			throw new GerException("Ocurrió un error general consultando los estados del sistema.", false, e);
		}

	}

	@Override
	public RouletteResponse createRoulettes() throws GerException {

		try {
			String sql = "insert into ger.ma_roulette (minNumber, maxNumber, stateId) values (?,?,?)";
			jdbcTemplate.update(sql, new Object[] { 0, 36, 2 });
			String sql2 = "select rouletteId from ger.ma_roulette order by 1 desc limit 1";
			List<Roulette> listRoulette = jdbcTemplate.query(sql2, new BeanPropertyRowMapper<Roulette>(Roulette.class));
			RouletteResponse rouletteResponse = new RouletteResponse();
			rouletteResponse.setRouletteId(listRoulette.get(0).getRouletteId());
			return rouletteResponse;

		} catch (Exception e) {
			throw new GerException("Ocurrió un error general creando una ruleta en el sistema.", false, e);
		}

	}

	@Override
	public OpenRouletteResponse openRoulettes(Roulette roulette) throws GerException {
		try {
			String sql = "update ger.ma_roulette set stateId = ? where rouletteId = ?";
			jdbcTemplate.update(sql, new Object[] { 1, roulette.getRouletteId() });
			OpenRouletteResponse response = new OpenRouletteResponse();
			response.setMessage("Se ha realizado la apertura correctamente");
			return response;

		} catch (Exception e) {
			throw new GerException("Ocurrió un error general aperturando la ruleta..", false, e);
		}

	}

}

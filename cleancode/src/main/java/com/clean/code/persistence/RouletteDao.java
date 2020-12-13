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

import com.clean.code.dto.Roulette;
import com.clean.code.dto.State;
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
	public StateResponse findStates() {
		String sql = "select * from ger.ma_state";
		List<State> listState = jdbcTemplate.query(sql, new BeanPropertyRowMapper<State>(State.class));
		StateResponse response = new StateResponse();
		response.setListStates(listState);
		return response;
	}

	@Override
	public RouletteResponse createRoulettes() {

		String sql = "insert into ger.ma_roulette (minNumber, maxNumber, stateId) values (?,?,?)";
		jdbcTemplate.update(sql, new Object[] { 0, 36, 2 });
		String sql2 = "select rouletteId from ger.ma_roulette order by 1 desc limit 1";
		List<Roulette> listRoulette = jdbcTemplate.query(sql2, new BeanPropertyRowMapper<Roulette>(Roulette.class));
		RouletteResponse rouletteResponse = new RouletteResponse();
		rouletteResponse.setRouletteId(listRoulette.get(0).getRouletteId());
		return rouletteResponse;
	}

}

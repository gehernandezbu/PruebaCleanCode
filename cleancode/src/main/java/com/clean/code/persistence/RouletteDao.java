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

import com.clean.code.dto.State;
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

}

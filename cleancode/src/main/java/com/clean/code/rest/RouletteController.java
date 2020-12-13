/*
 * File containing the
 * class code RouletteController
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clean.code.core.BaseController;
import com.clean.code.dto.Roulette;
import com.clean.code.request.BetRequest;
import com.clean.code.request.OpenRouletteRequest;
import com.clean.code.response.BetResponse;
import com.clean.code.response.OpenRouletteResponse;
import com.clean.code.response.RouletteResponse;
import com.clean.code.response.StateResponse;
import com.clean.code.service.IRouletteService;

/**
 * Class RouletteController. Controller to expose the services of a roulette in
 * the system.
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RouletteController extends BaseController {
	@Autowired
	IRouletteService rouletteService;

	@RequestMapping(value = "/v1/states", method = RequestMethod.GET)
	public ResponseEntity<?> findStatus() throws Exception {
		StateResponse stateResponse = rouletteService.findStates();

		return ResponseEntity.status(HttpStatus.OK).body(stateResponse);
	}

	@RequestMapping(value = "/v1/roulettes", method = RequestMethod.POST)
	public ResponseEntity<?> createRoulettes() throws Exception {
		RouletteResponse rouletteResponse = rouletteService.createRoulettes();

		return ResponseEntity.status(HttpStatus.OK).body(rouletteResponse);
	}

	@RequestMapping(value = "/v1/open/roulettes", method = RequestMethod.POST)
	public ResponseEntity<?> openRoulettes(@RequestBody OpenRouletteRequest request) throws Exception {
		Roulette roulette = new Roulette();
		roulette.setRouletteId(request.getStateId());
		OpenRouletteResponse response = rouletteService.openRoulettes(roulette);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@RequestMapping(value = "/v1/bet/roulettes", method = RequestMethod.POST)
	public ResponseEntity<?> betRoulette(@RequestHeader("usuario-id") int id, @RequestBody BetRequest request)
			throws Exception {
		request.setUsuarioId(id);
		BetResponse response = rouletteService.betRoulettes(request);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}

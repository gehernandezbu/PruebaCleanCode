/*
 * File containing the
 * class code BaseController
 * DO NOT MODIFY OR DELETE COPYRIGHT NOTICES OR THIS HEADING FROM THE FILE.
 * This code is proprietary software, you cannot redistribute it and / or 
 * modify it without prior permission.
 * @date 12/12/2020
 */
package com.clean.code.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class BaseController. Base class for application internal user system
 * controllers.
 * 
 * @author Gerardo Hernández.
 * @version 1.0 Creation and documentation of the Class.
 */
public class BaseController {
	/** Referencia a los LOGs del sistema. */
	protected static final Logger LOG = LoggerFactory.getLogger(BaseController.class);

	@ExceptionHandler(GerException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	@ResponseBody
	public BaseResponse validarErrorGmr(GerException ge) {

		LOG.info("***********************************************************************");
		LOG.info("***********************************************************************");
		LOG.error("A controlled error occurred in the system", ge);

		BaseResponse response = new BaseResponse();
		response.setState(false);
		response.setShowMessage(ge.isShowMessage());
		response.setMessage(ge.getMessage());

		return response;

	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public BaseResponse validarErrorExcepion(Exception e) {
		LOG.info("***********************************************************************");
		LOG.info("***********************************************************************");
		LOG.error("An NO controlled error occurred in the system", e);

		BaseResponse response = new BaseResponse();
		response.setState(false);
		response.setShowMessage(false);
		response.setMessage("Ocurrío un error general, por favor comunícate con el admnistrador del sistema");
		return response;
	}

}

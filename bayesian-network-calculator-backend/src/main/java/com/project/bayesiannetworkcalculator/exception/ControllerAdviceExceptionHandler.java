package com.project.bayesiannetworkcalculator.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {
	
	/*	Exception response example
		{
		    "timestamp": "Timestamp of the exception",
		    "status": Status code,
		    "message": "Exception message",
		    "path": "Request URI"
		}
	*/
	
	@ExceptionHandler(ProbabilityCalculatorException.class)
	protected ResponseEntity<ExceptionResponse> handleCategoryException(ProbabilityCalculatorException probabilityCalculatorException, HttpServletRequest httpServletRequest) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setTimestamp(ZonedDateTime.now(ZoneId.of("Z")));
		exceptionResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		exceptionResponse.setMessage(probabilityCalculatorException.getMessage());
		exceptionResponse.setPath(httpServletRequest.getRequestURI());
		
		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
}

package com.project.bayesiannetworkcalculator.exception;

public class ProbabilityCalculatorException extends RuntimeException {

	private static final long serialVersionUID = -4632687163063491177L;
	
	public ProbabilityCalculatorException() {}
	
	public ProbabilityCalculatorException(String message) {
		super(message);
	}
	
	public ProbabilityCalculatorException(Throwable cause) {
		super(cause);
	}
	
	public ProbabilityCalculatorException(String message, Throwable cause) {
		super(message, cause);
	}
	
}

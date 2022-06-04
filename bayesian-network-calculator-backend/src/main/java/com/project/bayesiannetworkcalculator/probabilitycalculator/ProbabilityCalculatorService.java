package com.project.bayesiannetworkcalculator.probabilitycalculator;

import java.util.List;

public interface ProbabilityCalculatorService {

	List<ProbabilityCalculatorResultDTO> calculateProbability(ProbabilityCalculatorDTO probabilityCalculatorDTO) throws Exception;
	
}

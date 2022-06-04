package com.project.bayesiannetworkcalculator.probabilitycalculator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bayesiannetworkcalculator.exception.ProbabilityCalculatorException;

@RestController
@RequestMapping("/calculator")
class ProbabilityCalculatorController {
	
	private final ProbabilityCalculatorService probabilityCalculatorService;
	
	@Autowired
	public ProbabilityCalculatorController(ProbabilityCalculatorService probabilityCalculatorService) {
		this.probabilityCalculatorService = probabilityCalculatorService;
	}
	
	@PostMapping(value = "/calculate",
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProbabilityCalculatorResultDTO>> calculateProbability
		(@RequestBody ProbabilityCalculatorDTO probabilityCalculatorDTO) {
		try {
			return new ResponseEntity<List<ProbabilityCalculatorResultDTO>>(probabilityCalculatorService.calculateProbability(probabilityCalculatorDTO),
					HttpStatus.OK);
		} catch (Exception e) {
			throw new ProbabilityCalculatorException("Internal server error: " + e.getMessage());
		}
	}
	
}

package com.project.bayesiannetworkcalculator.weakness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weakness")
class WeaknessController {

	private final WeaknessService weaknessService;

	@Autowired
	public WeaknessController(WeaknessService weaknessService) {
		this.weaknessService = weaknessService;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Weakness>> findAll() {
		return new ResponseEntity<List<Weakness>>(weaknessService.findAll(), HttpStatus.OK);
	}
	
}

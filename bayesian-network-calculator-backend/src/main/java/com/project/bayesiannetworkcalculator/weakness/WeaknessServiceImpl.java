package com.project.bayesiannetworkcalculator.weakness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaknessServiceImpl implements WeaknessService {

	private final WeaknessRepository weaknessRepository;
	
	@Autowired	
	public WeaknessServiceImpl(WeaknessRepository weaknessRepository) {
		this.weaknessRepository = weaknessRepository;
	}

	@Override
	public List<Weakness> findAll() {
		return weaknessRepository.findAll();
	}

}

package com.project.bayesiannetworkcalculator.attack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttackServiceImpl implements AttackService {
	
	private final AttackRepository attackRepository;
	
	@Autowired
	public AttackServiceImpl(AttackRepository attackRepository) {
		this.attackRepository = attackRepository;
	}

	@Override
	public List<Attack> findAll() {
		return attackRepository.findAll();
	}

}

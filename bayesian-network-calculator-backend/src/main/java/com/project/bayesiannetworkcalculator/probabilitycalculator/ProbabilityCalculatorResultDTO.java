package com.project.bayesiannetworkcalculator.probabilitycalculator;

public class ProbabilityCalculatorResultDTO {

	private String attackName;
	private Float probability;
	
	public ProbabilityCalculatorResultDTO() {}

	public ProbabilityCalculatorResultDTO(String attackName, Float probability) {
		this.attackName = attackName;
		this.probability = probability;
	}

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}

	public Float getProbability() {
		return probability;
	}

	public void setProbability(Float probability) {
		this.probability = probability;
	}
	
}

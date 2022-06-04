package com.project.bayesiannetworkcalculator.probabilitycalculator;

import java.util.List;

public class ProbabilityCalculatorDTO {

	private String maintenance;
	private String manufacturer;
	private String localAccess;
	private String hardware;
	private String firewallConfiguration;
	private String passwordStrength;
	private List<String> selectedWeaknesses;
	
	public ProbabilityCalculatorDTO() {}

	public ProbabilityCalculatorDTO(String maintenance, String manufacturer, String localAccess, String hardware,
			String firewallConfiguration, String passwordStrength, List<String> selectedWeaknesses) {
		this.maintenance = maintenance;
		this.manufacturer = manufacturer;
		this.localAccess = localAccess;
		this.hardware = hardware;
		this.firewallConfiguration = firewallConfiguration;
		this.passwordStrength = passwordStrength;
		this.selectedWeaknesses = selectedWeaknesses;
	}

	public String getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getLocalAccess() {
		return localAccess;
	}

	public void setLocalAccess(String localAccess) {
		this.localAccess = localAccess;
	}

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public String getFirewallConfiguration() {
		return firewallConfiguration;
	}

	public void setFirewallConfiguration(String firewallConfiguration) {
		this.firewallConfiguration = firewallConfiguration;
	}

	public String getPasswordStrength() {
		return passwordStrength;
	}

	public void setPasswordStrength(String passwordStrength) {
		this.passwordStrength = passwordStrength;
	}

	public List<String> getSelectedWeaknesses() {
		return selectedWeaknesses;
	}

	public void setSelectedWeaknesses(List<String> selectedWeaknesses) {
		this.selectedWeaknesses = selectedWeaknesses;
	}
	
}

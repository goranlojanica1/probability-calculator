package com.project.bayesiannetworkcalculator.probabilitycalculator;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import unbbayes.io.NetIO;
import unbbayes.prs.Node;
import unbbayes.prs.bn.JunctionTreeAlgorithm;
import unbbayes.prs.bn.ProbabilisticNetwork;
import unbbayes.prs.bn.ProbabilisticNode;

@Service
public class ProbabilityCalculatorServiceImpl implements ProbabilityCalculatorService {

	@Override
	public List<ProbabilityCalculatorResultDTO> calculateProbability(ProbabilityCalculatorDTO probabilityCalculatorDTO) throws Exception {
		ProbabilisticNetwork probabilisticNetwork = (ProbabilisticNetwork) new NetIO().load(new File("src/main/resources/hardware_attacks_network.net"));
		
		JunctionTreeAlgorithm junctionTreeAlgorithm = new JunctionTreeAlgorithm();
		junctionTreeAlgorithm.setNetwork(probabilisticNetwork);
		junctionTreeAlgorithm.run();
		
		ProbabilisticNode maintenanceNode = (ProbabilisticNode) probabilisticNetwork.getNode("Maintenance");
		ProbabilisticNode manufacturerNode = (ProbabilisticNode) probabilisticNetwork.getNode("Manufacturer");
		ProbabilisticNode localAccessNode = (ProbabilisticNode) probabilisticNetwork.getNode("Local_access");
		ProbabilisticNode hardwareNode = (ProbabilisticNode) probabilisticNetwork.getNode("Hardware");
		ProbabilisticNode firewallConfigurationNode = (ProbabilisticNode) probabilisticNetwork.getNode("Firewall_configuration");
		ProbabilisticNode passwordStrengthNode = (ProbabilisticNode) probabilisticNetwork.getNode("Passwords");
		
		switch (probabilityCalculatorDTO.getMaintenance()) {
		case "Regularly":
			maintenanceNode.addFinding(0);
			break;
		case "Rarely":
			maintenanceNode.addFinding(1);
			break;
		default:
			break;
		}
		
		switch (probabilityCalculatorDTO.getManufacturer()) {
		case "Trusted":
			manufacturerNode.addFinding(0);
			break;
		case "Suspicious":
			manufacturerNode.addFinding(1);
			break;
		default:
			break;
		}
		
		switch (probabilityCalculatorDTO.getLocalAccess()) {
		case "Protected":
			localAccessNode.addFinding(0);
			break;
		case "Unprotected":
			localAccessNode.addFinding(1);
			break;
		default:
			break;
		}
		
		switch (probabilityCalculatorDTO.getHardware()) {
		case "Modern":
			hardwareNode.addFinding(0);
			break;
		case "Outdated":
			hardwareNode.addFinding(1);
			break;
		default:
			break;
		}
		
		switch (probabilityCalculatorDTO.getFirewallConfiguration()) {
		case "Good":
			firewallConfigurationNode.addFinding(0);
			break;
		case "Poor":
			firewallConfigurationNode.addFinding(1);
			break;
		default:
			break;
		}
		
		switch (probabilityCalculatorDTO.getPasswordStrength()) {
		case "Strong":
			passwordStrengthNode.addFinding(0);
			break;
		case "Weak or default":
			passwordStrengthNode.addFinding(1);
			break;
		default:
			break;
		}
		
		for (String weakness : probabilityCalculatorDTO.getSelectedWeaknesses()) {
			ProbabilisticNode weaknessNode = (ProbabilisticNode) probabilisticNetwork.getNode(weakness.replaceAll("[ -]", "_"));
			weaknessNode.addFinding(0);
		}
		
		probabilisticNetwork.updateEvidences();
		
		List<ProbabilityCalculatorResultDTO> results = new ArrayList<ProbabilityCalculatorResultDTO>();
		for (Node node : probabilisticNetwork.getNodes()) {
			if (node.getStateAt(0).equals("Can happen")) {
				results.add(new ProbabilityCalculatorResultDTO(node.getName().replace("_", " "), ((ProbabilisticNode) node).getMarginalAt(0)));
			}
		}
		
		results.sort(Comparator.comparing(ProbabilityCalculatorResultDTO::getProbability).reversed());
		
		List<ProbabilityCalculatorResultDTO> topResults = new ArrayList<ProbabilityCalculatorResultDTO>();
		for (int i = 0; i < 10; i++) {
			topResults.add(results.get(i));
		}
		
		return topResults;
	}

}

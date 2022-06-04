package com.project.bayesiannetworkcalculator.attack;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.project.bayesiannetworkcalculator.weakness.Weakness;

@Entity
public class Attack {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "attack_weaknesses",
			joinColumns = @JoinColumn(name = "attack_id"),
			inverseJoinColumns = @JoinColumn(name = "weakness_id"))
	private List<Weakness> weaknesses;
	
	protected Attack() {}

	public Attack(String name, List<Weakness> weaknesses) {
		this.name = name;
		this.weaknesses = weaknesses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Weakness> getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(List<Weakness> weaknesses) {
		this.weaknesses = weaknesses;
	}
	
}

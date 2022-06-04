package com.project.bayesiannetworkcalculator.weakness;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaknessRepository extends JpaRepository<Weakness, Integer> {

}

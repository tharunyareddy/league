package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Fixtures;

@Repository
public interface IFeaturesRepository extends JpaRepository<Fixtures, Integer> {
	
}

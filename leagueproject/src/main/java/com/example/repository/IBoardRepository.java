package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Board;

@Repository
public interface IBoardRepository extends JpaRepository<Board, Integer> {

	

	
	
}

package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.model.League;
import com.example.model.LeagueView;

@Repository
public interface ILeagueRepository extends JpaRepository<League, Integer> {

	//reading from a view
	
	@Query(value = "select * from leagueview",nativeQuery =true)
	List<LeagueView> getLeagueDetails();
//	
	@Procedure
	Integer GET_LEAGUE_COUNT(String country);
	
//	@Procedure(procedureName = "GET_LEAGUE_COUNT")
//	Integer getLeagueCount(String country);
	
	//using named query
	@Query(name="findByBoard")
	List<League> getLeagueByBoard(String name);
}

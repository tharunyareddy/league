package com.example.service;

import java.util.List;

import com.example.model.League;
import com.example.model.LeagueView;

public interface ILeagueService {
	
	League addLeague(League league);
	void updateLeague(League league);
	void deleteLeague(int leagueId);
	League getById(int leagueId);
	List<League> getAllLeague();
	
	//view
	List<LeagueView> getLeagueDeatils();
	Integer getLeagueCount(String country);
	
	List<League> getLeagueByBoard(String name);
}

package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.League;
import com.example.model.LeagueView;
import com.example.repository.ILeagueRepository;

@Service
public class LeagueServiceImpl implements ILeagueService {

	@Autowired
	ILeagueRepository iLeagueRepository;
	
	@Override
	public League addLeague(League league) {
		return iLeagueRepository.save(league);
	}

	@Override
	public void updateLeague(League league) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeague(int leagueId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public League getById(int leagueId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<League> getAllLeague() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LeagueView> getLeagueDeatils() {

		return iLeagueRepository.getLeagueDetails();
	}

	@Override
	public Integer getLeagueCount(String country) {
		return iLeagueRepository.GET_LEAGUE_COUNT(country);
	}

	@Override
	public List<League> getLeagueByBoard(String name) {
		return iLeagueRepository.getLeagueByBoard(name);
	}

}

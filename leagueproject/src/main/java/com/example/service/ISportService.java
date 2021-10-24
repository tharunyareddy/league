package com.example.service;

import java.util.List;

import com.example.model.LeagueView;
import com.example.model.Sports;
import com.example.model.SportView;
public interface ISportService {

	

	Sports addSport(Sports sports);	
	List<Sports> getAll();
	
	//view
	
	List<SportView> getSportsDeatils();
    
	

}

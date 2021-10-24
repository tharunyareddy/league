package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Sports;
import com.example.model.SportView;
import com.example.repository.ISportRepository;

@Service
public class SportServiceImpl implements ISportService {

	@Autowired
	ISportRepository iSportRepository;

	@Override
	public Sports addSport(Sports sports) {
				return  iSportRepository.save(sports);
	}

	@Override
	public List<Sports> getAll() {
		return  iSportRepository.findAll();
	}

	@Override
	public List<SportView> getSportsDeatils() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<SportView> getSportsDeatils() {
//		return iSportRepository.getSportDetails();
//	}
	
	
}

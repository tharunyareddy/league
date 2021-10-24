package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.model.Fixtures;

public class FeaturesServiceImpl implements IFeaturesService {

	@Autowired
	IFeaturesService iFeaturesService;

	@Override
	public Fixtures addFeatures(Fixtures features) {
	
		return iFeaturesService.addFeatures(features);
	}
	
	


}

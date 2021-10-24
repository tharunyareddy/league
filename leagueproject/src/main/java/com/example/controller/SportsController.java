package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Sports;
import com.example.service.ISportService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class SportsController {

	@Autowired
	ISportService sportService;
	
	@GetMapping("/sports")
	public List<Sports> getAll() {
		return sportService.getAll();
	}

}

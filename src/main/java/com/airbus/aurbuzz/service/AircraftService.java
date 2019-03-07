package com.airbus.aurbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbus.aurbuzz.model.City;
import com.airbus.aurbuzz.repository.AircraftRepository;
import com.airbus.aurbuzz.model.Aircraft;

@Service
public class AircraftService {

	@Autowired
	private AircraftRepository aircraftRepository;
	
	public List<Aircraft> getAllFlight() {
		
		return null;
	}

	public List<Aircraft> findByDate(String date) {
	
		return null;
	}

	public List<Aircraft> getAllFlightBySrc(City dest) {
		
		return null;
	}
	
	public List<Aircraft> getAllFlightByDest(City src) {
		
		return null;
	}

	public List<Aircraft> getAllFlightBySrcDest(String src, String dest) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.airbus.aurbuzz.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airbus.aurbuzz.model.City;
import com.airbus.aurbuzz.model.Aircraft;
import com.airbus.aurbuzz.service.AircraftService;


@RestController
public class FlightController {
	@Autowired
	private AircraftService AircraftService;
	
	@RequestMapping("/aircrafts")
	public String getAllFlights() {
		return "hi";
	}
	
	@RequestMapping("/aircraft")
	public List<Aircraft> getAllFlight() {
		return AircraftService.getAllFlight();
	}
	
	@RequestMapping("/flight/{date}")
	public List<Aircraft> findByDate(@PathVariable("date") String date) {
		return AircraftService.findByDate(date);
	}
	
	
	@RequestMapping("/flight/{src}")
	public List<Aircraft> getAllFlightBySrc(@PathVariable("src") City src){
		return AircraftService.getAllFlightBySrc(src);
	}
	@RequestMapping("/flight/{dest}")
	public List<Aircraft> getAllFlightByDest(@PathVariable("dest") City dest){
		return AircraftService.getAllFlightByDest(dest);
	}
	
	@RequestMapping("/flight/{src}/{dest}")
	public List<Aircraft> getAllFlightBySrcDest(@PathVariable("src") String src, @PathVariable("dest") String dest){
		return AircraftService.getAllFlightBySrcDest(src, dest);
	}
	
	
//	@RequestMapping(method = RequestMethod.POST, value = "/flights")
//	public void addUser(@RequestBody Flight user) {
//		flightService.addUser(user);
//	}
	
//	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
//	public void updateUserById(@RequestBody Flight user, @PathVariable String id) {
//		System.out.println("update: " + user.getName() + " / " + id);
//		flightService.updateUserById(user, id);
//	}
	
//	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
//	public void deleteUserById(@PathVariable String id) {
//		service.deleteUserById(id);
//	}
	
	
//	@RequestMapping(method = RequestMethod.DELETE, value = "/users")
//	public void deleteAllUser() {
//		flightService.deleteUserById();
//	}
	
}

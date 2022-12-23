package com.cdac.Springbootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
	
@Autowired
private FlightService flightService;
	
	@GetMapping("/all-flights")
	public List<Flight> getAll()
	{
		return flightService.getAvailableFlights();
	}
	
	@GetMapping("/flights-route")
	public List<Flight> getFlights(@RequestParam("source")String source, @RequestParam("destination") String destination) {
		return flightService.getAvailableFlights(source, destination);
		
	}
		@PostMapping("/add-flight")
		public String addFlight(@RequestBody Flight flight) {
			flightService.addFlight(flight, 30);
			return "Flight added!";
			
		}

}

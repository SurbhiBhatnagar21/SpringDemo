package com.cdac.Springbootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public void addFlight(Flight flight,int noOfDays) {
		for (int i=0;i<noOfDays;i++) {
			Flight f= new Flight();
			f.setCarrier(f.getCarrier());
			f.setSource(flight.getSource());
			f.setDestination(flight.getDestination());
			f.setDepartureTime(flight.getDepartureTime());
			f.setArrivalTime(flight.getArrivalTime());
			f.setFlightDate(flight.getFlightDate());
			
			flightRepository.save(f);
	 	}
	}
	public List<Flight>getAvailableFlights(){
			return flightRepository.findAll();
		
		
	}
	
	public List<Flight>getAvailableFlights(String source,String destination)
	{
 return flightRepository.findAvailableFlights(source,destination);
}
}

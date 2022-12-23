package com.cdac.Springbootdemo;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Autowired
	private FlightRepository flightRepository;
	
	@Test
	void addFlight(){
		Flight f=new Flight();
		f.setCarrier("Vistara");
		f.setSource("Mumbai");
		f.setDestination("Delhi");
		f.setDepartureTime(LocalTime.of(10,20));
		f.setArrivalTime(LocalTime.of(12,20));
		f.setFlightDate(LocalDate.of(2022, 12, 25));
	
		flightRepository.save(f);
	}

}

package com.cdac.Springbootdemo;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="tbl_flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int flightno;
	private String carrier;
	private String source;
	private String destination;
	private LocalTime DepartureTime;
	private LocalTime ArrivalTime;
	private LocalDate flightDate;
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		DepartureTime = departureTime;
	}
	public LocalTime getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public LocalDate getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}
	
	
}

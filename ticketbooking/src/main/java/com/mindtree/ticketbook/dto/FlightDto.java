package com.mindtree.ticketbook.dto;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.mindtree.ticketbook.entity.Passenger;

public class FlightDto {
	private int flightID;
	private String fightName;
	private String Source;
	private String Destination;
	private int Distance;

	private Set<PassengerDto> passangers;

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getFightName() {
		return fightName;
	}

	public void setFightName(String fightName) {
		this.fightName = fightName;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getDistance() {
		return Distance;
	}

	public void setDistance(int distance) {
		Distance = distance;
	}

	public Set<PassengerDto> getPassangers() {
		return passangers;
	}

	public void setPassangers(Set<PassengerDto> passangers) {
		this.passangers = passangers;
	}

	
}

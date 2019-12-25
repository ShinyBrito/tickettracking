package com.mindtree.ticketbook.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightID;
	private String fightName;
	private String Source;
	private String Destination;
	private int Distance;
	@OneToMany(mappedBy = "flights")
	private Set<Passenger> passangers;
	

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

	public Set<Passenger> getPassangers() {
		return passangers;
	}

	public void setPassangers(Set<Passenger> passangers) {
		this.passangers = passangers;
	}


}

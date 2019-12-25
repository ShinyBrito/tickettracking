package com.mindtree.ticketbook.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passangerID;
	private String passangerName;
	private Date travelDate;
	private String Hobby;
	private String foodType;
	private int flightPrice;
	@ManyToOne
	private Flight flights;

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flights) {
		this.flights = flights;
	}

	public int getPassangerID() {
		return passangerID;
	}

	public void setPassangerID(int passangerID) {
		this.passangerID = passangerID;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getHobby() {
		return Hobby;
	}

	public void setHobby(String hobby) {
		Hobby = hobby;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(int flightPrice) {
		this.flightPrice = flightPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Hobby == null) ? 0 : Hobby.hashCode());
		result = prime * result + flightPrice;
		result = prime * result + ((flights == null) ? 0 : flights.hashCode());
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + passangerID;
		result = prime * result + ((passangerName == null) ? 0 : passangerName.hashCode());
		result = prime * result + ((travelDate == null) ? 0 : travelDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (Hobby == null) {
			if (other.Hobby != null)
				return false;
		} else if (!Hobby.equals(other.Hobby))
			return false;
		if (flightPrice != other.flightPrice)
			return false;
		if (flights == null) {
			if (other.flights != null)
				return false;
		} else if (!flights.equals(other.flights))
			return false;
		if (foodType == null) {
			if (other.foodType != null)
				return false;
		} else if (!foodType.equals(other.foodType))
			return false;
		if (passangerID != other.passangerID)
			return false;
		if (passangerName == null) {
			if (other.passangerName != null)
				return false;
		} else if (!passangerName.equals(other.passangerName))
			return false;
		if (travelDate == null) {
			if (other.travelDate != null)
				return false;
		} else if (!travelDate.equals(other.travelDate))
			return false;
		return true;
	}

}

package com.mindtree.ticketbook.service;

import java.util.Set;

import com.mindtree.ticketbook.dto.FlightDto;
import com.mindtree.ticketbook.dto.PassengerDto;

public interface FlightService {

	String storeFlightDetails(FlightDto flight);

	Set<FlightDto> getAllFlights();

	int bookTicket(int flightID, PassengerDto passanger);

	Set<PassengerDto> getAllPassangerDetails(String fightName);

	PassengerDto update(int passangerID);

	String updateData(PassengerDto passanger, int passangerID);

}

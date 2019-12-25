package com.mindtree.ticketbook.service.serviceimpl;

import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ticketbook.dto.FlightDto;
import com.mindtree.ticketbook.dto.PassengerDto;
import com.mindtree.ticketbook.entity.Flight;
import com.mindtree.ticketbook.entity.Passenger;
import com.mindtree.ticketbook.repository.FlightRepository;
import com.mindtree.ticketbook.repository.TravellerRepository;
import com.mindtree.ticketbook.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {
	ModelMapper mapper = new ModelMapper();
	@Autowired
	private FlightRepository fightRepository;
	@Autowired
	private TravellerRepository travellerRepository;

	@Override
	public String storeFlightDetails(FlightDto flight) {
		fightRepository.save(mapper.map(flight, Flight.class));
		return "";
	}

	@Override
	public Set<FlightDto> getAllFlights() {
		return fightRepository.findAll().parallelStream().map(flight -> mapper.map(flight, FlightDto.class))
				.collect(Collectors.toSet());
	}

	@Override
	public int bookTicket(int flightID, PassengerDto passanger) {
		Flight flight = fightRepository.findById(flightID).get();
		passanger.setFlightPrice(flight.getDistance() * 50);
		passanger.setFlights(mapper.map(flight, FlightDto.class));

		travellerRepository.save(mapper.map(passanger, Passenger.class));
		return flight.getDistance() * 50;
	}

	@Override
	public Set<PassengerDto> getAllPassangerDetails(String fightName) {
		Flight flight = fightRepository.findByfightName(fightName);
		return flight.getPassangers().stream().map(passanger -> mapper.map(passanger, PassengerDto.class))
				.collect(Collectors.toSet());
	}

	@Override
	public PassengerDto update(int passangerID) {
		return mapper.map(travellerRepository.findById(passangerID).get(), PassengerDto.class);
	}

	@Override
	public String updateData(PassengerDto passanger, int passangerID) {
		Passenger passanger1 = travellerRepository.findById(passangerID).get();
		passanger1.setTravelDate(passanger.getTravelDate());
		passanger1.setFoodType(passanger.getFoodType());
		passanger1.setHobby(passanger.getHobby());
		travellerRepository.save(passanger1);
		return "";
	}

}

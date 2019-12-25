package com.mindtree.ticketbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.ticketbook.dto.FlightDto;
import com.mindtree.ticketbook.dto.PassengerDto;
import com.mindtree.ticketbook.entity.Flight;
import com.mindtree.ticketbook.entity.Passenger;
import com.mindtree.ticketbook.service.FlightService;

@Controller
public class FlightController {
	@Autowired
	private FlightService flightService;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/flight")
	public String flight(Model m) {
		m.addAttribute("command", new FlightDto());
		return "flight";
	}

	@PostMapping("/flights")
	public String storeFlightDetails(Model m, FlightDto flight) {
		flightService.storeFlightDetails(flight);
		m.addAttribute("command", new FlightDto());
		return "flight";
	}

	@GetMapping("/booking")
	public String bookingForm(Model m) {
		m.addAttribute("command", new PassengerDto());
		m.addAttribute("flights", flightService.getAllFlights());
		return "passanger";

	}

	@PostMapping("/passanger")
	public String bookTicket(PassengerDto passanger, @RequestParam("flightID") int flightID, Model m) {

		int price = flightService.bookTicket(flightID, passanger);
		m.addAttribute("command", new PassengerDto());
		m.addAttribute("flights", flightService.getAllFlights());
		m.addAttribute("price", price);
		return "sucess";

	}

	@GetMapping("/view")
	public String getFlightDetails(Model m) {
		return "details";

	}

	@RequestMapping("/details")
	public String getPassangersDetails(Model m, @RequestParam("fightName") String fightName) {
		m.addAttribute("passengers", flightService.getAllPassangerDetails(fightName));
		return "details";
	}

	@GetMapping("/update/{passangerID}")
	public String update(@PathVariable int passangerID, Model m) {
		m.addAttribute("passanger", flightService.update(passangerID));
		m.addAttribute("command", new PassengerDto());
		return "update";

	}

	@PostMapping("/updatetraveldate/{passangerID}")
	public String updateData(PassengerDto passanger,@PathVariable int passangerID) {
		flightService.updateData(passanger,passangerID);
		
		return "index";

	}

}

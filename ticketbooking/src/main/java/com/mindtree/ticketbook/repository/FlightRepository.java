package com.mindtree.ticketbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ticketbook.entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

	Flight findByfightName(String fightName);

}

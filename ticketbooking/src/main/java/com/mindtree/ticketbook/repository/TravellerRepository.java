package com.mindtree.ticketbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ticketbook.entity.Passenger;
@Repository
public interface TravellerRepository extends JpaRepository<Passenger, Integer>{

}

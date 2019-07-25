package com.mjnari.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjnari.flightreservation.models.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}

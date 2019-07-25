package com.mjnari.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjnari.flightreservation.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}

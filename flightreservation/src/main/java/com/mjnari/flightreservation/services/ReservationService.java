package com.mjnari.flightreservation.services;

import com.mjnari.flightreservation.dto.ReservationRequest;
import com.mjnari.flightreservation.models.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}

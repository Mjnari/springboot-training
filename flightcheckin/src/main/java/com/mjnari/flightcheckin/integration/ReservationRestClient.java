package com.mjnari.flightcheckin.integration;

import com.mjnari.flightcheckin.integration.dto.Reservation;
import com.mjnari.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}

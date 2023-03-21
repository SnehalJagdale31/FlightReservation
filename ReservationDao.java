package com.snera.flightReservation.dao;

import com.snera.flightReservation.model.Reservation;

public interface ReservationDao {
	
	Reservation bookFlight(Reservation reservation);
	Reservation checkIn(long reservationId, int noOfBags);
	

}

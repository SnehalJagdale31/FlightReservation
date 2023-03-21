package com.snera.flightReservation.dao;

import java.util.HashMap;

import com.snera.flightReservation.model.Flight;
import com.snera.flightReservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {
	
	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;
	
	public ReservationDaoImpl() {
		
		reservations = new HashMap<>();
		flights = new HashMap<>();
		Flight flight1 = new Flight();
		
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("Indian");
		flight1.setDepartureCity("Pune");
		flight1.setArrivalCity("Mumbai");
		flight1.setDateAndTimeOfDeparture("3/22/2023 3:00AM");
		
		flights.put(flight1.getId(), flight1);
		
		
Flight flight2 = new Flight();
		
		flight2.setId(2l);
		flight2.setFlightNumber("987");
		flight2.setOperatingAirlines("Japanese");
		flight2.setDepartureCity("Tokyo");
		flight2.setArrivalCity("Osaka");
		flight2.setDateAndTimeOfDeparture("6/22/2023 5:00AM");
		
		flights.put(flight2.getId(), flight2);
		
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId+1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {

		Reservation reservation =reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		
		return reservation;

	}
	

}

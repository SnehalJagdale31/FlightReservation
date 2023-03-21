package com.snera.flightReservation.test;

import com.snera.flightReservation.dao.ReservationDao;
import com.snera.flightReservation.dao.ReservationDaoImpl;
import com.snera.flightReservation.model.Passenger;
import com.snera.flightReservation.model.Reservation;

public class Test {

	public static void main(String[] args) {

		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("Raju");
		passenger.setMiddleName("Balu");
		passenger.setMiddleName("Nichit");
		passenger.setEmail("raju@nichit.com");
		
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		
		Reservation savedeReservation = dao.bookFlight(reservation);
		System.out.println(savedeReservation);
		
		Reservation checkedInReservation = dao.checkIn(savedeReservation.getId(), 2);
		System.out.println(checkedInReservation);
			
			
		
	}

}

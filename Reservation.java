package com.snera.flightReservation.model;

public class Reservation extends AbstarctModel{
	
	private Passenger passenger;
	private Flight flight;
	private long flightId;
	private int noOfBags;
	private boolean checkedIn;
	
	
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	
	
	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [passenger=" + passenger + ", flight=" + flight + ", flightId=" + flightId + ", noOfBags="
				+ noOfBags + ", checkedIn=" + checkedIn + "]";
	}
	
		

}

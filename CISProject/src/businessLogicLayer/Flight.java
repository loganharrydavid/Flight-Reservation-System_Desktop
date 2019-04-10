package businessLogicLayer;


import java.util.ArrayList;

public class Flight implements Comparable<Flight> {
	
	private int flightNumber;
	private String departureCity;
	private String destinationCity;
	private String departTime;
	private String arriveTime;
	private String flightDate;
	private ArrayList<Account> passengers;
	private int numberOfSeats;
	
	public Flight() {

	}

	public Flight(String departureCity, String destinationCity, String departTime, String arriveTime, String flightDate,
			int flightNumber,int numberOfSeats) {
		
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.departTime = departTime;
		this.arriveTime = arriveTime;
		this.flightDate = flightDate;
		this.numberOfSeats = numberOfSeats;

	}
	
	public ArrayList<Account> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Account> passengers) {
		this.passengers = passengers;
	}
	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public void bookFlight(){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
	}

	@Override
	public String toString() {
		return "\nFlight number: " + this.getFlightNumber() + "\nDeparture time: " + this.getDepartTime()
				+ "\nDeparture City: " + this.getDepartureCity() + "\nDestination City: " + this.getDestinationCity();
	}

	@Override
	public int compareTo(Flight f) {
		if (flightNumber == f.flightNumber) {
			return 0;
		} else
			return -1;
	}

}

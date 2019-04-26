package businessLogicLayer;

import java.util.ArrayList;
import businessLogicLayer.Account;
import java.util.Random;

public class Flight implements Comparable<Flight> {
	
	private int flightNumber;
	private String departureCity;
	private String destinationCity;
	private String departTime;
	private String arriveTime;
	private String flightDate;
	private ArrayList <Account> passengers = new ArrayList<>();
	private int numberOfSeats;
	
	public Flight() {

	}
		//Creates a flight and sets a random flight number
	public Flight(String departureCity, String destinationCity, String departTime, String arriveTime, 
			String flightDate,int numberOfSeats) {
		
		setFlightNumber();
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.departTime = departTime;
		this.arriveTime = arriveTime;
		this.flightDate = flightDate;
		this.numberOfSeats = numberOfSeats;

	}
	//called from GUI to create flight object and insert to database
	public static void generateFlight() {
		
		
	}
	
	public String getPassengers(ArrayList<Account> passengers) {
		
		
		String toPrint = "";
		
		for (int i = 0; i < passengers.size(); i++ ) {
			
			Account account = passengers.get(i);
			
			toPrint += account.toString();
			
		}
			
		return toPrint;
	}
	public void setFlightNumber() {
		
		Random rand = new Random();
		
		int ID = rand.nextInt(9999);

		this.flightNumber = ID;
	}
	
	public void bookFlight(Account account) {
		
		if(this.getNumberOfSeats() > 0) {
		this.passengers.add(account);
		}
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

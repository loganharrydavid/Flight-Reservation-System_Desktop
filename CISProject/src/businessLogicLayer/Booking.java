package businessLogicLayer;


public class Booking {
	
	private int ticketNumber;
	private int account_id;
	private int flight_number;
	private int numberOfPassengers;
		

public Booking() {
	
}
public Booking(int ticketNumber, int acctID, int flightNum) {
	
	this.ticketNumber = ticketNumber;
	this.account_id = acctID;
	this.flight_number = flightNum;
	
	
}

public int getAccount_id() {
	return account_id;
}
public void setAccount_id(int account_id) {
	this.account_id = account_id;
}
public int getFlight_number() {
	return flight_number;
}
public void setFlight_number(int flight_number) {
	this.flight_number = flight_number;
}
public int getTicketNumber() {
	return ticketNumber;
}
public void setTicketNumber(int ticketNumber) {
	this.ticketNumber = ticketNumber;
}
public int getNumberOfPassengers() {
	return numberOfPassengers;
}
public void setNumberOfPassengers(int numberOfPassengers) {
	this.numberOfPassengers = numberOfPassengers;
}
}
package businessLogicLayer;

import java.util.ArrayList;

public class booking {
	
	private int ticketNumber;
	private Flight flight;
	private ArrayList<String>account_id = new ArrayList<>();
	
public booking() {
	
}
public booking(int ticketNumber, Flight flight) {
	
	this.ticketNumber = ticketNumber;
	this.flight = flight;
	
	
	
}
public int getTicketNumber() {
	return ticketNumber;
}
public void setTicketNumber(int ticketNumber) {
	this.ticketNumber = ticketNumber;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public ArrayList<String> getAccount_id() {
	return account_id;
}
public void setAccount_id(ArrayList<String> account_id) {
	this.account_id = account_id;
}
}

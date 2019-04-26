package businessLogicLayer;

import java.util.Random;

public class Booking {

	private int ticketNumber;
	private int account_id;
	private int flight_number;
	private String flight_date;
	private String flight_time;

	public Booking() {

	}

	public Booking(int acctID, int flightNum) {

		setTicketNumber();
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

	public void setTicketNumber() {

		Random rand = new Random();

		int tkn = rand.nextInt(999);

		this.ticketNumber = tkn;
	}

	public String getFlight_date() {
		return flight_date;
	}

	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}

	public String getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}
}
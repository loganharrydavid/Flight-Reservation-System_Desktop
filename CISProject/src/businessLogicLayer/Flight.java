package businessLogicLayer;

public class Flight implements Comparable<Flight> {

	private String departureCity;
	private String destinationCity;
	private String departTime;
	private String arriveTime;
	private String flightDate;
	private int flightNumber;
	private int numberOfSeats;

	public Flight() {

	}

	public Flight(String departureCity, String destinationCity, String departTime, String arriveTime, String flightDate,
			int flightNumber, int numberOfSeats) {
		
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.departTime = departTime;
		this.arriveTime = arriveTime;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.numberOfSeats = numberOfSeats;

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
	public int compareTo(Flight f) {
		if(flightNumber == f.flightNumber) {
			return -1;
		}else
		return 0;
	}

}

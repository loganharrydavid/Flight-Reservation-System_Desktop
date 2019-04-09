package businessLogicLayer;


import java.util.ArrayList;

public class Account implements Comparable<Account> {
	
	private String firstName;
	private String lastName;
	private UserLogin login;
	private String address;
	private String email;
	private String state;
	private int zipCode;
	private int ssn;
	private ArrayList<Flight> flights;

	public Account() {
		
	}

	public Account(UserLogin login, String firstname, String lastName, String address, String email,
			String State, int zipCode, int ssn) {
		
		this.firstName = firstname;
		this.lastName = lastName;
		this.login = login;
		this.address = address;
		this.email = email;
		this.state = State;
		this.zipCode = zipCode;
		this.ssn = ssn;
		
	}
	public UserLogin getLogin() {
		return login;
	}

	public void setLogin(UserLogin login) {
		this.login = login;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	
	@Override
	public String toString() {
		return "\nFirst name " + this.getFirstName() + "\nLast name " +
	this.getLastName() + "\nUsername " + this.login.getUserName();
	}

	@Override
	public int compareTo(Account a) {
		if (ssn == a.ssn) {
			return 0;
		} else
			return -1;
	}

}

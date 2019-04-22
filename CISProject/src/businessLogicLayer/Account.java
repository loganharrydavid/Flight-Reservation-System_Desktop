package businessLogicLayer;

import databaseInterfaceLayer.DatabaseObjectJJ;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import databaseInterfaceLayer.*;

public class Account implements Comparable<Account> {
	private String accountID; // ArrayList[0] returnObjectList;
	private String userName; // ArrayList[1] returnObjectList;
	private String password; // ArrayList[2] returnObjectList;
	private String firstName; // ArrayList[3] returnObjectList;
	private String lastName; // ArrayList[4] returnObjectList;
	private String address; // ArrayList[5] returnObjectList;
	private String state; // ArrayList[6] returnObjectList;
	private String city; // ArrayList[7] returnObjectList;
	private String email; // ArrayList[8] returnObjectList;
	private int zipCode; // ArrayList[9] returnObjectList;
	private int ssn; // ArrayList[10] returnObjectList;
	private String securityQuestion; // ArrayList[11] returnObjectList;
	private String securityAnswer; // ArrayList[12] returnObjectList;
	static final boolean is_Admin = false; // ArrayList[13] returnObjectList;
	private ArrayList<Flight> flights = new ArrayList<>();

	public Account() {

	}

	public Account(String username, String password) {
		this.userName = username;
		this.password = password;

	}
	//Creates an Account object. Customer Accounts are set to is_Admin = false; and Admin are set to true;
	public Account(String firstname, String lastName, String address, String email, String State, int zipCode, int ssn,
			String userName, String password, String sq, String sa) {

		this.firstName = firstname;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.state = State;
		this.zipCode = zipCode;
		this.ssn = ssn;
		this.userName = userName;
		this.password = password;
		this.securityQuestion = sq;
		this.securityAnswer = sa;

	}

	public static void generateAccount(String fname, String lname, String address, String email, String state,String city int zip,
			int ssn, String un, String pword, String secQuestion, String sa) throws DuplicateAccountException {

		Account acct = new Account(fname, lname, address, email, state, zip, ssn, un, pword, secQuestion, sa);

		LoginDBO search = new LoginDBO();

		Boolean result = search.searchFor(acct.getEmail());

		if (result) {
			throw new DuplicateAccountException("An account with this email address already exists");

		} else {
			DatabaseObjectJJ input = new DatabaseObjectJJ();

			input.setNewAccountValues(acct);

		}


	}

	public String[] getFlights() {

		String[] a = new String[this.flights.size()];

		for (int i = 0; i < this.flights.size(); i++) {

			a[i] += this.flights.get(i);
		}

		return a;
	}

	public String getPassword() {
		return this.password;
	}

	public String getAccountID() {
		return accountID;
	}

	public String getFirstName() {
		return firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public int getSsn() {
		return ssn;
	}

	public String getUserName() {
		return userName;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	protected void setUserName(String username) {
	}

	protected void setPassword(String password) {
	}

	@Override
	public String toString() {
		return "\nFirst name " + this.getFirstName() + "\nLast name " + this.getLastName() + "\nUsername "
				+ this.getUserName() + "\nAccount ID: " + getAccountID();
	}

	@Override
	public int compareTo(Account a) {
		if (ssn == a.getSsn()) {
			return 0;
		} else
			return -1;
	}

}

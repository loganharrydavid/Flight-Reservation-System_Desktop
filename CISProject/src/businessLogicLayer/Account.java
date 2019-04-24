package businessLogicLayer;

import databaseInterfaceLayer.DatabaseObjectJJ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import databaseInterfaceLayer.*;

public class Account implements Comparable<Account> {

	private int accountID;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String email;
	private int zipCode;
	private int ssn;
	private String securityQuestion;
	private String securityAnswer;
	private static boolean is_Admin = false;
	private ArrayList<Flight> flights = new ArrayList<>();

	public Account() {
	}

	public Account(String username, String password) {
		this.userName = username;
		this.password = password;

	}

	// Creates an Account object. Customer Accounts are set to is_Admin = false; and
	// Admin are set to true;

	public Account(String firstname, String lastName, String address, String email, String State,
			int zipCode, int ssn, String userName, String password, String sq, String sa) {

		this.firstName = firstname;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.email = email;
		this.state = State;
		this.zipCode = zipCode;
		this.ssn = ssn;
		this.securityQuestion = sq;
		this.securityAnswer = sa;

	}

	public static void generateAccount(String fname, String lname, String address, String email, String state,
			int zip, int ssn, String un, String pword, String secQuestion, String sa)
			throws DuplicateAccountException {

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

	public static void main(String[] args) {

		returnAccountFromDatabase("name");

	}

	// retrieves an Account from the DB. Use any String field in the Account to tell
	// it which one to return
	public static void returnAccountFromDatabase(String un) {

		final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
		final String databaseUsername = "root";
		final String databasePassword = "1234abcd";

		ArrayList<Object> account = new ArrayList<>();

		try {

			Class.forName("java.sql.Driver");

			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
			

			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM account WHERE username=" + "'" + un + "'");

			ResultSet res = preparedStatement.executeQuery();

			while (res.next()) {

				
				account.add(res.getString("username"));
				account.add(res.getString("password"));
				account.add(res.getString("firstname"));
				account.add(res.getString("lastname"));
				account.add(res.getString("address"));
				account.add(res.getString("state"));
				account.add(res.getString("city"));
				account.add(res.getString("email"));
				account.add(res.getInt("zipcode"));
				account.add(res.getInt("ssn"));
				account.add(res.getString("security_q"));
				account.add(res.getString("security_a"));
				account.add(res.getBoolean("is_Admin"));

			}
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		for (int i = 0; i < account.size(); i++) {
			System.out.println(account.get(i));
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

	public int getAccountID() {
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

	public void setUserName(String username) {
		this.userName = username;
	}

	public static boolean isAdmin() {
		return is_Admin;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}

	public void setPassword(String password) {
		this.password = password;

	}


	@Override
	public String toString() {
		return "\nAccount ID: " + getAccountID() + "\nUsername " + this.getUserName() + "\nFirst name "
				+ this.getFirstName() + "\nLast name " + this.getLastName();
	}

	@Override
	public int compareTo(Account a) {
		if (ssn == a.getSsn()) {
			return 0;
		} else
			return -1;
	}

}

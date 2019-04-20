package businessLogicLayer;

import databaseInterfaceLayer.DatabaseObjectJJ;

import java.security.InvalidKeyException;
import java.util.ArrayList;
import databaseInterfaceLayer.*;

public class Account implements Comparable<Account> {

	private String accountID;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String state;
	private int zipCode;
	private int ssn;
	private ArrayList<Flight> flights = new ArrayList<>();
	private String userName;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	static final boolean is_Admin = false;

	public Account() {
		
	}
	public Account(String username,String password) {
		this.userName = username;
		this.password = password;
		
	}

	public Account(String firstname, String lastName, String address, String email, String State, int zipCode,
			int ssn, String userName, String password, String sq, String sa) {

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

	public static void generateAccount(String fname, String lname, String address, String email, String state, int zip,
			int ssn, String un, String pword, String secQuestion, String sa) throws DuplicateAccountException {
	
			Boolean isDuplicate;
			
			Account acct = new Account(fname, lname, address, email, state, zip, ssn, un, pword, secQuestion, sa);
			
			databaseInterfaceLayer.LoginDBO search = new databaseInterfaceLayer.LoginDBO();
		
			
			int find = search.searchFor(acct.getEmail());
			
			if(find == acct.getSsn()) {
				isDuplicate = true;
				throw new DuplicateAccountException("An account with this email address already exists");
				
			}else {
				isDuplicate = false;
			}
			
			if(!isDuplicate) {
				
				DatabaseObjectJJ input = new DatabaseObjectJJ();
				
				input.setNewAccountValues(acct);
				
			}

	}
	
	public String[] getFlights() {
		
		String[]a = new String[this.flights.size()];
		
		for(int i = 0; i < this.flights.size(); i++) {
			
			a[i] += this.flights.get(i);}
			
			return a;
	}
	
	public String getPassword() {
		
		String secureAnswer = "";   //databaseObject.method(toReturn correct Answer)
		try {
			if(this.securityAnswer != secureAnswer)
				throw new InvalidKeyException("Incorrect answer to security question");
		}catch(InvalidKeyException ex) {
			ex.getMessage();
			
		}
		return password;
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

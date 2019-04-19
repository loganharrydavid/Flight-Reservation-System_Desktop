package businessLogicLayer;

import databaseInterfaceLayer.DatabaseObjectJJ;
import java.util.ArrayList;
import businessLogicLayer.DuplicateAccountException;

public class Account implements Comparable<Account> {

	private String accountID;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String state;
	private Integer zipCode;
	private int ssn;
	private ArrayList<Flight> flights;
	private String userName;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	public static boolean is_Admin = false;

	public Account() {
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

	public Integer getSsn() {
		return ssn;
	}


	public String getUserName() {
		return userName;
	}

	public String getPassword() {

		return password;

	}

	public void resetPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
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

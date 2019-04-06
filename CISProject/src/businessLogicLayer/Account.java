package businessLogicLayer;

public class Account implements Comparable<Account> {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String address;
	private String email;
	private String password;
	private String securityQuestion;
	private String state;
	private int zipCode;
	private int ssn;
	private String flightInfo;

	public Account() {
		
	}

	public Account(String firstname, String lastName, String userName, String address, String email, String password,
			String securityQuestion, String State, int zipCode, int ssn, String flightInfo) {
		
		this.firstName = firstname;
		this.lastName = lastName;
		this.userName = userName;
		this.address = address;
		this.email = email;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.state = State;
		this.zipCode = zipCode;
		this.ssn = ssn;
		this.flightInfo = flightInfo;
		
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
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

	public String getFlightInfo() {
		return flightInfo;
	}

	public void setFlightInfo(String flightInfo) {
		this.flightInfo = flightInfo;
	}
	@Override
	public String toString() {
		return "\nFirst name " + this.getFirstName() + "\nLast name " +
	this.getLastName() + "\nUsername " + this.getUserName();
	}

	@Override
	public int compareTo(Account a) {
		if (ssn == a.ssn) {
			return 0;
		} else
			return -1;
	}

}

package businessLogicLayer;


import databaseInterfaceLayer.LoginDBO;

public class loginObject {

	private String username;
	private String password;
	private Boolean loginCheck;

	public loginObject() {

	}
	public loginObject(String userName, String Pword) {
		
		this.username = userName;
		this.password = Pword;
		this.loginCheck = false;
	}
	
public void checkPassword(String check) throws PasswordException{
		
		if(this.getPassword().equals(check)) {
			setLoginCheck(true);
			}		
		else {
			throw new PasswordException("Something");
		}
		
		}
	
	public Boolean executeLogin() {
		
		LoginDBO log = new LoginDBO();
		
		String check = log.loginConn(getUsername());
		try {
		checkPassword(check);
		}
		catch(PasswordException ex) {
			System.out.println("password issue");
		}
		
		return loginCheck;		
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Boolean getLoginCheck() {
		return loginCheck;
	}
	public void setLoginCheck(Boolean loginCheck) {
		this.loginCheck = loginCheck;
	}

			}
package businessLogicLayer;


import databaseInterfaceLayer.LoginDBO;



public class loginObject{

	private String username;
	private String password;
	public Boolean loginCheck = false;

	public loginObject() {

	}
	public loginObject(String userName, String Pword) {
		
		this.username = userName;
		this.password = Pword;
		
	}
	
	public Boolean executeLogin() {
		
		LoginDBO log = new LoginDBO();
		
		String pword = log.loginConn(getUsername());
		
		try {
			checkPassword(pword);
		}
		catch(PasswordException ex) {
			System.out.println("The password you enter is incorrect");
			
		}
		return loginCheck;
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public void checkPassword(String pword) throws PasswordException {
		
			if(getPassword() == pword) {
				loginCheck = true;
				}
				else {
				throw new PasswordException("Wrong Password");	
		}
	}
	
	
	
	
}




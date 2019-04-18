package businessLogicLayer;


import databaseInterfaceLayer.LoginDBO;


public class loginObject{

	private String username;
	private String password;
	

	public loginObject() {

	}
	public loginObject(String userName, String Pword) {
		
		this.username = userName;
		this.password = Pword;
		
	}
	
	public void executeLogin() {
		
	
		
		
		try {
			checkLogin(this.getUsername(),this.getPassword());
		}
		catch(PasswordException ex) {
			System.out.println("The password you enter is incorrect");
			
		}
		
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void checkLogin(String username, String pword) throws PasswordException {
		
			if(this.password != pword) {
				throw new PasswordException("The password you entered is incorrect");
		}
	}
	
	
	
	
}




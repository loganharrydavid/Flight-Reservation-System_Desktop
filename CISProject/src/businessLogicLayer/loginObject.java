package businessLogicLayer;

import java.sql.DriverManager;

import databaseInterfaceLayer.DatabaseObjectJJ;

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
		
		DatabaseObjectJJ log = new DatabaseObjectJJ();
		
		
		
	}
	
	
	
	
}




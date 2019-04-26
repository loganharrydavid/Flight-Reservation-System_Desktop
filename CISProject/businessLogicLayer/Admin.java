package businessLogicLayer;

public class Admin extends Account{
	
	 static final Boolean is_Admin = true;

	public Admin(String username,String password) {
		super(username,password);
		
	}
	
	
	
	@Override
	public void setPassword(String passowrd){
		
	}
	@Override
	public void setUserName(String username) {
		
	}
	public void setFlight(Flight flight) {
		
	}
	
	@Override
	public String toString(){
		return "\nUsername: " + this.getUserName() + "\npassword: " + this.getPassword() 
		+ "\nAdmin Status: " + is_Admin;
		
	}
}
package businessLogicLayer;

import businessLogicLayer.Account;

public class ExceptionHandler extends Exception{
	
	
	public ExceptionHandler(String message) {
		super(message);
	}
	
	//this method is called when a new user tries to register an account but before it is stored in the database
	//the purpose is to check the format of their input (i.e.) email address, SSN, etc...
	public void checkRegistration(Account account) {
		
		try {
		
		String ssnString = "" + account.getSsn();		
		
		int lengthOfSsn = String.valueOf(ssnString).length();
		
		if(lengthOfSsn != 9) {
			throw new SSNException("Something wrong with the social security number");
		}
		}catch(SSNException ex) {
		ex.toString();
		}
		
		
	}

		}

	class LoginException extends ExceptionHandler{
		
	
		private static final long serialVersionUID = 1L;

		public LoginException(String message) {
			
			super(message);
			
		}
	
		
	}
	class DuplicateFlightException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public DuplicateFlightException(String message) {
			
			super(message);
		}
	}
	class DuplicateAccountException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;

		public DuplicateAccountException(String message) {
			
			super(message);
			
		}
		
	}
	class SSNException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public SSNException(String message) {
			
			super(message);
		}
	}
	
	class EmailException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public EmailException(String message) {
			
			super(message);
		}
		
	}
	class PasswordException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public PasswordException(String message) {
		
			super(message);
		}
	}
	 class UserNameException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public UserNameException(String message) {
			
		super(message);
		}
	}
	class NameFormatException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public NameFormatException(String message) {
			
			super(message);
		}
	}
	class AddressException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public AddressException(String message) {
			super(message);
		}
	}
	class StateException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public StateException(String message) {
			
			super(message);
		}
	}
	class ZipcodeException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public ZipcodeException(String message) {
			
			super(message);
		}
		
	}
package businessLogicLayer;


public class ExceptionHandler extends Exception{
	
	private static final long serialVersionUID = 1L;
	public String Error;
	
	public ExceptionHandler() {
		
	}
	
	
	public ExceptionHandler(String message) {
	
		super(message);
		
	}	
		}

	class LoginException extends ExceptionHandler{
		
	
		private static final long serialVersionUID = 1L;

		public LoginException(String Error) {
			
			this.Error = "Something is wrong with the Username or Password";
			
		}
		
		public String getError() {
			return this.Error;
		}
		
	}
	class DuplicateFlightException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public DuplicateFlightException() {
			
			this.Error = "You are trying to book a duplicate flight";
		}
	}
	class DuplicateAccountException extends ExceptionHandler {
		
		private static final long serialVersionUID = 1L;

		public DuplicateAccountException() {
			
			this.Error = "It appears you are trying to create a duplicate account";
			
		}
		
	}
	class SSNException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public SSNException() {
			
			this.Error = "Social security number should be in the format: 123456789";
		}
	}
	
	class EmailException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public EmailException() {
			
			this.Error = "Email should be in the format: Blank@email.com";
		}
		
	}
	class PasswordException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public PasswordException() {
		
			this.Error = "Password entered was incorrect, please try again";
		}
	}
	class UserNameException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public UserNameException() {
			
		this.Error = "The username you entered does not exist";
		}
	}
	class NameFormatException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public NameFormatException() {
			
			this.Error = "Invalid character detected in first or last name";
		}
	}
	class AddressException extends ExceptionHandler{
	
		private static final long serialVersionUID = 1L;

		public AddressException() {
			this.Error = "Address must only consist of letters and numbers";
		}
	}
	class StateException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public StateException() {
			
			this.Error = "State format should be two uppercase letters";
		}
	}
	class ZipcodeException extends ExceptionHandler{
		
		private static final long serialVersionUID = 1L;

		public ZipcodeException() {
			
			this.Error = "Zipcode should be in the format: 12345";
		}
	}
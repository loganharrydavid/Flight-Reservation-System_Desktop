package businessLogicLayer;


public class ExceptionHandler extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	
	public ExceptionHandler(String message) {
		super(message);
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
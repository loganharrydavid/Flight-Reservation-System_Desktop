package businessLogicLayer;

import java.util.InputMismatchException;

public class ExceptionHandler extends Exception{
	try {
		if(userAnswer.equalsIgnoreCase(this.securityAnswer)){
			return this.password;
		}else {
				throw new InputMismatchException("Wrong answer");
				}
		
	}
		catch(InputMismatchException ex) {
			return ex.getMessage();
		}
	
	
	
	
	
		
		
	}
	 
	 
	



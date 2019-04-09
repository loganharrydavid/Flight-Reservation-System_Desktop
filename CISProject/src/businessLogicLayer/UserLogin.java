package businessLogicLayer;

public class UserLogin {

	private String userName;
	private String password;
	private String securityQuestion;
	private String securityAnswer;

	public UserLogin() {

	}

	public UserLogin(String userName, String password, String sq, String sa) {
		
		this.userName = userName;
		this.password = password;
		this.securityQuestion = sq;
		this.securityAnswer = sa;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

}

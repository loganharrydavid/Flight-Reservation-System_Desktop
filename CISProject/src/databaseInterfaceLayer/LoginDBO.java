package databaseInterfaceLayer;

import java.sql.*;

public class LoginDBO {

	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
	static final String databaseUsername = "root";
	static final String databasePassword = "1234abcd";
	static Connection connection;

	public String loginConn(String username) {

		String result = "";

		try {

			Class.forName("java.sql.Driver");

			System.out.println("databse connected! ");

			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM account WHERE username=" + "'" + username + "'");

			ResultSet res = preparedStatement.executeQuery();

			if (res.next()) {

				result = res.getString("password");

			}

			connection.close();

		} catch (SQLException|ClassNotFoundException ex) {
			System.out.println("Something went wrong with the database :(");
			ex.printStackTrace();

		}
		return result;

	}

	public Boolean searchFor(String email){
		
		Boolean result;
		int i = 0;

		try {
			
			

			System.out.println("databse connected! ");

			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM account WHERE email=" + "'" + email + "'");

			ResultSet res = preparedStatement.executeQuery();

			 while(res.next()) {

				i = res.getInt("ssn");
			
			}
			 
			 
		connection.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
			
	}
		 if(i > 0) {
			 result = true;
		 }
		 else {
			 result = false;
		 }
		return result;
		
}
	}
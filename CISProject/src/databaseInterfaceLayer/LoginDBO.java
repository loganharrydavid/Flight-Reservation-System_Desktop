package databaseInterfaceLayer;

import java.sql.*;

public class LoginDBO {

	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=false";
	static final String databaseUsername = "root";
	static final String databasePassword = "redwall12";
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

	public int searchFor(String email) {
		
		 int i = 0;

		try {

			Class.forName("java.sql.Driver");

			System.out.println("databse connected! ");

			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM account WHERE email=" + "'" + email + "'");

			ResultSet res = preparedStatement.executeQuery();

			 while(res.next()) {

				i = res.getInt("ssn");
			
			}
			 
		connection.close();
			
		} catch (SQLException|ClassNotFoundException ex) {
			
			ex.printStackTrace();
			return 0;
	}
		return i;
}
	}
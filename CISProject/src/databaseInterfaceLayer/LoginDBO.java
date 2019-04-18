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

		} catch (Exception ex) {
			System.out.println("Something went wrong with the database :(");
			

		}
		return result;

	}

	public String searchFor(String thing) {
		
		String result = "";

		try {

			Class.forName("java.sql.Driver");

			System.out.println("databse connected! ");

			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM account WHERE ssn=" + "'" + thing + "'");

			ResultSet res = preparedStatement.executeQuery();

			if (res.next()) {

				result = res.getString("password");

			}
			
			
			connection.close();
			
			return "exists";
			
		} catch (Exception ex) {
			
			return "";}
	}}


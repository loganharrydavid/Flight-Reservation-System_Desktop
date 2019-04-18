package databaseInterfaceLayer;

import java.sql.*;


public class LoginDBO {
	
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=false";
	static final String databaseUsername = "root";
	static final String databasePassword = "redwall12";
	static Connection connection;

	public String loginConn(String username) {

		try {
		
			Class.forName("java.sql.Driver");
			
			System.out.println("databse connected! ");
			
			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			String sqlQuery = " SELECT * FROM account WHERE username =" + username;
					
			PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

			ResultSet res = preparedStatement.executeQuery();
			
			String pass = "";
			
			if(res.next()) {
			pass = res.getString("password");
			}
			

			connection.close();

			return pass;

		} catch (Exception ex) {
			return "Please check that your Username is correct";
		
		} 
			
		}
		
	}





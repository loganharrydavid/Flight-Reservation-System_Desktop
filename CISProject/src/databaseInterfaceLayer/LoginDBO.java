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

			ResultSet res = preparedStatement.executeQuery(sqlQuery); 
			
			String pw = "";
			while(res.next()) {
			
			pw = res.getString("password");
			
			}
			System.out.println(pw);
			

			connection.close();

			return pw;

		} catch (Exception ex) {
			return "Something went wrong with the database :(";
		
		} 
			
		}
		
	}





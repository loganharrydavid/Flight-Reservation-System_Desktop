package databaseInterfaceLayer;

import java.sql.*;
import businessLogicLayer.*;



public class LoginDBO {
	
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=false";
	static final String databaseUsername = "root";
	static final String databasePassword = "redwall12";
	static Connection connection;

	public void loginConn(loginObject log) {

		try {
		
			Class.forName("java.sql.Driver");
			
			System.out.println("databse connected! ");
			
			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			String sqlQuery = " SELECT * FROM account(username,password)";
					
			PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

			ResultSet res = preparedStatement.executeQuery();
			
			

			preparedStatement.executeUpdate();

			connection.close();

			// execute the query
			// ResultSet rSet = preparedStatement.executeQuery();

//			//look through database
//			while (rSet.next()) {
//				
//				//do whatever
//				
//				
//			}

		} catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}
}




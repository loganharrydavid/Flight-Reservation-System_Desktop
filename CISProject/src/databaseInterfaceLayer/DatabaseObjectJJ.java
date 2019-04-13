package databaseInterfaceLayer;

import java.sql.*;

public class DatabaseObjectJJ {
	
	//location of database //set verifity certificate to false to not use SSL to get rid of the verification error
	static String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=false";
	static String databaseUsername ="root";
	static String databasePassword = "1234abcd";
	
	
	public static void main(String[] args) {
		
		
		try {
			
			//driver location
			Class.forName("com.mysql.jdbc.Driver");
			
			//this creates the connection to the database 
			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
			
			System.out.println("databse connected! ");
			
			
			String sqlQuery = 
			" INSERT INTO Account(username, password01)"
			+ " VALUES(?, ?);";
			
			
			//the prepared statement is more efficient to execute the same or similar database statement repeatedly
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			
			String bye = "bye";
			String fafafa="fafafaf";
			
			
			preparedStatement.setString(1, bye);
			preparedStatement.setString(2, fafafa);
			
			preparedStatement.executeUpdate();
			
			
			connection.close();
			
			//execute the query
			//ResultSet rSet = preparedStatement.executeQuery();
			
			
			
			
//			//look through database
//			while (rSet.next()) {
//				
//				//do whatever
//				
//				
//			}
//			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}

}

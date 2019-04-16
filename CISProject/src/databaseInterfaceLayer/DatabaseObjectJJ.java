package databaseInterfaceLayer;

import java.sql.*;
import businessLogicLayer.Account;

public class DatabaseObjectJJ {
	
	//location of database //set verify certificate to false to not use SSL to get rid of the verification error
	static String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=false";
	static String databaseUsername ="root";
	static String databasePassword = "redwall12";
	
	
	public void setAccountValues(Account acc) {
		
		try {
			//driver location
			Class.forName("java.sql.Driver");
			
			//this creates the connection to the database 
			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
			
			System.out.println("databse connected! ");
			
			
			String sqlQuery = 
			" INSERT INTO account(username,password,firstname,lastname,address,email,zipcode,ssn,security_q,security_a)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?);";
			
			
			//the prepared statement is more efficient to execute the same or similar database statement repeatedly
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			
			preparedStatement.setString(1, acc.getUserName());
			preparedStatement.setString(2, acc.getPassword());
			preparedStatement.setString(3, acc.getFirstName());
			preparedStatement.setString(4, acc.getLastName());
			preparedStatement.setString(5, acc.getAddress());
			preparedStatement.setString(6, acc.getEmail());
			preparedStatement.setInt(7, acc.getZipCode());
			preparedStatement.setString(8, acc.getSsn());
			preparedStatement.setString(9, acc.getSecurityQuestion());
			preparedStatement.setString(10, acc.getSecurityAnswer());
			
			
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
			
		} catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}

}

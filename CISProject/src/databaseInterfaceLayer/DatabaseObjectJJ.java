package databaseInterfaceLayer;

import java.sql.*;
import businessLogicLayer.*;
import java.util.ArrayList;

public class DatabaseObjectJJ {
	// location of database //set verify certificate to false to not use SSL to get
	// rid of the verification error
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
	static final String databaseUsername = "root";
	static final String databasePassword = "1234abcd"; 
	Connection connection;
	public ArrayList<Object> returnList;
	
	
	public void setNewAccountValues(Account account) {

		try {
		
			 Class.forName("java.sql.Driver");
			
			System.out.println("database connected! ");
			

			//the prepared statement is more efficient to execute the same or similar database statement repeatedly

			 connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			String sqlQuery = " INSERT INTO account(username,password,firstname,lastname,address,state,email,zipcode,ssn,security_q,security_a)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?);";

			// the prepared statement is more efficient to execute the same or similar
			// database statement repeatedly
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, account.getUserName());
			preparedStatement.setString(2, account.getPassword());
			preparedStatement.setString(3, account.getFirstName());
			preparedStatement.setString(4, account.getLastName());
			preparedStatement.setString(5, account.getAddress());
			preparedStatement.setString(6, account.getState());
			preparedStatement.setString(7, account.getEmail());
			preparedStatement.setInt(8, account.getZipCode());
			preparedStatement.setInt(9, account.getSsn());
			preparedStatement.setString(10, account.getSecurityQuestion());
			preparedStatement.setString(11, account.getSecurityAnswer());

			preparedStatement.executeUpdate();
			
			

			connection.close();


		} 
		catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}
}
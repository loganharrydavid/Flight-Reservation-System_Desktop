package databaseInterfaceLayer;

import java.sql.*;
import java.util.ArrayList;
import businessLogicLayer.Account;

public class InsertDBO {
	// location of database //set verify certificate to false to not use SSL to get
	// rid of the verification error
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
	static final String databaseUsername = "root";
	static final String databasePassword = "1234abcd"; 
	
	public ArrayList<Object> returnList;
	
	
	public void insertFlight() {
		
	}
	public void insertBooking() {
	
	}
	public static void main(String[] args) {
		insertAccount(new Account( "username","password","firstname","lastname","address",
				"state","email",30098,123456,"security_q","security_a"));
	}
	
	public static void insertAccount(Account account) {

		try {
		
			 Class.forName("java.sql.Driver");
			
			System.out.println("database connected! ");
			

			//the prepared statement is more efficient to execute the same or similar database statement repeatedly

			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);


				String sqlQuery = "INSERT INTO account(account_id,username,password,firstname,lastname,address,"
						+ "state,email,zipcode,ssn,security_q,security_a,is_Admin)"
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

				// the prepared statement is more efficient to execute the same or similar
				// database statement repeatedly
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

				preparedStatement.setInt(1, account.getAccountID());
				preparedStatement.setString(2, account.getUserName());
				preparedStatement.setString(3, account.getPassword());
				preparedStatement.setString(4, account.getFirstName());
				preparedStatement.setString(5, account.getLastName());
				preparedStatement.setString(6, account.getAddress());
				preparedStatement.setString(7, account.getState());
				preparedStatement.setString(8, account.getEmail());
				preparedStatement.setInt(9, account.getZipCode());
				preparedStatement.setInt(10, account.getSsn());
				preparedStatement.setString(11, account.getSecurityQuestion());
				preparedStatement.setString(12, account.getSecurityAnswer());
				preparedStatement.setBoolean(13,Account.is_Admin);
				
				
				preparedStatement.executeUpdate();
			

			connection.close();


		} 
		catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}

}




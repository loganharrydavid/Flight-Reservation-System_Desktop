package databaseInterfaceLayer;

import java.sql.*;
import businessLogicLayer.*;
import java.util.ArrayList;

public class DatabaseObjectJJ {

	// location of database //set verify certificate to false to not use SSL to get
	// rid of the verification error
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=false";
	static final String databaseUsername = "root";
	static final String databasePassword = "redwall12";
	static Connection connection;
	public ArrayList<Object> returnList;
	
	public DatabaseObjectJJ() {
		
	}
	public DatabaseObjectJJ(ArrayList<Object> list) {
		
		this.returnList = list;
	}

	public void setNewAccountValues(Account acc) {

		try {
		
				 Class.forName("java.sql.Driver");
			
			System.out.println("databse connected! ");
			
			connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			String sqlQuery = " INSERT INTO account(username,password,firstname,lastname,address,state,email,zipcode,ssn,security_q,security_a)"
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?);";

			// the prepared statement is more efficient to execute the same or similar
			// database statement repeatedly
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, acc.getUserName());
			preparedStatement.setString(2, acc.getPassword());
			preparedStatement.setString(3, acc.getFirstName());
			preparedStatement.setString(4, acc.getLastName());
			preparedStatement.setString(5, acc.getAddress());
			preparedStatement.setString(6, acc.getState());
			preparedStatement.setString(7, acc.getEmail());
			preparedStatement.setInt(8, acc.getZipCode());
			preparedStatement.setInt(9, acc.getSsn());
			preparedStatement.setString(10, acc.getSecurityQuestion());
			preparedStatement.setString(11, acc.getSecurityAnswer());

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

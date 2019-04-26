package databaseInterfaceLayer;

import java.sql.*;
import java.util.ArrayList;
import businessLogicLayer.Account;
import businessLogicLayer.Flight;
import businessLogicLayer.booking;

public class InsertDBO {
	// location of database //set verify certificate to false to not use SSL to get
	// rid of the verification error
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
	static final String databaseUsername = "root";
	static final String databasePassword = "1234abcd";

	public ArrayList<Object> returnList;

	public static void insertFlight(Flight flight) {
		try {

			Class.forName("java.sql.Driver");

			System.out.println("database connected! ");

			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			String sqlQuery = "INSERT INTO flights(flight_number,departure_city,destination_city,depart_time,"
					+ "arrive_time,flight_date,num_seats)" + " VALUES(?,?,?,?,?,?,?)";

			
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setInt(1, flight.getFlightNumber());
			preparedStatement.setString(2, flight.getDepartureCity());
			preparedStatement.setString(3, flight.getDestinationCity());
			preparedStatement.setString(4, flight.getDepartTime());
			preparedStatement.setString(5, flight.getArriveTime());
			preparedStatement.setString(6, flight.getFlightDate());
			preparedStatement.setInt(7, flight.getNumberOfSeats());

			preparedStatement.executeUpdate();

			connection.close();

		} catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}

	

	public void insertBooking() {

	}

	public void insertAccount(Account account) {

		try {

			Class.forName("java.sql.Driver");

			System.out.println("database connected! ");

			
			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);

			String sqlQuery = "INSERT INTO account(account_id,username,password,firstname,lastname,address,"
					+ "state,email,zipcode,ssn,security_q,security_a,is_Admin)" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

			
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
			preparedStatement.setBoolean(13, Account.is_Admin);

			preparedStatement.executeUpdate();

			connection.close();

		} catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}

}

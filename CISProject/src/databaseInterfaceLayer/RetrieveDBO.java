package databaseInterfaceLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import businessLogicLayer.Flight;


public class RetrieveDBO {
	

	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
	static final String databaseUsername = "root";
	static final String databasePassword = "1234abcd";
	

	
	public static void main(String[] args) {
		
	}
	// retrieves an Account from the DB. Use any user_name in the Account to tell
	// it which one to return
		public static void retrieveAccount(String un) {


			ArrayList<Object> account = new ArrayList<>();
	//public OberservableList<Account> getAccount
			try {

				Class.forName("java.sql.Driver");

				Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
				
				PreparedStatement preparedStatement = connection
						.prepareStatement("SELECT * FROM account WHERE username=" + "'" + un + "'");
				
			    
				ResultSet res = preparedStatement.executeQuery();

				while (res.next()) {
					
					account.add(res.getInt("account_id"));
					account.add(res.getString("username"));
					account.add(res.getString("password"));
					account.add(res.getString("firstname"));
					account.add(res.getString("lastname"));
					account.add(res.getString("address"));
					account.add(res.getString("state"));
					account.add(res.getString("email"));
					account.add(res.getInt("zipcode"));
					account.add(res.getInt("ssn"));
					account.add(res.getString("security_q"));
					account.add(res.getString("security_a"));
					account.add(res.getBoolean("is_Admin"));

				}
				connection.close();

			} catch (Exception e) {
				e.printStackTrace();

			}
			for (int i = 0; i < account.size(); i++) {
				System.out.println(account.get(i));
			}

		}
		public static void retrieveFlight(int flightnum) {
			
			ArrayList<Object> flights = new ArrayList<>();
			
			//public OberservableList<Account> getFlight
					try {

						Class.forName("java.sql.Driver");

						Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
						
						PreparedStatement preparedStatement = connection
								.prepareStatement("SELECT * FROM flights WHERE flight_number=" + "'" + flightnum + "'");
						
					    
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {
							
							flights.add(rs.getInt("flight_number"));
							flights.add(rs.getString("depature_city"));
							flights.add(rs.getString("destination_city"));
							flights.add(rs.getString("depart_time"));
							flights.add(rs.getString("arrive_time"));
							flights.add(rs.getString("flight_date"));
							flights.add(rs.getInt("num_seats"));
							
						}
						
						connection.close();

					} catch (Exception e1) {
						e1.printStackTrace();

					}
					for (int i = 0; i < flights.size(); i++) {
						System.out.println(flights.get(i));
					}

				}
			
		public static void retrieveBooking(String passenger_uName) {
			
				ArrayList<Object> booking = new ArrayList<>();
			
				//public OberservableList<Account> getBooking
					try {

						Class.forName("java.sql.Driver");

						Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
						
						PreparedStatement preparedStatement = connection
								.prepareStatement("SELECT * FROM flights WHERE flight_number=" + "'" + passenger_uName + "'");
						
					    
						ResultSet res = preparedStatement.executeQuery();

						while (res.next()) {
							
							booking.add(res.getInt("flight_number"));
							booking.add(res.getString("depature_city"));
							booking.add(res.getString("destination_city"));
							booking.add(res.getString("depart_time"));
							booking.add(res.getString("arrive_time"));
							
							
						}
						
						connection.close();

					} catch (Exception e1) {
						e1.printStackTrace();

					}
					for (int i = 0; i < booking.size(); i++) {
						System.out.println(booking.get(i));
					}

				}
			
			
			
			
			
			
		}
		

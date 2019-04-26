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
	
	// retrieves an Account from the DB. Use any user_name in the Account to tell
	// it which one to return
		public static void retrieveAccount(String un) {


			ArrayList<Object> account = new ArrayList<>();
	//public OberservableList<Account> setAccount
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
		public static void retrieveFlight(Flight flightNumber) {
			
			ArrayList<Object> flight = new ArrayList<>();
			
			//public OberservableList<Account> setAccount
					try {

						Class.forName("java.sql.Driver");

						Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
						
						PreparedStatement preparedStatement = connection
								.prepareStatement("SELECT * FROM flights WHERE flight_number=" + "'" + flightNumber + "'");
						
					    
						ResultSet res = preparedStatement.executeQuery();

						while (res.next()) {
							
							flight.add(res.getInt("flight_number"));
							flight.add(res.getString("depature_city"));
							flight.add(res.getString("destination_city"));
							flight.add(res.getString("depart_time"));
							flight.add(res.getString("arrive_time"));
							flight.add(res.getString("flight_date"));
							flight.add(res.getInt("num_seats"));
							
						}
						
						connection.close();

					} catch (Exception e1) {
						e1.printStackTrace();

					}
					for (int i = 0; i < flight.size(); i++) {
						System.out.println(flight.get(i));
					}

				}
			
		public static void retrieveBooking() {
			
		}
		
}
		
package databaseInterfaceLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class RetrieveDBO {
	

	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB";
	static final String databaseUsername = "root";
	static final String databasePassword = "1234abcd";
	
	// retrieves an Account from the DB. Use any username in the Account to tell
	// it which one to return
		public static void retrieveAccount(String un) {


			ArrayList<Object> account = new ArrayList<>();
			
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
		public static void retrieveFlight() {
			
		}
		public static void retrieveBooking() {
			
		}
		
}
		
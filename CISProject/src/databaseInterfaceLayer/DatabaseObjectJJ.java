package databaseInterfaceLayer;

import java.sql.*;

public class DatabaseObjectJJ {
	
	//location of database 
	static String databaseURL = "jdbc:mysql://localhost:3306/JavaJesusDB?verifyServerCertificate=false&useSSL=true";
	static String databaseUsername ="root";
	static String databasePassword = "1234abcd";
	
	
	public static void main(String[] args) {
		
		
		try {
			
			//driver location
			Class.forName("com.mysql.jdbc.Driver");
			
			//this creates the connection to the database 
			Connection connection = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
			
			System.out.println("databse connected! ");
			
			String sqlQuery = "'USE JavaJesusDB;'" + 
					"'INSERT INTO Account (username, password01)'" + 
					"'VALUES ('bye', 'moon');'";
			
			//the prepared statement is more efficient to execute the same or similar database statement repeatedly
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			
			//execute the query
			ResultSet rSet = preparedStatement.executeQuery();
			
			//look through database
			//while (rSet.next()) {
				
				//do whatever
				
				
			//}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("something messed up in database! :-(");
			e.printStackTrace();
		}

	}

}

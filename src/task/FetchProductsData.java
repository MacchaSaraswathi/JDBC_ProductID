package task;

import java.sql.*;

public class FetchProductsData {
		
		public static void main(String[] args) throws ClassNotFoundException, 
		SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/ecommerce"; 
		//connection string
		String username="root";
		String password = "root";
		String query = "select * from product;";
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, username, 
		password); //connecting DB
		Statement stmt = con.createStatement(); //Execute the query
		ResultSet rs = (stmt).executeQuery(query); //Save the result after executing the query
		while (rs.next()) {
		System.out.print("product_ID: " + rs.getString("product_ID") + "\t");
		System.out.print("product_Name: " + rs.getString("product_name") + "\t\t" );
		System.out.println("product_Price: " + rs.getString("product_Price")+ "\t");
		}
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
		finally {
		con.close();
		}
	  }

		
	}
		


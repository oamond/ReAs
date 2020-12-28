package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		
	System.out.println("loading to DB");
		Connection connection = null;
		try {
			//step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Drivers loaded Succesfully");
			
			//step 2 - open connection(url,username,password)
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "password";
			connection=DriverManager.getConnection(url,username,password);
			System.out.println("connection success");
			//step 3 - create statement
			Statement statement=connection.createStatement();
			String sql = "select id, name, team_id from test.driver";
			//step 4 - execute
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			//step 5 - process results
			while(resultSet.next()) {
				System.out.print("  Name  : "+resultSet.getString("name"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			
			//step 6 - close connection
			System.out.println("\nConnection closed");
			
		}
	}

}

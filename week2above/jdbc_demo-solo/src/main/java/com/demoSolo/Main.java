package com.demoSolo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * JDBC hand shake and query execution example
 */
public class Main {

	public static void main(String[] args) {
		
		Connection connection = null;
	
		try {
			
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "password";
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Success");
			Statement statement = connection.createStatement();
			String sql = "select id, name, age, gender, teamname, contact, dob from practice2.player order by age desc";
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			while(resultSet.next()) {
				System.out.print("id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" Team Name : "+resultSet.getString("teamname"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.print(" Contact : "+resultSet.getLong("contact"));
				System.out.println(" "
						+ "DOB : "+resultSet.getDate("dob"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				connection.close();
				System.out.println("connection succesfully closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
	}

}

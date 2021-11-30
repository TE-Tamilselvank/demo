package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {

		//Connection connection = null;

		//Statement statement = null;
		try (	Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/technoelevate", "root", "root");
			Statement statement = connection.createStatement();){

			// step1
			Class.forName("com.mysql.jdbc.Driver");

			// step2
			//String dburl = "jdbc:mysql://localhost:3306/technoelevate";

			//connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/technoelevate", "root", "root");

			// step3
			String query = "update employee set name='kishore' where id=11";

			//statement = connection.createStatement();

			int result = statement.executeUpdate(query);

			// step4

			System.out.println(result + " no of rows affected");

		} catch (Exception e) {

			e.printStackTrace();
//		} finally {
//			try {
//				if (connection != null) {
//					connection.close();
//
//				}
//				if (statement != null) {
//					statement.close();
//				}
//
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//
	}

	}

}

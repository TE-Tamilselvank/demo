package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {

		Connection connection = null;

		Statement statement = null;
		try {

			// step1
			Class.forName("com.mysql.jdbc.Driver");

			// step2
			String dburl = "jdbc:mysql://localhost:3306/technoelevate";

			connection = DriverManager.getConnection(dburl, "root", "root");

			// step3
			String query = "Insert into interns values ('paul',110,'1995-09-02','m','jsp',9087064321,65000,'paul@gmail.com',20,'o+ve',800,13,'2021-09-05')";

			statement = connection.createStatement();

			int result = statement.executeUpdate(query);

			// step4

			System.out.println(result + " no of rows affected");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();

				}
				if (statement != null) {
					statement.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

}

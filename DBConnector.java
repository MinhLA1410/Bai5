package com.MinhLA1.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
	private static Connection connection;
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/itstudent";
	private static final String USER = "root";
	private static final String PASSWORD = "system";

	public static Connection getInstance() throws Exception {
		if (null == connection || connection.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		}
		return connection;
	}

	public static String getJdbcDriver() {
		return JDBC_DRIVER;
	}
}

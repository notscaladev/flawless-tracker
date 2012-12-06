package com.flawless.core;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnector {
	
	public synchronized Connection getConnection(){
		final Properties properties = new Properties();
		final ClassLoader loader = Thread.currentThread().getContextClassLoader();
		final InputStream is = loader.getResourceAsStream("db.properties");
		final String driver = properties.getProperty("driver");
		final String url = properties.getProperty("url");
		final String username = properties.getProperty("username");
		final String password = properties.getProperty("password");
		Connection connection = null;
		try {
			Class.forName(driver);
			try {
				connection = DriverManager.getConnection(url,username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

package com.flawless.core.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flawless.core.DatabaseConnector;
import com.flawless.core.user.dao.UserDAO;
import com.flawless.core.user.domain.User;
import com.flawless.core.user.domain.impl.UserImpl;

public class UserDAOImpl implements UserDAO{
	
	private DatabaseConnector mConnector;

	@Override
	public User read(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public synchronized UserImpl insert(UserImpl user) {
		Connection connection = null;
		PreparedStatement statement = null;
		mConnector = new DatabaseConnector();
		connection = mConnector.getConnection();
		final String insertQuery = "INSERT INTO `flawless-tracker`.tbl_users(name,email,password) VALUES(?,?,?)";
		try {
			statement = connection.prepareStatement(insertQuery);
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getPassword());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmail(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.flawless.core;

import com.flawless.core.user.dao.UserDAO;

public abstract class BaseDAOFactory {
	
	private static final int MySQL = 1;
	
	public abstract UserDAO getUserDAO();
	
	public static BaseDAOFactory getFactory(int factory){
		switch(factory){
		case MySQL:
			return new MySQLDAOFactory();
		default:
			return null;
		}
	}
}

package com.flawless.core.user.service.impl;

import com.flawless.core.user.dao.UserDAO;
import com.flawless.core.user.domain.User;
import com.flawless.core.user.domain.impl.UserImpl;
import com.flawless.core.user.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDAO mUserDAO;

	@Override
	public UserImpl createUser(UserImpl user) {
		return mUserDAO.insert(user);
	}
}

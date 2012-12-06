package com.flawless.core.user.dao;

import com.flawless.core.user.domain.User;
import com.flawless.core.user.domain.impl.UserImpl;

public interface UserDAO {
	
	public User read(User user);
	
	public User delete(User user);
	
	public UserImpl insert(UserImpl user);
	
	public User update(User user);
	
	public User updateEmail(User user);
	
}

package com.app.service;

import java.util.List;

import com.app.dto.userdto;

public interface userService {

	userdto createUser(userdto user);
	userdto updateUser(userdto user,Integer userId );
	userdto getUserById(Integer userId);
	List<userdto>getAllUsers();
	void deleteUser(Integer userId);
}

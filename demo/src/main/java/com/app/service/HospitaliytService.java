package com.app.service;

import java.util.List;

import com.app.dto.Hospitaliytdto;

public interface HospitaliytService {
	Hospitaliytdto createUser(Hospitaliytdto Users);
	Hospitaliytdto updateUser(Hospitaliytdto Users , Integer UserssId);
	Hospitaliytdto getUserById(Integer UsersId);
	List<Hospitaliytdto>getAllUsers();
	void deleteUser(Integer UsersId);
}

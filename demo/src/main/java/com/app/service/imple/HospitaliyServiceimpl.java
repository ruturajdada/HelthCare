package com.app.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dto.Hospitaliytdto;
import com.app.service.HospitaliytService;


@Autowired
private HospitalityRepo hospitalityRepo;
public class HospitaliyServiceimpl implements HospitaliytService {

	@Override
	public Hospitaliytdto createUser(Hospitaliytdto Users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hospitaliytdto updateUser(Hospitaliytdto Users, Integer UserssId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hospitaliytdto getUserById(Integer UsersId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospitaliytdto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer UsersId) {
		// TODO Auto-generated method stub

	}

}

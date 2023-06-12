package com.app.service.imple;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dto.userdto;
import com.app.entity.user;
import com.app.jpaRepo.userRepo;
import com.app.service.userService;

public class userServiceimpl implements userService {
	@Autowired
	private userRepo UserRepo;

	@Override
	public userdto createUser(userdto user) {
	//	User user =this.dtoTouser(userdto);
		User saveuser=this.UserRepo.save(user);
		return this.userToDto(saveuser);
	}

	@Override
	public userdto updateUser(userdto userdto, Integer userId) {
		User user=this.UserRepo.findById(userId).orElseThrow((e-> new ResourceNotFoundException("User",)))
		return null;
	}

	@Override
	public userdto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<userdto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	private user dtoTouser(userdto userdto)
	{
		user user=new user();
		user.setId(userdto.getId);
		user.setName(userdto.getName);
		user.setEmail(userdto.getEmail);
		user.setAbout(userdto.getAbout);
		user.set(userdto.getId);
		
		return user;
	}
public userdto userToDto(User user)
{
	userdto userDto=new userDto();
	userdto.setId(user.getId());
	userdto.setName(user.getName());
	userdto.setEmail(user.getEmail());
	userdto.setAbout(user.getAbout());
	return userDto;
}
}

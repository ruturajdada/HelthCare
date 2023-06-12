package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.userService;

@RestController
@RequestMapping("/api/users")
public class userController {
	
	@Autowired
private userService UserService;
	
	@GetMapping("/")
	public ResponseEntity<UserDto > createUser(@RequestBody UserDto userdto )
	
	{
		UserDto createUserDto =this.UserService.createUser(userdto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
}

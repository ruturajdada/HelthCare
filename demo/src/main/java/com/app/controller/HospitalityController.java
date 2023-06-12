package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Hospitaliytdto;
import com.app.service.HospitaliytService;

@RestController
@RequestMapping("/api/HUsers")
public class HospitalityController {

	@Autowired
	private HospitaliytService hospitalityService;
	
	@GetMapping("/")
	public ResponseEntity<Hospitaliytdto> createUsers(@RequestMapping )
	{
		hospitaliytDto createUserDto=this.hospitalityService.createUser(Hospitaliytdto);
		return new ResponseEntity<>(createUsersDto,HttpStatus.CREATED);
	}
}

package com.pratice.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.jdbc.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;
	
//	this method return list of user
	@GetMapping(path="/getusernames")
	public List<String> getAllUserName(){
		return userRepo.getAllUserName();
	}
	
}

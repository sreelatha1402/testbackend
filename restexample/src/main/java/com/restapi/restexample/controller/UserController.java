package com.restapi.restexample.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restexample.model.User;
import com.restapi.restexample.repository.UserRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api")




public class UserController {
	@Autowired
	UserRepository userRepository;

	
	@PostMapping("/addperson")
	public User addperson(@RequestBody User u) {
		return userRepository.save(u);
	}
	
	@GetMapping("/getperson")
	public List<User> getAllUsers(){
		return userRepository.findAll();
		
	}
}

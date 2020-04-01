package com.bipin.nagp2020.microservices.assignment2.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.nagp2020.microservices.assignment2.userservice.controller.model.User;
import com.bipin.nagp2020.microservices.assignment2.userservice.controller.userserviceimpl.UserServiceImpl;

@RestController
public class UserServiceController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	/**
	 * Gets the user.
	 *
	 * @param userId the user id
	 * @return the user
	 */
	@GetMapping("user/{userId}")
	public User getUser(@PathVariable String userId) {
		return userServiceImpl.getUser(Integer.parseInt(userId));
	}

}

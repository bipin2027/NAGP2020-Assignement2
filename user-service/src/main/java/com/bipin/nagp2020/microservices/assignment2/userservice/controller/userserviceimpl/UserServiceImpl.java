package com.bipin.nagp2020.microservices.assignment2.userservice.controller.userserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bipin.nagp2020.microservices.assignment2.userservice.controller.model.User;

@Service
public class UserServiceImpl {
	private List<User> users;
	
	public UserServiceImpl() {
		users = new ArrayList<User>();
		InititalizeUser();
	}

	/**
	 * Inititalize user.
	 */
	private void InititalizeUser() {
		User u1= new User("john", 35, "john.doe@gmail.com", 1);
		User u2= new User("jack", 35, "jack@gmail.com", 2);
		User u3= new User("cassia", 35, "cassia@gmail.com", 3);
		users.add(u1);
		users.add(u2);
		users.add(u3);
	}
	
	public User getUser(int uId) {
		User user=users.stream().filter(u->u.getuId()==uId).findFirst().get();
		return user;
	}
	
}

package com.nnt.leisure_breaker.LeisureBreaker.service;



import org.springframework.stereotype.Service;

import com.nnt.leisure_breaker.LeisureBreaker.model.User;

@Service
public class UserService {

	public User create(User user) {
		user.setId(10);// db intraction
		return user;
		
	}
	
}

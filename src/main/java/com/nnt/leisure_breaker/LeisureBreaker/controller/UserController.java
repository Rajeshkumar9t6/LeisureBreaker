package com.nnt.leisure_breaker.LeisureBreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnt.leisure_breaker.LeisureBreaker.model.User;
import com.nnt.leisure_breaker.LeisureBreaker.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping
	public ResponseEntity<User> setUser(@RequestBody User user) {
		System.out.println(user.hashCode());
		service.create(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}

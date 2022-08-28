package com.sacavix.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacavix.users.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/{name}")
	public Integer getUserAge(@PathVariable String name) {
		System.out.println("New request :" + name);
		return usersService.retrieveAge();
	}

}

package com.sacavix.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UsersService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String URL = "http://localhost:8081/ages";
	
	public Integer retrieveAge() {
		return restTemplate.getForObject(URL, Integer.class);
	}

}

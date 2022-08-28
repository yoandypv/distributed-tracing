package com.sacavix.age.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ages")
public class AgeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String URL = "http://localhost:8082/years";
	
	@GetMapping
	public Integer getAge() throws InterruptedException {
		Thread.sleep(4000);
		Integer year = restTemplate.getForObject(URL, Integer.class);
		return 2022 - year;
	}

}

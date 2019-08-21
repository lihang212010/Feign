package com.example.demo;

import java.util.List;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import ch.qos.logback.classic.Logger;



@RestController
public class MoviesController {

@Autowired
UserFiegnClient userFiegnClient;

	@RequestMapping("/user/{id}")
	public Users findById(@PathVariable Long id) {
		return this.userFiegnClient.findById(id);
	}	
		
	} 


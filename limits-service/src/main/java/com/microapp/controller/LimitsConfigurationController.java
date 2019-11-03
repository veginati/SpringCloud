package com.microapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microapp.configuration.Configuration;
import com.microapp.model.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration; 
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		System.out.println("test");
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}

}

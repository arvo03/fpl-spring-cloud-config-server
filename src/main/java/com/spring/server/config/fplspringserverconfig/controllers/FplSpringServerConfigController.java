package com.spring.server.config.fplspringserverconfig.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.server.config.fplspringserverconfig.configuration.FplSpringServerConfigConfiguration;
import com.spring.server.config.fplspringserverconfig.entities.Limits;

@RestController
public class FplSpringServerConfigController {

	@Autowired
	private FplSpringServerConfigConfiguration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}

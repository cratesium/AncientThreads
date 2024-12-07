package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerMain {
	
	@GetMapping("/home")
	public String homeController() {
		return "This is Home Controller";
	}

}

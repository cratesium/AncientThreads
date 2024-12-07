package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.services.UserServices;

@RestController
public class UserController {
	


    @Autowired
    UserServices userServices;
    
    @PostMapping("/user/post")
    public User saveUser(@RequestBody User user) {
	return userServices.saveEntry(user);
	
   }

}

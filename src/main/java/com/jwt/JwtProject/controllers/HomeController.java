package com.jwt.JwtProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.JwtProject.models.User;
import com.jwt.JwtProject.services.UserService;

@RestController
@RequestMapping("/admin/")
public class HomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		System.out.println("Getting user");
		return userService.getUser();
	}
}

package com.jwt.JwtProject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.JwtProject.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"akshansh sharma","sakshansh.bv@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Harsh sharma","Harsh.bv@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"ankit sharma","ankit.bv@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"ayush sharma","ayush.bv@gmail.com"));
	}
	
	public List<User> getUser(){
		return store;
	}
	
}

package com.jwt.JwtProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.JwtProject.entity.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public List<User> getUser() {
		return store;
	}

}

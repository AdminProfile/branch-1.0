package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.User;


@RestController
public class UserController {

	@RequestMapping("/")
	public List<User> getEmployees()
	{
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"Nitish","Saxena","nitish.saxena001100@gmail.com"));
		return userList;
	}

}

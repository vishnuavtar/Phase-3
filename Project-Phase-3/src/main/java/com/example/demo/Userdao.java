package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userdao {
	
	@Autowired
	UserRepo repo;
	
	public List<User> alluser(){
		return repo.findAll();
	}

}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyDao {

	@Autowired
	BuyRepo repo;
	
	public Buy buy(Buy y) {
		return repo.save(y);
	}
	
	
	public List<Buy> buyall(){
		return repo.findAll();
	}
	
}

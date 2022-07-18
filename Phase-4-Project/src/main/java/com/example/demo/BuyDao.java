package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class BuyDao {
	
	@Autowired
	BuyRepo repo;
	
	public Buy addbuy(Buy y) {
		return repo.save(y);
	}
	
	public java.util.List<Buy> allorder(){
		return repo.findAll();
	}
	

}

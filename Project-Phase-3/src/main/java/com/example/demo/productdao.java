package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productdao {
	
	@Autowired
	productrepo repo;
	
	//insert
		public product insert(product s) {
			return repo.save(s);
		}
		
		//retrive all the objects
		public List<product> getall(){
			return repo.findAll();
		}
	

}

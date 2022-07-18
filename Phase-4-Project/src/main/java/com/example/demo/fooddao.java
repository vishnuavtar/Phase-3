package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fooddao {
	
	@Autowired
	foodrepo repo;
	
	public food addfood(food f) {
		return repo.save(f);
	}
	
	public List<food> allfood(){
		return repo.findAll();
	}
	
	public food deletefood(food f) {
		 repo.delete(f);
		 return(f);
	}
	
	public food FoodUpdate(food f) {
		food ff=repo.findById(f.getId()).orElse(null);
		ff.setFoodname(f.getFoodname());
		ff.setPrice(f.getPrice());
		ff.setId(f.getId());
		return repo.save(f);
	}
	
	public List<food> buyoption(){
		return repo.findAll();
	}

}

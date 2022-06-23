package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CategoryDao {
	
	@Autowired
	categoryrepo repo;
	
	public category insertcategory(category c) {
		return repo.save(c);
	}
	
	public List<category> catall(){
		return repo.findAll();
	}
	
	public category update(category c) {
		category cc=repo.findById(c.getId()).orElse(null);
		cc.setId(c.getId());
		cc.setPname(c.getPname());
		return repo.save(c);
	}

	@RequestMapping("/deleteByid")
	public category deleteByid(category c) {
		repo.delete(c);
		return c;
	}
}

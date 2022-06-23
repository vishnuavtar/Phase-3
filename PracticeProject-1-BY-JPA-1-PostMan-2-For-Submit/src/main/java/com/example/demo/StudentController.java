package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentDAO dao;
	
	@PostMapping("/insert")
	public Student insert(@RequestBody Student s) {
		return dao.insert(s);
		
	}
	
	@PostMapping("/insertall")
	public List<Student> insertall(@RequestBody List<Student> s) {
		return dao.insertall(s);
	}
	

}

package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	
	@Autowired
	StudentRepo repo;

	
	// insert
	public Student insert(Student s) {
		return repo.save(s);
	
	}
	
	// insertall
	public List<Student> insertall(List<Student> s) {
		return repo.saveAll(s);
	}
}

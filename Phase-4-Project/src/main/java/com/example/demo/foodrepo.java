package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface foodrepo extends JpaRepository<food, Integer> {

}

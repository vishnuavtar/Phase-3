package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data
@Entity
public class Buy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String model;
	private String status;
	private String cardname;
	private String ammount;
	private String cardnumber;
	private String ccv;
	private String size;

}

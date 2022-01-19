package com.abhishek.springmvcboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springmvcboot.entity.Person;
import com.abhishek.springmvcboot.repository.PersonRepository;

@RestController
public class PersonController {

	//private final MongoTemplate mongoTemplate;
	
	@Autowired
	private PersonRepository personRepo;
	
	@PostMapping("/createUser")
	public Person createUser(@RequestBody Person person) {
		//System.out.println("created " + person.getFirstName());
		System.out.println("created " + person.getDetails());
		personRepo.insert(person);
		return person;
	}
	
	@GetMapping("/")
	public void applicationStarted() {
		System.out.println("entered ");
	}
}

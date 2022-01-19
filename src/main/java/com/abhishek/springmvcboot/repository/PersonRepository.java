package com.abhishek.springmvcboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.abhishek.springmvcboot.entity.Person;

public interface PersonRepository extends MongoRepository<Person, String> {

  List<Person> findByLastName(@Param("lastName") String name);

}

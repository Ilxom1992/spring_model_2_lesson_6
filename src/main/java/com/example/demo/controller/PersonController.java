package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.payload.PersonDto;
import com.example.demo.repository.PersonRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {
    final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public HttpEntity<?> addPerson(@RequestBody PersonDto personDto){
        Person person=new Person();
        person.setFullName(person.getFullName());

        personRepository.save(person);

        return ResponseEntity.ok( "Person Saqlandi");
    }

}

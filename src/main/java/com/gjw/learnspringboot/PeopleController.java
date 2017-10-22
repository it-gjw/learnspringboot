package com.gjw.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {
    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping("/peoples")
    public List<People> getPeoples(){
        return peopleRepository.findAll();
    }
}

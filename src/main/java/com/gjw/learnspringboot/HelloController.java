package com.gjw.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private PeopleConfiguration peopleConfiguration;


    //@RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    @GetMapping("/hello/{id}")
    public String sayHello(@PathVariable("id") Integer id){
        return "id:"+id;
    }
}

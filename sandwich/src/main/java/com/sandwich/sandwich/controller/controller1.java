package com.sandwich.sandwich.controller;

import com.sandwich.sandwich.repository.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class controller1 {

    @Autowired
    SandwichRepository sandwichRepository;

    @GetMapping("fooditems") //localhost:8080/fooditems GET
    public List<SandwichRepository> getFoods(){
        return sandwichRepository.findAll();
    }



}

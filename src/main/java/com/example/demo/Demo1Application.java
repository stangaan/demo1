package com.example.demo;

import com.example.demo.Repository.CoffesRepository;
import com.example.demo.Repository.PizzasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {
    @Autowired
    CoffesRepository coffesRepository;
    PizzasRepository pizzasRepository;


    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}

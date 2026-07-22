package com.example.springboot_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Car {


    @Autowired
    Engine e;

    public void drive(){
        e.display();
        System.out.println("Driving a Car");
    }
}

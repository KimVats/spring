package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("Creating vehicle instance");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialise(){
        this.name = "honda";
    }

    public void hellowClass(){
        System.out.println("Hello World");
    }
}

package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

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

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying before closing ");;
    }

    public void hellowClass(){
        System.out.println("Hello World");
    }
}

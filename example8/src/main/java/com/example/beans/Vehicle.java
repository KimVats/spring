package com.example.beans;import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    public Vehicle() {
        System.out.println("Creating vehicle instance via Spring");
    }

    private String name = "Honda";

//    private VehicleService vehicleService;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hellowClass(){
        System.out.println("Hello World");
    }
}

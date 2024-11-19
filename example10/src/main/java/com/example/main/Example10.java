package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("before initialising person bean");
        Person per = context.getBean(Person.class);
        System.out.println("after initialising person bean");
        Vehicle veh = context.getBean(Vehicle.class);
        veh.getVehicleService().move();
        veh.getVehicleService().playSound();
    }
}

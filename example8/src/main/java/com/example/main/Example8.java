package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per = context.getBean(Person.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Person mainteained by spring context "+per.getName());
        System.out.println("Vehicle mainteained by spring context "+veh.getName());
        System.out.println("Vehicle from person "+per.getVehicle().getName());
        veh.hellowClass();
    }
}

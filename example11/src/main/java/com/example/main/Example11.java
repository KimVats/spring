package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example11 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per1 = context.getBean(Person.class);
        System.out.println("person 1 hashcode"+per1);
        Person per2 = context.getBean(Person.class);
        System.out.println("person 2 hashcode"+per2);
        System.out.println("person 1 and 2 hashcodes are different because we have used prototype scope for person");
        Vehicle veh = context.getBean(Vehicle.class);
        veh.getVehicleService().move();
        veh.getVehicleService().playSound();
    }
}

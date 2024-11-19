package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String pers[] = context.getBeanNamesForType(Person.class);
        Person per = context.getBean(Person.class);
        Vehicle veh = context.getBean(Vehicle.class);
        veh.getVehicleService().move();
        veh.getVehicleService().playSound();
    }
}

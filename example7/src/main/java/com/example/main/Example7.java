package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per = context.getBean(Person.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("this object is mainteained by spring context "+veh.getName());
        veh.hellowClass();
    }
}

package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*This annotation at the start up will tell the spring container to scan the content of this file,
this annotation is a part od spring core framework and also it tells that this class has @bean method definitions so that
at startup it scan those.

 */
@Configuration
public class ProjectConfig {

    //diff ways of giving beans a custom name
    @Bean(name="bmwVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle(); // var keyword was introduced in java 10, the type of reference var depends on the right hand siide
        veh.setName("BMW CAR");
        return veh;
    }

    @Bean(value="audiCar")
    Vehicle vehicle2(){
        var veh = new Vehicle(); // var keyword was introduced in java 10, the type of reference var depends on the right hand siide
        veh.setName("Audi CAR");
        return veh;
    }

    @Bean("waganorCar")
    Vehicle vehicle3(){
        var veh = new Vehicle(); // var keyword was introduced in java 10, the type of reference var depends on the right hand siide
        veh.setName("Waganor CAR");
        return veh;
    }

}

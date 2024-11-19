package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*This annotation at the start up will tell the spring container to scan the content of this file,
this annotation is a part od spring core framework and also it tells that this class has @bean method definitions so that
at startup it scan those.

 */
@Configuration
@ComponentScan(basePackages = {"com.example.beans","com.example.service","com.example.interfaces"})
public class ProjectConfig {

//    @Bean
//    public Vehicle getVeh(){
//        Vehicle veh = new Vehicle();
//        veh.setName("Honda");
//        return veh;
//    }

//    @Bean
//    public Person getPer(){
//        Person per = new Person();
//        per.setName("Kim");
//        per.setVehicle(getVeh());
//        return per;
//    }


}

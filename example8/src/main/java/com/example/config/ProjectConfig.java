package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*This annotation at the start up will tell the spring container to scan the content of this file,
this annotation is a part od spring core framework and also it tells that this class has @bean method definitions so that
at startup it scan those.

 */
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

}

package com.example.service;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Sony speakers playing");
    }
}

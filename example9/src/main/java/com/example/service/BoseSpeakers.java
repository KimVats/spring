package com.example.service;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Playing bose speakers");
    }
}

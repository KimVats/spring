package com.example.service;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichlienTyre implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Rotate Michieln tyre");
    }
}

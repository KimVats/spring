package com.example.service;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void playSound() {
        speakers.makeSound();
    }

    public void move() {
        tyres.rotate();
    }
}

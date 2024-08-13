package com.codefarm.oop;

public class Bike extends Vehicle{

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String makeSound() {
        return "Bike making sound..";
    }
}

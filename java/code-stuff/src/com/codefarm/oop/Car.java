package com.codefarm.oop;

public class Car extends Vehicle{

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String makeSound() {
        return "Car making sound";
    }

    public void accelerates(){
        System.out.println("accelerating..");
    }

    public void accelerates(int increment){
        System.out.println("accelerating by speed " + increment);
    }

}

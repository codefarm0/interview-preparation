package com.codefarm.oop;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle car1 = new Car("xyz", 12);


        Vehicle bike1 = new Bike("hero", 2);


//polymorphism
        System.out.println(car1.makeSound());
        //System.out.println(car2.makeSound());
        System.out.println(bike1.makeSound());

        //encapsulation
        System.out.println("car1 name - " + car1.getName() + ", car1 speed -- " + car1.getSpeed());
        System.out.println("bik1 name - " + bike1.getName() + ", car1 speed -- " + bike1.getSpeed());

        //overloading
        Car car2 = new Car("abc", 5);
        car2.accelerates();
        car2.accelerates(4);
    }
}

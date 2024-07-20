package com.cglia.training.oops;

class Vehicle {
    public void run() {
        System.out.println("I have a BMW.");
    }
}
public class SingleInheritance extends Vehicle {
    public static void main(String[] args) {
        SingleInheritance car = new SingleInheritance();
        car.run();
    }
}
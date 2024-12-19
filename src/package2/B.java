package src.package2;

import src.packages1.*;

public class B {
    public static void main(String[] args) {
        System.out.println("hello From class A");

        Car newCar = new Car(); // Accessing Car class from class A

        newCar.speed(120); // Using the speed method of Car class

        BMW bmw = new BMW(); // Using BMW class from class A

        bmw.run(); // Using the run method of BMW class
    }
}

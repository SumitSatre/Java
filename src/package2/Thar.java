package src.package2;

import src.packages1.*;

class Thar extends Car {
    void checkSpeed() {
        Car newCar = new Car(); // Accessing Car class from class A

        newCar.speed(120); 
    }
}
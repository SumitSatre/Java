package src.packages1;

public class Car {
    public void speed(int speed){
        System.out.println("My car speed is " + speed + "km/hr");
    }

    // Same class 

    void run(){
        speed(100);
    }
}

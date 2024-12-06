/*
 * Author: Gokl Martin
 * Date: 4.12.2024
 * Version: 0.9
 * Description: Exercise for constructor and random number generation.
 */



public class Car {
    public String make;
    public String model;
    public int year;


    //Constructor for a car
    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //methods for the Car object
    public static void start() {
        System.out.println("Car has started");
    }
    public static void accelerate(int speed){
        System.out.println("Car is accelerating to " + speed + " km/h");
    }
    public static void stop(){
        System.out.println("Car has stopped");
    }
}

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Main Method.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        HelloWorldExercise.HelloWorldMethod();
        VariableExercise.VariableMethod();
        StringExercise.StringMethod();
        SimpleCalculatorExercise.SimpleCalculatorMethod();
        AdvancedCalculatorExercise.AdvancedCalculatorMethod();
        LoopsExercise.LoopsMethod();
        BreakContinueExercise.BreakContinueMethod();
        CalculatorWithArrayExercise.CalculatorWithArrayMethod();


        //initializing a new random and 3 int variables for the arrays of the car typ
        Random rand = new Random();
        int rand1;
        int rand2;
        int rand3;




//        myCar.make = "Mercedes";
//        myCar.model = "E250";
//        myCar.year = 1993;
//        System.out.println(myCar.make + " " + myCar.model + " " + myCar.year);
//        Car.start();
//        Car.accelerate(130);
//        Car.stop();
//
//        myCar1.make = "Audi";
//        myCar1.model = "A8";
//        myCar1.year = 2013;
//        System.out.println(myCar1.make + " " + myCar1.model + " " + myCar1.year);
//        Car.start();
//        Car.accelerate(180);
//        Car.stop();
//        System.out.println(myCar.make + " " + myCar.model + " " + myCar.year);
//        Car.start();
//        Car.accelerate(130);
//        Car.stop();
//        System.out.println(myCar1.make + " " + myCar1.model + " " + myCar1.year);
//        Car.start();
//        Car.accelerate(130);
//        Car.stop();


        //3 arrays for the car specifications
        String[] makeArr = {"Audi", "Mercedes", "Ferrari", "Kia", "Opel", "Lamborghini", "BMW", "Hyundai",
                "LandRover", "Lexus"};
        String[] modelArr = {"SUV", "Caprio", "LWK", "PKW", "Moped"};
        int[] yearArr = {1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003,
                2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020};

        //for loop to print a car with random specifications
        for (int i = 0; i < 30; i++){
            rand1 = rand.nextInt(10);
            rand2 = rand.nextInt(5);
            rand3 = rand.nextInt(30);
            Car mycar = new Car(makeArr[rand1], modelArr[rand2], yearArr[rand3]);
            System.out.println(mycar.make + " " + mycar.model + " " + mycar.year);
        }

    }
}

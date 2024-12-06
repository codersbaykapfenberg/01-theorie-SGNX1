import java.util.Scanner;

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Calculator with if and if else.
 */

public class SimpleCalculatorExercise {

    public static void SimpleCalculatorMethod() {

        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;
        String user_input;

        //user input for the numbers
        System.out.println("Please enter your first number");
        num1 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Please enter your second number");
        num2 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Please enter +, -, *, /");
        user_input = sc.nextLine();


        //calculation
        if (user_input.equals("+")) {
            System.out.println("Your result is: " + (num1 + num2));
        } else if (user_input.equals("-")) {
            System.out.println("Your result is: " + (num1 - num2));
        } else if (user_input.equals("*")) {
            System.out.println("Your result is: " + (num1 * num2));
        } else if (user_input.equals("/")) {
            if (num1 == 0 || num2 == 0) {
                System.out.println("It cannot be divided by zero");
            } else {
                System.out.println("Your solution is: " + (num1 / num2));
            }
        } else {
            System.out.println("You did not enter +, -, *, or /.");
        }

    }
}

import java.util.Scanner;

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Calculator with switch, case and default.
 */


public class AdvancedCalculatorExercise {

    public static void AdvancedCalculatorMethod() {

        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;
        float num3;
        String user_input;
        boolean end = true;

        //begin of the while loop and user input for the calculation
        while (end) {
            System.out.println("Please enter your first number");
            num1 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your second number");
            num2 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your third number.“");
            num3 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter +, -, *, /, min, max, sqrt, mean.");
            user_input = sc.nextLine();

            //switch case to calculate
            switch (user_input) {
                case "+":
                    System.out.println("Your result is: " + (num1 + num2 + num3));
                    break;
                case "-":
                    System.out.println("Your result is: " + (num1 - num2 - num3));
                    break;
                case "*":
                    System.out.println("Your result is: " + (num1 * num2 * num3));
                    break;
                case "/":
                    if (num1 == 0 || num2 == 0 || num3 == 0) {
                        System.out.println("It cannot be divided by zero");
                    } else {
                        System.out.println("Your result is: " + (num1 / num2 / num3));
                    }
                    break;
                case "min":
                    System.out.println("The lowest value is: " + Math.min(num1, num2));
                    break;
                case "max":
                    System.out.println("The highest value is: " + Math.max(num1, num2));
                    break;
                case "sqrt":
                    System.out.println("The square roots of number 1 and number 2 are: " + Math.sqrt(num1) + " and " + Math.sqrt(num2));
                    break;
                case "mean":
                    System.out.println("Your result is: " + (num1 / 2) + " " + (num2 / 2) + " " + (num3 / 2));
                    break;
                default:
                    System.out.println("Invalid case");
            }
            //while loop for end or continue
            System.out.println("Would you like to perform a new calculation? Yes or No");
            user_input = sc.nextLine();
            if (user_input.equals("No")) {
                end = false;
            }


        }
    }
}
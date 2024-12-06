/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Calculator with an Array.
 */

import java.util.Scanner;

public class CalculatorWithArrayExercise {
    public static void CalculatorWithArrayMethod() {

        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;
        float num3;
        String user_input;
        String user_input2;
        float i = 0;
        boolean end1 = true;
        float[] results = {0f, 0f, 0f, 0f, 0f};
        boolean end2;


        //begin of the while loop and user input for the calculation
        while (end1) {
            end2 = true;
            System.out.println("Please enter your first number:");
            num1 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your second number:");
            num2 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your third number:");
            num3 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter +, -, *, /, min, max, sqrt, or mean:");
            user_input = sc.nextLine();
            user_input = user_input.toLowerCase();


            //switch case to calculate
            switch (user_input) {
                case "+":
                    i = num1 + num2 + num3;
                    System.out.println("Your result is: " + i);
                    break;
                case "-":
                    i = num1 - num2 - num3;
                    System.out.println("Your result is: " + i);
                    break;
                case "*":
                    i = num1 * num2 * num3;
                    System.out.println("Your result is: " + i);
                    break;
                case "/":
                    if (num1 == 0 || num2 == 0 || num3 == 0) {
                        System.out.println("Division by 0 is not allowed.");
                    } else {
                        i = num1 / num2 / num3;
                        System.out.println("Your result is: " + i);
                    }
                    break;
                case "min":
                    i = Math.min(num1, num2);
                    System.out.println("The smallest value is: " + i);
                    break;
                case "max":
                    i = Math.max(num1, num2);
                    System.out.println("The largest value is: " + i);
                    break;
                case "sqrt":
                    i = (float) Math.sqrt(num1) + (float) Math.sqrt(num2);
                    System.out.println("The sum of the square roots of the first and second numbers is: " + i);
                    break;
                case "mean":
                    i = (num1 / 2) + (num2 / 2) + (num3 / 2);
                    System.out.println("Your result is: " + i);
                    break;
                default:
                    System.err.println("Invalid input");
                    break;
            }

            System.arraycopy(results, 0, results, 1, results.length - 1);
            results[0] = i;

            //while loop for result, end or continue
            while (end2) {
                System.out.println("Would you like to perform another calculation? Yes, No, or Results");
                user_input2 = sc.nextLine();
                user_input2 = user_input2.toLowerCase();
                switch (user_input2) {
                    case "no": {
                        end2 = false;
                        end1 = false;
                        break;
                    }
                    case "results": {
                        for (int k = 0; k < 5; k++) {
                            System.out.println("The result of calculation " + (k + 1) + " is: " + results[k]);
                        }
                        break;
                    }
                    case "yes": {
                        end2 = false;
                        break;
                    }
                    default:
                        System.err.println("Invalid input");
                        break;
                }
            }
        }
    }
}

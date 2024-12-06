import java.util.Scanner;

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Exercise for Break and Continue.
 */

public class BreakContinueExercise {

    public static void BreakContinueMethod() {
        String user_Input;
        float tNumber;//temporary Number
        float result = 0f;
        Scanner sc = new Scanner(System.in);

        //Prompt the user to either exit the loop or continue
        while (true) {
            System.out.println("Please enter a number or type \"Ende\" or \"Stop\" to conclude the summation.");
            user_Input = sc.nextLine();
            user_Input = user_Input.toLowerCase();
            //Breaking Contition
            if (user_Input.equals("ende") || user_Input.equals("stop")) {
                System.out.println("Your Result is: " + result);
                break;
            }
            //Continue the while loop and adding the number to result
            else {
                tNumber = Float.parseFloat(user_Input);
                result += tNumber;
                //continue;
            }
        }
    }
}

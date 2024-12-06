
/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Exercise for "for" loops.
 */


public class LoopsExercise {

    public static void LoopsMethod() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("_________\n" + i + "er row: ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}


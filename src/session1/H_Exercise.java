package session1;
import feedback.Feedback;

import java.util.Scanner;

/**
 * a) Which is the function being computed by this code? (Hint: Use the debugger)
 * b) Re-write it using a for-loop?
 */
public class H_Exercise {
    public static void main(String[] args) {
        int e;
        int result;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read from standard input

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        result = 1;
        e = number;
        while (e > 0) {
            result *= 2;
            e--;
        }

        System.out.println(result);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        Feedback.submit("session1_H", I_did_finish, I_did_understand, comment);
        */

    }
}

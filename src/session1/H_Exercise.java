package session1;
import feedback.Feedback;

import java.util.Scanner;

/**
 * a) Which is the function being computed by this code? (Hint: Use the debugger)
 * b) Re-write it using a for-loop?
 */
public class H_Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read from standard input

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < number; i++) {
            result*=2;
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

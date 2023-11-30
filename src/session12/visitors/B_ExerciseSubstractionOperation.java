package session12.visitors;

import session12.mathexpression.MathExpression;
import session12.mathexpression.Node;

import java.util.Scanner;

/**
 * Exercise: Update the current code to also consider the subtraction operation encoded with the symbol "-".
 *
 * Hints:
 *  a) Create a class: "SubtractionNode".
 *  b) Update MathExpression's parse method.
 *  b) Update the CountOperations class.
 *
 *  For example, for the input "3 + 2 - 1 + 5= ", you should get:
 *      "Number of sum operations = 2"
 *      "Number of subtraction operations = 1"
 */

public class B_ExerciseSubstractionOperation {

    public static void main(String[] args) {
        System.out.println("Enter the math expression (e.g., 3 + 2 = )");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println();

        //We create the object
        MathExpression mathExpression = new MathExpression();
        mathExpression.parse(line);

        System.out.println("Printing the parsed expression:");
        System.out.println(mathExpression);
        System.out.println();
        System.out.println();


        System.out.println("Counting the number of operations: ");

        Visitor visitor = new CountOperations();
        for (Node node: mathExpression){
            visitor.visit(node);
        }

        System.out.println(visitor);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session12_B", I_did_finish, I_did_understand, comment);
        */

    }
}

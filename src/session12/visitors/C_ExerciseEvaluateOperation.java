package session12.visitors;

import session12.mathexpression.Node;
import session12.mathexpression.MathExpression;

import java.util.Scanner;


/**
 * Exercise: Implementing an Evaluator Visitor to Evaluate Mathematical Expressions
 *
 * Background:
 * In this exercise, you will implement a visitor class named Evaluator that computes
 * the result of a given mathematical expression.
 *
 * Objective:
 * Your task is to create an Evaluator class that implements the visitor pattern to
 * compute the result of mathematical expressions, such as "4 + 3 - 2 = ", where the
 * expected result would be "5".
 *
 * Requirements:
 * 1. Evaluator Class:
 *    - Create a class named Evaluator.
 *    - Add the following fields to the Evaluator class:
 *      - int result: to store the accumulated result of the expression.
 *      - int currentInteger: to keep track of the last integer found when visiting the expression.
 *      - Node lastOperation: to track the last operation (e.g., addition, subtraction) found when visiting the expression.
 *
 * 2. Implementing Visitor Methods:
 *    - Implement the required visitor methods in the Evaluator class.
 *    - The main complexity will be in the visitor method associated with the Integer node. This method should check
 *      the last operation and update the final result based on the current visited integer.
 *
 * 3. Testing Your Implementation:
 *    - Test your Evaluator with various expressions to ensure it accurately computes the results.
 *    For example, for the input "4 + 3 - 2 =", the output should be "5".
 *
**/

public class C_ExerciseEvaluateOperation {

    public static void main(String[] args) {
        System.out.println("Enter the math expression (e.g., 3 + 2 + 4 - 5 + 10 = )");
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


        System.out.println("Evaluating the expression: ");


        Visitor visitor = new Evaluator();
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

        feedback.Feedback.submit("session12_C", I_did_finish, I_did_understand, comment);
        */

    }
}

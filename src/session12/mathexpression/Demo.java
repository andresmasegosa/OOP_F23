package session12.mathexpression;

import java.util.Scanner;

/**
 * This class is able to parse expressions of the form: "3 + 4 + 5 =".
 *  - A white space should be included among all the symbols!!
 */

public class Demo {
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
    }
}

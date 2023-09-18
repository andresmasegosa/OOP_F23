package session1;
import feedback.Feedback;

/**
 * Try to understand the rationale behind the outputs
 */

class C_Excercise {
    public static void main(String[] args) {
        // Initializing an integer and a double variable with similar values
        int intValue = 10;
        double doubleValue = 10.0;

        // Displaying the initial values of the variables
        System.out.println("Original value of intValue: " + intValue);
        System.out.println("Original value of doubleValue: " + doubleValue);
        System.out.println();

        // Performing division on both variables
        intValue /= 4;
        doubleValue /= 4;

        // Displaying the values after division
        System.out.println("intValue after division: " + intValue);
        System.out.println("doubleValue after division: " + doubleValue);

        // Resetting the intValue and demonstrating the difference between
        // integer division (and casting) and direct floating-point division
        intValue = 10;
        double resultUsingIntDivision = intValue / 4.0;
        System.out.println("Result using integer division: " + resultUsingIntDivision);

        double resultUsingFloatDivision = intValue / 4.0;
        System.out.println("Result using floating-point division: " + resultUsingFloatDivision);


        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /**
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        Feedback.submit("session1_C", I_did_finish, I_did_understand, comment);
        */
    }

}
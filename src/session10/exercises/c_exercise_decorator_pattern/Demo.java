package session10.exercises.c_exercise_decorator_pattern;

import session10.solutions.c_exercise_decorator_pattern_solution.SendDataService;
import session10.solutions.c_exercise_decorator_pattern_solution.SendDataServiceBasic;

public class Demo {
    public static void main(String[] args) {
        SendDataService sendDataService = new SendDataServiceBasic("http://128.1.1.1");

        sendDataService.sendData("Hello");
        System.out.println();

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session10_C", I_did_finish, I_did_understand, comment);
        */

    }
}

package session4.A_Vehicle_Hierarchy;

import session4.B_Multiple_Inheritance.Vehicle;

/**
 * Exercise:
 * a) Create the classes, abstract-classes and interfaces to reproduce the Vehicle's
 * class diagram of the slides.
 * b) Uncomment the code below and try to understand the different statements
 */
public class Exercise {

    public static void main(String[] args) {


        /**
         * Porsche911's objects have the "speed" method because they are Vehicle's objects too.
         */
        //Porsche911 porsche911 = new Porsche911();
        //System.out.println(porsche911.speed());

        /**
         * Porsche911's objects have the "goFast" method because they are SportsCar's objects too.
         */
        //System.out.println(porsche911.goFast());


        /**
         * Volvo's objects have the "speed" method because they are Vehicle's objects too.
         */
        //Volvo volvo = new Volvo();
        //System.out.println(volvo.speed());

        /**
         * Volvo's objects do not have the "goFast" method because they are not SportsCar's objects.
         */
        //System.out.println(volvo.goFast()); //Compilation Error


        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session4_A", I_did_finish, I_did_understand, comment);
    */
    }
}

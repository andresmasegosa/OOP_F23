package session6.D_List.exercise;

import java.util.*;

/**
 * Exercise: Create a new comparator that allows ordering a list of Person objects by age.
 */
public class ExerciseSortList {

    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();

        people.add(new Person("Anders", 23));
        people.add(new Person("Mads", 28));
        people.add(new Person("Jakob", 21));

        //Comparator<Person> comparator = new CompareByAge();
        Comparator<Person> comparator = new CompareAlphabeticalOrder();

        people.sort(comparator);

        for (Person person: people){
            System.out.println(person);
        }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_D", I_did_finish, I_did_understand, comment);
        */
    }

}

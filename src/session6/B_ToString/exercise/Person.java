package session6.B_ToString.exercise;

/**
 * Exercise:
 * a) Run the code below and see the output.
 * b) Implement the toString method. If a person does not have middle name, it should be
 * properly displayed.
 * c) Run again the code below and see the output.
 */
public class Person {
    String firstName;
    String middleName;
    String lastName;
    int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "";
        this.age = age;
    }

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }



    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders", "Madsen", 38);
        System.out.println(person1);

        Person person2 = new Person("Anders", "M", "Madsen", 38);
        System.out.println(person2);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_B", I_did_finish, I_did_understand, comment);
        */
    }

}

package session6.A_EqualsMethod.exercise;

import java.util.Objects;

/**
 * Exercise:
 * a) Run the code below and see the output.
 * b) Then, implement the equals method such that:
 * two persons are equal if and only if they have
 * the same first name, same last name and same age.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders", "Madsen", 48);

        Person person2 = new Person("Anders", "M", "Madsen", 38);

        if (person1.equals(person2))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");


        System.out.println("HashCode of Person 1 : " + person1.hashCode());
        System.out.println("HashCode of Person 2 : " + person2.hashCode());

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_A", I_did_finish, I_did_understand, comment);
        */
    }

}

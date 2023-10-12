package session6.D_List.exercise;

public class Person {
    String name;
    int age;

    public Person(String firstName, int age) {
        this.name = firstName;
        this.age = age;
    }


    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders Madsen", 38);
        System.out.println(person1);

        Person person2 = new Person("Anders Madsen", 38);
        System.out.println(person2);

    }

}

package session6.C_generics.exercise;


import session6.C_generics.Book;
import session6.C_generics.Giraff;

/**
 * Exercise:
 *  a) Run the following code and see why the current implementation of a "List" does not provide type safety.
 *  b) Use generics to adapt the following implementation of a "List" to provide type safety.
 */
public class GenericList {
    private Object[] array;
    int count=0;

    public GenericList() {
        array = new Object[100];
    }

    public  void add(Object o) {
        array[count++]=o;
    }

    public Object get(int i) {
        return array[i];
    }

    public static void main(String[] args) {

        GenericList genericList = new GenericList();

        Giraff giraff = new Giraff();
        genericList.add(giraff);

        Book book = (Book) genericList.get(0);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_C", I_did_finish, I_did_understand, comment);
        */
    }
}

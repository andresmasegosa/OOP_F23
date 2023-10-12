package session6.E_Set;


import java.util.Set;
import java.util.TreeSet;


/**
 * Exercise:
 * a) Run the code below and try to understand why the size of this Set is equal to 6.
 * b) Overwrite the "equals" and "hashcode" methods of the class "Card" and try to understand why the size
 * of this set is now equal to 4.
 */
public class B_DemoCard {
    public static void main(String[] args) {
        Set<Card> cards = new TreeSet<>();

        cards.add(new Card("Ace of Hearts"));
        cards.add(new Card("Ace of Hearts"));
        cards.add(new Card("Queen of Spades"));
        cards.add(new Card("Queen of Spades"));
        cards.add(new Card("Ten of Hearts"));
        cards.add(new Card("Two of Clubs"));

        int size = cards.size();
        System.out.println(size);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_E", I_did_finish, I_did_understand, comment);
        */
    }
}

package session6.E_Set;

import java.util.HashSet;
import java.util.Set;

public class A_DemoSet {
    public static void main(String[] args) {
        Set<String> cards = new HashSet<>();

        cards.add("Ace of Hearts");
        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Two of Clubs");

        cards.remove("Ten of Hearts");
        int size = cards.size();

        System.out.println(size);

        for (String card : cards) {
            System.out.println(card);
        }
   }
}

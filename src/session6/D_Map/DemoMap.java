package session6.D_Map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<President, Integer> birthYear = new HashMap<>();

        birthYear.put(new President("George Washington"), 1732);
        birthYear.put(new President("Abraham Lincoln"), 1809);
        birthYear.put(new President("Barack Obama"), 1961);

        Integer obamaYear = birthYear.get(new President("Barack Obama"));

        System.out.println("Mr. Obama was born in: " + obamaYear);
        System.out.println();


    }
}

package session6.D_List;

import java.util.Comparator;

public class StringAlphabeticalOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

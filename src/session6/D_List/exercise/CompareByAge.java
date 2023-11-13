package session6.D_List.exercise;

import java.util.Comparator;

public class CompareByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()<o2.getAge())
            return -1;
        else if (o1.getAge()>o2.getAge())
            return 1;
        else
            return 0;
    }
}

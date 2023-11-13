package session9.d_enums;

public class DemoDay {
    public static void main(String[] args) {
        Day d = Day.FRIDAY;
        switch (d) {
            case MONDAY:
                System.out.println("Monday! Bummer!");
            case FRIDAY:
                System.out.println("Aww yeah!");
        }
    }
}

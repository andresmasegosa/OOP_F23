package session4.B_Multiple_Inheritance;

public class Porsche911 extends SportsCar {


    @Override
    public boolean goFast() {
        System.out.println("Going Fast!!!");
        return true;
    }

    @Override
    public int speed() {
        return 350;
    }
}

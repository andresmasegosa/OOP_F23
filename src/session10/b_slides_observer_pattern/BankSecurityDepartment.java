package session10.b_slides_observer_pattern;

public class BankSecurityDepartment implements AccountListener{
    @Override
    public void notify(double newBalance, double oldBalance) {
        double difference = newBalance - oldBalance;
        if (difference>1_000_000){
            System.err.println("WARNING!!!!!!!!!!!!!!!!!");
        }
    }
}

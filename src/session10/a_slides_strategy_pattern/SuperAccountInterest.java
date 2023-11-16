package session10.a_slides_strategy_pattern;

public class SuperAccountInterest implements InterestStrategy {
    public double getInterest(double balance) {
        return balance * 0.20;
    }
}

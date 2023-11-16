package session10.solutions.a_exercise_strategy_pattern;

public class PaymentByMobilePay implements PaymentMethod{
    @Override
    public boolean pay(double quantity) {
        return false;
    }
}

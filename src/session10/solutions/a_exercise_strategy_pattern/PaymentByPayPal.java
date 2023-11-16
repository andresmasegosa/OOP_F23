package session10.solutions.a_exercise_strategy_pattern;

import session10.solutions.a_exercise_strategy_pattern.payments_apis.PayPal;

public class PaymentByPayPal implements PaymentMethod{
    PayPal payPal;

    public PaymentByPayPal(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public boolean pay(double quantity) {
        return payPal.processPayment(quantity);
    }
}

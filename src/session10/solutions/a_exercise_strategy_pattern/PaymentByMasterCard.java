package session10.solutions.a_exercise_strategy_pattern;

import session10.solutions.a_exercise_strategy_pattern.payments_apis.MasterCard;

public class PaymentByMasterCard implements PaymentMethod{
    private MasterCard card;

    public PaymentByMasterCard(MasterCard card) {
        this.card = card;
    }

    @Override
    public boolean pay(double quantity) {
        return card.chargeToTheCreditCard(quantity);
    }

}

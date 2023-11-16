package session10.solutions.a_exercise_strategy_pattern;

import session10.solutions.a_exercise_strategy_pattern.payments_apis.MasterCard;
import session10.solutions.a_exercise_strategy_pattern.payments_apis.PayPal;

public class Demo {
    public static void main(String[] args) {

        Product iphone = new Product("Iphone", 10000);
        Product gloves = new Product("gloves", 500);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(iphone);
        shoppingCart.addProduct(gloves);

        MasterCard card = new MasterCard("Andres", 12345678, 123, 30_000);

        PaymentMethod  paymentMethod = new PaymentByMasterCard(card);
        if (shoppingCart.pay(paymentMethod)){
            System.out.println("Successful Payment");
        }else{
            System.out.println("Wrong Payment");
        }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session10_A", I_did_finish, I_did_understand, comment);
        */

    }
}

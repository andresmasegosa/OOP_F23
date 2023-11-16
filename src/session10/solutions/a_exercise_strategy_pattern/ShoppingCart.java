package session10.solutions.a_exercise_strategy_pattern;

import session10.solutions.a_exercise_strategy_pattern.payments_apis.MasterCard;
import session10.solutions.a_exercise_strategy_pattern.payments_apis.PayPal;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public double getTotalPrice(){
        double totalPrice=0;
        for (Product product: products){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }

    public boolean pay(PaymentMethod paymentMethod){
        return paymentMethod.pay(this.getTotalPrice());
    }

    /*
    public boolean pay(MasterCard card){
    }

    public boolean pay(PayPal payPal){
    }
    */
}

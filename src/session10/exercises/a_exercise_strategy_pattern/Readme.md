In this exercise, you have a class *ShoppingCart* where 
you can add  products (*Product* objects). Each product 
has a price. The *ShoppingCart* class covers two different
payment methods: by credit card (using a *CreditCard* object), 
and by PayPal (using a *PayPal* object). 

Try to refactor these classes using the **Strategy design 
pattern** to better handle the payment functionality.

Hints:
- Create a "PaymentMethod" interface with a method "boolean pay(double quantity)".
- Create two classes "PaymentByMasterCard" and "PaymentByPaypal" that implements the "PaymentMethod" interface.
- Fuse the two payment methods in the ShoppingCart class in a single one using the interface "PaymentMethod". 


package behavioralpatterns.strategy.examples.java;

public class PaypalPaymentMethod implements PaymentMethod{
    public void pay(int amount){       
        System.out.println("Paying " + amount + " using Paypal");
    }

}

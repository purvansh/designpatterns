package behavioralpatterns.strategy.examples.java;

public class CreditcardPaymentMethod implements PaymentMethod{
    public void pay(int amount){       
        System.out.println("Paying " + amount + " using Credit Card");
    }
    
}

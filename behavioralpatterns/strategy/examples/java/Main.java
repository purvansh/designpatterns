package behavioralpatterns.strategy.examples.java;

public class Main {
    
        public static void main(String[] args) {
            Context context = new Context();
            context.setPaymentMethod(new CreditcardPaymentMethod());
            context.pay(100);
            context.setPaymentMethod(new PaypalPaymentMethod());
            context.pay(100);
        }
}



public class Context {
    
    private PaymentMethod paymentMethod;

    public Context(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public Context() {
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(int amount){
        paymentMethod.pay(amount);
    }
    
}

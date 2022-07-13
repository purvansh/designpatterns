public abstract class Deliver {
    public void planDelivery() {
        Transport transport = createDelivery();
        transport.deliver();
     }
     abstract public Transport createDelivery();
}

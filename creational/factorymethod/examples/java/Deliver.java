public abstract class Deliver {
    public void planDelivery() {
        Transport transport = createDelivery();
        transport.deliver();
     }
     abstract public Transport createDelivery();    ///override this method in subclasses to create different types of transport
}

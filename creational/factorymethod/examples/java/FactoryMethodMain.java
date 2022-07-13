public class FactoryMethodMain {
    
    public static void main(String[] args) {
        Deliver deliver = new RoadDeliver();
        deliver.planDelivery();

        deliver = new BoatDeliver();
        deliver.planDelivery();
        
    }
}

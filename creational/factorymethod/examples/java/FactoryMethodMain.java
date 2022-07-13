public class FactoryMethodMain { //main class
    
    public static void main(String[] args) { //main method
        Deliver deliver = new RoadDeliver(); //create a new instance of RoadDeliver
        deliver.planDelivery();             //call the planDelivery method

        deliver = new BoatDeliver();    //create a new instance of BoatDeliver
        deliver.planDelivery();             //call the planDelivery method
        
    }
}

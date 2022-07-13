public class RoadDeliver extends Deliver { //extends Deliver

    public Transport createDelivery() {  //factory Method 
        return new Truck();  //returns a new instance of Truck
    }
}
    


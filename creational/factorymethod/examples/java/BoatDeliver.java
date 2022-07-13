public class BoatDeliver extends Deliver { //extends Deliver
    
    public Transport createDelivery() {    //factory Method 
        return new Boat();  //returns a new instance of Boat
    }
}
    


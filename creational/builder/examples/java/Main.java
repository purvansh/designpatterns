
public class Main {

    public static void main(String args[]){
        CarBuilderInterface b = new CarBuilder();
        b.setAirBags(true);
        b.setComputer(true);
        b.setGPS(true);
        b.setSeat(4);
        b.setSuspention(true);
        Car car = (Car)b.build();
        car.display();
    }
}

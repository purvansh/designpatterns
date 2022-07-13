
public class BuilderMain {

    public static void main(String args[]){
        CarBuilderInterface<Car> b = new CarBuilder();
        b.setAirBags(true);
        b.setComputer(true);
        b.setGPS(true);
        b.setSeat(4);
        b.setSuspention(true);
        Car car = b.build();
        car.display();
    }
}

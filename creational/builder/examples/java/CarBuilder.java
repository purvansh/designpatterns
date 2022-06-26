
public class CarBuilder implements CarBuilderInterface<Car> {
    private Car car;

    CarBuilder() {
        this.car = new Car();
    }

    public Car build() {
        Car newcar = this.car;
        return newcar;
    }

    @Override
    public Car setSeat(int state) {
        this.car.seat = state;
        return car;
    }

    @Override
    public Car setGPS(boolean state) {
        this.car.gps = state;
        return this.car;

    }

    @Override
    public Car setAirBags(boolean state) {
        this.car.airBags = state;
        return this.car;
    }

    @Override
    public Car setSuspention(boolean state) {
        this.car.suspention = state;
        return this.car;
    }

    @Override
    public Car setComputer(boolean state) {
        this.car.computer = state;
        return this.car;
    }

}
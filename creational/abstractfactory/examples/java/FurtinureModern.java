public class FurtinureModern implements Furtinure {
    @Override
    public Chair createChair() {
        return new ChairModern();
    }
    @Override
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTableModern();
    }
}
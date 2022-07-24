public class FurtinureTraditional implements Furtinure {
    @Override
    public Chair createChair() {
        return new ChairTraditional();
    }
    @Override
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTableTraditional();
    }
}
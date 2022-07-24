public class AbstractFactoryMain {
    public static void main(String argss[]) {
        Furtinure factory = new FurtinureModern();
        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        chair.legs();
        coffeeTable.legs();
        chair.sit();
        coffeeTable.design();
        Furtinure factory2 = new FurtinureTraditional();
        Chair chair2 = factory2.createChair();
        CoffeeTable coffeeTable2 = factory2.createCoffeeTable();
        chair2.legs();
        coffeeTable2.legs();
        chair2.sit();
        coffeeTable2.design();

    }
}

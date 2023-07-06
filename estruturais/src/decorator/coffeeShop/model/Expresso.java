package decorator.coffeeShop.model;

public class Expresso implements Drink {

    @Override
    public void serve() {
        System.out.println("- Adding 50ml of expresso");
    }

    @Override
    public double getPrice() {
        return 2.50;
    }

}

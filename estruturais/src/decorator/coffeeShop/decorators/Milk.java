package decorator.coffeeShop.decorators;

import decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30ml of Milk");
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.50;
    }

}

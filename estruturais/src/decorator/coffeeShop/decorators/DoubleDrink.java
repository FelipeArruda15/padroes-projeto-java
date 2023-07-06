package decorator.coffeeShop.decorators;

import decorator.coffeeShop.model.Drink;

public class DoubleDrink extends DrinkDecorator {

    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public double getPrice() {
        return drink.getPrice() * 2;
    }

}

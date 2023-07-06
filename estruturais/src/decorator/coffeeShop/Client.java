package decorator.coffeeShop;

import decorator.coffeeShop.decorators.DoubleDrink;
import decorator.coffeeShop.decorators.Milk;
import decorator.coffeeShop.model.Drink;
import decorator.coffeeShop.model.Expresso;
import decorator.coffeeShop.model.Tea;

public class Client {

    public static void order(String name, Drink drink) {
        System.out.println("Ordering a " + name);
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Expresso()));
        order("Cafe Au Lait", new Milk(new Expresso()));
        order("English Tea", new Milk(new Tea()));
        order("Double Cafe Au Lait ", new DoubleDrink(new Milk(new Expresso())));
    }

}

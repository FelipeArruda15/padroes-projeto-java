package br.com.felipearruda.builder.meal.fluent.builder;

import br.com.felipearruda.builder.meal.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {

    // Obrigatório
    private String side;
    // Opcionais
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder andDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder andMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal build() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }

}

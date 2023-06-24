package br.com.felipearruda.builder.meal.after.builder;

import br.com.felipearruda.builder.meal.after.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    protected FastFoodMeal meal;

    public FastFoodMealBuilder() {
        this.meal = new FastFoodMeal();
    }

    public void buildDrink() {
    };

    public void buildMain() {
    };

    public void buildSide() {
    };

    public void buildDessert() {
    };

    public void buildGift() {
    };

    public FastFoodMeal getMeal() {
        return meal;
    }
}

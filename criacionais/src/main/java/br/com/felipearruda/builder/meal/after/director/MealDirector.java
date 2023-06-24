package br.com.felipearruda.builder.meal.after.director;

import br.com.felipearruda.builder.meal.after.builder.FastFoodMealBuilder;
import br.com.felipearruda.builder.meal.after.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    // Faz a construção em partes do objeto
    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }

}

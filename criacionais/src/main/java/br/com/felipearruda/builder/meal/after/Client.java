package br.com.felipearruda.builder.meal.after;

import br.com.felipearruda.builder.meal.after.builder.FatMealBuilder;
import br.com.felipearruda.builder.meal.after.director.MealDirector;
import br.com.felipearruda.builder.meal.after.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        MealDirector director = new MealDirector(new FatMealBuilder());
        director.constructCombo();
        FastFoodMeal combo = director.getCombo();

        System.out.println(combo);
    }

}

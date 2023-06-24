package br.com.felipearruda.builder.meal.fluent;

import br.com.felipearruda.builder.meal.fluent.builder.FastFoodMealBuilder;
import br.com.felipearruda.builder.meal.fluent.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {

        FastFoodMeal meal = new FastFoodMealBuilder("Batata frita")
                .andMain("X-Bacon")
                .andDrink("Coca")
                .build();

        System.out.println("Pedido:");
        System.out.println(meal);

    }

}

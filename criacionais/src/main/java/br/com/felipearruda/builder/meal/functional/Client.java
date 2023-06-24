package br.com.felipearruda.builder.meal.functional;

import br.com.felipearruda.builder.meal.functional.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {

        FastFoodMeal meal = new FastFoodMeal.Builder("A")
                .andMain("X-Bacon")
                .andDrink("Coca")
                .build();

        System.out.println("Pedido:");
        System.out.println(meal);

    }

}

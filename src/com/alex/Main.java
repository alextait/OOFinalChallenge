package com.alex;

/**
 * Created by alex on 31/12/2016.
 */
public class Main {
    public static void main(String[] args){

        //Cheese burger
        Burger cheeseBurger = new Burger("Cheese burger","Brown");
        cheeseBurger.addIngredient( "Lettuce", 0.10D);
        cheeseBurger.addIngredient( "Cheese", 0.10D);
        System.out.println("Burger name :" + cheeseBurger.getName());
        System.out.println("Burger Price : " + cheeseBurger.getPrice());
        System.out.println("Ingredients : " + cheeseBurger.getIngredientList());

        System.out.println("\n");

        //Plain burger
        Burger plainBurger = new Burger("Plain Burger", "White");
        System.out.println("Burger name :" + plainBurger.getName());
        System.out.println("Burger Price : " + plainBurger.getPrice());
        System.out.println("Ingredients : " + plainBurger.getIngredientList());

        System.out.println("\n");

        //Healthy burger
        Burger healthyBurger = new HealthyBurger();
        System.out.println("Burger name :" + healthyBurger.getName());
        System.out.println("Burger Price : " + healthyBurger.getPrice());
        System.out.println("Ingredients : " + healthyBurger.getIngredientList());





    }
}

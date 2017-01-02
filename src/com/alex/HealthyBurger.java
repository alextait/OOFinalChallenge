package com.alex;

/**
 * Created by alex on 02/01/2017.
 */
public class HealthyBurger extends Burger{

    public HealthyBurger (){
        super("Healthy Burger", "Rye", 8);

        super.addIngredient("Lettuce", 0.10);
        super.addIngredient("Tomatoe", 0.10);
        super.addIngredient("Onion", 0.10);
        super.addIngredient("Avocado", 0.10);
        
    }

}

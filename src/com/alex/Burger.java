package com.alex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 31/12/2016.
 */
public class Burger {
    private String name;
    private double price;
    private int maxiumIngredients = 2; // default is to only allow the bun and the meat
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Burger(){

    }

    public Burger(String name, String bun) {
        this.name = name;
        addIngredient(getBunFromName(bun));
        addIngredient(new MeatBeef());
    }

    public Burger(String name, String bun, int maxiumIngredients) {
        this.name = name;
        this.maxiumIngredients = maxiumIngredients;
        addIngredient(getBunFromName(bun));
        addIngredient(new MeatBeef());
    }

    private Ingredient getBunFromName(String bunName){
        Ingredient bun = new BunWhite();
        switch(bunName){
            case "brown" :  bun =  new BunBrown();
            case "rye" :  bun = new BunRye();
            default :   bun = new BunWhite();
        }
        return bun;
    }

    public String getIngredientList(){
        String ingredientList = "";
        for(int i =0; i < this.ingredients.size(); i++){
            ingredientList += this.ingredients.get(i).getName() + "(" + this.ingredients.get(i).getPrice()  + ")";
        }
        return ingredientList;
    }

    public void increasePrice(double increase){
        double updatedPrice = this.price += increase;
    }

    public void addIngredient(String name, double price){
        Ingredient ingredient = new Ingredient(name, price);
        addIngredient(ingredient);
    }

    public void addIngredient(Ingredient ingredient){
        if(this.ingredients.size() < maxiumIngredients) {
            System.out.println("this.ingredients.size() -->" + this.ingredients.size());
            this.ingredients.add(ingredient);
            System.out.println("this.ingredients.size() -->" + this.ingredients.size());
            increasePrice(ingredient.getPrice());
            System.out.println("Adding ingredient."  + ingredient.getName());
        }else{
            System.out.println("You cannot add more ingredients to this burger.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }




}



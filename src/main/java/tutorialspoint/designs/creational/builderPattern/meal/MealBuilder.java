package main.java.tutorialspoint.designs.creational.builderPattern.meal;

import main.java.tutorialspoint.designs.creational.builderPattern.meal.burger.ChickenBurger;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.burger.VeggieBurger;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.drink.Coke;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.drink.Cola;

/**
 * Created by rodicad on 25/10/2017.
 */
public class MealBuilder {
    public Meal meal;

    public Meal prepareVeggieMeal() {
        Meal meal = new Meal();
        meal.addItem( new VeggieBurger() );
        meal.addItem( new Coke() );
        return meal;
    }

    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem( new ChickenBurger() );
        meal.addItem( new Cola() );
        return meal;
    };



}

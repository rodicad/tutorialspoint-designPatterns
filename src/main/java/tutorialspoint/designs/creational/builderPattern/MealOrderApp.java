package main.java.tutorialspoint.designs.creational.builderPattern;

import main.java.tutorialspoint.designs.creational.builderPattern.meal.Meal;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.MealBuilder;

/**
 * Created by rodicad on 25/10/2017.
 */
public class MealOrderApp {

    public static void main(String[] args) {
        MealBuilder mealOrder = new MealBuilder();
        Meal meal = mealOrder.prepareVeggieMeal();
        meal.showItems();
        System.out.println("meal total price: "+meal.getCost());

    }
}

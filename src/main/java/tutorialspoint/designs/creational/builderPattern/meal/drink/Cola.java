package main.java.tutorialspoint.designs.creational.builderPattern.meal.drink;

/**
 * Created by rodicad on 25/10/2017.
 */
public class Cola extends Drink {
    @Override public float price() {
        return (float) 1.20;
    }

    @Override public String name() {
        return "cola";
    }
}

package main.java.tutorialspoint.designs.creational.builderPattern.meal.drink;

import main.java.tutorialspoint.designs.creational.builderPattern.meal.packing.Bottled;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.Item;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.packing.Packing;

/**
 * Created by rodicad on 25/10/2017.
 */
public abstract class Drink implements Item {
    public abstract String name();

    @Override public Packing packing() {
        return new Bottled();
    }
}

package main.java.tutorialspoint.designs.creational.builderPattern.meal.burger;

import main.java.tutorialspoint.designs.creational.builderPattern.meal.Item;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.packing.Packing;
import main.java.tutorialspoint.designs.creational.builderPattern.meal.packing.Wrapping;

/**
 * Created by rodicad on 25/10/2017.
 */
public abstract class Burger implements Item {

    @Override public Packing packing() {
        return new Wrapping();
    }





}

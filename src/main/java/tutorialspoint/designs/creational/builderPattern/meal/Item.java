package main.java.tutorialspoint.designs.creational.builderPattern.meal;

import main.java.tutorialspoint.designs.creational.builderPattern.meal.packing.Packing;

/**
 * Created by rodicad on 25/10/2017.
 */
public interface Item {
    public String name();
    public float price();
    public Packing packing();

}

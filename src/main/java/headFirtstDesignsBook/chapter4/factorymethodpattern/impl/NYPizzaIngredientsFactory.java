package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.impl;

import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.interfaces.PizzaIngredientsFactory;

/**
 * Created by rodicad on 24/08/2017.
 */
public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override public Veggies[] createVeggies() {
        Veggies[]  veggies = {new Garlic(), new Onion(), new Mushroom()};
        return veggies;
    }
}

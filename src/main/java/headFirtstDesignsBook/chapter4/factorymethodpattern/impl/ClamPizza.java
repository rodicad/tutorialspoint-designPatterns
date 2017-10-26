package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.impl;

import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs.Pizza;
import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.interfaces.PizzaIngredientsFactory;

/**
 * Created by rodicad on 24/08/2017.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

}

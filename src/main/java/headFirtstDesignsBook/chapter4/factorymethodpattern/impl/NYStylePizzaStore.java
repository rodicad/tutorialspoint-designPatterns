package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.impl;

import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs.Pizza;
import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs.PizzaStore;
import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.interfaces.PizzaIngredientsFactory;

/**
 * Created by rodicad on 24/08/2017.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override protected Pizza createPizza( String type ) {
        Pizza pizza = null;

        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();

        if (type.equals( "cheese" )) {
            pizza = new CheesePizza( ingredientsFactory );
            pizza.setName("NY Cheese Pizza");
            return pizza;
        } else  if (type.equals( "clam" )) {
            pizza = new ClamPizza( ingredientsFactory );
            pizza.setName("NY Cheese Pizza");
            return pizza;
        } else return null;

    }



}

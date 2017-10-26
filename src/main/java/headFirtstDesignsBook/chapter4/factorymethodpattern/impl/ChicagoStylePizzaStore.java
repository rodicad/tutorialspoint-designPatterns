package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.impl;

import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs.Pizza;
import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs.PizzaStore;

/**
 * Created by rodicad on 19/10/2017.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override protected Pizza createPizza( String type ) {
        if (type.equals ("cheese")) {
            return new Chi
        }

    }
}

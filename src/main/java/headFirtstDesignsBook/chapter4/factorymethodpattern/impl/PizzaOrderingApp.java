package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.impl;

import main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs.PizzaStore;

/**
 * Created by rodicad on 24/08/2017.
 */
public class PizzaOrderingApp {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza( "cheese" );

    }
}

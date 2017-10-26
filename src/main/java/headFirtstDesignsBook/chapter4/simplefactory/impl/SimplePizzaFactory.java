package main.java.headFirtstDesignsBook.chapter4.simplefactory.impl;

import main.java.headFirtstDesignsBook.chapter4.simplefactory.interfaces.Pizza;

/**
 * Created by rodicad on 17/08/2017.
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}

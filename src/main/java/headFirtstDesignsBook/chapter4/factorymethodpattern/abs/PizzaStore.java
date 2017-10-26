package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs;


/**
 * Created by rodicad on 17/08/2017.
 */
public abstract class PizzaStore {
    Pizza pizza;

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type)  {
        Pizza pizza = createPizza( type );
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    };

}

package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.interfaces;

/**
 * Created by rodicad on 24/08/2017.
 */
public interface PizzaIngredientsFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

}

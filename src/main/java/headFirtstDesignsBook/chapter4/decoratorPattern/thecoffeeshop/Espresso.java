package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.thecoffeeshop;

/**
 * Created by rodicad on 10/08/2017.
 */
public class Espresso extends DarkRoast {
    private double cost = .9;

    public Espresso(){
        this.description = "expresso dark roast coffee";
    }

    public double cost(){
        return cost;
    }

    public String getDescription() {
        return description;
    }
}

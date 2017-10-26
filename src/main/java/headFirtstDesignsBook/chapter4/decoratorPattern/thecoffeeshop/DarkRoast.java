package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.thecoffeeshop;

/**
 * Created by rodicad on 10/08/2017.
 */
public class DarkRoast extends Beverage {
    private double cost = 1;

    public DarkRoast(){
        description ="dark roasted coffee";
    }

    @Override public double cost() {
        return cost;
    }

}

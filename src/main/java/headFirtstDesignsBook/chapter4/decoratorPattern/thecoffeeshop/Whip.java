package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.thecoffeeshop;

/**
 * Created by rodicad on 10/08/2017.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip (Beverage beverage){
        this.beverage = beverage;
    };

    public String getDescription() {
        return beverage.getDescription()+", whip cream";

    }


    @Override public double cost() {
        return 0.7+beverage.cost();
    }
}

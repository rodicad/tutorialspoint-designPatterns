package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.thecoffeeshop;

/**
 * Created by rodicad on 10/08/2017.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    };

    public String getDescription(){
        return beverage.getDescription()+", milk";
    }



    @Override public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost+=.10;
        } else if (getSize() == Beverage.VENTI) {
            cost+=.15;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .20;
        }
        return cost;
    }
}

package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.thecoffeeshop;

/**
 * Created by rodicad on 10/08/2017.
 */
public class CoffeeOrder {


    public static void main(String[] args) {
        Beverage bev1 = new DarkRoast();

        bev1 = new Milk(bev1);
        bev1 = new Whip(bev1);

        System.out.println("Cost of "+bev1.getDescription()+" is: "+bev1.cost());
    }
}

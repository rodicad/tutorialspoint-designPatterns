package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.thecoffeeshop;

/**
 * Created by rodicad on 10/08/2017.
 */
public abstract class Beverage {
    protected String description;
    protected String size;

    protected static final String TALL="tall";
    protected static final String VENTI="venti";

    protected static final String GRANDE="grande";



    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public String getSize(){
        return size;
    }
}

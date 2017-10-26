package main.java.headFirtstDesignsBook.chapter4.factorymethodpattern.abs;

/**
 * Created by rodicad on 24/08/2017.
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    Veggies[] veggies;

    abstract void prepare() ;


    void cut() {
        System.out.println("Cutting in 8 pieces");
    };

    void bake() {
        System.out.println("bakng at 350 degrees");
    };

    void box() {
        System.out.println("Placing pizza in a very cool box");
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

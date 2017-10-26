package main.java.headFirtstDesignsBook.chapter4.implementations;

import main.java.headFirtstDesignsBook.chapter4.interfaces.DisplayElement;
import main.java.headFirtstDesignsBook.chapter4.interfaces.Observer;

/**
 * Created by rodicad on 09/08/2017.
 */
public class CurrentDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weathedData;

    public CurrentDisplay(WeatherData weathedData) {
        this.weathedData = weathedData;
        weathedData.registerObserver( this );
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: temperature="+temperature+" degrees F \n humidity = "+humidity);
    }
}

package main.java.headFirtstDesignsBook.chapter4.implementations.builtinobersver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by rodicad on 10/08/2017.
 */
public class CurrentDisplay implements Observer {
    Observable obs;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentDisplay(Observable obs) {
        this.obs = obs;
        obs.addObserver( this );
    }



    @Override public void update( Observable o, Object arg ) {
        if (o instanceof WeatherData) {
            ( (WeatherData) o ).measurementsChanged();
        }
    }

    public void display() {
        System.out.println("Current conditions: temperature="+temperature+" degrees F \n humidity = "+humidity);

    }
}

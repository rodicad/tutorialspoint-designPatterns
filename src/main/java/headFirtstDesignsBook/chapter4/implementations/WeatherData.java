package main.java.headFirtstDesignsBook.chapter4.implementations;

import main.java.headFirtstDesignsBook.chapter4.interfaces.Observer;
import main.java.headFirtstDesignsBook.chapter4.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by rodicad on 09/08/2017.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList(  );
    }

    public void registerObserver(Observer o) {
        observers.add( o );
    }

    public void removeObserver(Observer o) {
        if (observers.indexOf(  o ) >=0) {
            observers.remove( o );
        }
    }


    public void notifyObservers() {
        for (int i = 0; i< observers.size(); i++ ){
            ((Observer) observers.get( i )).update(temperature, humidity, pressure);
        }
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public void measurementsChanged() {
        notifyObservers();
    }
}

package main.java.headFirtstDesignsBook.chapter4;

import main.java.headFirtstDesignsBook.chapter4.implementations.CurrentDisplay;
import main.java.headFirtstDesignsBook.chapter4.implementations.WeatherData;

/**
 * Created by rodicad on 09/08/2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay( weatherData );

        weatherData.setMeasurements( 10, 11, 12 );

    }

}



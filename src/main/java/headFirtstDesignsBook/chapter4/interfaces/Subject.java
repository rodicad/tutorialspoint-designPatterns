package main.java.headFirtstDesignsBook.chapter4.interfaces;

/**
 * Created by rodicad on 09/08/2017.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();


}

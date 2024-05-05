package models;

import basemodels.Observable;

public class Stock extends Observable {
    private final String name;
    private double price;
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}

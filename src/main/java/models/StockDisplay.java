package models;

import basemodels.Observable;
import basemodels.Observer;

public class StockDisplay implements Observer {
    private String displayIdentifier;
    public StockDisplay(String displayIdentifier) {
        this.displayIdentifier = displayIdentifier;
    }
    public String getDisplayIdentifier() {
        return this.displayIdentifier;
    }
    @Override
    public void update(Observable observable) {
        if(observable instanceof Stock){
            Stock stock = (Stock) observable;
            System.out.println("("+getDisplayIdentifier()+") "+"Stock update: " +
                    stock.getName() + " is now " + stock.getPrice());
        }
    }
}

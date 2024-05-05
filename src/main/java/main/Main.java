package main;

import models.Stock;
import models.StockDisplay;

public class Main {
    public static void main(String[] args) {
        Stock googleStock = new Stock("GOOG", 1800d);
        Stock appleStock = new Stock("AAPL", 1790d);
        Stock microsoftStock = new Stock("MSFT",1810d);

        StockDisplay display1 = new StockDisplay("Display 1");
        StockDisplay display2 = new StockDisplay("Display 2");

        googleStock.attach(display1);

        appleStock.attach(display2);

        microsoftStock.attach(display1);
        microsoftStock.attach(display2);

        googleStock.setPrice(1805d);
        System.out.print("\n");
        appleStock.setPrice(1807d);
        System.out.print("\n");
        microsoftStock.setPrice(1803);
        System.out.print("\n");
    }
}

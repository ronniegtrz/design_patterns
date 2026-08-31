package observer;
/** @author Ronnie */

import java.util.ArrayList;
import java.util.HashMap;
/**
 * this pushes out the updates when prices change
 */
public class StockMarketPublisher implements Subject {
    
    private ArrayList<Observer> observers = new ArrayList<>();
    private HashMap<String, Stock> stocks = new HashMap<>();
    /** Called by an Observers constructor */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
/** Removes an observer so its not being called anymore */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /** looks up stock by symbol moves the price and notifies the observers */
    public void updateStock(String symbol, double change){
        Stock stock = stocks.get(symbol);
        if (stock == null) 
        {
            return; // if the symbol is not found nothing to do
        }

        stock.updatePrice(change);
        Direction direction = change >= 0 ? Direction.UP : Direction.DOWN;
        notifyObservers(stock, direction);
    }
/** loops through every observer and calls update on each one */
    public void notifyObservers(Stock stock, Direction direction)
    {
        for (Observer o : observers){
            o.update(stock,direction);
        }
    }
    /** creates a new stock and stores it */
    public void addStock(String symbol, String companyName, Sector sector, double price) {
        stocks.put(symbol, new Stock(symbol, companyName, sector, price));
    }
}

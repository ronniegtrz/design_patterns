package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class StockMarketPublisher implements Subject {
    
    private ArrayList<Observer> observers = new ArrayList<>();
    private HashMap<String, Stock> stocks = new HashMap<>();

    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

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

    public void notifyObservers(Stock stock, Direction direction)
    {
        for (Observer o : observers){
            o.update(stock,direction);
        }
    }
    public void addStock(String symbol, String companyName, Sector sector, double price) {
        stocks.put(symbol, new Stock(symbol, companyName, sector, price));
    }
}

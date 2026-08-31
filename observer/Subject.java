package observer;
/**
 * this is what StockMarketPublisher will implement
 * @author Ronnie
 */
public interface Subject {
    /** adds an observer*/
    void registerObserver(Observer observer);
    /** removes an observer*/
    void removeObserver (Observer observer);
    /** notifies every observer of a stock update */
    void notifyObservers(Stock stock, Direction direction);
}

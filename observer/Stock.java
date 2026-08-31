package observer;
/** represents one stock being tracked by StockMarketPublisher */
public class Stock {
    private String symbol; 
    private String companyName;
    private Sector sector;
    private double price;
/** Creates a new stock at its starting price */
    public Stock(String symbol, String companyName, Sector sector, double price) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.sector = sector;
        this.price = price; 
    }
    /** updates the price by delta */ 
    public void updatePrice(double delta){
        price += delta;
    }

    public String getSymbol() { 
        return symbol; 
    }
    public String getCompanyName() {
        return companyName;
    }
    public Sector getSector() {
        return sector;
    }
    public double getPrice() {
        return price;
    }
}

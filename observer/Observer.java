package observer;

public abstract class Observer {
    private static final String RESET = "\033[0m";
    private static final String GREEN = "\033[32m";
    private static final String RED = "\033[31m";

    protected String name;
    protected Sector sector;
    protected String color;

    public Observer(Subject publisher, String name, Sector sector, String color){
        this.name = name;
        this.sector = sector;
        this.color = color; 

        publisher.registerObserver(this);

        System.out.println(color + name.toUpperCase()+ RESET + " is monitoring the market");
    }

    public void update(Stock stock, Direction direction) {
        if (stock.getSector() != sector) {
            return; 
        }

        String arrowColor = direction == Direction.UP ? GREEN : RED;
        String arrow = direction == Direction.UP ? "^" : "v";

        String priceText = (direction == Direction.UP ? "$" : "$ ") + stock.getPrice();

        System.out.println(color + name.toUpperCase() + RESET + ": " + stock.getCompanyName()
                + "(" + stock.getSymbol() + ") is now priced at " + arrowColor + priceText
                + RESET + " " + arrowColor + arrow + RESET);
    }
}

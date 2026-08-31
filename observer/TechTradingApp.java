package observer;

public class TechTradingApp extends Observer {
    public TechTradingApp(Subject publisher, String name){
        super(publisher, name, Sector.TECHNOLOGY, "\033[33mm");
    }
}

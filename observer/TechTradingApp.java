package observer;
/** watches the tech stocks, make them appear in yellow. 
 * @author Ronnie
*/
public class TechTradingApp extends Observer {
    /** creates a tech trading app and registers it */
    public TechTradingApp(Subject publisher, String name){
        super(publisher, name, Sector.TECHNOLOGY, "\033[33m"); //color: yellow
    }
}

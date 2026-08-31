package observer;
/** Observer that only reacts to finance sector stock updates*
 * @author Ronnie
 * FinanceTradingApp
*/
public class FinanceTradingApp extends Observer {
/** creates a finance trading app and registers it with the publisher
* @param publisher the market this app subscribes to
* @param name this displays name for this app*
 */
    public FinanceTradingApp(Subject publisher, String name) {
        super(publisher, name, Sector.FINANCE, "\033[35m"); // color:purple
    }
}

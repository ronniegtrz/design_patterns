/** 
 * @author Ronnie
 */
package decorator;
/**
 * 
 * Decorates the player with armor art
 */
public class Armor extends GearAdder {
    public Armor(Player player){
        super(player, FileReader.getLines("decorator/armor.txt"));
    }
}

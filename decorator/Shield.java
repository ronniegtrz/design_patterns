package decorator;
/**
 * @author Ronnie
 * 
 * Decorates the player with the shied Art
 */
public class Shield extends GearAdder {
    public Shield(Player player){
        super(player, FileReader.getLines("shield.txt"));
    }
}

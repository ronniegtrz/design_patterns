package decorator;
/**
 * @author Ronnie
 * 
 * Decorates player with Sword art.
 */
public class Sword extends GearAdder{
    public Sword(Player player){
        super(player, FileReader.getLines("decorator/sword.txt"));
    }
}

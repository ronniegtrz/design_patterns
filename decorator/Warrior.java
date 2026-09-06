package decorator;
/**
 * @author Ronnie
 * 
 */
public class Warrior extends Player {
    public Warrior(String name){
        super(FileReader.getLines("decorator/warrior.txt"), name);
    }
}

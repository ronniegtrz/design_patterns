package decorator;
/**
 * @author Ronnie
 * 
 */
public class Warrior extends Player {
    public Warrior(String name){
        super(FileReader.getLines("warrior.txt"), name);
    }
}

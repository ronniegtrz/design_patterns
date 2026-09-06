package decorator;
import java.util.ArrayList;
/**
 * @author Ronnie
 * 
 * represents a player character made of art lines
 */
public class Player  {
    protected String name; 
    protected ArrayList<String> character; 
    /** 
     * creates a player with its art lines and a name.
     */
    public Player(ArrayList<String> character, String name) {
        this.character = character;
        this.name = name;
    }
    /**
     * name getter
     * 
     */
    public String getName() {
        return name; 
    }
    
    @Override
    public String toString() {
        String header = "#### " + name + " ####";
        String art = String.join("\n", character);
        return header + "\n" + art; 
    }
}


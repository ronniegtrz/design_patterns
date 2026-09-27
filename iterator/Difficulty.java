package iterator;
/**
 * @author Ronnie
 * 
 * represents the difficulty with its assigned color
 */
public enum Difficulty {
    HARD("\u001B[31m"), 
    MEDIUM("\u001B[32m"),
    EASY("\u001B[33m");
/**
 * the color code used to print difficulty
 */
    public String ASCII; 
    /**
     * sets the difficulty's color code
     */
    private Difficulty (String ascii) {
        this.ASCII = ascii;
    }

}

package iterator;
/**
 * @author Ronnie
 */
public class Ticket {
    private String name; 
    private String teamMember;
    private Difficulty difficulty;
   /**
    * creates a ticket with a name, team member, and difficulty.
    */
    public Ticket(String name, String teamMember, Difficulty difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }
/**
 * returns the tickets name
 */
    public String getName() {
        return name; 
    }
/**
 * Returns the ticket as one colored line of text
 */
    public String toString() {
        String capitalized = difficulty.name().charAt(0) + difficulty.name().substring(1).toLowerCase();
        return difficulty.ASCII + name + "(Difficulty: " + capitalized + ") - " + teamMember + "\033[0m";
    }
}

package iterator;

public class Ticket {
    private String name; 
    private String teamMember;
    private Difficulty difficulty;

    public Ticket(String name, String teamMember, Difficulty difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name; 
    }

    public String toString() {
        String capitalized = difficulty.name().charAt(0) + difficulty.name().substring(1).toLowerCase();
        return difficulty.ASCII + name + "(Difficulty: " + capitalized + ") - " + teamMember + "\033[0m";
    }
}

package iterator;
/**
 * @author Ronnie
 */
public class SCRUMBoard {
    
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done; 
/**
 * Creates a board with the projects name and three empty categories
 */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName; 
        todo = new TaskList("ToDo");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }
/**
 * adds a new ticket to the ToDo columns
 */
    public void addTicket(String name, String teamMember, Difficulty difficulty) {
        todo.addTicket(name, teamMember, difficulty);
    }
/**
 * Moves ticket from ToDo to Doing if it is found
 */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket == null) {
            return false; 
        }
        doing.addTicket(ticket);
        return true; 
    }
/**
 * Moves a ticket from Doing to Done if found.
 */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket == null) {
            return false;
        }
        done.addTicket(ticket);
        return true;
    }
/**
 * Returns the project name and all three categories to text
 */
    public String toString() {
        return "***** " + projectName + " *****\n" + todo + "\n" + doing + "\n" + done;
    }
}

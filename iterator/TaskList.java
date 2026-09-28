package iterator;
/**
 * @author Ronnie
 */
import java.util.Arrays;
/**
 * one category on the board that holds a list of tickets
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name; 
/**
 * creates an empty category with a name
 * @param name the columns name such as ToDo
 */
    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[50];
        this.count = 0; 
    }
/**
 * Builds a new ticket and adds it to this category
 */
    public void addTicket(String name, String teamMember, Difficulty difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }
/**
 * Adds an existing ticket to the next open spot in this category
 */
    public void addTicket(Ticket ticket) {
        tickets[count] = ticket;
        count++;
    }
/**
 * Finds a ticket by name and removes it from the category
 */
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getName().equals(name)) {
                Ticket found = tickets[i];
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j +1]; 
                }
                count--;
                return found;
            }
        }
        return null; 
    }
/**
 * Creates an iterator that walks through the tickets in this column
 */
    public TaskListIterator createIterator() {
        Ticket[] filled = Arrays.copyOfRange(tickets, 0, count);
        return new TaskListIterator(filled);
    }

    /**    
     * Returns the categories name followed by the tickets
     */
    @Override
    public String toString() {
        String result = name + ":\n";
        TaskListIterator iterator = createIterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            result = result + "- " + ticket + "\n";
        }
        return result;
    }
}

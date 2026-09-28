package iterator;
/**
 * @author Ronnie
 */
import java.util.Iterator;
/**
 * 
 * goes through an array of tickets one at a time
 */
public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position;
/**
 * Creates an iterator that starts at the first ticket
 */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }
/**
 * checks if there is another ticket left to look at
 */
    @Override 
    public boolean hasNext() {
        return position < tickets.length;
    }
/**
 * Returns the current ticket then moves on to the next one in the array. 
 */
    @Override 
    public Ticket next() {
        Ticket ticket = tickets[position];
        position++;
        return ticket;
    }
}

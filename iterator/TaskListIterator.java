package iterator;

import java.util.Iterator;

public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < tickets.length;
    }

    public Ticket next() {
        Ticket ticket = tickets[position];
        position++;
        return ticket;
    }
}

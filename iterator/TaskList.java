package iterator;

import java.util.Arrays;

public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name; 

    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[50];
        this.count = 0; 
    }

    public void addTicket(String name, String teamMember, Difficulty difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }

    public void addTicket(Ticket ticket) {
        tickets[count] = ticket;
        count++;
    }

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

    public TaskListIterator createIterator() {
        Ticket[] filled = Arrays.copyOfRange(tickets, 0, count);
        return new TaskListIterator(filled);
    }

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

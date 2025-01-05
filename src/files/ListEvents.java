package files;

import java.util.ArrayList;
import java.util.List;

public class ListEvents {

    private List<Event> events;

    public ListEvents() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void removeEvent(Event event) {
        this.events.remove(event);
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public void displayEvents() {
        if (this.events.isEmpty()) {
            System.out.println("Aucun événement à afficher.");
        } else {
            for (Event event : events) {
                System.out.println("Titre de l'événement : " + event.getTitle());
                System.out.println("Description : " + event.getDescription());
                System.out.println("Lieu : " + event.getPlace());
                System.out.println("Date de début : " + event.getStartDate());
                System.out.println("Date de fin : " + event.getEndDate());
                System.out.println("--------------------------");
            }
        }
    }
}

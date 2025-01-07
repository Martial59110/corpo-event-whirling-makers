package files;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
    	Admin admin = new Admin("Admin", "Admin", "admin@test.fr", "1234", false);
    	ListCollaborators listCollaborator = new ListCollaborators();
        System.out.println("Application has started!");
        admin.addUser("John", "Doe", "jdoe@test.fr", "1234", listCollaborator);
        admin.addUser("Jane", "Doe", "jadoe@test.fr", "1234", listCollaborator);
        for(Collaborator n : listCollaborator) {
        	System.out.println(n.getFirstName());
        }
        ListEvents listEvent = new ListEvents();
        admin.addEvent("afterwork nouvel an", "C'est un afterwork pour nouvel an","Simplon Valenciennes", LocalDateTime.of(2025, Month.JANUARY, 30, 20, 00), LocalDateTime.of(2025, Month.JANUARY, 30, 23, 00), true, listEvent);
        for(Event n : listEvent) {
        	System.out.println(n.getTitle());
        	System.out.println(n.getStartDate());
        	System.out.println(n.getEndDate());
        }
    }
}

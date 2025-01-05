package files;

import java.util.ArrayList;
import java.util.List;

public class ListCollaborators {
	private List<Collaborator> collaborators;

    public ListCollaborators() {
        this.collaborators = new ArrayList<>();
    }

    public void addCollaborator(Collaborator collaborator) {
        this.collaborators.add(collaborator);
    }

    public void removeCollaborator(Collaborator collaborator) {
        this.collaborators.remove(collaborator);
    }

    public List<Collaborator> getCollaborators() {
        return this.collaborators;
    }

    public void displayCollaborators() {
        if (this.collaborators.isEmpty()) {
            System.out.println("Aucun collaborateurs à afficher.");
        } else {
            for (Collaborator collaborator : collaborators) {
            	 System.out.println("Nom : " + collaborator.getFirstName() + " " + collaborator.getLastName());
                 System.out.println("Email : " + collaborator.getEmail());
                 System.out.println("---------------------------");
            }
        }
    }
}

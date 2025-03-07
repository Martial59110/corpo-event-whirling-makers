package files;

import java.time.LocalDateTime;

public class Admin extends Collaborator {

    public Admin(String firstName, String lastName, String email, String password, Boolean isConnected) {
        super(firstName, lastName, email, password, isConnected);
    }

  
    public void addUser(String firstName, String lastName, String email, String password, ListCollaborators list) {
        Collaborator collaborator = new Collaborator(firstName, lastName, email, password, false);
        list.addCollaborator(collaborator);
        System.out.println("Utilisateur ajouté : " + collaborator.getFirstName() + " " + collaborator.getLastName());
    }


    public void deleteUser(Collaborator collaboratorToDelete, ListCollaborators list) {        
        if (collaboratorToDelete != null) {
            list.removeCollaborator(collaboratorToDelete);
            System.out.println("Utilisateur supprimé : " + collaboratorToDelete.getFirstName() + " " + collaboratorToDelete.getLastName());
        } else {
            System.out.println("Cet utilisateur n'existe pas dans la liste.");
        }
    }


   
    public void deleteAnyComment(Comment comment, Event event, Collaborator owner) {
        if (comment.getOwner() == owner) {
            event.removeComment(comment);
            System.out.println("Commentaire supprimé de " + owner.getFirstName() + " : " + comment.getContent());
        } else {
            System.out.println("Vous ne pouvez supprimer que les commentaires de " + owner.getFirstName());
        }
    }

 
    public void modifyAnyEvent(Event eventToModify, ListEvents list, String newTitle, String newDescription, String newPlace, LocalDateTime newStartDate, LocalDateTime newEndDate, Collaborator owner) {
        if (eventToModify != null) {
            eventToModify.setTitle(newTitle);
            eventToModify.setDescription(newDescription);
            eventToModify.setPlace(newPlace);
            eventToModify.setStartDate(newStartDate);
            eventToModify.setEndDate(newEndDate);
            System.out.println("Événement modifié pour " + owner.getFirstName() + " : " + newTitle);
        } else {
            System.out.println("Aucun événement trouvé avec ce titre : " + title);
        }
    }


  
    public void deleteAnyEvent(Event eventToDelete, ListEvents list, Collaborator owner) {
        if (eventToDelete != null) {
            list.removeEvent(eventToDelete); 
            System.out.println("Événement supprimé par " + owner.getFirstName() + " : " + eventToDelete.getTitle());
        } else {
            System.out.println("Aucun événement trouvé avec ce titre : " + title);
        }
    }

}

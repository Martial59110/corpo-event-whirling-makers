package files;

import java.time.LocalDateTime;

public class Collaborator {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected Boolean isConnected = false;

    public Collaborator(String firstName, String lastName, String email, String password, Boolean isConnected) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setIsConnected(isConnected);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty())
            this.firstName = firstName;
        else
            this.firstName = "Aucun";
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty())
            this.lastName = lastName;
        else
            this.lastName = "Aucun";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.isEmpty())
            this.email = email;
        else
            this.email = "Aucun";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() >= 6)
            this.password = password;
        else
            this.password = "Aucun";
    }

    public Boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(Boolean isConnected) {
        if (isConnected != null)
            this.isConnected = isConnected;
        else
            this.isConnected = false;
    }

    public Boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Vous êtes bien connecté !");
            isConnected = true;
            return true;
        } else {
            System.out.println("Connexion échouée");
            return false;
        }
    }

    public void logout() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Vous êtes déconnecté.");
        } else {
            System.out.println("La session est déjà déconnectée.");
        }
    }

    public void changePassword(String newPassword) {
        setPassword(newPassword);
    }

    public void viewingProfile() {
        System.out.println("Profil de l'utilisateur :");
        System.out.println("Nom : " + firstName + " " + lastName);
        System.out.println("Email : " + email);
    }

    public void addComment(String content, LocalDateTime publication, Event event) {
        Comment comment = new Comment(content, publication, this, event);
        event.addComment(comment);  
    }

    public void modifyOwnComment(Comment comment, String newContent) {
        if (comment.getOwner() == this) {
            comment.setContent(newContent);
            System.out.println("Commentaire modifié !");
        } else {
            System.out.println("Vous ne pouvez modifier que vos propres commentaires.");
        }
    }

    public void deleteOwnComment(Comment comment, Event event) {
        if (comment.getOwner() == this) {
            event.removeComment(comment); 
            System.out.println("Commentaire supprimé !");
        } else {
            System.out.println("Vous ne pouvez supprimer que vos propres commentaires.");
        }
    }

    public void addEvent(String title, String description, String place, LocalDateTime startDate, LocalDateTime endDate, Boolean isDisplay, ListEvents list) {
        Event newEvent = new Event(title, description, place, startDate, endDate, this, isDisplay);
        list.addEvent(newEvent);
        System.out.println("Événement ajouté : " + title);
    }

    public void modifyOwnEvent(Event eventToModify, ListEvents list, String newTitle, String newDescription, String newPlace, LocalDateTime newStartDate, LocalDateTime newEndDate) {
        if (eventToModify != null) {
            if (eventToModify.getOwner() == this) {
                eventToModify.setTitle(newTitle);
                eventToModify.setDescription(newDescription);
                eventToModify.setPlace(newPlace);
                eventToModify.setStartDate(newStartDate);
                eventToModify.setEndDate(newEndDate);
                System.out.println("Événement modifié : " + newTitle);
            } else {
                System.out.println("Vous ne pouvez modifier que vos propres événements.");
            }
        } else {
            System.out.println("Aucun événement trouvé avec ce titre : " + title);
        }
    }


    public void deleteOwnEvent(Event eventToDelete, ListEvents list) {
        if (eventToDelete != null) {
            if (eventToDelete.getOwner() == this) {
                list.removeEvent(eventToDelete);
                System.out.println("Événement supprimé : " + eventToDelete.getTitle());
            } else {
                System.out.println("Vous ne pouvez supprimer que vos propres événements.");
            }
        } else {
            System.out.println("Aucun événement trouvé avec ce titre : " + title);
        }
    }


}


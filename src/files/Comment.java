package files;

import java.time.LocalDateTime;

public class Comment {
    private Collaborator owner;
    private String content;
    private LocalDateTime publication;
    private LocalDateTime modification;
    private Event event;

    public Comment(String content, LocalDateTime publication, Collaborator owner, Event event) {
        this.setContent(content); 
        this.setPublication(publication); 
        this.setOwner(owner);  
        this.setEvent(event);  
        this.setModification(null); 
    }

    public Collaborator getOwner() {
        return owner;
    }

    public void setOwner(Collaborator owner) {
        if (owner != null) {
            this.owner = owner;
        } else {
            System.out.println("Le propriétaire du commentaire ne peut pas être nul.");
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content != null && !content.isEmpty()) {
            this.content = content;
            this.modification = LocalDateTime.now();
        } else {
            System.out.println("Le contenu du commentaire ne peut pas être vide.");
            this.content = "Commentaire par défaut"; 
        }
    }

    public LocalDateTime getPublication() {
        return publication;
    }

    public void setPublication(LocalDateTime publication) {
        if (publication != null) {
            this.publication = publication;
        } else {
            System.out.println("La date de publication ne peut pas être nulle.");
            this.publication = LocalDateTime.now(); 
        }
    }

    public LocalDateTime getModification() {
        return modification;
    }

    public void setModification(LocalDateTime modification) {
        this.modification = modification;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        if (event != null) {
            this.event = event;
        } else {
            System.out.println("L'événement associé au commentaire ne peut pas être nul.");
        }
    }
}

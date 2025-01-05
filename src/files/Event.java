package files;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {

    private Collaborator owner;
    private String title;
    private String description;
    private String place;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean isDisplay;
    private List<Comment> comments;

    public Event(String title, String description, String place, LocalDateTime startDate, LocalDateTime endDate, Collaborator owner, boolean isDisplay) {
        this.setTitle(title);
        this.setDescription(description);
        this.setPlace(place);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setOwner(owner);
        this.setIsDisplay(isDisplay);
        this.comments = new ArrayList<>();
    }

    public Collaborator getOwner() {
        return owner;
    }

    public void setOwner(Collaborator owner) {
        if (owner != null) {
            this.owner = owner;
        } else {
            System.out.println("Le propriétaire de l'événement ne peut pas être nul.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Le titre de l'événement ne peut pas être vide.");
            this.title = "Titre par défaut";
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null && !description.isEmpty()) {
            this.description = description;
        } else {
            System.out.println("La description ne peut pas être vide.");
            this.description = "Description par défaut";
        }
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if (place != null && !place.isEmpty()) {
            this.place = place;
        } else {
            System.out.println("Le lieu de l'événement ne peut pas être vide.");
            this.place = "Lieu par défaut";
        }
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        if (startDate != null) {
            this.startDate = startDate;
        } else {
            System.out.println("La date de début ne peut pas être nulle.");
            this.startDate = LocalDateTime.now(); 
        }
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        if (endDate != null && (this.startDate == null || !endDate.isBefore(this.startDate))) {
            this.endDate = endDate;
        } else {
            System.out.println("La date de fin ne peut pas être antérieure à la date de début.");
            this.endDate = this.startDate != null ? this.startDate.plusHours(1) : LocalDateTime.now().plusHours(1); 
        }
    }

    public boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        if (comment != null) {
            this.comments.add(comment);
        } else {
            System.out.println("Le commentaire ne peut pas être nul.");
        }
    }

    public void removeComment(Comment comment) {
        if (comment != null && this.comments.contains(comment)) {
            this.comments.remove(comment);
        } else {
            System.out.println("Le commentaire à supprimer n'existe pas.");
        }
    }
}


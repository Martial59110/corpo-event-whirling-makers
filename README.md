# corpo-event-whirling-makers

Ce dépôt est associé à **Corpo Event**, une plate-forme d'entreprise dédiés au partage d'évènements.

Il est organisé en deux parties principales : la **documentation** et le **code source**.
- La partie **documentation** détaille les règles de gestions de la plate-forme ainsi que la conception du projet au moyen de diagrammes UML. Elle inclut:
    - Un diagramme de cas d'utilisation et de classe représentant la totalité de la plate-forme.
    - Un diagramme de séquence se concentrant sur deux actions spécifiques: l'ajout et la modification d'un évènement.
- La **partie source**, développée en Java, contient les classes et méthodes définies lors de la phase de conception.

## Sommaire:
- [Partie documentation](./doc/)
    - [Règles de gestions](./doc/regles-gestion.md)
    - [Diagramme de cas d'utilisation](./doc/cas-utilisation.jpg)
    - [Diagramme de classe](./doc/diagramme-classe.jpg)
    - [Diagramme de séquence sur l'ajout d'un événement](./doc/diagramme-sequence-creation.jpg)
    - [Diagramme de séquence sur la modification d'un événement](./doc/diagramme-sequence-modification.jpg)
- [Partie code source](./src/files/)
    - [La classe *Admin*](./src/files/Admin.java)
    - [La classe *Collaborator*](./src/files/Collaborator.java)
    - [La classe *Comment*](./src/files/Comment.java)
    - [La classe *Event*](./src/files/Event.java)
    - [La classe *ListCollaborators*](./src/files/ListCollaborators.java)
    - [La classe *ListEvents*](./src/files/ListEvents.java)

## Fonctionnement du code

Notre dossier source contient les classes et méthodes qui ont été développées conformément au diagramme de classes, à l'exception de la classe App, qui contient la méthode main. Cette méthode main sert de point d'entrée pour l'application et permet d'appeler toutes les autres classes et méthodes du projet. Pour faciliter la démonstration de certaines fonctionnalités, nous avons ajouté une méthode start dans la classe App.

Dans cette méthode start, nous avons intégré une démonstration qui réalise les actions suivantes :
- Ajout d'un administrateur (Admin).
- Ajout de deux utilisateurs, qui sont ensuite affichés.
- Ajout d'un événement, qui est ensuite affiché.

Comment lancer la démo dans Eclipse :
- Ouvrez le dossier src dans votre IDE Eclipse.
- Exécutez le programme en cliquant sur Run. Cela lancera la méthode main et exécutera la démo.
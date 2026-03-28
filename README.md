# TP 0 — Introduction à Jakarta EE

## Description

Ce projet correspond au TP 0 du cours. L’objectif est de se familiariser avec les bases de Jakarta EE, notamment :

- JSF (Jakarta Faces)
- CDI (Context and Dependency Injection)
- Maven
- Déploiement sur Payara

L’application développée est une interface web de type chat permettant à l’utilisateur de saisir une question, de choisir un rôle, et d’obtenir une réponse générée côté serveur.

---

## Technologies utilisées

- Java 21
- Jakarta EE (JSF, CDI)
- Maven
- Payara Server
- PrimeFaces

---

## Fonctionnalités

- Saisie d’une question utilisateur
- Choix d’un rôle (Assistant, Traducteur, Guide touristique)
- Génération d’une réponse côté serveur
- Affichage de la réponse
- Historique de la conversation
- Blocage du changement de rôle après la première question
- Bouton "Nouveau chat" pour réinitialiser

---

## Fonctionnement

1. L’utilisateur saisit une question dans l’interface JSF.
2. La requête est envoyée au serveur.
3. Le backing bean `Bb` traite la demande.
4. Le service `Modificateur` génère une réponse.
5. La réponse et l’historique sont affichés.

---

## Traitement implémenté

Le traitement côté serveur consiste à :

- Transformer la question (ex : changement de casse)
- Encadrer la réponse avec `||`
- Ajouter le rôle système au début de la première réponse
- Construire un historique de conversation

---

## Gestion des erreurs

Si la question est vide :

- Une validation est effectuée dans le backing bean
- Un message d’erreur est affiché avec `FacesMessage`
- Le traitement est interrompu (`return null`)
- L’utilisateur reste sur la même page

---

## Structure du projet

src/
 └── main/
     ├── java/
     │    └── ht/pierre/tp0/tp0pierre/
     │         ├── jsf/
     │         │    ├── Bb.java
     │         │    └── Utilisateur.java
     │         └── service/
     │              └── Modificateur.java
     ├── resources/
     └── webapp/
          ├── index.xhtml
          ├── presentation.xhtml
          ├── hello.xhtml
          ├── resources/
          │    ├── css/
          │    └── js/
          └── WEB-INF/
               └── web.xml

---

## Exécution

1. Lancer Payara Server
2. Compiler le projet :

mvnw.cmd clean package

3. Déployer le fichier `.war` sur Payara
4. Accéder à l’application :

http://localhost:9090/tp0-pierre-1.0-SNAPSHOT/

---

## Auteur

Dawens Holtzman PIERRE
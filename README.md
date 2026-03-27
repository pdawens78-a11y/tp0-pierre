# TP 0 — Introduction à Jakarta EE

## 📌 Description

Ce projet correspond au **TP 0** du cours, dont l’objectif est de se familiariser avec les bases de **Jakarta EE**, notamment :

* JSF (Jakarta Faces)
* CDI (Context and Dependency Injection)
* Maven
* Git et GitHub

L’application développée est une **interface web simple de type chat** permettant à l’utilisateur de saisir une question, de choisir un rôle, et d’obtenir une réponse générée côté serveur.

---

## ⚙️ Technologies utilisées

* Java
* Jakarta EE (JSF, CDI)
* Maven
* Payara Server
* PrimeFaces
* Git / GitHub

---

## 🚀 Fonctionnalités

* Saisie d’une question par l’utilisateur
* Choix d’un rôle (Assistant, Traducteur, Guide)
* Génération d’une réponse côté serveur
* Affichage de la réponse
* Historique de la conversation
* Interface web simple avec JSF

---

## 🧠 Fonctionnement

1. L’utilisateur saisit une question dans l’interface.
2. La requête est envoyée au serveur via JSF.
3. Le `ChatBean` (backing bean) traite la question.
4. Une réponse est générée (traitement personnalisé).
5. La réponse et l’historique sont affichés dans la page.

---

## ✨ Traitement personnalisé

Le traitement implémenté consiste à :

* Transformer la question en majuscules
* Ajouter un message de confirmation pour améliorer la lisibilité

---

## ⚠️ Gestion des erreurs

Si la question est vide :

* La méthode `envoyer()` retourne `null`
* Aucun traitement n’est effectué
* L’utilisateur reste sur la même page
* Aucune réponse vide n’est affichée

---

## 📁 Structure du projet

```
src/
 └── main/
     ├── java/
     │    └── ht/pierre/tp0/tp0pierre/jsf/ChatBean.java
     ├── resources/
     └── webapp/
          ├── index.xhtml
          ├── resources/
          │    └── css/style.css
          └── WEB-INF/web.xml
```

---

## ▶️ Exécution

1. Lancer le serveur Payara
2. Déployer le projet via IntelliJ
3. Accéder à l’application :

```
http://localhost:9090/tp0-pierre-1.0-SNAPSHOT/
```

---

## 👤 Auteur

Dawens Holtzman PIERRE

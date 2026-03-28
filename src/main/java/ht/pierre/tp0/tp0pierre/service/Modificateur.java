package ht.pierre.tp0.tp0pierre.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;
import java.util.Locale;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent // Portée CDI pour rendre la classe injectable par CDI dans les autres classes.
// Portée Dependent : l'instance sera supprimée quand la classe qui l'a injectée sera supprimée.
public class Modificateur implements Serializable { // Car CDI peut mettre l'instance en mémoire secondaire.
    /**
     * Modificateur de question.
     *
     * @param question    La question à modifier.
     * @param roleSysteme Le rôle système à utiliser pour la modification de la question.
     * @return La question modifiée : le rôle système en majuscule au début de la question, s'il n'est pas null,
     * suivi d'un saut de ligne,
     * puis la question en minuscule, le tout entouré de "||".
     */
    public String modifier(String question, String roleSysteme) {

        String roleLower = roleSysteme.toLowerCase();

        // Assistant
        if (roleLower.contains("assistant")) {
            return "Bonne question ! Votre question est : \""
                    + question + "\".\n\n"
                    + "Voici une réponse simple : cela dépend du contexte, mais ce sujet peut être mieux compris "
                    + "en analysant ses éléments principaux en profondeur.";
        }

        // Traducteur
        if (roleLower.contains("traducteur anglais-français")) {
            return "Voici une traduction de votre texte :\n\n\""
                    + question + "\"\n\n"
                    + "|| " + "Traduction simulée : "
                    + new StringBuilder(question).reverse().toString() + " ||"
                    + "\n\n(Note : ceci est une simulation pour illustrer le traitement.)";
        }

        // Guide touristique
        if (roleLower.contains("guide touristique")) {
            return "Excellente idée de s’intéresser à \"" + question + "\" !\n\n"
                    + "Si vous prévoyez de visiter cet endroit, je vous conseille de prendre le temps "
                    + "de découvrir les lieux incontournables, goûter à la cuisine locale et échanger "
                    + "avec les habitants.\n\n"
                    + "C’est souvent comme ça qu’on découvre les meilleures expériences.";
        }

        // Par défaut
        return "Je vais traiter votre demande simplement : "
                + question.toUpperCase();

//        String resultat = "||";
//        if (roleSysteme != null) {
//            // Ajouter le rôle système en majuscule au début du résultat, suivi d'un saut de ligne.
//            resultat += roleSysteme.toUpperCase(Locale.FRENCH) + "\n";
//        }
//        resultat += question.toLowerCase(Locale.FRENCH) + "||";
//        return resultat;
    }
}
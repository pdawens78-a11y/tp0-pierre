package ht.pierre.tp0.tp0pierre.jsf;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class ChatBean implements Serializable {

    private String question;
    private String reponse;
    private String conversation = "";
    private String role;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getConversation() {
        return conversation;
    }

    public void setConversation(String conversation) {
        this.conversation = conversation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String envoyer() {
        if (question == null || question.isEmpty()) {
            return null;
        }
        reponse = "On recoit bien votre question. " + "\nLa question est : " + question.toUpperCase();

        conversation += "User: " + question + "\n";
        conversation += "API: " + reponse + "\n\n";

        question = "";

        return null;
    }

}

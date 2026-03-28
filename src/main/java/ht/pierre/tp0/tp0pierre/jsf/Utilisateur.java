package ht.pierre.tp0.tp0pierre.jsf;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class Utilisateur implements Serializable  {
    private String nom;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String direHello() {
        return "hello";
    }}
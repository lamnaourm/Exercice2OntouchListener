package com.example.exercice2ontouchlistener;

import java.io.Serializable;

public class Stagiaire implements Serializable {

    private String nom;
    private String prenom;
    private String sexe;
    private int image;

    public Stagiaire() {
    }

    public Stagiaire(String nom, String prenom, String sexe, int image) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

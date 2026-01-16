package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Gare {
    // On garde les deux attributs proprement
    private int nombreQuais;
    private String nom;

    // --- On garde tous les Getters et Setters ---

    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
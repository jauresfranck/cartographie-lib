package fr.cours.info.tp.ferroviaire.cartographie.models;

/**
 * Représente une gare ferroviaire.
 * Cette classe contient les informations de base d'une gare (nom, nombre de quais).
 */
public class Gare {

    private int nombreQuais;
    private String nom;

    /**
     * Récupère le nombre de quais de la gare.
     * @return le nombre de quais (entier).
     */
    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }

    /**
     * Récupère le nom de la gare.
     * @return le nom de la gare (chaine de caractères).
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "Gare " + nom + " (" + nombreQuais + " quais)";
    }
}
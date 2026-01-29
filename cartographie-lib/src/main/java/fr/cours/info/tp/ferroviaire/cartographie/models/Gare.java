package fr.cours.info.tp.ferroviaire.cartographie.models;
/**
 * Représente une gare ferroviaire avec son nom et son nombre de quais.
 */
public class Gare {
    private int nombreDeQuais;
    private String nom;

    public int getNombreDeQuais() {
        return nombreDeQuais;
    }

    public void setNombreDeQuais(int nombreDeQuais) {
        this.nombreDeQuais = nombreDeQuais;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
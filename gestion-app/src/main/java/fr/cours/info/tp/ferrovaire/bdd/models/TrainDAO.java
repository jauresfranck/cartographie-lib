package fr.cours.info.tp.ferrovaire.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "train")
public class TrainDAO {
    @Id
    private String matricule;
    private String modele;
    private int nombreDeVoitures;

    // Ajoute les Getters et Setters (Idem que pour GareDAO)
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public int getNombreDeVoitures() { return nombreDeVoitures; }
    public void setNombreDeVoitures(int n) { this.nombreDeVoitures = n; }
}
package fr.cours.info.tp.ferroviaire.gestion.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name = "train")
public class TrainDAO {
    @Id
    private String matricule;
    // Ajoute un constructeur vide et un avec paramètre
    public TrainDAO() {}
    public TrainDAO(String matricule) { this.matricule = matricule; }
    // Getter et Setter
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
}
package fr.cours.info.tp.ferroviaire.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "train")
public class TrainDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String matricule;

    public TrainDAO() {
    }

    public TrainDAO(String matricule) {
        this.matricule = matricule;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
}
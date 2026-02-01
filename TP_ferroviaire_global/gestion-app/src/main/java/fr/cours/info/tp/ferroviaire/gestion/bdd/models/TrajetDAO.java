package fr.cours.info.tp.ferroviaire.gestion.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "trajet")
public class TrajetDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String villeDepart;
    private String villeArrivee;
    private double distance;

    // Constructeur vide
    public TrajetDAO() {
    }

    // Constructeur pratique pour les tests
    public TrajetDAO(String villeDepart, String villeArrivee, double distance) {
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.distance = distance;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
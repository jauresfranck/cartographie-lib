package fr.cours.info.tp.ferroviaire.gestion.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "gare")
public class GareDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private int nombreQuais;

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getNombreQuais() { return nombreQuais; }
    public void setNombreQuais(int nombreQuais) { this.nombreQuais = nombreQuais; }
}
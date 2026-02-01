package fr.cours.info.tp.ferroviaire.gestion.services;

import fr.cours.info.tp.ferroviaire.gestion.bdd.repositories.GareRepository;
import fr.cours.info.tp.ferroviaire.gestion.bdd.models.GareDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GareService {

    @Autowired
    private GareRepository gareRepository;

    public GareDAO trouverParNom(String nom) {
        // On utilise la méthode de Repository
        return gareRepository.findByNom(nom);
    }
}
package fr.cours.info.tp.ferroviaire.gestion.services;

import fr.cours.info.tp.ferroviaire.gestion.bdd.models.TrajetDAO;
import fr.cours.info.tp.ferroviaire.gestion.bdd.repositories.TrajetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrajetService {

    @Autowired
    private TrajetRepository trajetRepository;

    public List<TrajetDAO> recupererTousLesTrajets() {
        return trajetRepository.findAll();
    }
}
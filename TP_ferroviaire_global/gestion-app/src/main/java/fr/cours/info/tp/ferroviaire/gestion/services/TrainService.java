package fr.cours.info.tp.ferroviaire.gestion.services;

import fr.cours.info.tp.ferroviaire.gestion.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.gestion.bdd.repositories.TrainRepository;
import fr.cours.info.tp.ferroviaire.gestion.dto.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrainService {

    private final TrainRepository repository;

    @Autowired
    public TrainService(TrainRepository repository) {
        this.repository = repository;
    }
    public TrainDAO rechercher(String matricule) {
        return repository.findByMatricule(matricule);
    }

    public Train creer(String matricule) {
        Train train = new Train();
        train.setMatricule(matricule);
        train.setWagons(new ArrayList<>());
        return train;
    }
}
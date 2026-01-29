package fr.cours.info.tp.ferrovaire;

import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferrovaire.bdd.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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

    public List<TrainDAO> listerTout() {
        return repository.findAll();
    }
}
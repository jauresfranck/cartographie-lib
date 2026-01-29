package fr.cours.info.tp.ferroviaire.service;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.bdd.repositories.TrainRepository;
import fr.cours.info.tp.ferroviaire.generated.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrainService {

    private final TrainRepository repository;

    // Injection par constructeur (recommandé par Spring)
    @Autowired
    public TrainService(TrainRepository repository) {
        this.repository = repository;
    }

    // Ancienne méthode creer (vous pouvez la garder ou la supprimer)
    public Train creer(String matricule) {
        Train train = new Train();
        train.setMatricule(matricule);
        train.setWagons(new ArrayList<>());
        return train;
    }

    // Nouvelle méthode rechercher
    public Train rechercher(String matricule) {
        // 1. On cherche en base de données (DAO)
        TrainDAO dao = repository.findByMatricule(matricule);

        // 2. Si on trouve, on convertit en objet API (Train)
        if (dao != null) {
            Train train = new Train();
            train.setMatricule(dao.getMatricule());
            train.setWagons(new ArrayList<>()); // Liste vide pour l'instant
            return train;
        }
        return null; // ou lever une exception
    }
}
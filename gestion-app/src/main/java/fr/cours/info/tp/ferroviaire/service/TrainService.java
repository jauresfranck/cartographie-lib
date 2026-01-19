package fr.cours.info.tp.ferroviaire.service;

import fr.cours.info.tp.ferroviaire.generated.model.Train;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service // Important pour que Spring le trouve
public class TrainService {

    public Train creer(String matricule) {
        Train train = new Train();
        train.setMatricule(matricule);
        train.setWagons(new ArrayList<>()); // Initialise la liste vide
        return train;
    }
}
package fr.cours.info.tp.ferrovaire;

import fr.cours.info.tp.ferrovaire.api.TrainsApi;
import fr.cours.info.tp.ferrovaire.api.models.Train;
import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; // Ajouté
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class TrainController implements TrainsApi {

    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    /**
     * Travail n°24 : Consulter un train
     * On utilise @GetMapping car la méthode n'est pas encore dans TrainsApi
     */
    @GetMapping("/train/consulter")
    public ResponseEntity<Train> consulterTrain(@RequestParam String matricule) {
        // 1. Récupération via le service
        TrainDAO trainDb = trainService.rechercher(matricule);

        if (trainDb == null) {
            return ResponseEntity.notFound().build();
        }

        // 2. Mapping DAO -> API model
        Train trainApi = new Train();
        trainApi.setMatricule(trainDb.getMatricule());
        // On met une vitesse par défaut pour que le JSON soit valide
        trainApi.setVitesseMax(160);

        return ResponseEntity.ok(trainApi);
    }

    /**
     * Obligatoire pour satisfaire l'interface TrainsApi actuelle
     */
    @Override
    public ResponseEntity<List<Train>> trainsGet() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
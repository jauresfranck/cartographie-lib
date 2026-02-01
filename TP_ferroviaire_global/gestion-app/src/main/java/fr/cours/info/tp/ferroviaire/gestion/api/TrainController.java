package fr.cours.info.tp.ferroviaire.gestion.api;

import fr.cours.info.tp.ferroviaire.gestion.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.gestion.dto.Train;
import fr.cours.info.tp.ferroviaire.gestion.services.TrainService;
//import fr.cours.info.tp.ferroviaire.gestion.api.TrainApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {

    @Autowired
    private TrainService service;

    // Utilisation de la constante générée
    //@GetMapping(TrainApi.)
    @GetMapping("/train/consulter")
    public TrainDAO consulterTrain(
            @RequestParam(value = "matricule", required = true) String matricule) {
        //on retourne un TrainDAO
        return service.rechercher(matricule);
    }
}
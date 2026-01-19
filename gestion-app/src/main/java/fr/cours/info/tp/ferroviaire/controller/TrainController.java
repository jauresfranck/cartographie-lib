package fr.cours.info.tp.ferroviaire.controller;

import fr.cours.info.tp.ferroviaire.generated.model.Train;
import fr.cours.info.tp.ferroviaire.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {

    @Autowired
    private TrainService service;

    // Si TrainApi.PATH_CONSULTER_TRAIN n'est pas trouvé, mettez "/train/consulter"
    @GetMapping("/train/consulter")
    public Train consulterTrain(@RequestParam(value = "matricule", required = true) String matricule) {
        return service.creer(matricule);
    }
}
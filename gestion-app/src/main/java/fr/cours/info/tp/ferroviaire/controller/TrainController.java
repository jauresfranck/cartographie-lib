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

    @GetMapping("/train/consulter")
    public Train consulterTrain(@RequestParam(value = "matricule", required = true) String matricule) {
        // C'EST ICI QUE ÇA CHANGE :
        // On appelle la recherche en base de données (rechercher) au lieu de la création fictive (creer)
        return service.rechercher(matricule);
    }
}
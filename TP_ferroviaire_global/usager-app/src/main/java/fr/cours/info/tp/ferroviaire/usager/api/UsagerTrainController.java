package fr.cours.info.tp.ferroviaire.usager.api;

import fr.cours.info.tp.ferroviaire.usager.models.Train;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsagerTrainController {

    @GetMapping("/client/consulter-train")
    public String consulterTrain(@RequestParam(value = "matricule") String matricule) {
        // Initialisation du client REST
        RestTemplate restTemplate = new RestTemplate();

        //  url de l'api de l'application gestionnaire (port 8080)
        String url = "http://localhost:8080/train/consulter?matricule=" + matricule;

        // appel de l'api : on stocke le résultat dans un objet de type Train
        Train monTrain = restTemplate.getForObject(url, Train.class);
        //On utilise l'objet Java pour extraire l'information
        return "L'application usager a extrait le matricule depuis l'objet Java : " + monTrain.getMatricule();
    }
}
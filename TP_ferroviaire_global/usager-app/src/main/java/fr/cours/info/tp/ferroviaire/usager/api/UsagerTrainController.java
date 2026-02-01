package fr.cours.info.tp.ferroviaire.usager.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsagerTrainController {

    @GetMapping("/client/consulter-train")
    public String consulterTrain(@RequestParam (value = "matricule") String matricule) {
        // Initialisation du client REST
        RestTemplate restTemplate = new RestTemplate();

        // URL de l'API de l'application GESTIONNAIRE (port 8080)
        String url = "http://localhost:8080/train/consulter?matricule=" + matricule;

        // Appel de l'API et récupération du résultat
        String resultat = restTemplate.getForObject(url, String.class);

        return "L'application USAGER a reçu ces infos du GESTIONNAIRE : " + resultat;
    }
}
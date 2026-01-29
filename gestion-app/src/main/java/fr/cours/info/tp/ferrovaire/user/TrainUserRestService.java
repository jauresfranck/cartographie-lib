package fr.cours.info.tp.ferrovaire.user;

import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrainUserRestService {

    private final RestTemplate restTemplate;

    public TrainUserRestService() {
        this.restTemplate = new RestTemplate();
    }

    public TrainDAO appelerApiConsulter(String matricule) {
        // Appelle ton API qui renvoie le JSON que tu viens de voir
        String url = "http://localhost:8080/train/consulter?matricule=" + matricule;
        return restTemplate.getForObject(url, TrainDAO.class);
    }
}
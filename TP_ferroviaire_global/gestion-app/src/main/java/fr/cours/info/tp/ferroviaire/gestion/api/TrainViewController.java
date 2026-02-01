package fr.cours.info.tp.ferroviaire.gestion.api;

import fr.cours.info.tp.ferroviaire.gestion.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrainViewController {

    @Autowired
    private TrainService service;

    @GetMapping("/ihm/train")
    public String ihmConsulterTrain(
            @RequestParam(value = "matricule", required = true) String matricule,
            Model model
    ) {
        // On récupère le train via le service et on l'ajoute au modèle
        model.addAttribute("train", service.rechercher(matricule));

        // On retourne le nom du fichier HTML
        return "ihm_train";
    }
}
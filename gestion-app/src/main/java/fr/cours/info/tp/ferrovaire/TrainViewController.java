package fr.cours.info.tp.ferrovaire;

import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class TrainViewController {

    @Autowired
    private TrainService service;

    @GetMapping("/ihm/trains")
    public String ihmListeTrains(Model model) {
        List<TrainDAO> liste = service.listerTout();
        model.addAttribute("liste", liste);
        return "ihm_liste_trains";
    }

    /**
     * Affiche les détails d'un train spécifique
     */
    @GetMapping("/ihm/train")
    public String ihmConsulterTrain(
            @RequestParam(value = "matricule", required = true) String matricule,
            Model model
    ) {
        TrainDAO train = service.rechercher(matricule);

        if (train == null) {
            train = new TrainDAO();
            train.setMatricule(matricule + " (Inexistant)");
            train.setModele("Inconnu");
            train.setNombreDeVoitures(0);
        }

        model.addAttribute("train", train);
        return "ihm_train";
    }
}
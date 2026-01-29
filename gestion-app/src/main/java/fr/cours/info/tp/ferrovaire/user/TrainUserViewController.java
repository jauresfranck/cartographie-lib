package fr.cours.info.tp.ferrovaire.user;

import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrainUserViewController {

    @Autowired
    private TrainUserRestService restService;

    @GetMapping("/user/recherche")
    public String pageRecherche(@RequestParam(name="matricule", required=false) String matricule, Model model) {
        if (matricule != null && !matricule.isEmpty()) {
            try {
                // Appel REST pour récupérer le JSON et le transformer en objet Java
                TrainDAO train = restService.appelerApiConsulter(matricule);

                // Vérification si le train existe réellement
                if (train == null || train.getModele() == null || "Inconnu".equals(train.getModele())) {
                    model.addAttribute("erreur", "Désolé, le train " + matricule + " est introuvable.");
                } else {
                    model.addAttribute("train", train);
                }
            } catch (Exception e) {
                // En cas de problème technique (API éteinte par exemple)
                model.addAttribute("erreur", "Impossible de contacter le service de réservation.");
            }
        }
        return "user_recherche";
    }
}
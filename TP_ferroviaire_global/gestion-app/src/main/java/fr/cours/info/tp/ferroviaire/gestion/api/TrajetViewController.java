package fr.cours.info.tp.ferroviaire.gestion.api;

import fr.cours.info.tp.ferroviaire.gestion.services.TrajetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrajetViewController {

    @Autowired
    private TrajetService trajetService;

    @GetMapping("/ihm/trajets")
    public String ihmListeTrajets(Model model) {
        // On ajoute la liste au modèle pour Thymeleaf
        model.addAttribute("trajets", trajetService.recupererTousLesTrajets());

        // On retourne le nom du template
        return "ihm_liste_trajets";
    }
}
package fr.cours.info.tp.ferroviaire.gestion.api;

import fr.cours.info.tp.ferroviaire.gestion.services.GareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GareViewController {

    @Autowired
    private GareService gareService; // L'injection

    @GetMapping("/ihm/gare")
    public String ihmConsulterGare(
            @RequestParam(value = "nom") String nom,
            Model model
    ) {
        model.addAttribute("gare", gareService.trouverParNom(nom));
        return "ihm_gare";
    }
}
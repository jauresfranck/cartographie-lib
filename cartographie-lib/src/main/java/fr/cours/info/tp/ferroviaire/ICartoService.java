package fr.cours.info.tp.ferroviaire;

import java.util.List;

class Gare { String nom; int nombreQuais; }
class CheminDeFer { double distance; }
class Reseau { String nom; }

public interface ICartoService {
    // Actions de configuration
    Gare ajouterGare( String nom, int nbQuais);
    CheminDeFer creerChemin(Gare g1, Gare g2);
    void associer(Gare gare, CheminDeFer cheminDeFer);
    void ajouterVoie(CheminDeFer chemin, int vitesseMax);

    // Actions de consultation
    Gare rechercherGare(String nom);
    List<Gare> listerGares();
    double calculerDistance(CheminDeFer chemin);
}
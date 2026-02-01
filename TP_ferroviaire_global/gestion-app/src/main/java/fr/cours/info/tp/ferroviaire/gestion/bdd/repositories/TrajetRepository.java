package fr.cours.info.tp.ferroviaire.gestion.bdd.repositories;

import fr.cours.info.tp.ferroviaire.gestion.bdd.models.TrajetDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrajetRepository extends CrudRepository<TrajetDAO, Long> {
    List<TrajetDAO> findAll(); // Pour afficher tous les trajets
}
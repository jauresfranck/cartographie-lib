package fr.cours.info.tp.ferroviaire.gestion.bdd.repositories;

import fr.cours.info.tp.ferroviaire.gestion.bdd.models.GareDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends CrudRepository<GareDAO, Long> {
}
package fr.cours.info.tp.ferrovaire.bdd.repositories;

import fr.cours.info.tp.ferrovaire.bdd.models.GareDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends CrudRepository<GareDAO, Long> {
    // On laisse vide, Spring s'occupe de tout !
}
package fr.cours.info.tp.ferroviaire.gestion.bdd.repositories;

import org.springframework.stereotype.Repository;
import fr.cours.info.tp.ferroviaire.gestion.bdd.models.TrainDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TrainRepository extends CrudRepository<TrainDAO, String> {
    //  va écrire la requête SQL tout seul grâce au nom de la méthode !
    TrainDAO findByMatricule(String matricule);
}
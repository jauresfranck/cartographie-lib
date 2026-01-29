package fr.cours.info.tp.ferrovaire.bdd.repositories;

import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List; // Import nécessaire pour la List

@Repository
public interface TrainRepository extends CrudRepository<TrainDAO, String> {


    TrainDAO findByMatricule(String matricule);


    @Override
    List<TrainDAO> findAll();
}
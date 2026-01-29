package fr.cours.info.tp.ferroviaire.service;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.bdd.repositories.TrainRepository;
import fr.cours.info.tp.ferroviaire.generated.model.Train;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Active Mockito
class TrainServiceTest {

    @Mock // Crée un "faux" repository
    private TrainRepository repository;

    @InjectMocks // Crée le service en lui injectant le faux repository
    private TrainService service;

    @Test
    void rechercher_matricule_existant() {
        // GIVEN (On prépare le bouchon)
        String mat = "TGV-8921";
        TrainDAO trainEnBase = new TrainDAO(mat);
        // On dit au faux repo : "si on te demande TGV-8921, renvoie cet objet"
        when(repository.findByMatricule(mat)).thenReturn(trainEnBase);

        // WHEN (On appelle le service)
        Train train = service.rechercher(mat);

        // THEN (Vérifications)
        assertEquals(mat, train.getMatricule());
        assertNotNull(train.getWagons());
    }
}
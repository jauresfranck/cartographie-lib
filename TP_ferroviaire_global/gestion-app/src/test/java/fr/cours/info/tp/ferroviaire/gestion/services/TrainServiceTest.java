package fr.cours.info.tp.ferroviaire.gestion.services;

import fr.cours.info.tp.ferroviaire.gestion.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.gestion.bdd.repositories.TrainRepository;
import fr.cours.info.tp.ferroviaire.gestion.dto.Train;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TrainServiceTest {

    @Mock
    private TrainRepository repository; // On crée un faux repository

    @InjectMocks
    private TrainService service; // Mockito l'injecte automatiquement dans le service

    @Test
    void testRechercher() {
        // On définit le comportement du faux repository
        TrainDAO fakeTrain = new TrainDAO("BB777");
        Mockito.when(repository.findByMatricule("BB777")).thenReturn(fakeTrain);

        // Test
        TrainDAO resultat = service.rechercher("BB777");
        assertEquals("BB777", resultat.getMatricule());
    }
}
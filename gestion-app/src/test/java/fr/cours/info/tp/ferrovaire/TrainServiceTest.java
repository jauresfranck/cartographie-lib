package fr.cours.info.tp.ferrovaire;

import fr.cours.info.tp.ferrovaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferrovaire.bdd.repositories.TrainRepository;
import org.junit.jupiter.api.DisplayName;
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
    private TrainRepository trainRepository; // On crée une version simulée du repository

    @InjectMocks
    private TrainService trainService; // On injecte le simulacre dans le service à tester

    @Test
    @DisplayName("Devrait retourner un train quand le matricule existe en base")
    void testRechercherTrainSucces() {
        // 1. ARRANGE (Préparation)
        String matriculeTest = "T123";
        TrainDAO trainSimule = new TrainDAO();
        trainSimule.setMatricule(matriculeTest);

        // On définit le comportement du Mock : quand on cherche T123, on retourne trainSimule
        Mockito.when(trainRepository.findByMatricule(matriculeTest)).thenReturn(trainSimule);

        // 2. ACT (Action)
        TrainDAO resultat = trainService.rechercher(matriculeTest);

        // 3. ASSERT (Vérification)
        assertNotNull(resultat, "Le service devrait retourner un objet");
        assertEquals(matriculeTest, resultat.getMatricule(), "Le matricule retourné doit être celui demandé");

        // Vérification bonus : est-ce que le repository a bien été appelé 1 fois ?
        Mockito.verify(trainRepository, Mockito.times(1)).findByMatricule(matriculeTest);
    }

    @Test
    @DisplayName("Devrait retourner null quand le train n'existe pas")
    void testRechercherTrainInconnu() {
        // ARRANGE : On simule que la base ne trouve rien (retourne null)
        Mockito.when(trainRepository.findByMatricule("INCONNU")).thenReturn(null);

        // ACT
        TrainDAO resultat = trainService.rechercher("INCONNU");

        // ASSERT
        assertNull(resultat, "Le service devrait retourner null pour un train inexistant");
    }
}
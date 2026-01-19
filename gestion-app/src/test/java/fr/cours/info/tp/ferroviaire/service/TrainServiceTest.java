package fr.cours.info.tp.ferroviaire.service;

import fr.cours.info.tp.ferroviaire.generated.model.Train;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainServiceTest {

    private final TrainService service = new TrainService();

    @Test
    void creer_matricule_ok() {
        Train train = service.creer("8921");

        assertEquals("8921", train.getMatricule());
        assertNotNull(train.getWagons());
        assertTrue(train.getWagons().isEmpty());
    }
}
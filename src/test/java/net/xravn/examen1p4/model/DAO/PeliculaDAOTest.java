package net.xravn.examen1p4.model.DAO;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.xravn.examen1p4.boilerplate.controller.sql.DBConectionController;
import net.xravn.examen1p4.model.Pelicula;

public class PeliculaDAOTest {
    @BeforeAll
    static void setUp() {
        DBConectionController.getInstance().setTestMode(true);
    }

    @Test
    void testRecuperarPeliculas() {
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        List<Pelicula> peliculas = peliculaDAO.recuperarPeliculas();
        assertTrue(peliculas.size() > 0);
    }
}

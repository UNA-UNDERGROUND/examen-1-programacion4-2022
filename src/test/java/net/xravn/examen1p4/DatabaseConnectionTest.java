package net.xravn.examen1p4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import net.xravn.examen1p4.boilerplate.controller.configuration.ConfigurationManager;
import net.xravn.examen1p4.boilerplate.controller.sql.DBConectionController;



public class DatabaseConnectionTest {
    @Test
    void testConnect() {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        if (configurationManager.ommitDBTests()) {
            System.out.println("Test de conexión a base de datos deshabilitado");
        } else {
            DBConectionController controller = DBConectionController.getInstance();
            controller.setTestMode(true);
            assertTrue(controller.isConnected());
        }
    }
}

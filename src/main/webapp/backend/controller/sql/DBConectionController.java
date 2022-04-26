package backend.controller.sql;

import backend.controller.configuration.ConfigurationManager;
import backend.model.sql.DBConnection;
import java.sql.Connection;


/**
 * Clase que permite la conexion con la base de datos
 * 
 */
public class DBConectionController {

    private DBConectionController() {
    }

    public Connection getConnection() {
        try {
            ConfigurationManager config = ConfigurationManager.getInstance();
            String database;
            String user;
            String password;
            if (!testMode) {
                database = config.getDatabaseSchema();
                user = config.getDatabaseUser();
                password = config.getDatabasePassword();
            } else {
                database = config.getTestDatabaseSchema();
                user = config.getTestDatabaseUser();
                password = config.getTestDatabasePassword();
            }
            DBConnection instance = DBConnection.getInstance();
            instance.setTestMode(testMode);
            return instance.getConnection(database, user, password);
        } catch (Exception ex) {
            System.err.printf("No se pudo conectar con la base de datos: %s\n", ex.getLocalizedMessage());
            return null;
        }
    }

    public boolean isConnected() {
        Connection connection = getConnection();
        if (connection != null) {
            return true;
        } else {
            return false;
        }
    }

    public void setTestMode(boolean testMode) {
        this.testMode = testMode;
    }

    private boolean testMode = false;

    private static DBConectionController instance = null;

    public static DBConectionController getInstance() {
        if (instance == null) {
            instance = new DBConectionController();
        }
        return instance;
    }

}

package backend;

import backend.cli.testBackend;
import backend.controller.configuration.ConfigurationManager;
import java.util.Arrays;



public class Application {

	public static void main(String[] args) {
		// checks if it needs to run witouth spring boot
		if (Arrays.asList(args).contains("--no-init")) {
			System.out.println("Running without spring boot");
			// checks if it needs to test backend services
			if (Arrays.asList(args).contains("--test-backend")) {
				if (Arrays.asList(args).contains("--test-all")) {
					new testBackend().testAll();
				} else if (Arrays.asList(args).contains("--test-database")) {
					new testBackend().testDatabase();
				} else {
					System.out.println("No test specified");
				}
			}
		} else {
			ConfigurationManager configurationManager = ConfigurationManager.getInstance();
			System.out.println("Iniciando servidor en: " + configurationManager.getWebServerPort());
		}

	}


}

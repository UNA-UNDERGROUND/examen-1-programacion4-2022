package net.xravn.examen1p4;


import java.util.Arrays;
import net.xravn.examen1p4.cli.testBackend;
import net.xravn.examen1p4.controller.configuration.ConfigurationManager;



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
